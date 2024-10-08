package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.7jT  reason: invalid class name and case insensitive filesystem */
public final class C339357jT {
    public int A00;
    public long A01;
    public ImageView A02;
    public LinearLayout A03;
    public LinearLayout A04;
    public TextView A05;
    public String A06 = "";
    public List A07 = new ArrayList();
    public boolean A08;
    public final View A09;
    public final UserSession A0A;
    public final HashMap A0B = new HashMap();
    public final AnonymousClass4DH A0C;
    public final C357638Yz A0D;
    public final List A0E = new ArrayList();
    public final List A0F = new ArrayList();

    public final void A03(C391019sD r10) {
        0qQ.A0B(r10, 0);
        if (!this.A08) {
            Fragment fragment = this.A0C;
            if (!fragment.isAdded()) {
                return;
            }
            if (this.A0B.get(r10) == null || this.A01 <= System.currentTimeMillis() - 300000) {
                this.A08 = true;
                C2601144i.A00();
                UserSession userSession = this.A0A;
                Context context = this.A09.getContext();
                0qQ.A07(context);
                0gy A002 = AnonymousClass07i.A00(fragment);
                C385289ih r2 = new C385289ih(this, r10);
                1NY r5 = new 1NY(userSession, -2);
                r5.A08(AnonymousClass05K.A0N);
                r5.A0A("live/get_live_presence/");
                r5.A0O((15p) null, C384629hd.class, AB5.class, true);
                r5.A9m("presence_camera_type", r10.A00);
                if (r10 == C391019sD.STORY && 1NM.A01(userSession)) {
                    r5.A9m("presence_type", "1hr");
                }
                1OC A0M = r5.A0M();
                A0M.A00 = r2;
                1ES.A00(context, A002, A0M);
                return;
            }
            if (182.A06(0Tu.A05, this.A0A, 2342154264757010910L)) {
                A01(this, r10);
            } else {
                A02(this, r10);
            }
        }
    }

    private final LinearLayout A00() {
        View inflate = ((ViewStub) this.A09.requireViewById(R.id.iglive_presence_overlay_stub)).inflate();
        0qQ.A0C(inflate, C273654mx.A00(1));
        LinearLayout linearLayout = (LinearLayout) inflate;
        this.A03 = linearLayout;
        if (182.A06(0Tu.A05, this.A0A, 36322817595288012L)) {
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            layoutParams.height = -2;
            linearLayout.setLayoutParams(layoutParams);
        }
        return linearLayout;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x015a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C339357jT r23, X.C391019sD r24) {
        /*
            r6 = r23
            java.util.HashMap r8 = r6.A0B
            r9 = r24
            java.lang.Object r0 = r8.get(r9)
            X.9IM r0 = (X.AnonymousClass9IM) r0
            if (r0 == 0) goto L_0x00f1
            int r0 = r0.A00
            if (r0 <= 0) goto L_0x00f1
            java.lang.Object r0 = r8.get(r9)
            X.9IM r0 = (X.AnonymousClass9IM) r0
            r5 = 0
            if (r0 == 0) goto L_0x0141
            int r10 = r0.A00
        L_0x001d:
            android.widget.LinearLayout r0 = r6.A03
            if (r0 != 0) goto L_0x0063
            android.widget.LinearLayout r3 = r6.A00()
            r6.A03 = r3
            r0 = 2131434456(0x7f0b1bd8, float:1.8490726E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r6.A02 = r0
            r0 = 2131434459(0x7f0b1bdb, float:1.8490733E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.A05 = r0
            android.view.View r0 = r6.A09
            android.content.Context r0 = r0.getContext()
            X.0qQ.A07(r0)
            int r0 = X.0nA.A09(r0)
            float r2 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 1059481190(0x3f266666, float:0.65)
            float r1 = r1 - r0
            float r2 = r2 * r1
            int r0 = (int) r2
            int r2 = r0 / 2
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            X.0qQ.A0C(r1, r0)
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r1.setMargins(r2, r5, r2, r5)
        L_0x0063:
            int r0 = r9.ordinal()
            r4 = 1
            java.lang.String r3 = "Required value was null."
            if (r0 == r4) goto L_0x0122
            if (r0 != r5) goto L_0x008e
            android.widget.TextView r7 = r6.A05
            if (r7 == 0) goto L_0x0160
            X.4DH r0 = r6.A0C
            android.content.Context r0 = r0.requireContext()
            android.content.res.Resources r2 = r0.getResources()
            r1 = 2131963996(0x7f13305c, float:1.9564761E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r2.getString(r1, r0)
        L_0x008b:
            r7.setText(r0)
        L_0x008e:
            java.lang.Object r0 = r8.get(r9)
            X.9IM r0 = (X.AnonymousClass9IM) r0
            if (r0 != 0) goto L_0x00f2
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x009b:
            X.4DH r0 = r6.A0C
            android.content.Context r9 = r0.requireContext()
            java.lang.String r17 = r0.getModuleName()
            android.content.Context r0 = r0.requireContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165213(0x7f07001d, float:1.7944637E38)
            int r19 = r1.getDimensionPixelSize(r0)
            java.lang.Integer r12 = X.AnonymousClass05K.A00
            r10 = 0
            r11 = r10
            r13 = r10
            r14 = r10
            r15 = r10
            r16 = r10
            r22 = r4
            r23 = r4
            r24 = r5
            r20 = r4
            r21 = r5
            r18 = r8
            android.graphics.drawable.Drawable r1 = X.C244283aw.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            android.widget.ImageView r0 = r6.A02
            if (r0 == 0) goto L_0x015a
            r0.setImageDrawable(r1)
            X.8Yz r0 = r6.A0D
            X.80m r0 = r0.A08
            java.lang.Object r1 = r0.A00
            X.80L r0 = X.AnonymousClass80L.A00
            if (r1 == r0) goto L_0x00ea
            X.9QA r0 = X.AnonymousClass9QA.A00
            if (r1 != r0) goto L_0x014a
            com.instagram.common.session.UserSession r0 = r6.A0A
            boolean r0 = X.1NM.A01(r0)
            if (r0 == 0) goto L_0x014a
        L_0x00ea:
            android.widget.LinearLayout r0 = r6.A03
            if (r0 == 0) goto L_0x0144
            r0.setVisibility(r5)
        L_0x00f1:
            return
        L_0x00f2:
            java.lang.Object r0 = r0.A01
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            com.instagram.common.session.UserSession r10 = r6.A0A
            X.17i r9 = X.17h.A00(r10)
            java.util.Iterator r7 = r0.iterator()
        L_0x0105:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x009b
            java.lang.Object r2 = r7.next()
            java.lang.String r2 = (java.lang.String) r2
            com.instagram.user.model.User r0 = r9.A02(r2)
            if (r0 != 0) goto L_0x011e
            X.441 r1 = X.AnonymousClass441.A02
            r0 = 0
            r1.A02(r10, r0, r2)
            goto L_0x0105
        L_0x011e:
            r8.add(r0)
            goto L_0x0105
        L_0x0122:
            android.widget.TextView r7 = r6.A05
            if (r7 == 0) goto L_0x0166
            X.4DH r0 = r6.A0C
            android.content.Context r0 = r0.requireContext()
            android.content.res.Resources r2 = r0.getResources()
            r1 = 2131820760(0x7f1100d8, float:1.9274244E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r2.getQuantityString(r1, r10, r0)
            goto L_0x008b
        L_0x0141:
            r10 = 0
            goto L_0x001d
        L_0x0144:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x014a:
            android.widget.LinearLayout r1 = r6.A03
            if (r1 == 0) goto L_0x0154
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0154:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x015a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0160:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0166:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C339357jT.A01(X.7jT, X.9sD):void");
    }

    public static final void A02(C339357jT r14, C391019sD r15) {
        LayoutInflater layoutInflater;
        AnonymousClass9IM r0 = (AnonymousClass9IM) r14.A0B.get(r15);
        if (r0 != null && r0.A00 > 0) {
            if (r14.A03 == null) {
                LinearLayout A002 = r14.A00();
                r14.A03 = A002;
                r14.A04 = (LinearLayout) A002.findViewById(R.id.quick_capture_presence_facepile_container);
                r14.A05 = (TextView) A002.findViewById(R.id.quick_capture_presence_text);
                Context context = r14.A09.getContext();
                0qQ.A07(context);
                int A092 = ((int) (((float) 0nA.A09(context)) * (1.0f - 0.65f))) / 2;
                ViewGroup.LayoutParams layoutParams = A002.getLayoutParams();
                0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(A092, 0, A092, 0);
            }
            TextView textView = r14.A05;
            if (textView != null) {
                textView.setText(r14.A06);
                List<String> list = r14.A07;
                ArrayList arrayList = new ArrayList();
                UserSession userSession = r14.A0A;
                17i A003 = 17h.A00(userSession);
                for (String str : list) {
                    User A022 = A003.A02(str);
                    if (A022 == null) {
                        AnonymousClass441.A02.A02(userSession, (C330317Mh) null, str);
                    } else {
                        arrayList.add(A022.Bh3());
                    }
                }
                List<View> list2 = r14.A0F;
                for (View visibility : list2) {
                    visibility.setVisibility(8);
                }
                AnonymousClass4DH r9 = r14.A0C;
                Object systemService = r9.requireContext().getSystemService(AnonymousClass000.A00(318));
                if (systemService instanceof LayoutInflater) {
                    layoutInflater = (LayoutInflater) systemService;
                } else {
                    layoutInflater = null;
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (list2.size() <= i) {
                        if (layoutInflater != null) {
                            View inflate = layoutInflater.inflate(R.layout.quick_capture_social_presence_avatar, r14.A03, false);
                            0qQ.A0C(inflate, C273654mx.A00(2));
                            LinearLayout linearLayout = r14.A04;
                            if (linearLayout != null) {
                                linearLayout.addView(inflate);
                                list2.add(inflate);
                                List list3 = r14.A0E;
                                View findViewById = inflate.findViewById(R.id.quick_capture_presence_image);
                                0qQ.A0C(findViewById, C66579MXk.A00(67));
                                list3.add(findViewById);
                                inflate.requireViewById(R.id.quick_capture_presence_dot).setVisibility(0);
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    ((View) list2.get(i)).setVisibility(0);
                    ((IgImageView) r14.A0E.get(i)).setUrl((ImageUrl) arrayList.get(i), r9);
                }
                Object obj = r14.A0D.A08.A00;
                if (obj == AnonymousClass80L.A00 || (obj == AnonymousClass9QA.A00 && 1NM.A01(userSession))) {
                    LinearLayout linearLayout2 = r14.A03;
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(0);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                LinearLayout linearLayout3 = r14.A03;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(8);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public C339357jT(View view, AnonymousClass4DH r3, UserSession userSession, C357638Yz r5) {
        this.A0A = userSession;
        this.A0C = r3;
        this.A09 = view;
        this.A0D = r5;
    }
}
