package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.UdF  reason: case insensitive filesystem */
public final class C15464UdF extends C331047Ph implements C231272rL, C231302rO, AnonymousClass71P {
    public final 2el A00;
    public final C229932oe A01;
    public final C273674n0 A02;
    public final AnonymousClass71R A03;
    public final C229122ms A04;
    public final Context A05;
    public final C322186vO A06;
    public final AnonymousClass71U A07;
    public final AnonymousClass71T A08;
    public final C231762sK A09;
    public final Map A0A = new HashMap();

    public final AnonymousClass6u8 BQA(String str) {
        0qQ.A0B(str, 0);
        return C13991Tnr.A0P(str, this.A0A);
    }

    public final void EZ4(int i) {
    }

    public C15464UdF(Context context, FragmentActivity fragmentActivity, AnonymousClass0iw r16, UserSession userSession, 2el r18, C322186vO r19, AnonymousClass32Q r20, C229122ms r21) {
        UserSession userSession2 = userSession;
        AnonymousClass32Q r10 = r20;
        AnonymousClass7TG.A1S(userSession2, r10);
        this.A05 = context;
        this.A06 = r19;
        this.A04 = r21;
        this.A00 = r18;
        C231762sK r4 = new C231762sK(context);
        this.A09 = r4;
        AnonymousClass71U r3 = new AnonymousClass71U(context);
        this.A07 = r3;
        AnonymousClass71T r2 = new AnonymousClass71T(context);
        this.A08 = r2;
        this.A02 = new C273674n0((C324266yu) null, r10, AnonymousClass05K.A01);
        this.A01 = new C229932oe();
        AnonymousClass71R r5 = new AnonymousClass71R(r16, userSession2, (C267644bx) null, new WX6(userSession2, fragmentActivity), r10, (String) null, (String) null);
        this.A03 = r5;
        r5.A01 = new WX7(this);
        A0B(r3, r5, r4, r2);
    }

    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [X.VNH, java.lang.Object] */
    public final void A0C() {
        C320156rr r1;
        A06();
        this.A01.A00.clear();
        C273674n0 r6 = this.A02;
        r6.A08(this.A06);
        if (AnonymousClass7TE.A1b(r6.A01)) {
            ? obj = new Object();
            obj.A00 = this.A05.getString(2131965894);
            A08(this.A07, obj);
            int A022 = r6.A02();
            for (int i = 0; i < A022; i++) {
                C3251571g A0E = r6.A0E(i);
                AnonymousClass6u8 BQA = BQA(AnonymousClass7TF.A0h(A0E));
                boolean z = true;
                if (this.A04.CKB() || i != r6.A02() - 1) {
                    z = false;
                }
                BQA.A00(i, z);
                A09(this.A03, A0E, BQA);
            }
            C229122ms r12 = this.A04;
            if (r12.CKB()) {
                A08(this.A09, r12);
            }
        } else {
            C3253572b r3 = new C3253572b();
            if (this.A04.CT5()) {
                r1 = C320156rr.ERROR;
                r3.A02 = R.drawable.loadmore_icon_refresh_compound;
                r3.A05 = new C18887WAz(this, 23);
            } else {
                Resources resources = this.A05.getResources();
                r1 = C320156rr.EMPTY;
                r3.A02 = R.drawable.empty_state_private;
                r3.A0D = resources.getString(2131965893);
                r3.A07 = resources.getString(2131965892);
            }
            A09(this.A08, r3, r1);
        }
        A07();
    }
}
