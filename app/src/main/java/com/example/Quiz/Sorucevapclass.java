package com.example.Quiz;

public class Sorucevapclass {
    public static String soru[]={
            "Agreed",
            "Above",
            "Absolutely",
            "Account",
            "Admiration",
            "Adequate",
            "Adjust",
            "Advice",
            "Admit",
            "Adolescent",
            "Advertising",
            "Agent",
            "Alive",
            "Although",
            "Anger",
            "Angle",
            "Anxiety",
            "Anyway",
            "Attempt",
            "Attend",
            "Available",
            "Attract",
            "Awful",
            "Awareness",
            "Arrive",
            // Hatasız //
            "Bake",
            "Balance",
            "Bet",
            "Bill",
            "Blood",
            "Bowl",
            "Belief",
            "Benefit",
            "Birth",
            "Bread",
            "Breathe",
            "Brown",
            "Building",
            "Blind",
            "Bite",
            "Blame",
            "Belt",
            "Blanket",
            "Borrow",
            "Bottle",
            //HATASIZ//
            "Call off",
            "Captive",
            "Cave",
            "Charm",
            "Chair",
            "Cling",
            //hatasız
            "Decline",
            "Delusion",
            "Dent",
            "Deportation",
            "Desperately",
            "Divorce",
            "Dream",
            //hatasız
            "Enormous",
            "Expect",
            "Earn",
            "Exile",
            "Efficient",
            "Emotion",
            "Essay",
            "Entertain",
            "Eyelash",
            //
            "Favorable",
            "Fall",
            "Feasible",
            "Fur",
            "Fugitive",
            "Fertile",
            "Faint",
            "Flu",
            "Flaw",
            "Fortunate",
            //
            "Gain",
            "Gap",
            "Generous",
            "Grow"

    };

    public static String cevaplar[][]={
            {"Cevap","Anlaşıldı","Üstünde","Bırakmak"},
            {"Üstünde","Altında","Yanında","Uzağında"},
            {"Nadiren","Mutlaka/Kesinlikle","Sıklıkla","Asla"},
            {"Hesap","Kesin","Doğru","Davranmak"},
            {"Kesinlik","Bildirim","Hayranlık","Dolmak"},
            {"Sağlamak","Yeterli","İtiraf","Söylem"},
            {"Ayarlamak","Sitem","Söylemek","Değiş-Tokuş"},
            {"Kin","Tavsiye","Kabullenmek","Benimsemek"},
            {"Geliştirmek","Kafasında Kurmak","Hayal Etmek","İtiraf Etmek"},
            {"Yaşlı","Çocuk","Ergen","Yetişkin"},
            {"Tanıtım","Reklamcılık","Sunum","Portföy"},
            {"Mutakabat","Gündem","Ajan,Temsilci","Hırsız"},
            {"Korkusuz","Canlı","Cansız","Yaşantı"},
            {"Rağmen","İçin","Değersiz","Hatta"},
            {"Sevinç","Melek","Üzüntü","Öfke/Hiddet"},
            {"Kara","Açı","Melek","Kızgın"},
            {"Sevinç","Korku","Endişe/Kaygı","Üzüntü"},
            {"Öbür, Başka","Beklemek, Ummak","Hiç Kimse, Kimse","Neyse, Her Neyse"},
            {"Farzetmek, Varsaymak","Garanti Etmek","Girişimde Bulunmak","Eklemek, İliştirmek"},
            {"Katılmak","Kaçınmak","Cezbetmek","Otorite"},
            {"Farzetme, Varsayım","İlgi, Özen, Dikkat","Kitle, İzleyici, Seyirci","Müsait,Mevcut,Uygun"},
            {"Cezbetmek","Tavır, Tutum","Kaçınmak, Önlemek","Uzak, Uzakta"},
            {"Ortalama","Berbat","Farkında","Ödül"},
            {"Makale","Bertaraf","Farkındalık","Farklı"},
            {"Ulaşmak","Kaybolmak","Hissetmek","Yok Olmak"},
            // Hatasız //
            {"Dengelemek","Kurutmak","Pişirmek","Öğütmek"},
            {"Başlangıç","Temel","Düzlem","Denge"},
            {"İddiaya Girmek","Olasılık","İnanmak","Isırmak"},
            {"Kan","Kör","Teklif","Fatura/Senet"},
            {"Suç","Kör","Kan","Göl"},
            {"Kase/Tas","Çatal","Bıçak","Kaşık"},
            {"Kemer","İnanç","Başlangıç","İnanmak"},
            {"Fayda","Zarar","Berbat","Düzenli"},
            {"Isırmak","Doğum","Doğum Günü","Vefat Zamanı"},
            {"Göğüs","Kahvaltı","Kırmak","Ekmek"},
            {"Nefes Almak","Fırçalamak","İnşa Etmek","Tükenmek"},
            {"Kahverengi","Siyah","Gri","Yeşil"},
            {"Yıkmak","Otobüs","Bina","İnşa Etmek"},
            {"Kan","Vücut","Kör","Görmek"},
            {"Ayıplamak","Kuş","Bit","Isırmak"},
            {"Isırmak","Dikkat Etmek","Tebrik Etmek","Suçlamak"},
            {"Kemer","Takı","Kolye","Bileklik"},
            {"Ranza","Battaniye","Yatak","Yastık"},
            {"Herhangi Birşey Satmak","Birine Birşey Vermek","Satın Almak","Ödünç Almak/Borç Almak"},
            {"Şişe","Kapak","Kutu","Tas"},
            //HATASIZ//
            {"İptal etmek","Başından savmak","Esir almak","Uzaklaştırmak"},
            {"Kale","Değişik","Esir","Halı"},
            {"Çene","Uzaylı","Alımlı","Mağara"},
            {"Yazıcı","Alımlı/Sevimli","Kil","Mütevazi"},
            {"Uyumsuz","Tablo","Sandalye","Anlaşmazlık"},
            {"Yaratmak","Anlaşmak/Uzlaşmak","Yapışmak/Sarılmak","Çarpışmak/Çarpmak"},
            //hatasız
            {"Çıldırmak","Uzlaşmak","Reddetmek/Geri Çevirmek","Affetmek"},
            {"Tahrip","Aldatma","Çöküntü","Hoş"},
            {"Güvenilir/Emin","Defo","Tahrip","Çöküntü/Göçük"},
            {"Hatasız","Umutsuz","Sürgün","Ayıp"},
            {"Çılgınca","Sinirle","Utançla","Umutsuzca"},
            {"Boşanma","Bozmak","İkilem","Çizim"},
            {"Hayal","Çizim","Değerli","Cesur"},
            //hatasız
            {"Verimli","İlgi çekici değil","İdare eder","Muazzam"},
            {"Ümit etmek","Çıkmak","Para Kazanmak","Doğuya Ait"},
            {"Ümit Etmek","Yorgun Düşmek","İflas Etmek","Para Kazanmak"},
            {"Sürgün","Hayat","Haricinde","Kulak"},
            {"Eşit","Rapor","Acil","Verimli"},
            {"Denk","Çılgın","Hüzün","Duygu"},
            {"Masal","Hikaye","Makale","Öykü"},
            {"Eğlendirmek","Affetmek","Sinirlendirmek","Gezdirmek"},
            {"Göz","Göz Kalemi","Gözaltı","Kirpik"},
            //
            {"Kurbağa","Ateş","Balık","Olumlu"},
            {"Kırılmak","Vurmak","Fırlatmak","Düşmek"},
            {"Kolaylaştırılabilir","Kaçabilir","Yenilebilir","Mümkün/Yapılabilir"},
            {"Kumaş","Silinmek","Ateş","Kürk"},
            {"Kaçak","İflas Etmek","Sürgün","Yerlebir"},
            {"Parmaklık","Hayati(önem)","Uyumlu","Bereketli"},
            {"Uzlaşmak","Gerçeği Görmek","Ayılmak","Bayılmak"},
            {"Mide ağrısı","Ateş(hastalık)","Öksürük","Grip"},
            {"Lezzetsiz","Lezzet","Kusursuz","Kusur"},
            {"Lezzet","Parmak","Dayanıksız/Çürük","Minnettar"},
            //
            {"Almak","Elinden Kaçırmak","Uçmak","Kazanmak"},
            {"Hakiki/Gerçek","Deha/Dahi","Cömert","Boşluk/Fark"},
            {"Korumak","Damat","Misafir","Cömert"},
            {"Yer çekimi","Büyümek","Korumak","Elde etmek"}




    };

    public static String cevap[]={
            "Anlaşıldı",
            "Üstünde",
            "Mutlaka/Kesinlikle",
            "Hesap",
            "Hayranlık",
            "Yeterli",
            "Ayarlamak",
            "Tavsiye",
            "İtiraf Etmek",
            "Ergen",
            "Reklamcılık",
            "Ajan,Temsilci",
            "Canlı",
            "Rağmen",
            "Öfke/Hiddet",
            "Açı",
            "Endişe/Kaygı",
            "Neyse, Her Neyse",
            "Girişimde Bulunmak",
            "Katılmak",
            "Müsait,Mevcut,Uygun",
            "Cezbetmek",
            "Berbat",
            "Farkındalık",
            "Ulaşmak",
            //Hatasız//
            "Pişirmek",
            "Denge",
            "İddiaya Girmek",
            "Fatura/Senet",
            "Kan",
            "Kase/Tas",
            "İnanç",
            "Fayda",
            "Doğum",
            "Ekmek",
            "Nefes Almak",
            "Kahverengi",
            "Bina",
            "Kör",
            "Isırmak",
            "Suçlamak",
            "Kemer",
            "Battaniye",
            "Ödünç Almak/Borç Almak",
            "Şişe",
            //HATASIZ//
            "İptal etmek",
            "Esir",
            "Mağara",
            "Alımlı/Sevimli",
            "Anlaşmazlık",
            "Yapışmak/Sarılmak",
            // hatasız
            "Reddetmek/Geri Çevirmek",
            "Aldatma",
            "Çöküntü/Göçük",
            "Sürgün",
            "Umutsuzca",
            "Boşanma",
            "Hayal",
            //hatasız
            "Muazzam",
            "Ümit etmek",
            "Para Kazanmak",
            "Sürgün",
            "Verimli",
            "Duygu",
            "Makale",
            "Eğlendirmek",
            "Kirpik",
            //
            "Olumlu",
            "Düşmek",
            "Mümkün/Yapılabilir",
            "Kürk",
            "Kaçak",
            "Bereketli",
            "Bayılmak",
            "Grip",
            "Kusur",
            "Minnettar",
            //
            "Kazanmak",
            "Boşluk/Fark",
            "Cömert",
            "Büyümek"


    };



}
