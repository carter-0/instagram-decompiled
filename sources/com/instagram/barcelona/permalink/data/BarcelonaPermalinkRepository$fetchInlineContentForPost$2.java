package com.instagram.barcelona.permalink.data;

import X.05G;
import X.0eS;
import X.0sP;
import X.0sn;
import X.15p;
import X.1Hj;
import X.1NY;
import X.1Xv;
import X.AnonymousClass00P;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.BBL;
import X.C239793Ih;
import X.C239803Ii;
import X.C297815sO;
import X.C41845B3m;
import X.C42111BHp;
import X.C51965G9l;
import X.C53384GnG;
import X.C54439HDr;
import X.C54847HVe;
import X.C59638JRg;
import X.C59639JRh;
import X.C60340gF;
import X.C61170le;
import X.C638918c;
import X.CDV;
import X.D0A;
import X.JRG;
import X.JV7;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.barcelona.permalink.data.BarcelonaPermalinkRepository$fetchInlineContentForPost$2", f = "BarcelonaPermalinkRepository.kt", i = {}, l = {544}, m = "invokeSuspend", n = {}, s = {})
public final class BarcelonaPermalinkRepository$fetchInlineContentForPost$2 extends AnonymousClass1Ek implements 0sP {
    public int A00;
    public final /* synthetic */ C54439HDr A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BarcelonaPermalinkRepository$fetchInlineContentForPost$2(C54439HDr hDr, String str, String str2, AnonymousClass4D7 r5) {
        super(1, r5);
        this.A01 = hDr;
        this.A02 = str;
        this.A03 = str2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.barcelona.permalink.data.BarcelonaPermalinkRepository$fetchInlineContentForPost$2, X.4D7] */
    public final AnonymousClass4D7 create(AnonymousClass4D7 r5) {
        return new BarcelonaPermalinkRepository$fetchInlineContentForPost$2(this.A01, this.A02, this.A03, r5);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((BarcelonaPermalinkRepository$fetchInlineContentForPost$2) create((AnonymousClass4D7) obj)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [com.instagram.barcelona.permalink.data.BarcelonaPermalinkRepository$fetchInlineContentForPost$2, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        List<C59639JRh> list;
        Object value3;
        1Hj r5 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            C54439HDr hDr = this.A01;
            05G r4 = hDr.A07;
            String str = this.A02;
            do {
                value = r4.getValue();
            } while (!r4.AIY(value, C53384GnG.A00((JV7) null, (C53384GnG) value, (JRG) null, (Integer) null, C54439HDr.A00(hDr, str, 0sn.A00, true), 2015, false, false, false, false)));
            UserSession userSession = hDr.A02;
            String str2 = this.A03;
            boolean A1V = AnonymousClass7TF.A1V(C638918c.A01(C61170le.A00).A05);
            this.A00 = 1;
            1NY A0b = AnonymousClass7TG.A0b(userSession);
            A0b.A0A("text_feed/{post_id}/inline_replies/");
            A0b.A9m("post_id", C51965G9l.A0u(str));
            A0b.A9m("permalink_post_id", 1Xv.A06(str2));
            A0b.A0H("is_app_start", A1V);
            A0b.A0O((15p) null, CDV.class, D0A.class, false);
            A0b.A0A = "text_feed/{post_id}/inline_replies/";
            A0b.A03();
            A0b.A0F("X-IG-App-ID", "871865944585275");
            obj = A0b.A0M().A00(104842234, this);
            if (obj == r5) {
                return r5;
            }
        }
        C239803Ii r11 = (C239803Ii) obj;
        if (r11 instanceof C239793Ih) {
            C59638JRg jRg = ((CDV) ((C239793Ih) r11).A00).A00;
            if (jRg == null) {
                C41845B3m.A0v();
                throw AnonymousClass00P.createAndThrow();
            }
            BBL bbl = ((C42111BHp) jRg).A00;
            if (!(bbl == null || (list = bbl.A05) == null)) {
                ArrayList A0r = AnonymousClass7TG.A0r(list);
                for (C59639JRh A002 : list) {
                    A0r.add(C54847HVe.A00(A002));
                }
                if (!A0r.isEmpty()) {
                    C54439HDr hDr2 = this.A01;
                    05G r42 = hDr2.A07;
                    String str3 = this.A02;
                    do {
                        value3 = r42.getValue();
                    } while (!r42.AIY(value3, C53384GnG.A00((JV7) null, (C53384GnG) value3, (JRG) null, (Integer) null, C54439HDr.A00(hDr2, str3, A0r, false), 2015, false, false, false, false)));
                    return C60340gF.A00;
                }
            }
        } else if (!(r11 instanceof C297815sO)) {
            throw AnonymousClass7TE.A1K();
        }
        C54439HDr hDr3 = this.A01;
        String str4 = this.A02;
        05G r43 = hDr3.A07;
        do {
            value2 = r43.getValue();
        } while (!r43.AIY(value2, C53384GnG.A00((JV7) null, (C53384GnG) value2, (JRG) null, (Integer) null, C54439HDr.A00(hDr3, str4, 0sn.A00, false), 2015, false, false, false, false)));
        return C60340gF.A00;
    }
}
