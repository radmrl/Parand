package com.example.rad.parand;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {

    private static List<Course> data = new ArrayList<>();

    public static List<Course> getData() {
        return data;
    }

    static {

        data.add(new Course(10101, "آموزش PHP", "زبان برنامه نویسی PHP یکی از مهمترین و قدرتمند ترین زبان های برنامه نویسی تحت وب است. در دوره مقدماتی این آموزش، شما پس از مرور دستورات HTML، با تعاریف پایه و قواعد کدنویسی آشنا شده و مفهوم شی گرایی را بصورت کامل خواهید آموخت. همچنین نحوه کار با انواع داده ها، متغیرها، عملگرها و توابع از دیگر مباحثی است که در این دوره آموزشی بصورت کامل به آن پرداخته شده است. ", 3));

        data.add(new Course(10102, "آموزش Audition CC", " نرم افزار Audition یکی از مهم ترین و پرکاربردترین نرم افزارهای ضبط و ویرایش فایل های صوتی است. در دوره مقدماتی این آموزش شما با محیط کاری و تنظیمات برنامه و روش های وارد کردن، ضبط و انتخاب صدا آشنا می شوید. همچنین آشنایی با برخی از ابزارها و کنترل ها، تنظیم دستی و نرمال سازی Level صدا و افزودن Fadeها بخشی دیگر از عناوین این دوره آموزشی است.", 3));

        data.add(new Course(10103, "آموزش SQL Server 2014", "نرم افزار SQL Server يكي ازمحبوب ترین و قدرتمند ترین نرم افزارهای طراحی و مديريت بانك‌‌هاي اطلاعاتي رابطه ای می باشد. در این دوره آموزشی شما با نحوه نصب برنامه SSMS، روش های مختلف ایجاد یک بانک اطلاعاتی و جداول آشنا شده و نحوه کار با انواع داده ها را فرا خواهید گرفت. همچنین اصول کار با کلید اصلی، Index ها و قیدها از دیگر مطالبی است که در این دوره آموزشی خواهید آموخت. علاوه بر این، با آموزش مباحثی نظیر روابط میان جدول و تضمین ارتباط روش های نرمال سازی را نیز فرا خواهید گرفت.", 2));

        data.add(new Course(10104, "آموزش Primavera P6", " نرم افزار Primavera یکی از مهمترین نرم افزارهای مدیریت پروژه است. در دوره مقدماتی این آموزش، شما ابتدا با مفاهیم اولیه پروژه آشنا شده، سپس با مطالعه مباحثی نظیر EPS ،OBS و WBS، نحوه ایجاد یک پروژه و تقویم کاری را فرا خواهید گرفت. در ادامه این دوره نیز، با مفاهیمی نظیر Milestone ،Project Code ،Activity و Step آشنا خواهید شد. کار با نمودار گانت، مقیاس های زمانی، مسیر بحرانی و شناوری و همچنین کار با WPs و Docs نیز از دیگر مباحث این دوره آموزشی می باشد.", 2));

        data.add(new Course(20101, "آموزش MATLAB 2015", "نرم افزار MATLAB یک محیط نرم افزاری برای انجام محاسبات عددی و یک زبان برنامه نویسی نسل چهارم است. در دوره مقدماتی این آموزش، شما ابتدا با نحوه ایجاد و مدیریت ماتریس ها آشنا شده، سپس با مطالعه مبحث انواع عملگرها، نحوه کار با ساختار های کنترلی را فرا خواهید گرفت. در ادامه این دوره نیز، با مفهوم تابع آشنا شده و نحوه کار با انواع توابع را خواهید آموخت. کار با اعداد مختلط، توابع مرتب سازی ماتریس ها و توابع کار با بردارها نیز از دیگر مباحث این دوره آموزشی می باشد.", 3));

        data.add(new Course(20102, "آموزش Illustrator CC", "نرم افزار Illustrator یکی از مهم ترین و پرکاربردترین نرم افزارهای طراحی تصاویر Vector یا برداری است. در دوره مقدماتی این آموزش شما با محیط کاری، روش های ایجاد و ذخیره فایل ها، ابزارهای ساده ترسیم و ویرایش اشکال آشنا می شوید. همچنین نحوه کار با Artboard، پیمایش، ذخیره و پیش نمایش اسناد را به همراه جزئیات کاملی از رنگ آمیزی و روشهای مختلف آن فرا خواهید گرفت.", 3));

        data.add(new Course(20103, "آموزش Dreamweaver CC", "نرم افزار Dreamweaver یکی از مهمترین و پرکاربردترین نرم افزارهای طراحی صفحات وب است. در دوره مقدماتی این آموزش، شما ابتدا با مفاهیم اولیه کار با نرم افزار آشنا شده، سپس کدهای HTML و نحوه بکارگیری آن ها را فرا خواهید گرفت. کار با CSS و مفاهیم ID و Class نیز از دیگر مباحث این دوره آموزشی می باشد. علاوه بر این، روش های مختلف طرح بندی، از دیگر مباحث این دوره آموزشی است. در ادامه این دوره نیز، با نحوه کار با پانل های مختلف برنامه نظیر Insert ،Properties و Files آشنا خواهید شد.", 2));

        data.add(new Course(30101, "آموزش SolidWorks 2014", "نرم افزار SolidWorks یکی از محبوب ترین و قدرتمندترین نرم افزار ها در زمینه طراحی سه بعدی مکانیکی در جهان بوده که که ما در این مرجع آموزشی نحوه کار با آن را به شما خواهیم آموخت. در دوره مقدماتی این آموزش، شما ابتدا با نرم افزار، محیط کاری Sketch و ابزارهای ترسیم آشنا شده و اصول اندازه گذاری و قیدگذاری را فراخواهید گرفت. حالت های ترسیم و تکثیر ترسیمات نیز از دیگر مباحث این دوره آموزشی است. پس از آن نیز با آشنایی با محیط 3D-Sketch، نحوه کار با Block ها، تصاویر و انواع دستورات ویرایشی را بصورت کامل و با جزئیات فراوان خواهید آموخت.", 3));

        data.add(new Course(30102, "آموزش InDesign CC", "نرم افزار InDesign یکی از مهم ترین نرم افزارهای صفحه آرایی و طراحی کتاب، مجله و روزنامه است. در دوره مقدماتی این آموزش، شما با محیط عمومی برنامه آشنا شده و روش های ایجاد، ذخیره و باز کردن اسناد را خواهید آموخت. همچنین نحوه مدیریت اسناد، کار با پانل ابزار، ترسیم و ویرایش اشکال، درج و قالب بندی متن نیز از دیگر مباحث این دوره آموزشی است. علاوه بر موارد ذکر شده، شما در دوره مقدماتی با اصول و روشهای رنگ آمیزی و کار با گرادیان ها و خط کش ها نیز آشنا خواهید شد.", 3));

        data.add(new Course(30103, "آموزش Mac OS X", "Mac OS X آخرین نسخه از سیستم عامل Mac بوده که توسط شرکت Apple ارائه می شود. در این دوره آموزشی، یک شبیه ساز نصب این سیستم عامل طراحی و تعبیه شده است که شما با استفاده از آن می توانید بارها و بارها به نصب مجازی Mac بپردازید. علاوه بر این، در این دوره با مطالبی در خصوص مزایای کار با Mac، تفاوت های آن با ویندوز، روش های اتصال و جدا سازی وسایل جانبی و مبانی کار با این سیستم عامل آشنا خواهید شد. کار با Finder، کنترل نحوه نمایش و کار با Menu Bar نیز از دیگر مطالب این دوره آموزشی است.", 3));

        data.add(new Course(30104, "آموزش AutoCAD 2014", "نرم افزار AutoCAD یکی از مهم ترین و پرکاربردترین نرم افزارهای طراحی های دو و سه بعدی و همچنین ترسیم فنی است. در دوره مقدماتی این آموزش شما با محیط کاری، روش های ایجاد و ذخیره فایل ها، اصول کار با دستگاه های مختصات و روش های مختصات دهی آشنا می شوید. همچنین اصول ترسیم، انتخاب و ویرایش اشکال ساده و ترکیبی را به همراه جزئیات کاملی از دستگیره های O’Snap فراخواهید گرفت.", 3));

        data.add(new Course(40101, "آموزش Maya 2015", "نرم افزار Maya یکی از مهمترین و پرکاربردترین نرم افزارای ساخت Objectهای سه بعدی در دنیا می باشد. در دوره مقدماتی این آموزش، شما با مفاهیمی نظیر مکعب دید و View Portها آشنا شده و نحوه ترسیم انواع Polygonهای ساده را فرا خواهید گرفت. همچنین نحوه ویرایش، سازماندهی و مدیریت Objectها از دیگر مباحث این دوره آموزشی بوده که با مثال هایی در خصوص مدلسازی ساختمان و پرنده تکمیل شده است. علاوه بر موارد ذکر شده ، شما در دوره مقدماتی با برخی از ابزارها، روش های مدلسازی و Deformerها نیز آشنا خواهید شد.", 3));

        data.add(new Course(40102, "آموزش MS Project 2013", "نرم افزار Project یکی از افزارهای قدرتمند مدیریت پروژه است. در دوره مقدماتی این آموزش، شما ابتدا با مفاهیم اولیه پروژه و برنامه ریزی آشنا شده، سپس با مطالعه مباحثی نظیر WBS و Milestone، نحوه زمان بندی دستی و خودکار را فراخواهید گرفت. در ادامه این دوره نیز، با مفاهیمی نظیر Recurring ،Timeline، روابط، پیش نیازی، پس نیازی، قیدها و Deadline آشنا خواهید شد. فعالیت های بحرانی، محاسبه شناوری، سفارشی کردن نمای گانت و تعریف و تخصیص منابع نیز از دیگر مباحث این دوره آموزشی می باشد.", 3));

        data.add(new Course(50101, "آموزش After Effects CC", "نرم افزار After Effects یکی از قدرتمند ترین نرم افزارهای کار بر روی فایلهای ویدئویی است که توسط شرکت Adobe عرضه شده و امکان درج محدوده وسیعی از تغییرات را به شما ارائه می کند. در دوره مقدماتی آموزش این نرم افزار، شما با نحوه وارد کردن انواع فایلها، ایجاد Compositionها، کار با Keyframeها و لایه ها آشنا خواهید شد. همچنین روشهای درج و ویرایش متن، کار با Pre-Composeها و کانال Alpha فقط بخش کوچکی از مطالبی است که در این دوره آموزشی مطرح شده است.", 3));

        data.add(new Course(50102, "آموزش CorelDRAW X6", "نرم افزار CorelDRAW، یکی از مهم ترین و پرکاربردترین نرم افزارها، برای ایجاد تصاویر دو بعدیِ Vector یا برداری است. در دوره مقدماتی این آموزش، با محیط کاری و روش های ایجاد و ذخیره فایل ها آشنا خواهید شد. همچنین اصول ترسیم انواع اشکال دو بعدی به همراه دستورات و تنظیمات ویرایشی آنها از دیگر مباحثی است که در این دوره آموزشی فراخواهید گرفت.", 2.5));

        data.add(new Course(60101, "آموزش 3ds Max 2014", "نرم افزار 3ds Max یکی از پرکاربردترین نرم افزارهای ساخت و متحرک سازی انیمیشن های دو و سه بعدی است که قدرت مدل سازی اشیاء در آن فوق العاده بوده، با این وجود ساختاری کاملاً انعطاف پذیر دارد. در دوره مقدماتی این آموزش، با محیط عمومی برنامه، مکعب دید و ابزار Steering Wheels آشنا می شوید. همچنین روش های ایجاد و ویرایش اجسام هندسی استاندارد و Extended را فراگرفته و با نحوه ترسیم انواع درب و پنجره و گیاهان آشنا خواهید شد.", 2));

        data.add(new Course(60102, "آموزش Windows 7", "Windows 7 یکی از محبوب ترین سیستم عامل هایی است که در سال ۲۰۰۹ توسط شرکت مایکروسافت ارائه شده است. در این دوره آموزشی، یک شبیه ساز نصب ویندوز طراحی و تعبیه شده است که شما با استفاده از آن می توانید بارها و بارها به نصب مجازی ویندوز بپردازید. علاوه بر این، در این دوره با مطالبی در خصوص نام کاربری، منوی Start، اجزاء تشکیل دهنده ویندوز، روش های ایجاد فایل ها، فولدرها و میان برها آشنا خواهید شد. اصول انتخاب، ویرایش فایل ها و تنظیمات UAC نیز از دیگر مطالب این دوره آموزشی است.", 3));

        data.add(new Course(60103, "آموزش Windows 8", " Windows 8 جدیدترین و بروز ترین سیستم عاملی است که از سوی شرکت مایکروسافت عرضه شده که بدلیل تفاوت های گرافیکی و ساختاری آن، کاربران بسیاری را به سمت خود جذب کرده است. در دروس دوره مقدماتی آموزش این سیستم عامل، شما با دلایل استفاده از Windows 8 و تفاوت های آن با Windows 7 آشنا خواهید شد. همچنین نحوه نصب این سیستم عامل را نیز با استفاده از یک شبیه ساز بسیار قدرتمند فرا گرفته و اصول بوت دوگانه را نیز خواهید آموخت. علاوه بر این، کار با منوی Start، میزکار، میانبرها، نوار وظیفه، آیکون ها، نوار Charms، بخش Libraries و مرورگر فایل ها از دیگر مطالبی است که در این دوره آموزش مورد بحث و بررسی قرار گرفته است. در پایان این دوره آموزشی نیز ویژگی های جدید Windows 8.1 بطور کامل آموزش داده شده است.", 5));

    }
}
