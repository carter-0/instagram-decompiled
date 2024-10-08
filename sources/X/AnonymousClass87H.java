package X;

import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.87H  reason: invalid class name */
public final class AnonymousClass87H {
    public final /* synthetic */ C3509386y A00;

    public final void A0A(Drawable drawable, AnonymousClass57C r9, C317876nz r10) {
        A0B(drawable, r9, r10, (C310416b1) null, true, true);
    }

    public AnonymousClass87H(C3509386y r1) {
        this.A00 = r1;
    }

    public static void A01(Drawable drawable, AnonymousClass87H r2, C39890ADo aDo, boolean z) {
        r2.A0C(drawable, new C310416b1(aDo), z);
    }

    public final Drawable A02() {
        ArrayList A0V = this.A00.A01.A03.A1s.A0V(Drawable.class);
        if (AnonymousClass3S1.A04(A0V)) {
            return null;
        }
        return (Drawable) A0V.get(0);
    }

    public final C366678pU A03(C349307zv r27, String str) {
        C366678pU r20;
        AnonymousClass8QA r0 = this.A00.A01.A01;
        C349327zy A08 = r0.A08();
        C349307zv r1 = r27;
        if (r27 != null) {
            r0.A0G.A0A(r1.A0K, r1.A08, r1.A09, "front".equals(r1.A0f));
            FragmentActivity fragmentActivity = r0.A07;
            UserSession userSession = r0.A08;
            C3499582p r7 = r0.A0F;
            AnonymousClass81W r12 = ((NineSixteenLayoutConfigImpl) r0.A0E).A0K;
            int width = r12.getWidth();
            int height = r12.getHeight();
            C366688pV A002 = r0.A0D.A00();
            C279284yO A01 = AnonymousClass8QA.A01(r0);
            String str2 = r0.A0J;
            0qQ.A0B(r7, 2);
            0qQ.A0B(A01, 7);
            C366598pM r16 = C366588pL.A01;
            C3499482o r2 = r7.A02;
            r20 = new C366678pU(C366658pS.A00(fragmentActivity, (MediaUploadMetadata) null, userSession, A01, r7, (C366648pR) null, A08, r2.A01.A02(), (MusicOverlayStickerModel) null, str2, width, height, true), (C364758lx) null, A002, r16.A00(r2, A08.A01, false, false, false), true);
        } else {
            FragmentActivity fragmentActivity2 = r0.A07;
            UserSession userSession2 = r0.A08;
            C3499582p r72 = r0.A0F;
            AnonymousClass81W r13 = ((NineSixteenLayoutConfigImpl) r0.A0E).A0K;
            int width2 = r13.getWidth();
            int height2 = r13.getHeight();
            C364758lx A0G = r0.A0A.A0G();
            C279284yO A012 = AnonymousClass8QA.A01(r0);
            String str3 = r0.A0J;
            0qQ.A0B(r72, 2);
            0qQ.A0B(A012, 7);
            C366598pM r162 = C366588pL.A01;
            C3499482o r22 = r72.A02;
            r20 = new C366678pU(C366658pS.A00(fragmentActivity2, (MediaUploadMetadata) null, userSession2, A012, r72, (C366648pR) null, A08, r22.A01.A02(), (MusicOverlayStickerModel) null, str3, width2, height2, false), A0G, (C366688pV) null, r162.A00(r22, A08.A01, false, false, false), true);
        }
        String str4 = str;
        r0.A0L.put(str4, AnonymousClass8QA.A00(r0));
        r0.A0C(r20, str4);
        return r20;
    }

    public final void A04() {
        AnonymousClass87B r1 = this.A00.A0F;
        r1.A09.A03();
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = r1.A04;
        touchInterceptorFrameLayout.getClass();
        touchInterceptorFrameLayout.setVisibility(0);
    }

    public final void A05() {
        C3509386y r1 = this.A00;
        if (r1.A0A()) {
            AnonymousClass87G A01 = r1.A0H.A01();
            A01.getClass();
            if (r1.A02(A01).A0F()) {
                r1.A0K.E3H(AnonymousClass8T3.A00);
            }
        }
    }

    public final void A06() {
        ((AnonymousClass8ME) this.A00.A01.A03.A1g.get()).A1Q(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        if (r0 == null) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07() {
        /*
            r3 = this;
            X.86y r1 = r3.A00
            boolean r0 = r1.A0A()
            if (r0 == 0) goto L_0x0034
            X.8S4 r2 = r1.A01
            X.876 r0 = r1.A0H
            X.87G r0 = r0.A01()
            r0.getClass()
            X.AA8 r1 = r1.A02(r0)
            boolean r0 = r1 instanceof X.C387549mO
            if (r0 == 0) goto L_0x0035
            X.9mO r1 = (X.C387549mO) r1
            com.instagram.user.model.User r0 = r1.A03
            if (r0 == 0) goto L_0x0026
            android.graphics.Bitmap r0 = r1.A01
            r1 = 1
            if (r0 != 0) goto L_0x0027
        L_0x0026:
            r1 = 0
        L_0x0027:
            X.8BA r0 = r2.A03
            X.6if r0 = r0.A1g
            java.lang.Object r0 = r0.get()
            X.8ME r0 = (X.AnonymousClass8ME) r0
            r0.A1Q(r1)
        L_0x0034:
            return
        L_0x0035:
            boolean r0 = r1 instanceof X.C387449mE
            if (r0 == 0) goto L_0x003b
            r1 = 1
            goto L_0x0027
        L_0x003b:
            boolean r0 = r1 instanceof X.C387539mN
            if (r0 == 0) goto L_0x0048
            X.9mN r1 = (X.C387539mN) r1
            android.graphics.Bitmap r0 = r1.A00
            boolean r1 = X.AnonymousClass7TF.A1V(r0)
            goto L_0x0027
        L_0x0048:
            boolean r1 = r1.A0F()
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass87H.A07():void");
    }

    public final void A08(Drawable drawable) {
        if (drawable != null) {
            this.A00.A01.A03.A1s.A0S(drawable);
        }
    }

    public final void A09(Drawable drawable) {
        C71662eb r0 = this.A00.A0F.A09.A05;
        r0.getClass();
        View A01 = r0.A01();
        A01.setBackground(drawable);
        View[] viewArr = {A01};
        C71392co r02 = C315596kB.A02;
        C294975nL.A04((C295005nO) null, viewArr, false);
    }

    public final void A0B(Drawable drawable, AnonymousClass57C r9, C317876nz r10, C310416b1 r11, boolean z, boolean z2) {
        C3509386y r1 = this.A00;
        if (z2) {
            r1.A01.A00();
        }
        Drawable drawable2 = drawable;
        if (drawable != null) {
            C317876nz r4 = r10;
            if (r10 != null) {
                r1.A01.A03.A0e(drawable2, r9, r4, r11, z);
            }
        }
    }

    public final void A0C(Drawable drawable, C310416b1 r3, boolean z) {
        if (z) {
            this.A00.A01.A00();
        }
        AnonymousClass8S4 r0 = this.A00.A01;
        drawable.getClass();
        r0.A03.A0g(drawable, r3);
    }

    public final void A0D(2Rw r3, int i) {
        AnonymousClass87D r1 = this.A00.A0F.A09;
        boolean z = false;
        if (r3 != null) {
            z = true;
        }
        r1.A09 = z;
        AnonymousClass87D.A01(r1);
        r1.A00 = i;
        C71662eb r0 = r1.A04;
        r0.getClass();
        ((RecyclerView) r0.A01()).setAdapter(r3);
    }

    public final void A0E(AnonymousClass87I r7, 1Xj r8) {
        C3498482b r1;
        C3498482b r0;
        AnonymousClass8BA r2 = this.A00.A01.A03;
        int ordinal = r7.ordinal();
        if (ordinal == 9) {
            C3499482o r5 = r2.A14;
            UserSession userSession = r2.A0v;
            0qQ.A0B(r5, 0);
            0qQ.A0B(userSession, 1);
            boolean z = true;
            if (r8 == null || !r8.A5v()) {
                z = false;
            }
            AnonymousClass82Y r22 = r5.A01;
            r22.A0K = z;
            if (r8 == null || !r8.A5v()) {
                r1 = null;
            } else {
                r1 = new C3498482b(userSession, r8, (String) null, false);
            }
            r22.A04 = r1;
            if (r8 != null) {
                r22.A08 = r8;
            }
        } else if (ordinal == 19) {
            C3499482o r4 = r2.A14;
            UserSession userSession2 = r2.A0v;
            0qQ.A0B(r4, 0);
            0qQ.A0B(userSession2, 1);
            if (r8 == null) {
                r0 = null;
            } else {
                r0 = new C3498482b(userSession2, r8, (String) null, false);
            }
            r4.A01.A04 = r0;
        }
    }

    public final void A0F(BackgroundGradientColors backgroundGradientColors) {
        C3510287h r2 = this.A00.A01.A07;
        C353798Jc A002 = r2.A00();
        boolean z = false;
        if (backgroundGradientColors == null) {
            z = true;
        }
        AIY aiy = A002.A0B;
        aiy.getClass();
        aiy.A05 = z;
        C353798Jc A003 = r2.A00();
        if (A003.A0A != null) {
            AIY aiy2 = A003.A0B;
            aiy2.getClass();
            aiy2.A04(backgroundGradientColors, A003.A0A.A07());
        }
    }

    public final void A0G(C349327zy r8, List list) {
        C3509386y r1 = this.A00;
        if (r1.A0A()) {
            AnonymousClass87G A01 = r1.A0H.A01();
            A01.getClass();
            if (r1.A02(A01).A0F()) {
                AnonymousClass8S4 r2 = r1.A01;
                ArrayList arrayList = new ArrayList();
                r2.A07.A00().A0M(new C40418Abp(r2, r8, list, new ArrayList(), arrayList));
            }
        }
    }

    public final void A0H(CharSequence charSequence) {
        TextView textView = this.A00.A0F.A09.A02;
        textView.getClass();
        textView.setText(charSequence);
    }

    public final void A0I(CharSequence charSequence) {
        SearchEditText A002 = AnonymousClass87D.A00(this.A00.A0F.A09);
        A002.setText(charSequence);
        if (charSequence != null) {
            A002.setSelection(A002.getText().length());
        }
    }

    public final void A0J(String str) {
        this.A00.A0F.A09.A03.setText(str);
    }

    public final void A0K(String str, String str2) {
        AnonymousClass87D r3 = this.A00.A0F.A09;
        AnonymousClass87D.A00(r3).setFilters(new InputFilter[0]);
        TextView textView = r3.A02;
        textView.getClass();
        textView.setText(str);
        SearchEditText A002 = AnonymousClass87D.A00(r3);
        A002.setText("");
        A002.setSelection(A002.getText().length());
        AnonymousClass87D.A00(r3).setHint(str2);
        r3.A03.setText((CharSequence) null);
    }

    public final boolean A0L(AA8 aa8) {
        C3509386y r1 = this.A00;
        if (r1.A0A()) {
            AnonymousClass87G A01 = r1.A0H.A01();
            A01.getClass();
            if (!r1.A02(A01).equals(aa8)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static C39740A7g A00(AnonymousClass87H r2, 1Xj r3) {
        String id = r3.getId();
        id.getClass();
        return new C39740A7g(r2.A03((C349307zv) null, id), r3.getId());
    }
}
