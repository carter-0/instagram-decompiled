package X;

import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;

public abstract class E4R extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "QuickPromotionIIGFullscreenBaseFragment";
    public View A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public IgImageView A05;
    public QuickPromotionSlot A06;
    public AnonymousClass4UC A07;
    public C231002qi A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final Handler A0D = AnonymousClass7TF.A0D();
    public final AnonymousClass0eM A0E = C227642jf.A02(this);

    public final void A02(AnonymousClass4UC r5) {
        IgImageView igImageView;
        ImageUrl imageUrl;
        TextView textView;
        0qQ.A0B(r5, 0);
        C231002qi r0 = this.A08;
        if (r0 != null) {
            r0.DbK(r5);
        }
        AnonymousClass4V7 r2 = r5.A08;
        TextView textView2 = this.A04;
        if (textView2 != null) {
            textView2.setText(DbZ.A0n(r2.A09));
        }
        C283845Jo r02 = r2.A03;
        if (!(r02 == null || (textView = this.A01) == null)) {
            textView.setText(DbZ.A0n(r02));
        }
        AnonymousClass4VG r03 = r2.A01;
        if (r03 != null) {
            TextView textView3 = this.A02;
            if (textView3 != null) {
                textView3.setText(DbZ.A0n(r03.A00));
            }
            TextView textView4 = this.A02;
            if (textView4 != null) {
                FPG.A00(textView4, 38, r5, this);
            }
        }
        AnonymousClass4VG r04 = r2.A02;
        if (r04 != null) {
            TextView textView5 = this.A03;
            if (textView5 != null) {
                textView5.setText(DbZ.A0n(r04.A00));
            }
            TextView textView6 = this.A03;
            if (textView6 != null) {
                FPG.A00(textView6, 39, r5, this);
            }
        }
        C283905Ju r3 = r2.A06;
        C283905Ju r22 = r2.A07;
        if (AnonymousClass3HA.A00(requireContext()) && r3 != null) {
            igImageView = this.A05;
            if (igImageView != null) {
                imageUrl = r3.A00;
            } else {
                return;
            }
        } else if (r22 != null && (igImageView = this.A05) != null) {
            imageUrl = r22.A00;
        } else {
            return;
        }
        igImageView.setUrl(imageUrl, this);
    }

    public String getModuleName() {
        return "quick promotion";
    }

    public final void A01() {
        0hq r0 = this.mFragmentManager;
        if (r0 != null) {
            r0.A0c();
        }
        FragmentActivity activity = getActivity();
        if (this.A0C && activity != null) {
            activity.finish();
        }
    }

    public final void configureActionBar(2da r4) {
        if (this instanceof C47979EPl) {
            Dba.A1G(r4);
        } else {
            0qQ.A0B(r4, 0);
            if (this.A0B) {
                r4.Etr(true);
                r4.Eu4(true);
                F3V f3v = new F3V(AnonymousClass05K.A00);
                f3v.A01(-1);
                f3v.A02 = R.drawable.instagram_x_pano_outline_24;
                r4.ErJ(f3v.A00());
                View view = this.A00;
                if (view != null) {
                    0nA.A0e(view, DbV.A05(this).getDimensionPixelSize(R.dimen.avatar_powerups_avatar_height) - r4.AYI());
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            } else {
                r4.Etr(false);
            }
        }
        View view2 = this.mView;
        if (view2 != null) {
            view2.requestLayout();
        }
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0E);
    }

    public final boolean onBackPressed() {
        if (this instanceof C47981EPn) {
            return false;
        }
        return !this.A0B;
    }

    public static View A00(View view, E4R e4r) {
        e4r.A02 = (TextView) view.findViewById(R.id.primary_button);
        e4r.A03 = (TextView) view.findViewById(R.id.secondary_button);
        e4r.A01 = (TextView) view.findViewById(R.id.content);
        e4r.A04 = (TextView) view.findViewById(R.id.title);
        return view.findViewById(R.id.image);
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.4UC] */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0075, code lost:
        if (r1 == null) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0039, code lost:
        if (r4.length() == 0) goto L_0x003b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r14) {
        /*
            r13 = this;
            r0 = 704059827(0x29f719b3, float:1.09734616E-13)
            int r3 = X.AnonymousClass0fD.A02(r0)
            r8 = r13
            X.E4R.super.onCreate(r14)
            X.Dbb.A1M(r13)
            android.os.Bundle r1 = r13.requireArguments()
            java.lang.String r7 = "QuickPromotionIIGFullscreenBaseFragment.KEY_PROMOTION_SLOT"
            java.lang.String r0 = X.C320236s2.A01(r1, r7)
            com.instagram.quickpromotion.intf.QuickPromotionSlot r0 = com.instagram.quickpromotion.intf.QuickPromotionSlot.valueOf(r0)
            r13.A06 = r0
            java.lang.String r0 = "QuickPromotionIIGFullscreenBaseFragment.KEY_FRAGMENT_TAG_LAUNCH_AS_MODAL"
            boolean r0 = r1.getBoolean(r0)
            r13.A0C = r0
            X.0eM r6 = r13.A0E
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r6)
            java.lang.String r0 = "QuickPromotionIIGFullscreenBaseFragment.KEY_QUICK_PROMOTION"
            java.lang.String r4 = r1.getString(r0)
            if (r4 == 0) goto L_0x003b
            int r1 = r4.length()
            r0 = 0
            if (r1 != 0) goto L_0x003c
        L_0x003b:
            r0 = 1
        L_0x003c:
            r2 = 0
            if (r0 != 0) goto L_0x004f
            X.16F r0 = X.16P.A00(r4)     // Catch:{ IOException -> 0x0048 }
            X.4UC r2 = X.AnonymousClass4V6.parseFromJson(r0)     // Catch:{ IOException -> 0x0048 }
            goto L_0x004f
        L_0x0048:
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            java.lang.String r0 = "Error parsing fullscreen interstitial promotion"
            X.C46436Dey.A00(r5, r1, r0, r2)
        L_0x004f:
            r13.A07 = r2
            boolean r0 = r13 instanceof X.C47981EPn
            if (r0 == 0) goto L_0x0081
            android.os.Bundle r0 = r13.requireArguments()
            com.instagram.common.session.UserSession r2 = X.DbS.A0U(r0)
            java.lang.String r0 = X.C320236s2.A01(r0, r7)
            com.instagram.quickpromotion.intf.QuickPromotionSlot r1 = com.instagram.quickpromotion.intf.QuickPromotionSlot.valueOf(r0)
            X.EPk r0 = new X.EPk
            r0.<init>(r13, r13, r2, r1)
        L_0x006a:
            r13.A08 = r0
            X.4UC r0 = r13.A07
            if (r0 == 0) goto L_0x0077
            X.4V7 r0 = r0.A08
            X.4VG r1 = r0.A00
            r0 = 1
            if (r1 != 0) goto L_0x0078
        L_0x0077:
            r0 = 0
        L_0x0078:
            r13.A0B = r0
            r0 = -1555595260(0xffffffffa3478004, float:-1.081492E-17)
            X.AnonymousClass0fD.A09(r0, r3)
            return
        L_0x0081:
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r6)
            com.instagram.quickpromotion.intf.QuickPromotionSlot r12 = r13.A06
            if (r10 == 0) goto L_0x00a3
            if (r12 == 0) goto L_0x00a3
            X.1YN r7 = X.AnonymousClass2bO.A00()
            X.AnonymousClass2bO.A00()
            r1 = 8
            X.Fhb r0 = new X.Fhb
            r0.<init>(r13, r1)
            X.2bW r11 = X.2bV.A08(r0)
            r9 = r13
            X.2qi r0 = r7.A01(r8, r9, r10, r11, r12)
            goto L_0x006a
        L_0x00a3:
            r0 = 0
            goto L_0x006a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E4R.onCreate(android.os.Bundle):void");
    }

    public void onResume() {
        int A022 = AnonymousClass0fD.A02(-1387924602);
        super.onResume();
        AnonymousClass4UC r1 = this.A07;
        if (r1 == null || this.A0A) {
            A01();
            this.A09 = true;
        } else {
            A02(r1);
        }
        AnonymousClass0fD.A09(-499705806, A022);
    }
}
