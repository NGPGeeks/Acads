#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

struct node{
    int data;
    struct node* next;
};

struct node* insert_at_any_pos(struct node* head, int val, int pos)
{
    struct node* newnode = (struct node*)malloc(sizeof(struct node));
    newnode->data = val;
    newnode->next = NULL;  
    if(head == NULL)
    {
        head = newnode;
    }
    else
    {
        struct node* temp = head;
        int c = 1;
        while(c < pos-1)
        {
            temp = temp->next;
            c++;
        }
        newnode->next = temp->next;
        temp->next= newnode;
    }
    return head;
}


void printLL(struct node* head){
    if(head==NULL){
        printf("NULL");
        return;
    }
    while(head->next != NULL){
        printf("%d->", head->data);
        head = head->next;
    }
    // printf("NULL");
}

int main() {
    struct node* head = NULL;
    int data,pos,n;
    scanf("%d", &n);
    for(int i=0; i<n; i++){
        scanf("%d %d", &pos, &data);
        head = insert_at_any_pos(head,data,pos);
    }
    printLL(head);
    return 0;
}
