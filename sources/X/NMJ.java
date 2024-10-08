package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;
import com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel;
import com.instagram.settings.privacy.messages.DirectMessagesOptionsFragment;
import java.io.IOException;

public final class NMJ extends 1P0 implements C74430Puk {
    public DirectMessagesInteropOptionsViewModel A00;
    public String A01;
    public boolean A02 = true;
    public boolean A03;
    public boolean A04;
    public final Context A05;
    public final C69453Nlx A06;
    public final UserSession A07;
    public final OVB A08;
    public final 1Av A09;
    public final C71109Ocn A0A;
    public final OAI A0B = new OAI(this);
    public final OTN A0C;
    public final C72197OyI A0D;
    public final DirectMessagesOptionsFragment A0E;
    public final C74431Pul A0F;
    public final 16V A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final OR9 A0K;
    public final C70333O2l A0L;

    public NMJ(Context context, C69453Nlx nlx, UserSession userSession, OVB ovb, 1Av r7, C71109Ocn ocn, OR9 or9, OTN otn, C72197OyI oyI, DirectMessagesOptionsFragment directMessagesOptionsFragment, C74431Pul pul, C70333O2l o2l, 16V r15, boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass7TG.A1Q(userSession, r7);
        0qQ.A0B(oyI, 5);
        this.A05 = context;
        this.A07 = userSession;
        this.A09 = r7;
        this.A0L = o2l;
        this.A0D = oyI;
        this.A0K = or9;
        this.A0A = ocn;
        this.A08 = ovb;
        this.A0C = otn;
        this.A03 = z;
        this.A0H = z2;
        this.A0G = r15;
        this.A0I = z3;
        this.A0J = z4;
        this.A06 = nlx;
        this.A0E = directMessagesOptionsFragment;
        this.A0F = pul;
    }

    public static void A00(NMJ nmj) {
        nmj.A02 = true;
        nmj.A0E.A00();
    }

    public static final void A01(NMJ nmj) {
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions;
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions2;
        try {
            nmj.A00 = null;
            1Av r3 = nmj.A09;
            String A13 = DbV.A13(r3, r3.A5x, 1Av.A8a, 301);
            if (!(A13 == null || A13.length() == 0)) {
                nmj.A00 = OXN.parseFromJson(16P.A00(A13));
            }
            if (nmj.A00 == null) {
                String string = r3.A01.getString("interop_reachability_setting", "");
                0qQ.A07(string);
                DirectMessagesInteropOptionsViewModel parseFromJson = OXN.parseFromJson(16P.A00(string));
                if (parseFromJson == null) {
                    16V r0 = nmj.A0G;
                    if (r0 != null) {
                        int ordinal = r0.ordinal();
                        if (ordinal == 2) {
                            DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions3 = DirectMessageInteropReachabilityOptions.A0G;
                            parseFromJson = new DirectMessagesInteropOptionsViewModel(directMessageInteropReachabilityOptions3, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, directMessageInteropReachabilityOptions3, directMessageInteropReachabilityOptions3, DirectMessageInteropReachabilityOptions.A0F, directMessageInteropReachabilityOptions3, DirectMessageInteropReachabilityOptions.A0B, directMessageInteropReachabilityOptions3);
                        } else if (ordinal == 3) {
                            directMessageInteropReachabilityOptions2 = DirectMessageInteropReachabilityOptions.A0G;
                            directMessageInteropReachabilityOptions = DirectMessageInteropReachabilityOptions.A0F;
                            parseFromJson = new DirectMessagesInteropOptionsViewModel(directMessageInteropReachabilityOptions2, directMessageInteropReachabilityOptions, directMessageInteropReachabilityOptions2, directMessageInteropReachabilityOptions2, directMessageInteropReachabilityOptions2, directMessageInteropReachabilityOptions2, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, DirectMessageInteropReachabilityOptions.A0B, directMessageInteropReachabilityOptions2);
                        }
                    }
                    directMessageInteropReachabilityOptions2 = DirectMessageInteropReachabilityOptions.A0G;
                    directMessageInteropReachabilityOptions = DirectMessageInteropReachabilityOptions.A0D;
                    parseFromJson = new DirectMessagesInteropOptionsViewModel(directMessageInteropReachabilityOptions2, directMessageInteropReachabilityOptions, directMessageInteropReachabilityOptions2, directMessageInteropReachabilityOptions2, directMessageInteropReachabilityOptions2, directMessageInteropReachabilityOptions2, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, DirectMessageInteropReachabilityOptions.A0B, directMessageInteropReachabilityOptions2);
                }
                nmj.A00 = parseFromJson;
            }
        } catch (IOException e) {
            0wb.A06("DirectMessagesInteropOptionsControllerImpl", "Error while parsing DirectMessagesInteropOptionsViewModel", e);
        }
    }

    public final void FKM(DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel, DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel2, NHB nhb, String str) {
        C70657OFe oFe;
        DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel3 = directMessagesInteropOptionsViewModel2;
        0qQ.A0B(directMessagesInteropOptionsViewModel3, 2);
        DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel4 = directMessagesInteropOptionsViewModel;
        String str2 = str;
        if (!(str == null || directMessagesInteropOptionsViewModel == null)) {
            this.A0A.A06(directMessagesInteropOptionsViewModel4, directMessagesInteropOptionsViewModel3, this.A0G, str2, this.A03, this.A0H, false);
        }
        this.A01 = str2;
        if (directMessagesInteropOptionsViewModel != null) {
            NHB nhb2 = nhb;
            if (!(nhb == null || (oFe = nhb2.A01) == null || oFe.A03 == null || oFe.A02 == null || oFe.A01 == null || oFe.A00 == null || nhb2.A00 == null)) {
                if (str != null) {
                    C71109Ocn.A03(this.A0A, directMessagesInteropOptionsViewModel4, directMessagesInteropOptionsViewModel3, this.A0G, str2, this.A03, this.A0H, false);
                }
                C70657OFe oFe2 = nhb2.A01;
                if (oFe2 != null) {
                    Context context = this.A05;
                    String str3 = oFe2.A03;
                    if (str3 != null) {
                        String str4 = oFe2.A02;
                        if (str4 != null) {
                            String str5 = oFe2.A01;
                            if (str5 != null) {
                                String str6 = oFe2.A00;
                                if (str6 != null) {
                                    NHW nhw = nhb2.A00;
                                    if (nhw != null) {
                                        PQ0 pq0 = new PQ0(this, directMessagesInteropOptionsViewModel4);
                                        0qQ.A0B(context, 0);
                                        C51974G9v.A1P(str3, str4, str5, str6);
                                        C358248ab A0g = DbX.A0g(context, str4, str3);
                                        A0g.A0c(new C71183Of1(29, pq0, nhw), str5);
                                        A0g.A0b(new C71182Oey(pq0, 8), str6);
                                        A0g.A0B(new C71173Oen(pq0, 3));
                                        DbT.A1V(A0g);
                                        return;
                                    }
                                    throw AnonymousClass7TE.A0z("Required value was null.");
                                }
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        OR9.A00(this.A05);
        if (directMessagesInteropOptionsViewModel != null) {
            this.A00 = directMessagesInteropOptionsViewModel4;
        } else {
            A01(this);
        }
        A00(this);
    }

    public final void FLk(DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel, DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel2, String str) {
        DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel3 = directMessagesInteropOptionsViewModel;
        0qQ.A0B(directMessagesInteropOptionsViewModel, 1);
        String str2 = str;
        if (str != null) {
            DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel4 = directMessagesInteropOptionsViewModel2;
            if (directMessagesInteropOptionsViewModel2 != null) {
                this.A0A.A06(directMessagesInteropOptionsViewModel4, directMessagesInteropOptionsViewModel3, this.A0G, str2, this.A03, this.A0H, true);
            }
        }
        this.A01 = str;
        this.A00 = directMessagesInteropOptionsViewModel;
        this.A02 = true;
        this.A0E.A00();
    }

    public final void onFail(C268654dm r7) {
        int A032 = AnonymousClass0fD.A03(-967382734);
        0qQ.A0B(r7, 0);
        NMJ.super.onFail(r7);
        A01(this);
        this.A04 = false;
        OVB ovb = this.A08;
        0Aj A0e = AnonymousClass7TE.A0e(ovb.A00, "instagram_waverly_ig_event");
        OVB.A00(A0e, ovb, "fetch_data_error");
        A0e.AAJ("step", "ig_message_settings");
        A0e.AAJ("message_controls_settings_version", "v2");
        A0e.AAJ("error_message", C319126q5.A02(r7));
        A0e.AAJ("error_identifier", C319126q5.A01(r7));
        A0e.Cgf();
        A00(this);
        AnonymousClass0fD.A0A(-1206944391, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(1994811149);
        NHW nhw = (NHW) obj;
        int A033 = AnonymousClass0fD.A03(1370537357);
        0qQ.A0B(nhw, 0);
        NMJ.super.onSuccess(nhw);
        DirectMessagesInteropOptionsViewModel A002 = NHW.A00(nhw);
        this.A00 = A002;
        try {
            1Av r0 = this.A09;
            String A012 = OXN.A01(A002);
            0qQ.A0B(A012, 0);
            0xY A0p = AnonymousClass7TE.A0p(r0);
            A0p.E5g("interop_reachability_setting", A012);
            A0p.apply();
        } catch (IOException e) {
            0wb.A06("DirectMessagesInteropOptionsControllerImpl", "Error while serializing DirectMessagesInteropOptionsViewModel", e);
        }
        if (182.A06(0Tu.A05, this.A07, 36311891198346028L)) {
            boolean z = nhw.A0B;
            this.A04 = z;
            if (!z || nhw.A00 != null) {
                OVB ovb = this.A08;
                Boolean bool = nhw.A00;
                0Aj A0e = AnonymousClass7TE.A0e(ovb.A00, "instagram_waverly_ig_event");
                OVB.A00(A0e, ovb, "fetch_data");
                A0e.A7p("eligible_ig_dm_toggle", JTP.A0g(A0e, "step", "ig_message_settings", z));
                A0e.A7p("source_of_truth_toggle_value", bool);
                A0e.AAJ("message_controls_settings_version", "v2");
                A0e.Cgf();
                if (this.A04) {
                    1Av r4 = this.A09;
                    Boolean bool2 = nhw.A00;
                    if (bool2 != null) {
                        DbS.A1a(r4, bool2, r4.A6J, 1Av.A8a, 264);
                    } else {
                        IllegalStateException A0y = AnonymousClass7TE.A0y();
                        AnonymousClass0fD.A0A(-404044280, A033);
                        throw A0y;
                    }
                }
            } else {
                this.A08.A01("fetch_data_error", (Boolean) null);
                this.A04 = false;
            }
        }
        A00(this);
        AnonymousClass0fD.A0A(511228452, A033);
        AnonymousClass0fD.A0A(1550469156, A032);
    }
}
