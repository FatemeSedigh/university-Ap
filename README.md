```سلام
خب من یسره میرم سر اصل مطلب 
برای نوشتن این کد در ابتدا من اومدم کلاس ها و پوشه هارو طبق داکیومنت نوشتم 
بعد یه برنچ جداگانه برای نوشتن هر کدوم از کلاس ها درست کردم و دونه دونه کد هاشونو زدم و تغغیرات رو اد کردم و کامیت در نهایت هم همرو مرج کردم 
حالا اگه بخوام از ساختار دونه دونه ی کلاسا بگم :
کلاس Person :
بعد از تعریف تمام فیلد ها یه این شکل:




public int id; 
public static ArrayList<Person> personList = new ArrayList<>(); 
public String name;
public final String nationalID;`



کانستراکتور Person رو له این شکل نوشتم:



`public Person(String name, String nationalID){
        this.name = name;
        this.nationalID = nationalID;
        personList.add(this);
        id = personList.size();
    }`


    
وقتی یک شیء جدید ساخته میشه نام و کد ملی آن را می‌گیره و در شیء ذخیره می‌کنه.بعدش این شیء به یک لیست اضافه میشه تا همه اشیاء در آن نگهداری شوند
بعد، به شیء یک شماره منحصر به فرد داده می‌شود که برابر با تعداد اشیاء موجود در لیسته. مثلاً اگر این شیء سومین شیء باشد، شماره آن ۳ خواهد بود.
سپس متد زیر را به این شکل :



`public static Person findByID(int id){
        for(Person findPerson : personList){
            if(findPerson.id == id){
                return findPerson;
            }
        }
        return null;
    }`


    
این متد یک شماره (id) می‌گیره و شیء مربوط به آن شماره را در لیست personList پیدا می‌کنه.
لیست را بررسی می‌کنه و هر شیء را با شماره‌ای که دادیم مقایسه می‌کنه.
اگر شیء با آن شماره پیدا شه اونو برمیگردونه.
اگر شیء پیدا نشه، null برمی‌گردونه (یعنی چیزی پیدا نشده است)
حالا میریم سراغ کلاس Course :
در ابتدا اول فیلد هارو به این شکل تعریف کردم 



`public int id;
    public static ArrayList<Course> courseList = new ArrayList<>();
    public String title;
    public int units;`


    
بعد کانستراکتور Course رو :



`public Course(String title, int units) {
        this.title = title;
        this.units = units;
        courseList.add(this);
        this.id = courseList.size();
    }`


    
    
 این کد یک سازنده برای کلاس «Course» است. 
وقتی یک شیء جدید ساخته می‌شود، عنوان درس و تعداد واحدهای آن را می‌گیرد و در شیء ذخیره می‌کند. بعد، این شیء به یک لیست اضافه می‌شود تا همه درس‌ها در آن نگهداری شوند.
 سپس به درس یک شماره منحصر به فرد داده می‌شود که برابر با تعداد درس‌های موجود در لیست است.
 مثلاً اگر این درس سومین درس باشد، شماره آن ۳ می‌شود. این کد برای مدیریت و سازمان‌دهی اطلاعات درس‌ها استفاده می‌شود
 
 
 
 `public static Course findByID(int id) {
        for (Course findCourse : courseList) {
            if (findCourse.id == id) {
                return findCourse;
            }
        }
        return null;
    }`


    
این کد یک متد برای پیدا کردن درس بر اساس شماره‌اش است.
یک شماره می‌گیره و توی لیست درس‌ها می‌گرده تا ببینه کدوم درس شماره‌اش با شماره داده شده برابر است. 
اگر درس رو پیدا کنه، همون درس رو برمی‌گردونه. اگر هم چیزی پیدا نکنه، خالی (null) برمی‌گردونه.
این کد برای وقتی استفاده می‌شه که بخوایم اطلاعات یک درس خاص رو از روی شماره‌اش پیدا کنیم
میریم سراغ کلاس Major:
ساختار ابتدای این کلاس دقیقا مانند کلاس های پیشین است 
تا این یخش :



`public static Major findByID(int id) {
        for (Major findMajor : majorList) {
            if (findMajor.id == id) {
                return findMajor;
            }
        }
        return null;
    }`

    `public void addStudent() {
        if (numberOfStudents < capacity) {
            numberOfStudents++;
            System.out.println("Student added to " + name + ". Current number of students: " + numberOfStudents);
        } else {
            System.out.println("Cannot add more students to " + name + ". Capacity is full.");
        }
    }`



    
 متد findByID:
این متد یک شماره می‌گیره و توی لیست رشته‌ها می‌گرده تا ببینه کدوم رشته شماره‌اش با شماره داده شده برابر است. 
اگر رشته رو پیدا کنه، همون رشته رو برمی‌گردونه. اگر چیزی پیدا نکنه، خالی (null) برمی‌گردونه. 
 متد addStudent:
این متد یک دانشجو به رشته اضافه می‌کنه. 
اگر تعداد دانشجوها از ظرفیت رشته کمتر باشه، دانشجو رو اضافه می‌کنه و تعداد دانشجوها رو یکی زیاد می‌کنه. 
اگر ظرفیت رشته پر باشه، پیامی می‌ده که دیگه نمی‌شه دانشجو اضافه کرد.






کلیت این کد همینه و لگد بخوام بیشتر همش تیکه تیکه توضیح بدم تکراری میشه 
ولی در کل این کدیه که دقیقا طبق دستوری که در داکیومنت کوئرا بود نوشتم و تک تک متد و فیلد ها و کانستراکتور هارو فقط همون مدل که گفته شده بود تعریف کردم
این کد میاد چند دانشجو و استاد رو به عنوان شی ورودی میگیره که هر استاد می‌تونه در یک رشته تحصیلی جدا تدریس کنه و از طرفی هر کدام از دانشجو ها در رشته های خودشون ... 
هر دانشجو میتواند در کلاس های درس مختلفی باشد (یه جورایی انگار برای این ترمش چندین درس رو برداشته باشه ) و هر کدام از دروس هم با استاد همون درس
و برای هر کدوم از این درس ها نمره ای کسب کنه و در نهایت معدل خودشو داشته باشه
هر کدوم از درس ها یا رشته ها ای دی خودشونو دارن 
و هر کدوم از دانشجو ها و استاد ها هم ای دی خودشونو 
هر درس یه تعداد ظرفیت مشخص داره که بیشتر از اون دانشجو نمیتونه اون درس رو برداره 

در آخر هم من اومدم طبق داکیومنت بهشون ورودی دادم و خروجی خواسته شده در پروژه رو میتونید با ران کردن کد بگیرید 
فقط یه بخش اضافه تر از خواسته سوال هم در خروجی نمایش‌داده میشه که نشون دهنده ی اضافه شدن نمرات به هر کدوم از دانشجویان در درس با ای دی مشخصشه ...
```















    


