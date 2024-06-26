CREATE TABLE recipes(id int PRIMARY KEY GENERATED ALWAYS AS IDENTITY, name varchar(100), description varchar(1000), short_description varchar(500), products varchar(500));

INSERT INTO recipes(name, description, short_description, products) VALUES
                                                                  ('Классический омлет',
                                                                   'Классический омлет – это идеальный вариант для быстрого и питательного завтрака. Для приготовления взбейте яйца с молоком, добавьте соль и перец для вкуса. На сковороде разогрейте масло, вылейте яичную смесь и жарьте на медленном огне, пока омлет не схватится и не приобретет золотистую корочку. Подавайте горячим с тостами или свежими овощами',
                                                                   'Взбейте яйца с молоком, солью и перцем. Разогрейте сковороду с маслом, вылейте смесь и жарьте на медленном огне до готовности.',
                                                                   'Яйца – 3 шт, Молоко – 50 мл, Соль, перец – по вкусу, Масло растительное для жарки');
INSERT INTO recipes(name, description, short_description, products) VALUES
    ('Салат с тунцом',
     'Салат с тунцом – это прекрасный источник белка и идеален для легкого обеда. Нарежьте свежий огурец, вареные яйца и зеленый лук. Все ингредиенты смешайте с консервированным тунцом, добавьте майонез для сочности. Посолите и поперчите салат по вкусу. Этот салат можно подать на листьях салата или как самостоятельное блюдо.',
     'Нарежьте огурец, яйца и лук. Смешайте с тунцом и заправьте майонезом. Посолите и поперчите по вкусу.',
     ' Консервированный тунец – 200 г
     - Свежий огурец – 1 шт.
     - Яйцо вареное – 2 шт.
     - Зеленый лук – небольшой пучок
     - Майонез – 3 ст. л.
     - Соль, перец – по вкусу');

INSERT INTO recipes(name, description, short_description, products) VALUES
    ('Куриный суп',
     'Куриный суп – это сытное и утоляющее голод блюдо. В кастрюле варите курицу до полной готовности, затем добавьте нарезанный картофель, морковь и лук. Варите, пока овощи не станут мягкими. Перед подачей посыпьте суп свежей зеленью, добавьте соль и перец по вкусу. Этот суп отлично подходит для обеда и ужина.',
     'Варите курицу до готовности, добавьте нарезанный картофель, морковь и лук. Варите до мягкости овощей. Подавайте с зеленью.',
     '-Куриная грудка – 300 г
     - Картофель – 3 шт.
     - Морковь – 1 шт.
     - Лук – 1 шт.
     - Зелень, соль, перец – по вкусу');



