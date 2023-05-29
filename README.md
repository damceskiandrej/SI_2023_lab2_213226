# Андреј Дамчески, бр. на индекс 213226
 # Control Flow Graph 
![SILab2 drawio](https://github.com/damceskiandrej/SI_2023_lab2_213226/assets/127520269/525af868-e7f4-4efe-a9b7-e089f0e9bb29)
 # Цикломатска комплексност 
 Цикломатската комплексност на овој код е 11, истата ја добив преку формулата (E-N)+2, каде E означува вкупниот број на ребра, а N е вкупниот број на јазли, односно
 (38-29)+2 = 11.
 # Тест случаи според критериумот Every Branch 
 ![Screenshot 2023-05-29 170329](https://github.com/damceskiandrej/SI_2023_lab2_213226/assets/127520269/db333f6f-90cf-4c5f-9f09-c401e424349c)

За прегледен приказ за начинот на фунцкионирање на тест случаите според Every Branch критериумот се користи матрица во која со ѕвезда се прикажани поминатите гранки, додека празните полиња означуваат дека гранката не е помината според дефинираниот тест случај. 

Според првиот тест случај се изминуваат само гранките 1-2 и 2-25 , бидејќи ако вредноста на passowrd е null условот ќе се исполни, и веднаш ќе се фрли иклучок(2)-завршува функцијата, кој се спојува за крајниот јазел, односно за јазелот 25.

Според вториот тест случај се изминуваат поголемиот дел од гранките во споредба со првиот тест случај како : 1-3,3-4,6-7,8.1-8.2,8.2-9,10-11,11-12,12-13,13-8.3,8.3-8.2,(8.2-14,15,16,17),(14,15,16,17-18),18-25,5-6,7-8.1,9-10.Овие гранки го исполнуваат барањето да вредноста на user биде null,password да е помал од 8 и во email да има точка и @.

Според третиот тест случај се надополнуваат поминатите гранки, односно гранките: 3-5,4-5,(6-14,15,16,17),(14,15,16,17-19),19-20,20-21.1,21.1-21.2,21.2-24,21.2-22,22-21.3,21.3-21.2,24-25.Овие гранки го исполнуваат барањето да password биде поголем од 8, а email да нема точка и @. 

Според четвртиот тест случај се изминуваат дополнително гранките: 10-12,12-8.3,22-23,23-25, кои го исполнуваат барањето password да има празно место.

Според петтиот тест случај дополнително се изминува гранката 20-24 која го исполнува барањето да во password има празно место, со што се комплетира изминувањето на сите гранки.  

Тест1:  

![test1](https://github.com/damceskiandrej/SI_2023_lab2_213226/assets/127520269/2badd1f6-6e38-4803-b81a-a3e18f9b9438)

Тест2: 

![test2](https://github.com/damceskiandrej/SI_2023_lab2_213226/assets/127520269/59ac85e1-2441-4c93-9edb-87444725cc6f)

Тест3: 

![test3](https://github.com/damceskiandrej/SI_2023_lab2_213226/assets/127520269/14467665-ecf3-4a12-8962-e5b7fa2f8e36)

Тест4:

![test4](https://github.com/damceskiandrej/SI_2023_lab2_213226/assets/127520269/a938f236-256b-444d-a4ef-4c5a730996e1)

Тест5:

![test5](https://github.com/damceskiandrej/SI_2023_lab2_213226/assets/127520269/4aa0d363-c97e-4862-b695-bea40a2cdb76)

 # Тест случаи според критериумот Multiple Condition 
 ![multiple condition](https://github.com/damceskiandrej/SI_2023_lab2_213226/assets/127520269/96b17391-9fe4-44c6-bbb3-3bc7ff35b4c2) 
 
Повторно се користи матрица за да се разгледаат можните тест случаи според дадениот услов над матрицата.

1.Ако user1=null ќе врати TRUE, останатите две нема потреба да се проверуваат,условот е исполнет (1-2).  

![test1](https://github.com/damceskiandrej/SI_2023_lab2_213226/assets/127520269/57160643-8ec0-4f7c-86ed-e991a58cd5b1)


2.Ако user==null ќе врати FALSE,се преминува на следната проверка според тест случајот,се проверува дали user.getPassword()==null што е TRUE и нема потреба следното да се проверува, со што повторно е исполнет условот (1-2). 

![test2](https://github.com/damceskiandrej/SI_2023_lab2_213226/assets/127520269/48e8570c-9c21-4afb-872a-1ee5a5a49d67)


3.Ако user==null и user.getPassword()==null тие ќе вратат FALSE, со што се проверува следното, односно ако user.getEmail()==null ќе врати TRUE, значи дека условот е исполнет (1-2).

![test3](https://github.com/damceskiandrej/SI_2023_lab2_213226/assets/127520269/9dc9bb73-7863-482b-88fc-317a6436298f)


4.Ако сите проверки според последниот тест случај се еднакви на null тие ќе вратат FALSE со што условот не се исполнува, се прескокнува јазелот 2 и се преминува на јазелот 3.

![test4](https://github.com/damceskiandrej/SI_2023_lab2_213226/assets/127520269/10ca8dcb-9c60-4bb4-97ed-0e8cbde9f0ac)
