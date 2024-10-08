package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.api.schemas.ClipsIFUType;
import com.instagram.api.schemas.RIXUCoverSize;
import com.instagram.common.session.UserSession;
import com.instagram.model.rixu.RIXUChainingBehaviorDefinition;
import java.util.List;

/* renamed from: X.49P  reason: invalid class name */
public final class AnonymousClass49P extends 2Rw implements AnonymousClass49Q {
    public C294575mg A00;
    public C292805jY A01;
    public C294585mh A02;
    public RIXUChainingBehaviorDefinition A03;
    public final C231702s8 A04;
    public final UserSession A05;
    public final C229332nD A06;
    public final Context A07;
    public final AnonymousClass49R A08;
    public final AnonymousClass0iw A09;
    public final C228412ld A0A;
    public final C229182my A0B;
    public final boolean A0C;

    public final void D1A(C267324bN r2, C297595s1 r3) {
        0qQ.A0B(r3, 1);
        C294575mg r0 = this.A00;
        if (r0 == null) {
            0qQ.A0F("clipsNetegoCardViewBinderDelegate");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.D1A(r2, r3);
        }
    }

    public final boolean D1B(Context context, MotionEvent motionEvent, View view, C267324bN r11, AnonymousClass0iw r12, int i) {
        View view2 = view;
        0qQ.A0B(view, 1);
        MotionEvent motionEvent2 = motionEvent;
        0qQ.A0B(motionEvent, 2);
        C294575mg r0 = this.A00;
        if (r0 != null) {
            return r0.D1B(context, motionEvent2, view2, r11, r12, i);
        }
        0qQ.A0F("clipsNetegoCardViewBinderDelegate");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onBindViewHolder(C249703kE r25, int i) {
        C61074JwC jwC;
        Integer num;
        1Xj r2;
        String A2n;
        C249703kE r4 = r25;
        0qQ.A0B(r4, 0);
        C294585mh r22 = this.A02;
        if (r22 != null) {
            AnonymousClass3Y6 r0 = r22.A01;
            if (!(r4 instanceof C297595s1) || !(!r22.A00.isEmpty())) {
                throw new IllegalArgumentException("Either clips or attribution has to be filled");
            }
            C294585mh r1 = this.A02;
            if (r1 != null) {
                List list = r1.A00;
                int i2 = i;
                C267324bN r12 = (C267324bN) list.get(i2);
                1Xj r3 = r12.A02;
                if (r3 != null) {
                    AnonymousClass3W1 BQr = this.A0A.BQr(r3);
                    C61074JwC jwC2 = r0.A01;
                    if (jwC2 != null) {
                        jwC = (C61074JwC) jwC2.A00;
                    } else {
                        jwC = null;
                    }
                    Context context = this.A07;
                    UserSession userSession = this.A05;
                    C297595s1 r9 = (C297595s1) r4;
                    C229332nD r8 = this.A06;
                    AnonymousClass0iw r13 = this.A09;
                    if (r0.A0R) {
                        num = AnonymousClass05K.A01;
                    } else {
                        num = AnonymousClass05K.A00;
                    }
                    C292785jW r32 = C292785jW.A00;
                    boolean A002 = r32.A00(context, userSession);
                    C292805jY r7 = this.A01;
                    C294585mh r23 = this.A02;
                    if (r23 != null) {
                        boolean z = false;
                        if (r23.A01.A03 == ClipsIFUType.SUGGESTED) {
                            z = true;
                        }
                        C297575ry.A01(context, jwC, r12, r13, userSession, BQr, (C68154N2u) null, r9, r8, r7, num, (List) null, A002, z);
                        C229182my r82 = this.A0B;
                        View view = r4.itemView;
                        0qQ.A06(view);
                        boolean z2 = !r32.A00(context, userSession);
                        String id = r12.getId();
                        1Xj r6 = r12.A02;
                        if (r6 != null) {
                            C297645s6 r92 = new C297645s6(r0.A03, r0, r6, r0.A0S);
                            Integer valueOf = Integer.valueOf(i2);
                            AnonymousClass30Y r24 = AnonymousClass30Y.A07;
                            C2354830a r62 = new C2354830a(r92, valueOf, id);
                            r62.A00(r82.A02);
                            if (z2) {
                                AnonymousClass2xS r33 = r82.A00;
                                if (r33 == null) {
                                    0qQ.A0F("feedVideoModule");
                                    throw AnonymousClass00P.createAndThrow();
                                }
                                r62.A00(new C297655s7(r33));
                            }
                            r82.A01.A05(view, r62.A01());
                            if (this.A0C && 0qQ.A0K(r0.A0G, "feed_blending")) {
                                AnonymousClass49R r5 = this.A08;
                                View view2 = r4.itemView;
                                0qQ.A06(view2);
                                C276014sL r26 = (C276014sL) 00k.A0O(r0.A0M, i2);
                                if (r26 != null && (r2 = r26.A00) != null && (A2n = r2.A2n()) != null) {
                                    GAN gan = new GAN(view2, r5.A03, "feed_engagement_unit_item", r5.A01.getModuleName(), A2n);
                                    1Ua A003 = 1UX.A00(view2.getContext(), r5.A00);
                                    0qQ.A07(A003);
                                    r5.A02.A00(new C55513Hiv(A003), new GP1(r5, r0, i2, true), gan);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
        0qQ.A0F("clipsNetegoItemsToRender");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        0qQ.A0B(viewGroup, 0);
        Context context = this.A07;
        UserSession userSession = this.A05;
        C294585mh r1 = this.A02;
        if (r1 == null) {
            0qQ.A0F("clipsNetegoItemsToRender");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass3Y6 r2 = r1.A01;
        ClipsIFUType clipsIFUType = r2.A03;
        boolean z = false;
        if (clipsIFUType == ClipsIFUType.MUSIC_DROPS) {
            z = true;
        }
        RIXUCoverSize rIXUCoverSize = r2.A07;
        AnonymousClass0iw r6 = this.A09;
        C292805jY r9 = this.A01;
        boolean z2 = false;
        if (clipsIFUType == ClipsIFUType.SUGGESTED) {
            z2 = true;
        }
        return C297575ry.A00(context, viewGroup2, rIXUCoverSize, r6, userSession, this, r9, true, z, z2);
    }

    public final void DZ9(C240983Nk r2, 1Xj r3) {
        if (this.A00 == null) {
            0qQ.A0F("clipsNetegoCardViewBinderDelegate");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public AnonymousClass49P(Context context, C231702s8 r5, AnonymousClass0iw r6, UserSession userSession, C228412ld r8, C229332nD r9, C229182my r10) {
        this.A07 = context;
        this.A05 = userSession;
        this.A09 = r6;
        this.A06 = r9;
        this.A0B = r10;
        this.A04 = r5;
        this.A0A = r8;
        this.A0C = 182.A06(0Tu.A05, userSession, 36327507699448290L);
        this.A08 = new AnonymousClass49R(userSession, (AnonymousClass4DU) r6);
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(727923050);
        C294585mh r0 = this.A02;
        if (r0 == null) {
            0qQ.A0F("clipsNetegoItemsToRender");
            throw AnonymousClass00P.createAndThrow();
        }
        int size = r0.A00.size();
        AnonymousClass0fD.A0A(226881502, A032);
        return size;
    }
}
