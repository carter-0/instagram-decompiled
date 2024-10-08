package X;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.UdE  reason: case insensitive filesystem */
public final class C15463UdE extends C331047Ph implements AnonymousClass71P {
    public EVG A00;
    public VT5 A01;
    public NLL A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final Context A06;
    public final C273674n0 A07;
    public final C15397Uc0 A08;
    public final NLI A09;
    public final NLI A0A;
    public final C336947fR A0B;
    public final NLR A0C;
    public final C46457DfL A0D;
    public final String A0E;
    public final Map A0F;
    public final Set A0G = new HashSet();
    public final C322186vO A0H;
    public final X4A A0I;
    public final C15553Ueh A0J;
    public final AnonymousClass71U A0K;
    public final C229122ms A0L;
    public final C231762sK A0M;

    public C15463UdE(Context context, UserSession userSession, C322186vO r21, AnonymousClass4DU r22, JPQ jpq, C15397Uc0 uc0, EVG evg, AnonymousClass32Q r26, C229122ms r27, boolean z) {
        WX3 wx3 = new WX3(this);
        this.A0I = wx3;
        Context context2 = context;
        this.A06 = context2;
        this.A08 = uc0;
        this.A0H = r21;
        UserSession userSession2 = userSession;
        AnonymousClass4DU r11 = r22;
        this.A07 = new C273674n0(new C324266yu(context2, r11, userSession2), r26, AnonymousClass05K.A01);
        this.A0L = r27;
        this.A0F = new HashMap();
        C336947fR r6 = new C336947fR(context2);
        this.A0B = r6;
        NLR nlr = new NLR(context2);
        this.A0C = nlr;
        C46457DfL dfL = new C46457DfL(context2, new C19706We8(this));
        this.A0D = dfL;
        this.A02 = new NLL(context2);
        AnonymousClass71U r2 = new AnonymousClass71U(context2);
        this.A0K = r2;
        C15553Ueh ueh = new C15553Ueh(context2, r11, userSession2, jpq, wx3, false, true, false);
        this.A0J = ueh;
        C231762sK r8 = new C231762sK(context2);
        this.A0M = r8;
        NLI nli = new NLI(context2);
        this.A0A = nli;
        NLI nli2 = new NLI(context2);
        this.A09 = nli2;
        this.A0E = context2.getString(2131961425);
        this.A00 = evg;
        this.A05 = z;
        NLR nlr2 = nlr;
        C46457DfL dfL2 = dfL;
        A0B(r6, nlr2, dfL2, this.A02, r2, ueh, r8, nli, nli2);
    }

    public static void A00(C15463UdE udE) {
        C61057Jvv jvv;
        NLI nli;
        C273674n0 r2 = udE.A07;
        r2.A08(udE.A0H);
        udE.A06();
        if (udE.A01 != null) {
            udE.A09(udE.A0B, new C46448DfA(2131974933), new Object());
            udE.A08(udE.A0C, new PR9((CompoundButton.OnCheckedChangeListener) new C18921WCy(udE, 2), 2131974934, udE.A01.A01));
            VT5 vt5 = udE.A01;
            if (vt5 != null) {
                udE.A08(udE.A02, new C71065Oak((View.OnClickListener) new WB9((Object) udE, 20), C253673rC.A02(DbV.A05(udE.A08), vt5.A00), 2131974935, 0));
            }
            if (r2.A02() != 0) {
                C46448DfA dfA = new C46448DfA(2131969352);
                dfA.A0G = udE.A0E;
                udE.A08(udE.A0D, dfA);
            }
        }
        if (r2.A02() != 0 && udE.A05) {
            int ordinal = udE.A00.ordinal();
            if (ordinal == 1) {
                jvv = new C61057Jvv(udE.A06.getString(2131969329), Integer.valueOf(R.drawable.instagram_info_pano_outline_24));
                jvv.A00 = 2131969330;
                jvv.A01 = new C19392WXj(udE, 1);
                nli = udE.A0A;
            } else if (ordinal == 2) {
                jvv = new C61057Jvv(udE.A06.getString(2131974117), Integer.valueOf(R.drawable.instagram_warning_pano_outline_24));
                jvv.A00 = 2131974116;
                jvv.A01 = new C19392WXj(udE, 2);
                nli = udE.A09;
            }
            udE.A08(nli, jvv);
        }
        if (!udE.A04 || AnonymousClass7TE.A1b(r2.A01)) {
            for (int i = 0; i < r2.A02(); i++) {
                C3251571g A0E2 = r2.A0E(i);
                Map map = udE.A0F;
                AnonymousClass6u8 r3 = (AnonymousClass6u8) map.get(AnonymousClass7TF.A0h(A0E2));
                if (r3 == null) {
                    r3 = new AnonymousClass6u8();
                    r3.A03 = udE.A03;
                    map.put(AnonymousClass7TF.A0h(A0E2), r3);
                }
                boolean z = true;
                if (udE.A0L.CKB() || i != r2.A02() - 1) {
                    z = false;
                }
                r3.A00(i, z);
                r3.A03 = udE.A03;
                udE.A09(udE.A0J, A0E2, r3);
            }
        }
        if (!udE.A04 || udE.A0L.CKB()) {
            udE.A08(udE.A0M, udE.A0L);
        }
        udE.A07();
    }

    public final void A0C() {
        boolean z = this.A03;
        boolean z2 = !z;
        if (z != z2) {
            this.A03 = z2;
            if (z2) {
                this.A0G.clear();
            }
            0fE.A00(this, -347549398);
        }
        this.A0G.clear();
    }

    public final AnonymousClass6u8 BQA(String str) {
        return (AnonymousClass6u8) this.A0F.get(str);
    }

    public final boolean isEmpty() {
        if (this.A07.A02() == 0 && this.A01 == null) {
            return true;
        }
        return false;
    }

    public final void notifyDataSetChanged() {
        A00(this);
    }
}
