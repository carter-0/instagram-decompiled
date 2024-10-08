package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.imagebutton.IgMultiImageButton;
import java.util.Arrays;
import java.util.Map;

/* renamed from: X.71R  reason: invalid class name */
public final class AnonymousClass71R extends C231632rz {
    public float A00 = -1.0f;
    public AnonymousClass726 A01;
    public boolean A02;
    public boolean A03;
    public final AnonymousClass0iw A04;
    public final UserSession A05;
    public final C267644bx A06;
    public final AnonymousClass32J A07;
    public final AnonymousClass32Q A08;
    public final String A09;
    public final String A0A;
    public final AnonymousClass71S A0B = new AnonymousClass71S();

    public final int getIdentifier(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        return String.valueOf(obj.hashCode()).hashCode();
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        UserSession userSession = this.A05;
        C3251571g r7 = (C3251571g) obj;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r7, 1);
        int[] iArr = new int[r7.A01()];
        int A012 = r7.A01();
        for (int i2 = 0; i2 < A012; i2++) {
            iArr[i2] = C321466uD.A00(userSession, (1Xj) r7.A02(i2));
        }
        return Arrays.hashCode(iArr);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int dimensionPixelSize;
        int i2;
        Object obj3 = obj2;
        Object obj4 = obj;
        int A032 = AnonymousClass0fD.A03(-23781959);
        View view2 = view;
        0qQ.A0B(view2, 1);
        0qQ.A0B(obj4, 2);
        0qQ.A0B(obj3, 3);
        C3251571g r13 = (C3251571g) obj4;
        AnonymousClass6u8 r4 = (AnonymousClass6u8) obj3;
        int A033 = AnonymousClass0fD.A03(-1911978276);
        UserSession userSession = this.A05;
        Object tag = view2.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.feed.ui.rows.mediagrid.MediaGridRowViewBinder.Holder");
        C253973rj r2 = (C253973rj) tag;
        boolean z = r4.A04;
        int i3 = r4.A00;
        float f = this.A00;
        Map map = r4.A02;
        AnonymousClass32J r20 = this.A07;
        C267644bx r19 = this.A06;
        AnonymousClass726 r21 = this.A01;
        AnonymousClass0iw r8 = this.A04;
        String str = this.A09;
        boolean z2 = this.A03;
        boolean z3 = this.A02;
        String str2 = this.A0A;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r2, 1);
        0qQ.A0B(r13, 2);
        0qQ.A0B(r8, 11);
        View view3 = r2.A00;
        if (z) {
            dimensionPixelSize = 0;
        } else {
            dimensionPixelSize = view3.getResources().getDimensionPixelSize(R.dimen.photo_grid_spacing);
        }
        0nA.A0X(view3, dimensionPixelSize);
        view3.setImportantForAccessibility(2);
        IgMultiImageButton[] igMultiImageButtonArr = r2.A01;
        int i4 = 0;
        do {
            IgMultiImageButton igMultiImageButton = igMultiImageButtonArr[i4];
            if (igMultiImageButton != null) {
                float f2 = 1.0f;
                if (z2) {
                    f2 = 0.75f;
                }
                igMultiImageButton.A00 = f2;
                if (i4 < r13.A01()) {
                    1Xj r1 = (1Xj) r13.A02(i4);
                    int i5 = (i3 * 3) + i4;
                    if (!r1.A5D() || map == null || !map.containsKey(r1.getId())) {
                        i2 = 0;
                    } else {
                        i2 = ((Number) map.getOrDefault(r1.getId(), -1)).intValue();
                    }
                    AnonymousClass0iw r16 = r8;
                    C321496uH.A02(r16, userSession, r1, r19, r20, r21, igMultiImageButton, str, str2, f, i4, i3, i5, i2, true, z3, z2);
                } else {
                    C321466uD.A04(igMultiImageButton);
                }
            }
            i4++;
        } while (i4 < 3);
        AnonymousClass0fD.A0A(-467267781, A033);
        AnonymousClass0fD.A0A(1650049050, A032);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r8, Object obj, Object obj2) {
        1Xj r2;
        C3251571g r9 = (C3251571g) obj;
        AnonymousClass6u8 r10 = (AnonymousClass6u8) obj2;
        if (r8 != null) {
            r8.A7U(0);
        }
        if (this.A01 != null) {
            Integer num = null;
            if (r9 != null) {
                num = Integer.valueOf(r9.A01());
            }
            if (num != null) {
                int intValue = num.intValue();
                for (int i = 0; i < intValue; i++) {
                    AnonymousClass726 r3 = this.A01;
                    if (r3 != null) {
                        if (r9 == null || (r2 = (1Xj) r9.A02(i)) == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        if (r10 != null) {
                            int i2 = r10.A00;
                            if (Integer.valueOf(i2) != null) {
                                r3.AAh(r2, (i2 * 3) + i);
                            }
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public AnonymousClass71R(AnonymousClass0iw r2, UserSession userSession, C267644bx r4, AnonymousClass32J r5, AnonymousClass32Q r6, String str, String str2) {
        this.A05 = userSession;
        this.A07 = r5;
        this.A06 = r4;
        this.A08 = r6;
        this.A04 = r2;
        this.A09 = str;
        this.A0A = str2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.instagram.igds.components.imagebutton.IgMultiImageButton[]} */
    /* JADX WARNING: type inference failed for: r11v0, types: [android.view.View, com.instagram.igds.components.imagebutton.IgMultiImageButton] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View createView(int r14, android.view.ViewGroup r15) {
        /*
            r13 = this;
            r0 = -1663739926(0xffffffff9cd557ea, float:-1.4117883E-21)
            int r8 = X.AnonymousClass0fD.A03(r0)
            r0 = 1
            X.0qQ.A0B(r15, r0)
            android.content.Context r9 = r15.getContext()
            X.0qQ.A07(r9)
            r7 = 3
            X.71S r6 = r13.A0B
            r5 = 0
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r9)
            r0 = 2131625930(0x7f0e07ca, float:1.8879082E38)
            android.view.View r4 = r1.inflate(r0, r15, r5)
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.LinearLayout"
            X.0qQ.A0C(r4, r0)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            X.3rj r10 = new X.3rj
            r10.<init>(r4)
            r0 = 2131436010(0x7f0b21ea, float:1.8493878E38)
            r4.setId(r0)
            r3 = 0
        L_0x0034:
            r12 = 1
        L_0x0035:
            r0 = 0
            com.instagram.igds.components.imagebutton.IgMultiImageButton r11 = new com.instagram.igds.components.imagebutton.IgMultiImageButton
            r11.<init>(r9, r0, r5)
            r1 = -2
            r0 = 1065353216(0x3f800000, float:1.0)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r2.<init>(r5, r1, r0)
            if (r12 == 0) goto L_0x0053
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131165672(0x7f0701e8, float:1.7945568E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.setMarginEnd(r0)
        L_0x0053:
            r11.setLayoutParams(r2)
            if (r6 == 0) goto L_0x005b
            r11.setCoordinator(r6)
        L_0x005b:
            com.instagram.igds.components.imagebutton.IgMultiImageButton[] r0 = r10.A01
            r0[r3] = r11
            r4.addView(r11)
            int r3 = r3 + 1
            if (r3 >= r7) goto L_0x006b
            r0 = 2
            r12 = 0
            if (r3 >= r0) goto L_0x0035
            goto L_0x0034
        L_0x006b:
            r4.setTag(r10)
            r0 = -2033872621(0xffffffff86c59113, float:-7.431633E-35)
            X.AnonymousClass0fD.A0A(r0, r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass71R.createView(int, android.view.ViewGroup):android.view.View");
    }
}
