package com.instagram.contentnotes.data;

import X.0eS;
import X.0sL;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass4JK;
import X.AnonymousClass7TE;
import X.C54343H8p;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.contentnotes.data.ContentNotesRepository$deleteNote$1", f = "ContentNotesRepository.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
public final class ContentNotesRepository$deleteNote$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ AnonymousClass4JK A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContentNotesRepository$deleteNote$1(AnonymousClass4JK r2, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, AnonymousClass4D7 r11) {
        super(2, r11);
        this.A01 = r2;
        this.A07 = str;
        this.A08 = str2;
        this.A03 = str3;
        this.A06 = str4;
        this.A09 = str5;
        this.A04 = str6;
        this.A02 = num;
        this.A05 = str7;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.contentnotes.data.ContentNotesRepository$deleteNote$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r13) {
        return new ContentNotesRepository$deleteNote$1(this.A01, this.A02, this.A07, this.A08, this.A03, this.A06, this.A09, this.A04, this.A05, r13);
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [com.instagram.contentnotes.data.ContentNotesRepository$deleteNote$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r2 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            C54343H8p h8p = new C54343H8p(this.A01.A00, this.A02, this.A07, this.A08, this.A03, this.A06, this.A09, this.A04, this.A05);
            this.A00 = 1;
            if (h8p.A00(this) == r2) {
                return r2;
            }
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ContentNotesRepository$deleteNote$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
