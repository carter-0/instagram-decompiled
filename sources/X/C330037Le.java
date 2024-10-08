package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.aistudio.model.UtmMetadata;
import com.instagram.android.R;
import com.instagram.api.schemas.IGAIAgentVisibilityStatus;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.direct.groupinvites.models.InviteLinkShareInfo;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.reels.Reel;
import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.7Le  reason: invalid class name and case insensitive filesystem */
public final class C330037Le implements C330047Lf {
    public final AnonymousClass4DH A00;
    public final UserSession A01;
    public final C62320sa A02;
    public final AnonymousClass0iw A03;
    public final C332467Vd A04;
    public final AnonymousClass7VP A05;
    public final AnonymousClass7VX A06;
    public final C332897Ww A07;
    public final AnonymousClass7Wt A08;
    public final AnonymousClass7VW A09;
    public final AnonymousClass7X8 A0A;
    public final C333097Xq A0B;
    public final AnonymousClass0eK A0C;
    public final AnonymousClass0eK A0D;
    public final AnonymousClass0eK A0E;
    public final AnonymousClass0eK A0F;
    public final C62320sa A0G;

    public C330037Le(AnonymousClass4DH r17, AnonymousClass0iw r18, UserSession userSession, C332467Vd r20, AnonymousClass7VP r21, AnonymousClass7VX r22, C332897Ww r23, AnonymousClass7Wt r24, AnonymousClass7VW r25, AnonymousClass7X8 r26, C333097Xq r27, AnonymousClass0eK r28, AnonymousClass0eK r29, AnonymousClass0eK r30, AnonymousClass0eK r31, C62320sa r32, C62320sa r33) {
        AnonymousClass4DH r1 = r17;
        0qQ.A0B(r1, 1);
        AnonymousClass0iw r2 = r18;
        0qQ.A0B(r2, 3);
        C332467Vd r3 = r20;
        0qQ.A0B(r3, 4);
        AnonymousClass7VX r4 = r22;
        0qQ.A0B(r4, 5);
        C62320sa r5 = r32;
        0qQ.A0B(r5, 6);
        AnonymousClass7VW r6 = r25;
        0qQ.A0B(r6, 7);
        AnonymousClass7X8 r7 = r26;
        0qQ.A0B(r7, 8);
        AnonymousClass7Wt r8 = r24;
        0qQ.A0B(r8, 9);
        C332897Ww r9 = r23;
        0qQ.A0B(r9, 10);
        C333097Xq r10 = r27;
        0qQ.A0B(r10, 11);
        AnonymousClass7VP r11 = r21;
        0qQ.A0B(r11, 12);
        AnonymousClass0eK r12 = r28;
        0qQ.A0B(r12, 13);
        AnonymousClass0eK r13 = r30;
        0qQ.A0B(r13, 15);
        AnonymousClass0eK r14 = r31;
        0qQ.A0B(r14, 16);
        C62320sa r15 = r33;
        0qQ.A0B(r15, 17);
        this.A00 = r1;
        this.A01 = userSession;
        this.A03 = r2;
        this.A04 = r3;
        this.A06 = r4;
        this.A02 = r5;
        this.A09 = r6;
        this.A0A = r7;
        this.A08 = r8;
        this.A07 = r9;
        this.A0B = r10;
        this.A05 = r11;
        this.A0C = r12;
        this.A0E = r29;
        this.A0D = r13;
        this.A0F = r14;
        this.A0G = r15;
    }

    public final void D4M(View view) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        Context requireContext = this.A00.requireContext();
        String string = requireContext.getString(2131954464);
        0qQ.A07(string);
        C367618rI r5 = new C367618rI((Drawable) null, requireContext.getDrawable(R.drawable.instagram_video_chat_pano_outline_24), (C15048ULb) null, new C40538Adl(this), (Integer) null, string, 0, 0, 0, false, false, false, true, false, false, false);
        String string2 = requireContext.getString(2131954463);
        0qQ.A07(string2);
        ArrayList A1M = 0sr.A1M(new C367618rI[]{r5, new C367618rI((Drawable) null, requireContext.getDrawable(R.drawable.instagram_call_pano_outline_24), (C15048ULb) null, new C40539Adm(this), (Integer) null, string2, 0, 0, 0, false, false, false, true, false, false, false)});
        C355148Ov r2 = new C355148Ov(requireContext, this.A01, (Integer) null, false);
        r2.A02(A1M);
        r2.getContentView().measure(0, 0);
        view2.measure(0, 0);
        r2.showAsDropDown(view2, -(r2.getContentView().getMeasuredWidth() - view2.getMeasuredWidth()), 0);
    }

    public final void DrD(String str) {
        C254793t3 CBU;
        AnonymousClass2Ep Cms;
        User user;
        String str2;
        0qQ.A0B(str, 0);
        if (this.A0B.CPk()) {
            return;
        }
        if (!A00().C6l().CQm() || (user = (User) 00k.A0J(A00().C6l().C6Q().A0b)) == null || !user.A1T()) {
            C332467Vd r2 = this.A04;
            String str3 = (String) this.A0D.get();
            if (C332467Vd.A00(r2).C6l().CdE()) {
                if (!C332467Vd.A00(r2).C6l().CUO() && 1YZ.A02 != null) {
                    0wc r4 = r2.A01;
                    String C6k = C332467Vd.A00(r2).C6l().C6k();
                    List C6O = C332467Vd.A00(r2).C6l().C6O();
                    0qQ.A0B(r4, 0);
                    AnonymousClass73V.A05(r4, (C3263576k) null, (C69445Nlp) null, "direct_entry_point", C6k, (String) null, C6O);
                }
                UserSession userSession = r2.A02;
                AnonymousClass0iw r1 = r2.A00;
                C254743sy B8S = C332467Vd.A00(r2).C6l().B8S();
                0qQ.A07(B8S);
                boolean z = r2.A04;
                0qQ.A0B(r1, 1);
                0wc A012 = AnonymousClass0kN.A01(r1, userSession);
                0Aj A002 = A012.A00(A012.A00, "direct_thread_tap_details_button");
                A002.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, C66647MaG.A0A(B8S));
                A002.A7p("is_e2ee", Boolean.valueOf(C66647MaG.A0E(B8S)));
                C254793t3 A082 = C66647MaG.A08(B8S);
                if (A082 != null) {
                    A002.A9F("occamadillo_thread_id", AnonymousClass4KK.A01(A082));
                    A002.AAJ("open_thread_id", AnonymousClass4KK.A02(A082));
                    A002.A7p("is_bottom_sheet_thread", Boolean.valueOf(z));
                }
                A002.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
                A002.Cgf();
                if (str3 != null) {
                    Cms = 1bJ.A00(userSession).A0N(str3);
                } else {
                    C254783t2 C6c = C332467Vd.A00(r2).C6l().C6c();
                    0qQ.A07(C6c);
                    if (C6c instanceof C333417Yw) {
                        C254783t2 C6c2 = C332467Vd.A00(r2).C6l().C6c();
                        0qQ.A07(C6c2);
                        CBU = AnonymousClass6W3.A05(C6c2);
                    } else {
                        C333517Zg A003 = C332467Vd.A00(r2);
                        C376179Gx r12 = C376179Gx.PSEUDO_SHOW_THREAD_INFO_WITH_DIRECT_THREAD_OBJECT;
                        if (A003.AH1(r12)) {
                            Cms = C332467Vd.A00(r2).C6l().Cms();
                            if (Cms == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            C69865NtT.A00(r12);
                            CBU = C332467Vd.A00(r2).C6l().CBU();
                        }
                    }
                    C332467Vd.A02(r2, CBU);
                    return;
                }
                C332467Vd.A01(r2, Cms);
                return;
            }
            return;
        }
        UserSession userSession2 = this.A01;
        Class<ModalActivity> cls = ModalActivity.class;
        User user2 = (User) 00k.A0J(A00().C6l().C6Q().A0b);
        if (user2 != null) {
            str2 = user2.A03.AaZ();
        } else {
            str2 = null;
        }
        Bundle A004 = Q21.A00(new 0eP("creator_ai_creator_igid", str2), new 0eP("creator_ai_entry_point_extra", "thread_title_bar"));
        AnonymousClass4DH r13 = this.A00;
        new AnonymousClass6W8(r13.requireActivity(), A004, userSession2, cls, "creator_ai_settings").A0D(r13, 107);
    }

    private final C333517Zg A00() {
        Object obj = this.A0C.get();
        0qQ.A07(obj);
        return (C333517Zg) obj;
    }

    private final InviteLinkShareInfo A01() {
        AnonymousClass2Ep Cms = ((C333517Zg) this.A0C.get()).C6l().Cms();
        if (Cms == null) {
            return null;
        }
        String BA0 = Cms.BA0();
        String C6C = Cms.C6C();
        String C6k = Cms.C6k();
        UserSession userSession = this.A01;
        String str = userSession.A06;
        boolean A0K = 0qQ.A0K(str, Cms.AsX());
        return new InviteLinkShareInfo((Uri) null, (ImageUrl) AnonymousClass48N.A00(userSession, Cms).A00, BA0, C6C, C6k, Cms.AsX(), Cms.C6f(), C329997La.A00(((AnonymousClass3U9) Cms).A01.A0s, str, 29), Cms.C6a(), Cms.AdN(), Cms.BRT(), A0K, true);
    }

    public final void CuD() {
        AnonymousClass4DH r0 = this.A00;
        Context requireContext = r0.requireContext();
        UserSession userSession = this.A01;
        FFK.A01(requireContext, r0.requireActivity(), this.A03, userSession, new C71123OdH((C376519Ih) null, userSession, A00()).A03(), AnonymousClass05K.A00);
    }

    public final void CyL() {
        C53364Gmo gmo;
        String str;
        String str2;
        AnonymousClass7S7 C6l = ((C333517Zg) this.A0C.get()).C6l();
        UserSession userSession = this.A01;
        if (!AnonymousClass9HV.A00(userSession).A00(C6l.C6c(), 69)) {
            C310336ap r2 = new C310336ap();
            r2.A04();
            r2.A02();
            r2.A07(R.drawable.instagram_info_pano_outline_24);
            r2.A0D = this.A00.requireContext().getString(2131953849);
            1xC.A01.A00(new AnonymousClass3GP(r2.A00()));
            return;
        }
        C3269178q r0 = (C3269178q) this.A0G.invoke();
        String str3 = null;
        if (r0 != null) {
            gmo = r0.A09();
            if (!(gmo == null || (str2 = gmo.A02) == null || gmo.A00 != AnonymousClass05K.A0C)) {
                this.A08.CpK(str2, (String) null);
                return;
            }
        } else {
            gmo = null;
        }
        C254743sy B8S = C6l.B8S();
        0qQ.A07(B8S);
        String A0B2 = C66647MaG.A0B(B8S);
        if (!C6l.CUO()) {
            if (gmo != null) {
                str3 = gmo.A04;
            }
            if (str3 == null) {
                str3 = userSession.A06;
            }
            str = I5N.A01(str3, C6l.BRZ(), true);
            str3 = I5N.A01(str3, C6l.BRZ(), false);
        } else {
            str = null;
        }
        if (gmo != null && A0B2 != null) {
            FragmentActivity requireActivity = this.A00.requireActivity();
            boolean z = gmo.A06;
            boolean A072 = 1Av.A07(1Au.A00(userSession), 002.A0R("blend_last_invite_time_ms", A0B2), 1);
            String str4 = gmo.A02;
            String str5 = gmo.A04;
            C6l.CUO();
            I5N.A02(requireActivity, userSession, A0B2, str4, str5, str, str3, z, A072);
        }
    }

    public final void D0S() {
        this.A07.ATV(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0042, code lost:
        if (X.0qQ.A0K(r10.BiB(), r8.A06) != false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DTQ(boolean r14) {
        /*
            r13 = this;
            X.0eK r0 = r13.A0C
            java.lang.Object r1 = r0.get()
            X.7Zg r1 = (X.C333517Zg) r1
            X.4DH r0 = r13.A00
            androidx.fragment.app.FragmentActivity r4 = r0.requireActivity()
            com.instagram.common.session.UserSession r8 = r13.A01
            X.0qQ.A0A(r1)
            X.0iw r7 = r13.A03
            r2 = 0
            r0 = 2
            X.0qQ.A0B(r1, r0)
            r0 = 4
            X.0qQ.A0B(r7, r0)
            X.7S7 r10 = r1.C6l()
            X.3t3 r11 = r10.CBU()
            if (r11 == 0) goto L_0x00cd
            X.6gx r9 = X.C313746gw.A00(r8)
            X.7SD r0 = r10.C6Q()
            int r1 = r0.A08
            r0 = 29
            r6 = 1
            if (r1 != r0) goto L_0x0044
            java.lang.String r1 = r10.BiB()
            java.lang.String r0 = r8.A06
            boolean r0 = X.0qQ.A0K(r1, r0)
            r5 = 1
            if (r0 == 0) goto L_0x0045
        L_0x0044:
            r5 = 0
        L_0x0045:
            X.7SD r0 = r10.C6Q()
            int r1 = r0.A08
            r0 = 32
            if (r1 == r0) goto L_0x0059
            X.7SD r0 = r10.C6Q()
            int r1 = r0.A08
            r0 = 62
            if (r1 != r0) goto L_0x00d0
        L_0x0059:
            java.lang.String r0 = r8.A06
            boolean r0 = r10.COR(r0)
            if (r0 != 0) goto L_0x00d0
            X.0Tu r3 = X.0Tu.A05
            r0 = 36330226413814289(0x81122600014211, double:3.0387197019513105E-306)
            boolean r0 = X.182.A06(r3, r8, r0)
            if (r0 == 0) goto L_0x00d0
        L_0x006e:
            r12 = r6 ^ 1
            if (r5 != 0) goto L_0x0074
            if (r6 == 0) goto L_0x00cd
        L_0x0074:
            if (r14 == 0) goto L_0x00d2
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.P3N r6 = new X.P3N
            r6.<init>(r7, r8, r9, r10, r11, r12)
            X.C48837Ekz.A00(r4, r8, r6, r0)
            if (r12 == 0) goto L_0x00cd
            X.3t0 r0 = X.C300965yF.A01(r11)
            java.lang.String r4 = r0.A00
            java.lang.String r3 = r10.C6k()
            X.0wc r0 = r9.A03
            X.1Ln r2 = X.1Ln.A0E(r0)
            X.0Aj r0 = r2.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x00cd
            long r0 = r9.A02
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0h(r0)
            java.lang.String r0 = "mute_messages_options_dialog_rendered"
            r2.A0l(r0)
            java.lang.String r0 = "tap"
            r2.A0k(r0)
            java.lang.String r0 = "mute_button"
            r2.A0p(r0)
            java.lang.String r0 = "thread_view"
            r2.A0q(r0)
            java.lang.String r0 = "instagram"
            r2.A0o(r0)
            r2.A0s(r4)
            if (r3 == 0) goto L_0x00ce
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r3)
        L_0x00c7:
            r2.A0i(r0)
            r2.Cgf()
        L_0x00cd:
            return
        L_0x00ce:
            r0 = 0
            goto L_0x00c7
        L_0x00d0:
            r6 = 0
            goto L_0x006e
        L_0x00d2:
            if (r12 == 0) goto L_0x011f
            X.3t0 r0 = X.C300965yF.A01(r11)
            java.lang.String r5 = r0.A00
            java.lang.String r4 = r10.C6k()
            X.0wc r0 = r9.A03
            X.1Ln r3 = X.1Ln.A0E(r0)
            X.0Aj r0 = r3.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x011f
            long r0 = r9.A02
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A0h(r0)
            java.lang.String r0 = "mute_messages_disabled"
            r3.A0l(r0)
            java.lang.String r0 = "tap"
            r3.A0k(r0)
            java.lang.String r0 = "mute_button"
            r3.A0p(r0)
            java.lang.String r0 = "thread_view"
            r3.A0q(r0)
            java.lang.String r0 = "instagram"
            r3.A0o(r0)
            r3.A0s(r5)
            if (r4 == 0) goto L_0x0129
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r4)
        L_0x0119:
            r3.A0i(r0)
            r3.Cgf()
        L_0x011f:
            X.3t0 r0 = X.C300965yF.A01(r11)
            java.lang.String r0 = r0.A00
            X.C66671Mae.A04(r7, r8, r0, r2)
            return
        L_0x0129:
            r0 = 0
            goto L_0x0119
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C330037Le.DTQ(boolean):void");
    }

    public final void DcA(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        if (!this.A0B.CPk()) {
            this.A0A.CqW(reel, gradientSpinnerAvatarView);
        }
    }

    public final void DmO(boolean z) {
        if (z) {
            C70320O1y.A00(this.A01).A03(AnonymousClass05K.A0Y);
        }
        AnonymousClass2Ep Cms = ((C333517Zg) this.A0C.get()).C6l().Cms();
        C331537Rj r3 = C331537Rj.DIRECT_THREAD_AUDIO_CALL_BUTTON;
        if (Cms != null) {
            if (Cms.CQq()) {
                r3 = C331537Rj.CREATOR_AI_SANDBOX_THREAD;
            } else if (C66648MaH.A00(this.A01, Cms)) {
                r3 = C331537Rj.CREATOR_AI_CANONICAL_THREAD;
            }
        }
        this.A06.A01((C69465Nm9) null, r3, (RtcStartCoWatchPlaybackArguments) null, false);
    }

    public final void Dmg(boolean z) {
        if (z) {
            C70320O1y.A00(this.A01).A03(AnonymousClass05K.A0Y);
        }
        C331537Rj r3 = C331537Rj.DIRECT_THREAD;
        AnonymousClass2Ep Cms = ((C333517Zg) this.A0C.get()).C6l().Cms();
        if (Cms != null) {
            if (Cms.CQq()) {
                r3 = C331537Rj.CREATOR_AI_SANDBOX_THREAD;
            } else if (C66648MaH.A01(this.A01, Cms)) {
                r3 = C331537Rj.CREATOR_AI_CANONICAL_THREAD;
            }
        }
        this.A06.A01((C69465Nm9) null, r3, (RtcStartCoWatchPlaybackArguments) null, true);
    }

    public final void Dqs() {
        String str;
        UserSession userSession = this.A01;
        String str2 = userSession.A06;
        String BY8 = A00().C6l().BY8();
        DirectThreadKey A042 = C66647MaG.A04(A00().C6l().AfV());
        if (A042 != null) {
            str = A042.A00;
        } else {
            str = null;
        }
        if (BY8 != null && str != null) {
            List<C376659Iv> AxI = A00().C6l().AxI();
            ArrayList arrayList = new ArrayList();
            if (AxI != null) {
                for (C376659Iv r0 : AxI) {
                    switch (((Number) r0.A01).intValue()) {
                        case 4:
                            arrayList.add("appointment_booked");
                            break;
                        case 5:
                            arrayList.add("order_placed");
                            break;
                        case 6:
                            arrayList.add("payment_received");
                            break;
                        case 7:
                            arrayList.add("order_shipped");
                            break;
                        case 10:
                            arrayList.add("lead");
                            break;
                        case 11:
                            arrayList.add("important");
                            break;
                        case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                            arrayList.add("follow_up");
                            break;
                        case 13:
                            arrayList.add("order_placed");
                            break;
                        case 14:
                            arrayList.add("lead");
                            break;
                    }
                }
            }
            if (A00().C6l().CTo() && C66700Mb7.A01(userSession)) {
                arrayList.add("flag");
            }
            String join = TextUtils.join(",", arrayList);
            if (!1Au.A00(userSession).A1s()) {
                IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig((0lg) userSession);
                igBloksScreenConfig.A0l = true;
                igBloksScreenConfig.A0R = "com.bloks.www.biig.tas.intro";
                Context requireContext = this.A00.requireContext();
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                HashMap hashMap3 = new HashMap();
                BitSet bitSet = new BitSet(2);
                hashMap.put("seller_id", str2);
                bitSet.set(1);
                hashMap.put("buyer_id", BY8);
                bitSet.set(0);
                hashMap.put(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
                hashMap.put("labels_as_string", join);
                hashMap.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "thread_view");
                if (bitSet.nextClearBit(0) >= 2) {
                    C46649DiU A062 = C46649DiU.A06("com.bloks.www.biig.tas.intro", C359608dC.A01(hashMap), hashMap2);
                    A062.A00 = -1;
                    A062.A05 = null;
                    A062.A01 = 0;
                    A062.A06 = null;
                    A062.A03 = null;
                    A062.A02 = null;
                    A062.A04 = null;
                    A062.A0H(hashMap3);
                    A062.A0D(requireContext, igBloksScreenConfig);
                    1Au.A00(userSession).A0O();
                } else {
                    throw new IllegalStateException(AnonymousClass000.A00(457));
                }
            } else {
                HashMap hashMap4 = new HashMap();
                hashMap4.put("seller_id", str2);
                hashMap4.put("buyer_id", BY8);
                hashMap4.put(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
                hashMap4.put("labels_as_string", join);
                hashMap4.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "thread_view");
                C69864NtS.A00(userSession).A00(this.A00.requireContext(), BY8, "IG_TAS_SCREEN_IN_THREAD", hashMap4, new C377429Lu(32, hashMap4, this), false);
            }
            C327977Cy.A00((C69489NmX) null, C69462Nm6.CLICK, C69487NmV.ENTRYPOINT, new C327977Cy(this.A03, userSession), BY8, str2);
        }
    }

    public final void DwG(MessagingUser messagingUser) {
        AnonymousClass4DH r1 = this.A00;
        if (r1.getContext() != null) {
            AnonymousClass2Ep Cms = ((C333517Zg) this.A0C.get()).C6l().Cms();
            MessagingUser messagingUser2 = messagingUser;
            if (Cms != null && Cms.CBk() != null) {
                Context context = r1.getContext();
                if (context != null) {
                    UserSession userSession = this.A01;
                    AnonymousClass0iw r4 = this.A03;
                    Long CBk = Cms.CBk();
                    if (CBk != null) {
                        C49056Eoa.A00(context, r4, userSession, messagingUser2, CBk.longValue());
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            } else if (!this.A0B.CPk()) {
                this.A09.CqM(messagingUser, "direct_thread_user_row");
            }
        }
    }

    private final AnonymousClass2Ep A02() {
        AnonymousClass2Ep Cms = A00().C6l().Cms();
        if (Cms != null) {
            return Cms;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void Cup() {
        Long l;
        List list = A00().C6l().C6Q().A0b;
        boolean z = false;
        if (A00().C6l().C6Q().A08 == 1014) {
            z = true;
        }
        Bundle bundle = new Bundle();
        C262184Cl r0 = ((User) list.get(0)).A03;
        if (z) {
            String AaU = r0.AaU();
            bundle.putString("persona_id", AaU);
            UserSession userSession = this.A01;
            1Ln A002 = LTH.A00(new LTH(userSession));
            if (A002.A00.isSampled()) {
                A002.A0l("thread_view_header_settings_button_clicked");
                if (AaU != null) {
                    l = 00y.A0n(10, AaU);
                } else {
                    l = null;
                }
                A002.A0j(l);
                A002.Cgf();
            }
            AnonymousClass4DH r02 = this.A00;
            new AnonymousClass6W8(r02.requireActivity(), bundle, userSession, ModalActivity.class, "AI_SETTINGS").A0C(r02.requireActivity());
            return;
        }
        bundle.putString("creator_ai_creator_igid", r0.AaZ());
        bundle.putString("creator_ai_entry_point_extra", "in_thread");
        AnonymousClass4DH r1 = this.A00;
        new AnonymousClass6W8(r1.requireActivity(), bundle, this.A01, ModalActivity.class, "creator_ai_settings").A0D(r1, 107);
    }

    public final void Cuq() {
        IGAIAgentVisibilityStatus iGAIAgentVisibilityStatus;
        User user = (User) 00k.A0J(A00().C6l().C6Q().A0b);
        if (user != null && user.A06) {
            User user2 = (User) 00k.A0J(A00().C6l().C6Q().A0b);
            if (user2 != null) {
                iGAIAgentVisibilityStatus = user2.A03.AaY();
            } else {
                iGAIAgentVisibilityStatus = null;
            }
            if (iGAIAgentVisibilityStatus == IGAIAgentVisibilityStatus.PUBLIC) {
                1ap r2 = 1as.A04.A02;
                UserSession userSession = this.A01;
                2FW r0 = 2FW.A0H;
                AnonymousClass4DH r3 = this.A00;
                C49731F3w A072 = r2.A07(r3, userSession, r0);
                A072.A06(((User) A00().C6l().C6Q().A0b.get(0)).getId());
                DirectShareSheetFragment A002 = A072.A00();
                AnonymousClass37D A012 = AnonymousClass37D.A00.A01(r3.requireActivity());
                if (A012 != null) {
                    A012.A0J(A002);
                }
            }
        }
    }

    public final void Cuv() {
        String str;
        Long l;
        List list = A00().C6l().C6Q().A0b;
        if (A00().C6l().C6Q().A13) {
            str = "meta_ai_thread_header";
        } else {
            str = "thread_header";
        }
        UserSession userSession = this.A01;
        LTH lth = new LTH(userSession);
        String AaU = ((User) list.get(0)).A03.AaU();
        1Ln A002 = LTH.A00(lth);
        if (A002.A00.isSampled()) {
            A002.A0l("thread_view_bar_ai_studio_button_clicked");
            if (AaU != null) {
                l = 00y.A0n(10, AaU);
            } else {
                l = null;
            }
            A002.A0j(l);
            A002.Cgf();
        }
        AnonymousClass9B9.A00();
        C49951FGg.A00(this.A00.requireActivity(), (UtmMetadata) null, userSession, str, (String) null);
    }

    public final void CxX() {
        if (A00().C6l().CdE()) {
            A00().C6l().C6C();
            A00().C6l().EtG();
        }
        AnonymousClass4DH r1 = this.A00;
        if (r1.isResumed()) {
            FragmentActivity requireActivity = r1.requireActivity();
            AnonymousClass37D A012 = AnonymousClass37D.A00.A01(requireActivity);
            if (A012 == null || !((AnonymousClass37F) A012).A0g) {
                requireActivity.onBackPressed();
            }
        }
    }

    public final void DWq() {
        User user;
        User user2;
        if (A00().AH1(C376179Gx.BIZ_PERSISTENT_MENU)) {
            AnonymousClass2Ep A022 = A02();
            OI2 oi2 = (OI2) this.A0E.get();
            AnonymousClass9IV Bbp = A022.Bbp();
            if (Bbp != null) {
                C68480NJx nJx = new C68480NJx();
                nJx.A00 = Bbp;
                List list = oi2.A08;
                String str = null;
                if (!(list == null || (user2 = (User) 00k.A0O(list, 0)) == null)) {
                    str = user2.getUsername();
                }
                nJx.A02 = str;
                nJx.A01 = new OKK(oi2, nJx);
                C331127Pr r1 = new C331127Pr(oi2.A04);
                r1.A1G = true;
                C331157Pu A002 = r1.A00();
                oi2.A00 = A002;
                A002.A02(oi2.A02, nJx);
                if (list != null && (user = (User) 00k.A0O(list, 0)) != null) {
                    oi2.A05.A00(oi2.A07.toString(), user.getId(), "persistent_menu_item");
                }
            }
        }
    }

    public final void Djt() {
        InviteLinkShareInfo A012 = A01();
        if (A012 != null) {
            1ap r2 = 1as.A04.A02;
            UserSession userSession = this.A01;
            2FW r0 = 2FW.A0S;
            AnonymousClass4DH r3 = this.A00;
            C49731F3w A072 = r2.A07(r3, userSession, r0);
            A072.A07.putParcelable("DirectShareSheetConstants.channel_invite_link", A012);
            DirectShareSheetFragment A002 = A072.A00();
            AnonymousClass37D A013 = AnonymousClass37D.A00.A01(r3.requireActivity());
            if (A013 != null) {
                A013.A0J(A002);
            }
        }
    }

    public final void Dju() {
        InviteLinkShareInfo A012 = A01();
        if (A012 != null) {
            F7I.A00(this.A00.requireActivity(), this.A01, A012);
        }
    }

    public final void DmI() {
        String str;
        if (A00().C6l().CdE() && A00().C6l().C6C() != null) {
            boolean CVr = A00().C6l().CVr();
            UserSession userSession = this.A01;
            if (C69973NvD.A00(userSession, CVr)) {
                C71118OdC.A02(this.A00.requireContext(), this.A03, userSession, "flag", "thread_view", A00().C6l().C6C());
                return;
            }
            C333517Zg A002 = A00();
            C376179Gx r4 = C376179Gx.PSEUDO_STAR_THREAD;
            if (A002.AH1(r4)) {
                AnonymousClass7S7 C6l = A00().C6l();
                AnonymousClass4DH r2 = this.A00;
                if (!C70104NxK.A00(r2.requireActivity(), r2.requireContext(), r2, userSession, C6l)) {
                    boolean z = !A00().C6l().CTo();
                    C70170NyO.A00(userSession, C66647MaG.A03(A00().C6l().B8S()), z);
                    String C6C = A00().C6l().C6C();
                    if (C6C != null) {
                        AnonymousClass0kM r1 = new AnonymousClass0kM(userSession);
                        r1.A01 = "direct_inbox";
                        0wc A003 = r1.A00();
                        0Aj A004 = A003.A00(A003.A00, C66579MXk.A00(302));
                        A004.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, C6C);
                        if (z) {
                            str = "flag";
                        } else {
                            str = "unflag";
                        }
                        A004.AAJ("action", str);
                        A004.Cgf();
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            }
            C69865NtT.A00(r4);
        }
    }

    public final void Dqj() {
        C254793t3 A082 = C66647MaG.A08(C66647MaG.A04(A00().C6l().AfV()));
        if (A082 != null) {
            1Au.A00(this.A01).A0v(C300965yF.A07(A082));
        }
    }

    /* JADX WARNING: type inference failed for: r24v0, types: [X.07Z, androidx.fragment.app.Fragment] */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0350, code lost:
        if (X.0qQ.A0K(r4.A06, r3.BsI()) == false) goto L_0x0352;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CnZ(android.view.View r26, android.view.View r27, android.view.View r28, android.view.View r29, android.view.View r30, android.view.View r31, android.view.View r32, android.view.View r33, android.view.View r34, android.view.View r35) {
        /*
            r25 = this;
            r7 = 0
            r2 = r25
            X.7Zg r0 = r2.A00()
            X.9Gx r1 = X.C376179Gx.PSEUDO_SHOW_THREAD_VIEW_NUXES
            boolean r0 = r0.AH1(r1)
            if (r0 != 0) goto L_0x0013
            X.C69865NtT.A00(r1)
        L_0x0012:
            return
        L_0x0013:
            X.7Zg r0 = r2.A00()
            X.7S7 r0 = r0.C6l()
            boolean r0 = r0.CdE()
            if (r0 == 0) goto L_0x0012
            X.7Zg r0 = r2.A00()
            X.7S7 r0 = r0.C6l()
            X.7SD r0 = r0.C6Q()
            int r1 = r0.A08
            r0 = 29
            if (r1 != r0) goto L_0x004a
            com.instagram.common.session.UserSession r1 = r2.A01
            X.2Ep r0 = r2.A02()
            boolean r0 = X.C327967Cx.A00(r1, r0)
            if (r0 != 0) goto L_0x004a
            X.2Ep r0 = r2.A02()
            boolean r0 = X.C327957Cw.A00(r1, r0)
            if (r0 != 0) goto L_0x004a
            return
        L_0x004a:
            X.4DH r0 = r2.A00
            r24 = r0
            androidx.fragment.app.FragmentActivity r10 = r24.requireActivity()
            X.0iw r11 = r2.A03
            com.instagram.common.session.UserSession r4 = r2.A01
            X.7Zg r22 = r2.A00()
            X.2Ep r15 = r2.A02()
            X.7Zg r0 = r2.A00()
            X.7S7 r0 = r0.C6l()
            X.3sy r0 = r0.AfV()
            com.instagram.model.direct.DirectThreadKey r21 = X.C66647MaG.A04(r0)
            X.0eK r0 = r2.A0F
            java.lang.Object r0 = r0.get()
            X.0qQ.A07(r0)
            X.0sa r0 = r2.A0G
            java.lang.Object r0 = r0.invoke()
            X.78q r0 = (X.C3269178q) r0
            if (r0 == 0) goto L_0x0193
            X.Gmo r9 = r0.A09()
        L_0x0085:
            X.7VP r1 = r2.A05
            X.0eM r0 = r1.A0B
            java.lang.Object r8 = r0.getValue()
            X.2qT r8 = (X.C230882qT) r8
            X.0eM r0 = r1.A0A
            java.lang.Object r6 = r0.getValue()
            X.2bu r6 = (X.2bu) r6
            X.0Tu r5 = X.0Tu.A05
            r0 = 36314223365589483(0x810398000009eb, double:3.02859930981484E-306)
            boolean r20 = X.182.A06(r5, r4, r0)
            X.7Zg r1 = r2.A00()
            X.9Gx r0 = X.C376179Gx.THREAD_DETAILS_SHOW_THEME_SETTINGS
            r1.AH1(r0)
            r0 = 2
            X.0qQ.A0B(r11, r0)
            r1 = 4
            r0 = r22
            X.0qQ.A0B(r0, r1)
            r0 = 18
            X.0qQ.A0B(r8, r0)
            r0 = 19
            X.0qQ.A0B(r6, r0)
            r12 = r31
            if (r31 == 0) goto L_0x00f0
            X.7S7 r0 = r22.C6l()
            X.170 r0 = r0.BY7()
            if (r0 == 0) goto L_0x018f
            java.lang.String r23 = r0.getId()
        L_0x00d1:
            X.1Av r3 = X.1Au.A00(r4)
            X.0xa r2 = r3.A01
            java.lang.String r13 = "tas_tooltip_nux_last_seen_time"
            r0 = 0
            long r18 = r2.getLong(r13, r0)
            int r13 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r13 == 0) goto L_0x013a
            long r16 = java.lang.System.currentTimeMillis()
            long r16 = r16 - r18
            r13 = 259200000(0xf731400, double:1.280618154E-315)
            int r0 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x013a
        L_0x00f0:
            r11 = r27
            if (r27 == 0) goto L_0x0196
            X.1Av r1 = X.1Au.A00(r4)
            X.0s0 r2 = r1.A1k
            X.0YZ[] r3 = X.1Av.A8a
            r0 = 292(0x124, float:4.09E-43)
            r0 = r3[r0]
            java.lang.Object r0 = r2.CDM(r1, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0196
            X.0s0 r2 = r1.A4Q
            r0 = 293(0x125, float:4.1E-43)
            r0 = r3[r0]
            java.lang.Object r0 = r2.CDM(r1, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0196
            r0 = 2131969064(0x7f134428, float:1.957504E38)
            java.lang.String r16 = r10.getString(r0)
            X.0qQ.A07(r16)
            X.2fy r13 = X.C226262fy.BELOW_ANCHOR
            java.lang.Integer r15 = X.AnonymousClass05K.A01
            X.Fvt r2 = new X.Fvt
            r9 = r2
            r12 = r4
            r14 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r0 = 100
            r11.postDelayed(r2, r0)
            return
        L_0x013a:
            X.0s0 r1 = r3.A5K
            X.0YZ[] r13 = X.1Av.A8a
            r0 = 416(0x1a0, float:5.83E-43)
            r0 = r13[r0]
            java.lang.Object r0 = r1.CDM(r3, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0166
            java.lang.String r3 = "tas_tooltip_nux_impression"
            int r0 = r2.getInt(r3, r7)
            if (r0 != 0) goto L_0x0166
            int r0 = r2.getInt(r3, r7)
            X.0xY r1 = r2.AR4()
            int r0 = r0 + 1
            r1.E5Z(r3, r0)
            r1.apply()
        L_0x0166:
            java.lang.String r0 = "tas_tooltip_nux_impression"
            int r0 = r2.getInt(r0, r7)
            long r2 = (long) r0
            r0 = 36598305388563624(0x8205f700110ca8, double:3.208253925050177E-306)
            long r13 = X.182.A01(r5, r4, r0)
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x00f0
            X.Fvn r0 = new X.Fvn
            r17 = r0
            r18 = r10
            r19 = r12
            r20 = r12
            r21 = r11
            r22 = r4
            r17.<init>(r18, r19, r20, r21, r22, r23)
            X.03T.A00(r12, r0)
            return
        L_0x018f:
            r23 = 0
            goto L_0x00d1
        L_0x0193:
            r9 = 0
            goto L_0x0085
        L_0x0196:
            r3 = r28
            if (r28 == 0) goto L_0x01bf
            X.1Av r1 = X.1Au.A00(r4)
            boolean r0 = X.C327957Cw.A00(r4, r15)
            if (r0 == 0) goto L_0x01af
            X.AqF r2 = new X.AqF
            r2.<init>(r10, r3, r4, r1)
        L_0x01a9:
            r0 = 300(0x12c, double:1.48E-321)
            r3.postDelayed(r2, r0)
            return
        L_0x01af:
            X.1Av r1 = X.1Au.A00(r4)
            boolean r0 = X.C327967Cx.A00(r4, r15)
            if (r0 == 0) goto L_0x01bf
            X.FuJ r2 = new X.FuJ
            r2.<init>(r10, r3, r1)
            goto L_0x01a9
        L_0x01bf:
            r2 = r33
            if (r33 == 0) goto L_0x01ff
            boolean r0 = r15.CXW()
            r12 = 1
            X.1Av r3 = X.1Au.A00(r4)
            if (r0 == 0) goto L_0x01f1
            r0 = 36325145468744331(0x810d870014328b, double:3.0355064918297455E-306)
            boolean r0 = X.182.A06(r5, r4, r0)
            if (r0 == 0) goto L_0x01ff
            java.lang.String r1 = "preference_ai_home_meta_ai_tooltip_shown_count"
        L_0x01db:
            X.0xa r0 = r3.A01
            int r0 = r0.getInt(r1, r7)
            if (r0 > 0) goto L_0x01ff
            r3.A0z(r1, r12)
            X.Fsl r3 = new X.Fsl
            r3.<init>(r10, r2)
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.postDelayed(r3, r0)
            return
        L_0x01f1:
            r0 = 36325145468809868(0x810d870015328c, double:3.0355064918711913E-306)
            boolean r0 = X.182.A06(r5, r4, r0)
            if (r0 == 0) goto L_0x01ff
            java.lang.String r1 = "preference_ai_home_ugc_tooltip_shown_count"
            goto L_0x01db
        L_0x01ff:
            r12 = r34
            if (r34 == 0) goto L_0x0253
            com.instagram.user.model.User r0 = r15.BZK()
            if (r0 == 0) goto L_0x0251
            X.4Cl r0 = r0.A03
            java.lang.String r1 = r0.AaR()
        L_0x020f:
            java.lang.String r0 = r4.A06
            boolean r18 = X.0qQ.A0K(r1, r0)
            r0 = 36330479817015954(0x81126100034292, double:3.038879955156416E-306)
            boolean r0 = X.182.A06(r5, r4, r0)
            if (r0 == 0) goto L_0x0253
            X.1Av r14 = X.1Au.A00(r4)
            java.lang.String r1 = "preference_share_ai_tooltip_shown_count"
            X.0xa r0 = r14.A01
            int r13 = r0.getInt(r1, r7)
            long r2 = (long) r13
            r0 = 36611954793781547(0x8212610004192b, double:3.216885863871735E-306)
            long r16 = X.182.A01(r5, r4, r0)
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x0253
            r6 = 2131975276(0x7f135c6c, float:1.958764E38)
            if (r18 == 0) goto L_0x0242
            r6 = 2131975277(0x7f135c6d, float:1.9587642E38)
        L_0x0242:
            X.Fve r2 = new X.Fve
            r3 = r10
            r4 = r12
            r5 = r14
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = 1000(0x3e8, double:4.94E-321)
            r12.postDelayed(r2, r0)
            return
        L_0x0251:
            r1 = 0
            goto L_0x020f
        L_0x0253:
            r12 = r32
            if (r32 == 0) goto L_0x0298
            boolean r0 = r15.CQq()
            if (r0 == 0) goto L_0x0298
            X.7Yq r0 = new X.7Yq
            r0.<init>(r4)
            X.0xa r14 = r0.A01
            java.lang.String r13 = "creator_ai_sandbox_settings_nux_count"
            r2 = 0
            long r18 = r14.getLong(r13, r2)
            r16 = 1
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x0298
            r0 = 36322993690585827(0x810b92001b2ae3, double:3.0341456986577924E-306)
            boolean r0 = X.182.A06(r5, r4, r0)
            if (r0 == 0) goto L_0x0298
            X.Fsg r4 = new X.Fsg
            r4.<init>(r10, r12)
            r0 = 1000(0x3e8, double:4.94E-321)
            r12.postDelayed(r4, r0)
            X.0xY r4 = r14.AR4()
            long r0 = r14.getLong(r13, r2)
            long r0 = r0 + r16
            r4.E5c(r13, r0)
            r4.apply()
            return
        L_0x0298:
            r13 = r29
            if (r29 == 0) goto L_0x02cf
            X.AnonymousClass1q4.A00()
            X.7Yq r3 = new X.7Yq
            r3.<init>(r4)
            X.0xa r1 = r3.A01
            java.lang.String r0 = "ai_call_tooltip_seen_count"
            int r0 = r1.getInt(r0, r7)
            if (r0 != 0) goto L_0x02cf
            boolean r0 = X.C66648MaH.A01(r4, r15)
            if (r0 == 0) goto L_0x02cf
            X.07V r0 = r24.getLifecycle()
            X.0xx r2 = X.C71772f0.A00(r0)
            r16 = 0
            r17 = 11
            X.MHF r1 = new X.MHF
            r11 = r1
            r12 = r3
            r14 = r10
            r15 = r4
            r11.<init>(r12, r13, r14, r15, r16, r17)
            X.19B r0 = X.19B.A00
            X.1Eo.A05(r0, r1, r2)
            return
        L_0x02cf:
            r3 = r35
            if (r35 == 0) goto L_0x0308
            r2 = 1
            X.1Av r5 = X.1Au.A00(r4)
            if (r9 == 0) goto L_0x0308
            java.lang.String r0 = r9.A02
            if (r0 == 0) goto L_0x02e4
            java.lang.Integer r1 = r9.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0308
        L_0x02e4:
            boolean r0 = r9.A05
            if (r0 != r2) goto L_0x0308
            X.0xa r1 = r5.A01
            java.lang.String r0 = "blend_direct_thread_tooltip_seen_count"
            int r1 = r1.getInt(r0, r7)
            r0 = 3
            if (r1 >= r0) goto L_0x0308
            java.lang.String r2 = "blend_direct_thread_tooltip_last_shown_time_ms"
            r0 = 1
            boolean r0 = X.1Av.A07(r5, r2, r0)
            if (r0 == 0) goto L_0x0308
            X.FuI r2 = new X.FuI
            r2.<init>(r10, r3, r5)
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.postDelayed(r2, r0)
            return
        L_0x0308:
            if (r20 == 0) goto L_0x0311
            if (r27 == 0) goto L_0x0311
            com.instagram.quickpromotion.intf.QPTooltipAnchor r0 = com.instagram.quickpromotion.intf.QPTooltipAnchor.THREAD_NAME
            r8.A00(r11, r0, r6)
        L_0x0311:
            r5 = r30
            if (r30 == 0) goto L_0x0364
            X.7S7 r0 = r22.C6l()
            X.170 r0 = r0.BY7()
            if (r0 == 0) goto L_0x0364
            boolean r0 = r0.CPm()
            if (r0 == 0) goto L_0x0364
            if (r21 == 0) goto L_0x0364
            X.2Dm r1 = X.1bJ.A00(r4)
            r0 = r21
            java.util.ArrayList r0 = r1.Aax(r0, r7)
            java.util.Iterator r7 = r0.iterator()
            r2 = 0
        L_0x0336:
            r0 = 0
        L_0x0337:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x035b
            java.lang.Object r3 = r7.next()
            X.3su r3 = (X.C254703su) r3
            if (r3 == 0) goto L_0x0352
            java.lang.String r1 = r4.A06
            java.lang.String r0 = r3.BsI()
            boolean r0 = X.0qQ.A0K(r1, r0)
            r2 = 1
            if (r0 != 0) goto L_0x0355
        L_0x0352:
            r2 = 0
            if (r3 == 0) goto L_0x0336
        L_0x0355:
            X.55L r1 = r3.A0c
            r0 = 1
            if (r1 != 0) goto L_0x0337
            goto L_0x0336
        L_0x035b:
            if (r2 == 0) goto L_0x0364
            if (r0 != 0) goto L_0x0364
            com.instagram.quickpromotion.intf.QPTooltipAnchor r0 = com.instagram.quickpromotion.intf.QPTooltipAnchor.INBOX_THREAD_AUDIO_CALL_ICON
            r8.A00(r5, r0, r6)
        L_0x0364:
            if (r32 == 0) goto L_0x0012
            int r1 = r15.C6a()
            r0 = 1014(0x3f6, float:1.421E-42)
            if (r1 != r0) goto L_0x0012
            com.instagram.quickpromotion.intf.QPTooltipAnchor r0 = com.instagram.quickpromotion.intf.QPTooltipAnchor.KIRBY_THREAD_SETTINGS_BUTTON
            r8.A00(r12, r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C330037Le.CnZ(android.view.View, android.view.View, android.view.View, android.view.View, android.view.View, android.view.View, android.view.View, android.view.View, android.view.View, android.view.View):void");
    }
}
