#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

struct node{
    int data;
    struct node* next;
};

struct node* createnode(struct node* head, int data, int pos){
    int index = 0;
    struct node* newNode = NULL;
    struct node* ptr = NULL;
    ptr = head;
    newNode = (struct node*)malloc(sizeof(struct node));
    newNode->data = data;
    newNode->next = NULL;
    
    if(head==NULL){
        head = newNode;
        return head;
    }
    while(index != pos-1){
        ptr = ptr->next;
        index++;
    }
    
    newNode->next = ptr->next;
    ptr->next = newNode;
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
        head = createnode(head,data,pos);
    }
    printLL(head);
    return 0;
}
