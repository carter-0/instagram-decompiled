package X;

import android.view.View;
import com.instagram.api.schemas.HighlightReelTypeStr;
import com.instagram.api.schemas.ProfileGridItemTypeEnum;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.imagebutton.IgMultiImageButton;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.Arrays;
import java.util.Map;

/* renamed from: X.Ueq  reason: case insensitive filesystem */
public final class C15562Ueq extends C231632rz {
    public float A00 = -1.0f;
    public AnonymousClass726 A01;
    public AnonymousClass728 A02;
    public boolean A03;
    public boolean A04;
    public final AnonymousClass0iw A05;
    public final UserSession A06;
    public final C267644bx A07;
    public final AnonymousClass32J A08;
    public final C20962X6p A09;
    public final AnonymousClass32Q A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final AnonymousClass71S A0F = new AnonymousClass71S();

    public final int getIdentifier(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        return AnonymousClass7TF.A0h(obj).hashCode();
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        int i2;
        Reel reel;
        0qQ.A0B(obj, 1);
        UserSession userSession = this.A06;
        C3251571g r8 = (C3251571g) obj;
        Dba.A0j(1, userSession, r8);
        int[] iArr = new int[r8.A01()];
        int A012 = r8.A01();
        for (int i3 = 0; i3 < A012; i3++) {
            ProfileGridItemTypeEnum profileGridItemTypeEnum = ((C17884Vhb) r8.A02(i3)).A01;
            if (profileGridItemTypeEnum == ProfileGridItemTypeEnum.MEDIA) {
                1Xj r0 = ((C17884Vhb) r8.A02(i3)).A02;
                if (r0 != null) {
                    i2 = C321466uD.A00(userSession, r0);
                }
                i2 = 0;
            } else {
                if (!(profileGridItemTypeEnum != ProfileGridItemTypeEnum.HIGHLIGHT || ((C17884Vhb) r8.A02(i3)).A03 == null || (reel = ((C17884Vhb) r8.A02(i3)).A03) == null)) {
                    i2 = reel.hashCode();
                }
                i2 = 0;
            }
            iArr[i3] = i2;
        }
        return Arrays.hashCode(iArr);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        C321546uM r0;
        Number A14;
        Object obj3 = obj2;
        Object obj4 = obj;
        int A032 = AnonymousClass0fD.A03(-710810086);
        View view2 = view;
        AnonymousClass7TG.A1U(view2, obj4, obj3);
        C3251571g r11 = (C3251571g) obj4;
        AnonymousClass6u8 r3 = (AnonymousClass6u8) obj3;
        int A033 = AnonymousClass0fD.A03(1520804434);
        UserSession userSession = this.A06;
        Object tag = view2.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.feed.ui.rows.profilegrid.ProfileGridRowViewBinder.Holder");
        C14854UCi uCi = (C14854UCi) tag;
        boolean z = r3.A04;
        int i2 = r3.A00;
        float f = this.A00;
        Map map = r3.A02;
        AnonymousClass32J r44 = this.A08;
        C267644bx r43 = this.A07;
        C20962X6p x6p = this.A09;
        AnonymousClass726 r41 = this.A01;
        AnonymousClass728 r7 = this.A02;
        AnonymousClass0iw r40 = this.A05;
        String str = this.A0B;
        boolean z2 = this.A04;
        boolean z3 = this.A03;
        String str2 = this.A0C;
        boolean z4 = this.A0E;
        boolean z5 = this.A0D;
        AnonymousClass7TF.A1H(userSession, uCi);
        0qQ.A0B(r11, 2);
        0qQ.A0B(r40, 13);
        View view3 = uCi.A00;
        0nA.A0X(view3, C13990Tnq.A08(view3, z ? 1 : 0));
        view3.setImportantForAccessibility(2);
        C15830UjD[] ujDArr = uCi.A01;
        int i3 = 0;
        do {
            C15830UjD ujD = ujDArr[i3];
            if (ujD != null) {
                IgMultiImageButton igMultiImageButton = ujD.A00;
                float f2 = 1.0f;
                if (z2) {
                    f2 = 0.75f;
                }
                igMultiImageButton.A00 = f2;
                if (z4) {
                    ujD.A00.setEnableTouchOverlay(false);
                }
                ujD.A01.setVisibility(8);
                if (i3 < r11.A01()) {
                    C17884Vhb vhb = (C17884Vhb) r11.A02(i3);
                    int i4 = (i2 * 3) + i3;
                    if (vhb.A01 == ProfileGridItemTypeEnum.MEDIA) {
                        1Xj r12 = vhb.A02;
                        if (r12 != null) {
                            IgMultiImageButton igMultiImageButton2 = ujD.A00;
                            int i5 = 0;
                            0nA.A0X(view3, C13990Tnq.A08(view3, z));
                            view3.setImportantForAccessibility(2);
                            if (r12.A5D() && map != null && map.containsKey(r12.getId()) && (A14 = C51966G9m.A14(r12.getId(), map)) != null) {
                                i5 = A14.intValue();
                            }
                            igMultiImageButton2.setHighlightName((String) null);
                            C321496uH.A02(r40, userSession, r12, r43, r44, r41, igMultiImageButton2, str, str2, f, i3, i2, i4, i5, true, z3, z2);
                        }
                    } else if (vhb.A01 == ProfileGridItemTypeEnum.HIGHLIGHT && vhb.A03 != null) {
                        Reel reel = vhb.A03;
                        if (reel != null) {
                            IgImageView igImageView = ujD.A00;
                            boolean z6 = vhb.A00;
                            SpinnerImageView spinnerImageView = ujD.A01;
                            AnonymousClass7TF.A1G(igImageView, 0, spinnerImageView);
                            ImageUrl A082 = reel.A08();
                            if (!(A082 == null && (A082 = reel.A07()) == null)) {
                                igImageView.setUrl(A082, r40, false, false, 1Tw.A03);
                            }
                            if (r7 != null) {
                                r7.ECD(igImageView, reel);
                            }
                            AnonymousClass0fU.A00(new WAA(reel, x6p, spinnerImageView, i4, i2, z4), igImageView);
                            igImageView.setOnLongClickListener(new C50110FPa(i4, 0, reel, x6p));
                            C321556uN r1 = null;
                            igImageView.setOnTouchListener((View.OnTouchListener) null);
                            if (z4) {
                                if (!z6) {
                                    r1 = C321556uN.DISABLED;
                                }
                                igImageView.setMediaOverlay(r1);
                            }
                            if (reel.A1D && z5) {
                                igImageView.setMediaOverlay(C321556uN.DELETED_STORY_WARNING);
                                igImageView.setSecondaryIcon(C321546uM.A0A);
                            }
                            if (z4) {
                                if (z6) {
                                    r0 = C321546uM.A0H;
                                } else {
                                    r0 = C321546uM.A0I;
                                }
                            } else if (reel.A09 == HighlightReelTypeStr.FAN_CLUB) {
                                r0 = C321546uM.A0E;
                            } else {
                                r0 = C321546uM.A0F;
                            }
                            igImageView.setIcon(r0);
                            igImageView.setHighlightName(reel.A0r);
                            igImageView.setVisibility(0);
                        }
                    }
                }
                C321466uD.A04(ujD.A00);
            }
            i3++;
        } while (i3 < 3);
        AnonymousClass0fD.A0A(-1683280425, A033);
        AnonymousClass0fD.A0A(-1459267914, A032);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r8, Object obj, Object obj2) {
        Reel reel;
        AnonymousClass728 r2;
        1Xj r3;
        AnonymousClass726 r22;
        C3251571g r9 = (C3251571g) obj;
        AnonymousClass6u8 r10 = (AnonymousClass6u8) obj2;
        if (r8 != null) {
            r8.A7U(0);
        }
        Integer num = null;
        if (r9 != null) {
            num = Integer.valueOf(r9.A01());
        }
        if (num != null) {
            int intValue = num.intValue();
            for (int i = 0; i < intValue; i++) {
                if (r9 != null) {
                    C17884Vhb vhb = (C17884Vhb) r9.A02(i);
                    if (!(vhb == null || (r3 = vhb.A02) == null || (r22 = this.A01) == null)) {
                        if (r10 != null) {
                            int i2 = r10.A00;
                            if (Integer.valueOf(i2) != null) {
                                r22.AAh(r3, (i2 * 3) + i);
                            }
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    C17884Vhb vhb2 = (C17884Vhb) r9.A02(i);
                    if (!(vhb2 == null || (reel = vhb2.A03) == null || (r2 = this.A02) == null)) {
                        if (r10 != null) {
                            int i3 = r10.A00;
                            if (Integer.valueOf(i3) != null) {
                                r2.AAi(reel, (i3 * 3) + i);
                            }
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C15562Ueq(AnonymousClass0iw r2, UserSession userSession, C267644bx r4, AnonymousClass32J r5, C20962X6p x6p, AnonymousClass32Q r7, String str, String str2, boolean z, boolean z2) {
        this.A06 = userSession;
        this.A08 = r5;
        this.A07 = r4;
        this.A09 = x6p;
        this.A0A = r7;
        this.A05 = r2;
        this.A0B = str;
        this.A0C = str2;
        this.A0E = z;
        this.A0D = z2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: X.UjD[]} */
    /* JADX WARNING: type inference failed for: r11v0, types: [X.UjD, android.view.View, android.view.ViewGroup, com.instagram.common.ui.base.IgFrameLayout] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View createView(int r14, android.view.ViewGroup r15) {
        /*
            r13 = this;
            r0 = -1102109932(0xffffffffbe4f2314, float:-0.20228225)
            int r8 = X.DbX.A04(r15, r0)
            android.content.Context r9 = X.AnonymousClass7TE.A0S(r15)
            r7 = 3
            X.71S r6 = r13.A0F
            r5 = 0
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r9)
            r0 = 2131625930(0x7f0e07ca, float:1.8879082E38)
            android.view.View r4 = r1.inflate(r0, r15, r5)
            r0 = 1
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r4, r0)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            X.UCi r10 = new X.UCi
            r10.<init>(r4)
            r0 = 2131436010(0x7f0b21ea, float:1.8493878E38)
            r4.setId(r0)
            r3 = 0
        L_0x0030:
            r12 = 1
        L_0x0031:
            r0 = 0
            X.UjD r11 = new X.UjD
            r11.<init>(r9, r0, r5)
            r0 = 2131628332(0x7f0e112c, float:1.8883954E38)
            android.view.View r1 = android.view.View.inflate(r9, r0, r11)
            r0 = 25
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r1, r0)
            r0 = 2131434537(0x7f0b1c29, float:1.849089E38)
            android.view.View r0 = r1.findViewById(r0)
            com.instagram.igds.components.imagebutton.IgMultiImageButton r0 = (com.instagram.igds.components.imagebutton.IgMultiImageButton) r0
            r11.A00 = r0
            r0 = 2131441592(0x7f0b37b8, float:1.85052E38)
            android.view.View r0 = r1.findViewById(r0)
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = (com.instagram.ui.widget.spinner.SpinnerImageView) r0
            r11.A01 = r0
            r2 = -2
            r0 = 1065353216(0x3f800000, float:1.0)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r5, r2, r0)
            if (r12 == 0) goto L_0x006e
            int r0 = X.C13989Tnp.A0B(r9)
            r1.setMarginEnd(r0)
        L_0x006e:
            r11.setLayoutParams(r1)
            if (r6 == 0) goto L_0x0078
            com.instagram.igds.components.imagebutton.IgMultiImageButton r0 = r11.A00
            r0.setCoordinator(r6)
        L_0x0078:
            X.UjD[] r0 = r10.A01
            r0[r3] = r11
            r4.addView(r11)
            int r3 = r3 + 1
            if (r3 >= r7) goto L_0x0088
            r0 = 2
            r12 = 0
            if (r3 >= r0) goto L_0x0031
            goto L_0x0030
        L_0x0088:
            r4.setTag(r10)
            r0 = 871635694(0x33f41aee, float:1.1367034E-7)
            X.AnonymousClass0fD.A0A(r0, r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15562Ueq.createView(int, android.view.ViewGroup):android.view.View");
    }
}
