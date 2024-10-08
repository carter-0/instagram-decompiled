package X;

import android.graphics.drawable.Drawable;
import com.instagram.camera.capture.IgCameraFocusView;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

public final class AVM implements C252203oj {
    public int A00;
    public C352888Fl A01;
    public C369948va A02;
    public C39718A6j A03;
    public AnonymousClass804 A04;
    public C369458un A05;
    public float A06;
    public int A07;
    public int A08;
    public final AVJ A09;
    public final InteractiveDrawableContainer A0A;
    public final 2cs A0B;
    public final C3510387i A0C;
    public final C3498982i A0D;

    public final void DmB(2cs r2) {
        0qQ.A0B(r2, 0);
        this.A09.DmB(r2);
    }

    public final void DmC(2cs r3) {
        0qQ.A0B(r3, 0);
        this.A09.DmC(r3);
        String str = "thumbnailDrawable";
        if (this.A02 != null) {
            if (this.A04 == null) {
                str = "animatingDisplayMode";
            } else {
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DmD(2cs r2) {
        0qQ.A0B(r2, 0);
    }

    public final void DmE(2cs r21) {
        C39718A6j a6j;
        double d;
        float A002;
        2cs r8 = r21;
        0qQ.A0B(r8, 0);
        C369458un r12 = this.A05;
        if (r12 != null && (a6j = this.A03) != null) {
            int i = (r8.A01 > 1.0d ? 1 : (r8.A01 == 1.0d ? 0 : -1));
            C71412ct r0 = r8.A09;
            if (i == 0) {
                d = r0.A00;
            } else {
                d = 1.0d - r0.A00;
            }
            AD5 ad5 = a6j.A03;
            C41764Azt azt = new C41764Azt(d);
            String str = "thumbnailDrawable";
            C379289Tg r02 = null;
            if (this.A02 != null) {
                float A003 = A00(azt, Float.valueOf(r12.A06), ad5.A01);
                float f = r12.A01;
                C369948va r1 = this.A02;
                if (r1 != null) {
                    float A004 = A00(azt, Float.valueOf(f + ((Drawable) r1).getBounds().exactCenterX()), ad5.A02);
                    float f2 = r12.A02;
                    C369948va r13 = this.A02;
                    if (r13 != null) {
                        float A005 = A00(azt, Float.valueOf(f2 + ((Drawable) r13).getBounds().exactCenterY()), ad5.A03);
                        float A006 = A00(azt, Float.valueOf(r12.A05), ad5.A00);
                        InteractiveDrawableContainer interactiveDrawableContainer = this.A0A;
                        C369948va r14 = this.A02;
                        if (r14 != null) {
                            interactiveDrawableContainer.A0o((Drawable) r14, A003);
                            C369948va r15 = this.A02;
                            if (r15 != null) {
                                AEV.A02(InteractiveDrawableContainer.A00((Drawable) r15, interactiveDrawableContainer), A004, A005);
                                C369948va r2 = this.A02;
                                if (r2 != null) {
                                    interactiveDrawableContainer.A0n((Drawable) r2, A006 % 360.0f);
                                    C369948va r22 = this.A02;
                                    if (r22 != null) {
                                        if (!(r22 instanceof C14679U1a) && !(r22 instanceof AnonymousClass9X3)) {
                                            interactiveDrawableContainer.A0m((Drawable) r22);
                                        }
                                        if (this.A02 != null) {
                                            A8E a8e = A2Q.A00;
                                            AnonymousClass804 r23 = this.A04;
                                            if (r23 == null) {
                                                str = "animatingDisplayMode";
                                            } else {
                                                C3498982i r16 = this.A0D;
                                                if (r16 != null) {
                                                    r02 = r16.A02;
                                                }
                                                if (a8e.A00(r02, r23) != AnonymousClass05K.A0u) {
                                                    A002 = 0.0f;
                                                } else {
                                                    A002 = A00(azt, Float.valueOf(this.A06), (float) a6j.A00);
                                                }
                                                int A007 = (int) A00(azt, Float.valueOf((float) this.A08), (float) a6j.A01);
                                                int A008 = (int) A00(azt, Float.valueOf((float) this.A07), 255.0f);
                                                C369948va r03 = this.A02;
                                                if (r03 != null) {
                                                    r03.ESw(A002);
                                                    C3510387i r17 = this.A0C;
                                                    C376429Hy r142 = new C376429Hy(1, A002, A002, A002, A002);
                                                    if (r17.A0B()) {
                                                        r17.A0U.A01(r142.A02, r142.A03, r142.A00, r142.A01);
                                                    }
                                                    C369948va r04 = this.A02;
                                                    if (r04 != null) {
                                                        r04.Eps(A007);
                                                        C369948va r05 = this.A02;
                                                        if (r05 != null) {
                                                            r05.EPO(A008);
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final void A01(AVM avm, C39718A6j a6j, AnonymousClass804 r15, C369458un r16) {
        avm.A04 = r15;
        avm.A03 = a6j;
        C369948va r1 = avm.A02;
        if (r1 == null) {
            0qQ.A0F("thumbnailDrawable");
            throw AnonymousClass00P.createAndThrow();
        }
        if (r1 instanceof C347017w8) {
            ((C347017w8) r1).A0B(0);
        }
        double d = 0.0d;
        avm.A06 = r1.ArT();
        avm.A08 = r1.CD2();
        avm.A07 = r1.AeE();
        if (a6j != null) {
            ADA ada = a6j.A02;
            C352888Fl r12 = avm.A01;
            if (r12 != null) {
                int i = (int) ada.A01;
                int i2 = (int) ada.A02;
                float f = ada.A03;
                float f2 = ada.A04;
                C340297l2 r2 = r12.A06;
                if (r2 != null) {
                    AnonymousClass8LZ.A01(r2.A0H.A00(), 0.0f, 0);
                    C340287l1 r122 = r2.A0H;
                    C294975nL A012 = C294975nL.A01(r122.A00(), 0);
                    A012.A0G();
                    C294975nL A0A2 = A012.A0A();
                    float f3 = (float) i;
                    A0A2.A0J(f3);
                    float f4 = (float) i2;
                    A0A2.A0K(f4);
                    A0A2.A0P(f, AnonymousClass7TE.A02(r122.A00()) / 2.0f);
                    A0A2.A0Q(f2, AnonymousClass7TE.A03(r122.A00()) / 2.0f);
                    A0A2.A0H();
                    IgCameraFocusView igCameraFocusView = r2.A05;
                    if (igCameraFocusView != null) {
                        AnonymousClass8LZ.A01(igCameraFocusView, 0.0f, 0);
                        C294975nL A013 = C294975nL.A01(igCameraFocusView, 0);
                        A013.A0G();
                        C294975nL A0A3 = A013.A0A();
                        A0A3.A0J(f3);
                        A0A3.A0K(f4);
                        A0A3.A0P(f, AnonymousClass7TE.A02(igCameraFocusView) / 2.0f);
                        A0A3.A0Q(f2, AnonymousClass7TE.A03(igCameraFocusView) / 2.0f);
                        A0A3.A0H();
                    }
                }
            }
        }
        avm.A05 = r16;
        2cs r5 = avm.A0B;
        if (r5.A01 == 0.0d) {
            d = 1.0d;
        }
        r5.A06(d);
    }

    public AVM(C3510387i r3, AVJ avj, C3498982i r5, InteractiveDrawableContainer interactiveDrawableContainer) {
        AnonymousClass7TG.A1Q(interactiveDrawableContainer, r3);
        this.A09 = avj;
        this.A0A = interactiveDrawableContainer;
        this.A0C = r3;
        this.A0D = r5;
        2cs A0J = AnonymousClass7TF.A0J();
        A0J.A09(C315596kB.A02);
        A0J.A06 = true;
        A0J.A0A(this);
        this.A0B = A0J;
    }

    public static float A00(C41764Azt azt, Object obj, float f) {
        return ((Number) azt.invoke(obj, Float.valueOf(f))).floatValue();
    }
}
