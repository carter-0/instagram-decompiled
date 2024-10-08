package X;

import android.content.Context;
import android.view.View;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7Ix  reason: invalid class name and case insensitive filesystem */
public final class C329447Ix implements View.OnClickListener {
    public final /* synthetic */ C329437Iw A00;
    public final /* synthetic */ boolean A01;

    public C329447Ix(C329437Iw r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(907330916);
        C329437Iw r6 = this.A00;
        C308476Uk r1 = r6.A08;
        if (r1 != null) {
            r1.A01((Boolean) null, false, false);
        }
        boolean z = this.A01;
        C329247Id r3 = r6.A07;
        if (z) {
            String AuW = r6.A06.AuW();
            C329067Hl r62 = r3.A02.A01;
            C70797OLs oLs = r62.A0g;
            if (oLs != null) {
                C254783t2 r8 = r62.A1z;
                0qQ.A0B(r8, 0);
                if (!(r8 instanceof AnonymousClass9HR)) {
                    Context context = r62.A1R;
                    0qQ.A0B(context, 0);
                    if (TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - oLs.A00) >= 15) {
                        C310336ap r12 = new C310336ap();
                        r12.A05();
                        r12.A0H = "Attempted to edit message after the time limit";
                        r12.A0D = context.getString(2131959200);
                        r12.A0I = context.getString(2131959199);
                        1xC.A01.A00(new AnonymousClass3GP(r12.A00()));
                        r62.A15();
                    }
                }
                String str = oLs.A02;
                if (str != null) {
                    0wc r2 = r62.A1c.A00;
                    0Aj A002 = r2.A00(r2.A00, "direct_edit_message");
                    if (A002.isSampled()) {
                        A002.AAJ("action", "done");
                        A002.AAJ("message_type", 2FW.A1g.toString());
                        A002.AAJ("message_id", str);
                        A002.A7p("is_e2ee", Boolean.valueOf(AnonymousClass6W3.A07(r8)));
                        A002.AAJ("open_thread_id", AnonymousClass4KK.A02(r8));
                        A002.A9F("occamadillo_thread_id", AnonymousClass4KK.A01(r8));
                        A002.Cgf();
                    }
                    AnonymousClass7L9 r0 = AnonymousClass9H7.A01(r62.A1i.A00).A0j.A03;
                    if (r0 != null) {
                        AnonymousClass7L7 r32 = r0.A05;
                        r32.A03.ELc((C254783t2) r32.A08.invoke(), str, AuW, r0.A03.A00());
                        r62.A15();
                    } else {
                        0qQ.A0F("directSendHelper");
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
            }
        } else {
            C329337Im r22 = r6.A06;
            r3.A01(r22.Azu(), (Long) null, 00l.A0B(r22.AuW()).toString());
            r6.A01 = true;
        }
        AnonymousClass0fD.A0C(-244295350, A05);
    }
}
