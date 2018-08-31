%% Biseccion jueves 
clear all
clc
close all

syms x
f=input('ingresar funcion: ')
a=input('ingresar punto a: ')
b=input('ingrsar punto b: ')
t=input('ingrsar dato de tolerancia: ') 
fa=subs(f,x,a);
fb=subs(f,x,b);
 p=(a+b)/2;
fp=subs(f,x,p) 

%% suponiendo que a y b iniciales cumplen 
k=0
while abs(fp)>t
    if fa*fp<0
        b=p;
    else
        a=p;
    end 
    fa=subs(f,x,a);
    fb=subs(f,x,b);    
    p=(a+b)/2;
    fp=subs(f,x,p) 
    K=k+1
end