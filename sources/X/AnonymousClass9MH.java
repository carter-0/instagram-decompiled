package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.SpannableString;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.pando.ConnectionManager;
import com.facebook.pando.PandoConsistencyServiceJNI;
import com.facebook.pando.PandoGraphQLConsistencyJNI;
import com.facebook.pando.PandoPaginationService;
import com.facebook.pando.PandoPrimaryExecution;
import com.facebook.tigon.TigonError;
import com.instagram.android.R;
import com.instagram.api.schemas.MetaPlaceDict;
import com.instagram.barcelona.location.api.LocationRepository;
import com.instagram.barcelona.location.model.LocationModel;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.UUID;
import org.webrtc.EglBase14Impl;

/* renamed from: X.9MH  reason: invalid class name */
public final class AnonymousClass9MH extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9MH(AnonymousClass0eM r2, AnonymousClass0eM r3, AnonymousClass0eM r4, int i) {
        super(0);
        this.A00 = i;
        this.A03 = r2;
        if (30 - i != 0) {
            this.A01 = r3;
            this.A02 = r4;
        } else {
            this.A02 = r3;
            this.A01 = r4;
        }
    }

    /* JADX WARNING: type inference failed for: r3v22, types: [X.07g, java.lang.Object, X.4DH] */
    /* JADX WARNING: type inference failed for: r0v98, types: [X.9Hq, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass0eM r0;
        0sP r3;
        UUID uuid;
        RecyclerView recyclerView;
        2Wh r02;
        RecyclerView recyclerView2;
        2Wh r03;
        C381039b4 r4;
        Object obj;
        SpannableString spannableString;
        boolean A012;
        switch (this.A00) {
            case 0:
                AnonymousClass5S2 r42 = ((AnonymousClass6GF) this.A03).A06;
                AnonymousClass5Q3 r32 = (AnonymousClass5Q3) this.A02;
                ((0rm) this.A01).A00 = r42.AMX(r32, r32.getLayoutDirection(), r32.Bwg());
                break;
            case 1:
                C301465zJ r2 = (C301465zJ) this.A03;
                AnonymousClass5VN A002 = C301465zJ.A00(r2, (C268064ch) this.A02, (C62320sa) this.A01);
                if (A002 == null) {
                    return null;
                }
                AnonymousClass6IZ r5 = (AnonymousClass6IZ) r2.A00;
                long j = r5.A00;
                if (j != 0) {
                    return A002.A03(AnonymousClass6IZ.A01(r5, A002, j) ^ -9223372034707292160L);
                }
                throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.");
            case 2:
                View view = (View) this.A03;
                view.removeOnAttachStateChangeListener((C284865Oo) this.A01);
                Object obj2 = this.A02;
                0qQ.A0B(obj2, 1);
                C275604qc.A00(view).A00.remove(obj2);
                break;
            case 3:
                C258733zY r7 = (C258733zY) this.A02;
                C60400gq r33 = r7.A00;
                if (r33 != null && r33.Agw(36317779601921572L) && (r7.BTh() == 10 || r7.BTh() == 11)) {
                    r0 = AnonymousClass4Iw.A00((Context) this.A01, (UserSession) this.A03).A06;
                } else {
                    0lg r43 = (0lg) this.A03;
                    Object obj3 = this.A01;
                    0qQ.A0B(r43, 0);
                    0qQ.A0B(obj3, 1);
                    r0 = ((C10858RzJ) r43.A01(C10858RzJ.class, new TTP(12, obj3, r43))).A0C;
                }
                return r0.getValue();
            case 4:
                AnonymousClass94Z r34 = (AnonymousClass94Z) this.A03;
                C258743zZ r22 = r34.A03;
                boolean CaD = r22.CaD();
                0lg r52 = (0lg) this.A02;
                Object obj4 = this.A01;
                if (CaD) {
                    r3 = null;
                } else {
                    C3731694g r35 = r34.A05;
                    long BTh = r22.BTh();
                    if (BTh == 1) {
                        r3 = r35.A04;
                    } else if (BTh == 2) {
                        r3 = r35.A03;
                    } else if (BTh == 53) {
                        r3 = r35.A02;
                    } else if (BTh == 54) {
                        r3 = r35.A01;
                    } else {
                        r3 = r35.A00;
                    }
                }
                0qQ.A0B(r52, 0);
                0qQ.A0B(obj4, 1);
                return ((C10831Ryr) r52.A01(C10831Ryr.class, new C58696Iw5(15, obj4, r3, r52))).A08.getValue();
            case 5:
                C67701vw r36 = (C67701vw) this.A01;
                if (r36 != null) {
                    AnonymousClass0eM r1 = (AnonymousClass0eM) this.A02;
                    if (r1 != null) {
                        AnonymousClass0eM r04 = ((1vy) this.A03).A02;
                        if (r04 != null) {
                            PandoConsistencyServiceJNI pandoConsistencyServiceJNI = ((PandoGraphQLConsistencyJNI) r04.getValue()).consistencyService;
                            PandoPrimaryExecution pandoPrimaryExecution = (PandoPrimaryExecution) r1.getValue();
                            0qQ.A0B(pandoConsistencyServiceJNI, 0);
                            0qQ.A0B(pandoPrimaryExecution, 1);
                            XVH xvh = PandoPaginationService.Companion;
                            return new PandoPaginationService(pandoConsistencyServiceJNI, pandoPrimaryExecution, (ConnectionManager) r36.A00.getValue());
                        }
                        throw new IllegalStateException("Consistency service is required for pagination");
                    }
                    throw new IllegalStateException("Primary execution is required for pagination");
                }
                throw new IllegalStateException("Pagination service is required for paginating");
            case 6:
                ((C59520Ya) this.A03).invoke(this.A01, this.A02);
                break;
            case 7:
                ((01F) this.A03).A02(this.A01, this.A02);
                break;
            case 8:
                AnonymousClass9MH.super.onError((TigonError) this.A01, (C239923Iu) this.A02);
                break;
            case 9:
                AnonymousClass9MH.super.onWillRetry((TigonError) this.A01, (C239923Iu) this.A02);
                break;
            case 10:
                13w.A02((Context) this.A01, (UserSession) this.A02);
                break;
            case 11:
                C299575vQ r53 = (C299575vQ) this.A02;
                MetaPlaceDict metaPlaceDict = ((C299565vP) r53).A02;
                if (metaPlaceDict != null) {
                    0lg r44 = (0lg) this.A03;
                    C299665vd r37 = (C299665vd) this.A01;
                    String id = metaPlaceDict.getId();
                    String str = "";
                    if (id == null) {
                        id = str;
                    }
                    String name = metaPlaceDict.getName();
                    if (name != null) {
                        str = name;
                    }
                    0qQ.A0B(r44, 0);
                    ((LocationRepository) r44.A01(LocationRepository.class, new C58707IwG((Object) r44, 13))).A00(new LocationModel((Double) null, (Double) null, str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, Long.parseLong(id)));
                    r37.DOr(r53.Be5().A03, id, str);
                    break;
                }
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                C336857fI r23 = (C336857fI) this.A03;
                String str2 = r23.A04;
                Map map = null;
                if (str2 == null) {
                    return null;
                }
                UserSession userSession = r23.A03;
                C317746nl r38 = new C317746nl(userSession);
                boolean z = r23.A0D;
                if (z) {
                    if (r23.A09) {
                        A012 = r38.A02();
                    } else {
                        A012 = r38.A01();
                    }
                    if (!A012) {
                        return str2;
                    }
                }
                AnonymousClass3Y5 r12 = (AnonymousClass3Y5) this.A02;
                Context context = r12.A05.A0C;
                0qQ.A07(context);
                boolean z2 = !z;
                0sn r9 = r23.A07;
                if (r9 == null) {
                    r9 = 0sn.A00;
                }
                if (!r23.A0G || ((Boolean) ((2Wa) this.A01).A03).booleanValue()) {
                    spannableString = null;
                } else {
                    spannableString = new SpannableString(C244013aV.A0E(r12, 2131954761));
                }
                if (r23.A0E) {
                    map = r23.A08;
                }
                return C336887fL.A00(context, spannableString, userSession, str2, r9, map, new C58188Ins(42, this.A01, r23), new J6O(r23, 39), new J6O(r23, 40), new C59111J6t(r23, 42), new JG1(17, r12, r23), R.attr.igds_color_link, z2);
            case 13:
                C334977cB r45 = (C334977cB) this.A03;
                C334047aa r24 = r45.A03;
                if (r24 instanceof C334947c8) {
                    C334027aY r6 = ((C334947c8) r24).A04;
                    if (r6 instanceof C335537d7) {
                        C335017cF r25 = (C335017cF) this.A02;
                        C335537d7 r92 = (C335537d7) r6;
                        uuid = r92.A02;
                        0qQ.A0B(uuid, 0);
                        boolean z3 = !uuid.equals(r25.A00);
                        r25.A00 = uuid;
                        if (z3) {
                            try {
                                C334997cD r72 = (C334997cD) this.A01;
                                C337727go r05 = r72.A01;
                                if (r05 == null || (r03 = r05.A01) == null) {
                                    recyclerView2 = null;
                                } else {
                                    recyclerView2 = r03.A04;
                                }
                                if (!r92.A03 || recyclerView2 == null) {
                                    r72.A02(AnonymousClass05K.A0N, r92.A01);
                                } else {
                                    04k A003 = C586203k.A00(recyclerView2);
                                    if (A003 == null || !A003.A00.A0I(8)) {
                                        recyclerView2.addOnLayoutChangeListener(new C71415OkE(0, r72, recyclerView2, r6));
                                    } else {
                                        r72.A02(AnonymousClass05K.A0N, r92.A01);
                                    }
                                }
                            } catch (IllegalArgumentException unused) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Error processing ui action ");
                                sb.append(r6);
                                0KC.A0C("CommentListComponent", sb.toString());
                            }
                        }
                    } else if (r6 instanceof C335547d8) {
                        C335017cF r26 = (C335017cF) this.A02;
                        uuid = ((C335547d8) r6).A00;
                        0qQ.A0B(uuid, 0);
                        boolean z4 = !uuid.equals(r26.A00);
                        r26.A00 = uuid;
                        if (z4) {
                            C337727go r06 = ((C334997cD) this.A01).A01;
                            if (r06 == null || (r02 = r06.A01) == null) {
                                recyclerView = null;
                            } else {
                                recyclerView = r02.A04;
                            }
                            if (recyclerView != null) {
                                recyclerView.A0p(0);
                            }
                        }
                    } else if (!0qQ.A0K(r6, C334017aX.A00)) {
                        throw new RuntimeException();
                    }
                    r45.A02.A0j(uuid);
                }
                return new C245943dj(new 0Yg(0));
            case 14:
                C335887dh r27 = ((C338047hK) this.A03).A00.A04;
                if (r27 instanceof C335877dg) {
                    return null;
                }
                if (r27 instanceof C338057hL) {
                    AnonymousClass3Y5 r39 = (AnonymousClass3Y5) this.A02;
                    return new C10625RvJ((2V5) this.A01, C244013aV.A01(r39, R.attr.highlightedOrWarningCommentBackground), C244013aV.A01(r39, R.attr.highlightedOrWarningCommentBackgroundTransitionEnd));
                }
                throw new RuntimeException();
            case 15:
                C366258oa r13 = (C366258oa) this.A03;
                return new C366308of((View) this.A01, r13.A03, (TargetViewSizeProvider) this.A02, (AnonymousClass86i) r13.A09.getValue(), new C366288od(r13));
            case 16:
                ? r310 = ((C358238aa) this.A03).A02;
                0qQ.A0C(r310, "null cannot be cast to non-null type androidx.lifecycle.ViewModelStoreOwner");
                return new 2YN(new C358318ai((1Av) this.A01, (UserSession) this.A02), r310).A00(C358328aj.class);
            case 17:
                02m r28 = (02m) this.A01;
                0qQ.A0A(r28);
                return new AnonymousClass8A2((1QP) this.A03, (29E) this.A02, r28);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                AnonymousClass763 r14 = ((C39752A7s) this.A02).A07;
                Drawable drawable = null;
                if (r14 != null) {
                    drawable = r14.A00;
                }
                if ((drawable instanceof C381039b4) && (r4 = (C381039b4) drawable) != null) {
                    NEn nEn = r4.A00;
                    nEn.setVisible(true, true);
                    r4.A01.setVisible(false, false);
                    r4.A01(nEn);
                }
                ((ImageView) this.A01).setImageDrawable((Drawable) null);
                break;
            case 19:
                C332237Ue r311 = (C332237Ue) this.A03;
                UserSession userSession2 = r311.A0G;
                C332067Tn r29 = r311.A0H;
                return new AnonymousClass7V2(r311.A0E, userSession2, r29.A06, new AnonymousClass7V1((AnonymousClass7SG) this.A02), (C331617Rr) this.A01, new C332317Um(r29.A0G), new C332317Um(r311.A0t), new C332317Um(r29.A0I));
            case 20:
                C332237Ue r62 = (C332237Ue) this.A03;
                AnonymousClass4DH r11 = r62.A0E;
                UserSession userSession3 = r62.A0G;
                C332067Tn r15 = r62.A0H;
                AnonymousClass0iw r122 = r15.A02;
                String str3 = r15.A09;
                return new AnonymousClass7VP(r11, r122, userSession3, (AnonymousClass7TD) this.A02, (AnonymousClass7SE) this.A01, r15.A07, str3, r62.A0t, r15.A0H, new C73897PlY(r62, 2));
            case 21:
                C332237Ue r210 = (C332237Ue) this.A03;
                UserSession userSession4 = r210.A0G;
                AnonymousClass4DH r54 = r210.A0E;
                Handler handler = (Handler) this.A02;
                C332317Um r312 = new C332317Um(r210.A0t);
                AnonymousClass9H7 r142 = (AnonymousClass9H7) this.A01;
                C332067Tn r16 = r210.A0H;
                C332327Un r46 = new C332327Un(r16.A0K);
                C332327Un r211 = new C332327Un(r16.A0L);
                0qQ.A0B(r54, 1);
                0qQ.A0B(handler, 2);
                0qQ.A0B(r142, 4);
                return new AnonymousClass7V0(handler, userSession4, C61410nE.A00, r142, new C376359Hr(userSession4, new Object()), C332337Uo.A00(userSession4), r46, r211, new WeakReference(r54), r312);
            case 22:
                return new C40468Acd((AnonymousClass0iw) this.A01, ((AnonymousClass9H6) this.A03).A01, (AnonymousClass0eK) this.A02);
            case 23:
                return new C3258474k((Fragment) this.A02, ((AnonymousClass9H6) this.A03).A01, ((C332237Ue) this.A01).A00());
            case 24:
                return new AnonymousClass7AI(((AnonymousClass9H6) this.A03).A01, (AnonymousClass0eK) this.A01, (AnonymousClass0eK) this.A02);
            case 25:
                AnonymousClass9H6 r212 = (AnonymousClass9H6) this.A03;
                return new C50400Fb8(r212.A00.requireActivity(), (AnonymousClass0iw) this.A01, r212.A01, (AnonymousClass7TO) this.A02, AnonymousClass3BQ.DIRECT);
            case 26:
                AnonymousClass9H6 r17 = (AnonymousClass9H6) this.A03;
                return new C72510P8t(r17.A00.requireActivity(), r17.A01, ((C332237Ue) this.A01).A00(), (AnonymousClass7SM) this.A02);
            case 27:
                return new C50402FbA((AnonymousClass4DH) this.A02, ((AnonymousClass9H6) this.A03).A01, (AnonymousClass0eK) this.A01);
            case 28:
                AnonymousClass4AL r55 = (AnonymousClass4AL) this.A03;
                UserSession userSession5 = r55.A02;
                C3018760k A013 = C3018660j.A01(userSession5);
                AnonymousClass4AB r313 = (AnonymousClass4AB) this.A02;
                C319726r6 r213 = C319726r6.BIRTHDAY_INDICATOR;
                A013.A0I(r213, r313);
                boolean A0K = 0qQ.A0K(userSession5.A06, r313.A0A.getId());
                AnonymousClass4AF r07 = r55.A05;
                if (!A0K) {
                    r07.A01(r213, r313);
                    break;
                } else {
                    C69980NvK.A00(r07.A01, r07.A03);
                    break;
                }
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                AnonymousClass7P7 r18 = (AnonymousClass7P7) this.A03;
                UserSession userSession6 = r18.A07;
                C332807Wl r314 = r18.A08;
                AnonymousClass768 r214 = (AnonymousClass768) ((AnonymousClass0eM) this.A02).getValue();
                AnonymousClass7DR r19 = (AnonymousClass7DR) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0B(r214, 2);
                0qQ.A0B(r19, 3);
                return new C327997Da(r19, new PB1(userSession6, r314, r214));
            case 30:
                return new AnonymousClass7BB((AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue(), (AnonymousClass768) ((AnonymousClass0eM) this.A03).getValue(), (PB0) ((AnonymousClass0eM) this.A02).getValue());
            case 31:
                AnonymousClass7P7 r110 = (AnonymousClass7P7) this.A03;
                return new AnonymousClass7BB((AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue(), AnonymousClass768.A00(r110.A08, r110.A09), (C3258874o) ((AnonymousClass0eM) this.A02).getValue());
            case 32:
            case 33:
                return new NYC((AnonymousClass7DR) ((AnonymousClass0eM) this.A01).getValue(), (C72491P8a) ((AnonymousClass0eM) this.A02).getValue(), (C72559PAq) ((AnonymousClass0eM) this.A03).getValue(), C68873NaA.class);
            case 34:
                return new NYC((AnonymousClass7DR) ((AnonymousClass0eM) this.A01).getValue(), (C72491P8a) ((AnonymousClass0eM) this.A02).getValue(), (C72559PAq) ((AnonymousClass0eM) this.A03).getValue(), C68872Na9.class);
            case 35:
                return new NYB((AnonymousClass7DR) ((AnonymousClass0eM) this.A01).getValue(), (C72491P8a) ((AnonymousClass0eM) this.A02).getValue(), (C72559PAq) ((AnonymousClass0eM) this.A03).getValue());
            case 36:
                AnonymousClass7P7 r111 = (AnonymousClass7P7) this.A03;
                UserSession userSession7 = r111.A07;
                C332807Wl r56 = r111.A08;
                AnonymousClass9HC r63 = r111.A09;
                AnonymousClass7BA r215 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r215, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.voice.VoiceContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.quotedreply.expandabletext.ExpandableTextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                C331037Pg r73 = (C331037Pg) this.A02;
                0qQ.A0B(r215, 3);
                0qQ.A0B(r73, 4);
                return new AnonymousClass7BB(r215, new C3258874o(userSession7, r56, r63, r73, false, false), new AnonymousClass749(userSession7, r56, r63));
            case 37:
                AnonymousClass7P7 r315 = (AnonymousClass7P7) this.A03;
                Context context2 = r315.A04;
                UserSession userSession8 = r315.A07;
                C332807Wl r57 = r315.A08;
                AnonymousClass9HC r64 = r315.A09;
                AnonymousClass7BA r216 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r216, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.voice.VoiceContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.media.MediaContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                C331037Pg r74 = (C331037Pg) this.A02;
                AnonymousClass0iw r112 = r315.A06;
                0qQ.A0B(r216, 4);
                0qQ.A0B(r74, 5);
                0qQ.A0B(r112, 6);
                return new AnonymousClass7BB(r216, new C3258874o(userSession8, r57, r64, r74, false, false), new AnonymousClass77K(context2, r112, userSession8, r57, r64));
            case 38:
                AnonymousClass7P7 r316 = (AnonymousClass7P7) this.A03;
                UserSession userSession9 = r316.A07;
                C332807Wl r58 = r316.A08;
                AnonymousClass9HC r65 = r316.A09;
                AnonymousClass7BA r217 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r217, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.voice.VoiceContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.animatedsticker.AnimatedStickerContentViewHolder>");
                C331037Pg r75 = (C331037Pg) this.A02;
                AnonymousClass0iw r113 = r316.A06;
                0qQ.A0B(r217, 3);
                0qQ.A0B(r75, 4);
                0qQ.A0B(r113, 5);
                return new AnonymousClass7BB(r217, new C3258874o(userSession9, r58, r65, r75, false, false), C395119zF.A00(r113, userSession9, r58, r65));
            case 39:
                AnonymousClass7P7 r114 = (AnonymousClass7P7) this.A03;
                UserSession userSession10 = r114.A07;
                C332807Wl r47 = r114.A08;
                AnonymousClass9HC r317 = r114.A09;
                AnonymousClass7BA r218 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r218, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.voice.VoiceContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.voice.VoiceContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                return C395189zM.A00(userSession10, r218, r47, r317, (C331037Pg) this.A02);
            case 40:
                AnonymousClass7P7 r318 = (AnonymousClass7P7) this.A03;
                UserSession userSession11 = r318.A07;
                C332807Wl r59 = r318.A08;
                AnonymousClass9HC r66 = r318.A09;
                AnonymousClass7BA r219 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r219, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.voice.VoiceContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.visual.VisualContentViewHolder>");
                AnonymousClass0iw r115 = r318.A06;
                C331037Pg r76 = (C331037Pg) this.A02;
                0qQ.A0B(r219, 3);
                0qQ.A0B(r115, 4);
                0qQ.A0B(r76, 5);
                return new AnonymousClass7BB(r219, new C3258874o(userSession11, r59, r66, r76, false, false), new AnonymousClass7RW(r115, userSession11, r59, r66));
            case Seq.NULL_REFNUM:
                AnonymousClass7P7 r319 = (AnonymousClass7P7) this.A03;
                UserSession userSession12 = r319.A07;
                C332807Wl r510 = r319.A08;
                AnonymousClass9HC r67 = r319.A09;
                AnonymousClass7BA r220 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r220, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.voice.VoiceContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.visualthumbnail.VisualThumbnailContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                AnonymousClass0iw r116 = r319.A06;
                C331037Pg r77 = (C331037Pg) this.A02;
                0qQ.A0B(r220, 3);
                0qQ.A0B(r116, 4);
                0qQ.A0B(r77, 5);
                return new AnonymousClass7BB(r220, new C3258874o(userSession12, r510, r67, r77, false, false), new AnonymousClass7RY(r116, userSession12, r510, r67));
            case Seq.RefTracker.REF_OFFSET:
                AnonymousClass7P7 r320 = (AnonymousClass7P7) this.A03;
                Context context3 = r320.A04;
                UserSession userSession13 = r320.A07;
                C332807Wl r511 = r320.A08;
                AnonymousClass9HC r68 = r320.A09;
                AnonymousClass7BA r221 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r221, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.media.MediaContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.voice.VoiceContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                AnonymousClass0iw r132 = r320.A06;
                C331037Pg r78 = (C331037Pg) this.A02;
                0qQ.A0B(r221, 4);
                0qQ.A0B(r132, 5);
                0qQ.A0B(r78, 6);
                return new AnonymousClass7BB(r221, new AnonymousClass77K(context3, r132, userSession13, r511, r68), new C3258874o(userSession13, r511, r68, r78, false, false));
            case 43:
                AnonymousClass7P7 r321 = (AnonymousClass7P7) this.A03;
                Context context4 = r321.A04;
                UserSession userSession14 = r321.A07;
                C332807Wl r79 = r321.A08;
                AnonymousClass9HC r8 = r321.A09;
                AnonymousClass7BA r222 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r222, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.media.MediaContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.gif.GifContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                AnonymousClass0iw r512 = r321.A06;
                AnonymousClass7ZX r117 = (AnonymousClass7ZX) this.A02;
                0qQ.A0B(r222, 4);
                0qQ.A0B(r512, 5);
                0qQ.A0B(r117, 6);
                return new AnonymousClass7BB(r222, new AnonymousClass77K(context4, r512, userSession14, r79, r8), C395159zJ.A00(userSession14, r79, r117, r8));
            case 44:
                AnonymousClass7P7 r322 = (AnonymousClass7P7) this.A03;
                UserSession userSession15 = r322.A07;
                C332807Wl r513 = r322.A08;
                AnonymousClass9HC r69 = r322.A09;
                AnonymousClass7BA r223 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r223, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.visual.VisualContentViewHolder, com.instagram.direct.messagethread.voice.VoiceContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                C331037Pg r710 = (C331037Pg) this.A02;
                AnonymousClass0iw r118 = r322.A06;
                0qQ.A0B(r223, 3);
                0qQ.A0B(r710, 4);
                0qQ.A0B(r118, 5);
                return new AnonymousClass7BB(r223, new AnonymousClass7RW(r118, userSession15, r513, r69), new C3258874o(userSession15, r513, r69, r710, false, false));
            case 45:
                AnonymousClass7P7 r224 = (AnonymousClass7P7) this.A03;
                UserSession userSession16 = r224.A07;
                C332807Wl r610 = r224.A08;
                AnonymousClass9HC r514 = r224.A09;
                AnonymousClass7BA r48 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r48, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.visual.VisualContentViewHolder, com.instagram.direct.messagethread.gif.GifContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                AnonymousClass0iw r323 = r224.A06;
                AnonymousClass7ZX r225 = (AnonymousClass7ZX) this.A02;
                0qQ.A0B(r48, 3);
                0qQ.A0B(r323, 4);
                0qQ.A0B(r225, 5);
                return new AnonymousClass7BB(r48, new AnonymousClass7RW(r323, userSession16, r610, r514), C395159zJ.A00(userSession16, r610, r225, r514));
            case 46:
                AnonymousClass7P7 r324 = (AnonymousClass7P7) this.A03;
                UserSession userSession17 = r324.A07;
                C332807Wl r515 = r324.A08;
                AnonymousClass9HC r611 = r324.A09;
                AnonymousClass7BA r226 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r226, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.visualthumbnail.VisualThumbnailContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.voice.VoiceContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                C331037Pg r711 = (C331037Pg) this.A02;
                AnonymousClass0iw r119 = r324.A06;
                0qQ.A0B(r226, 3);
                0qQ.A0B(r711, 4);
                0qQ.A0B(r119, 5);
                return new AnonymousClass7BB(r226, new AnonymousClass7RY(r119, userSession17, r515, r611), new C3258874o(userSession17, r515, r611, r711, false, false));
            case 47:
                AnonymousClass7P7 r227 = (AnonymousClass7P7) this.A03;
                UserSession userSession18 = r227.A07;
                C332807Wl r612 = r227.A08;
                AnonymousClass9HC r516 = r227.A09;
                AnonymousClass7BA r49 = (AnonymousClass7BA) ((AnonymousClass0eM) this.A01).getValue();
                0qQ.A0C(r49, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.visualthumbnail.VisualThumbnailContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.gif.GifContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                AnonymousClass0iw r325 = r227.A06;
                AnonymousClass7ZX r228 = (AnonymousClass7ZX) this.A02;
                0qQ.A0B(r49, 3);
                0qQ.A0B(r325, 4);
                0qQ.A0B(r228, 5);
                return new AnonymousClass7BB(r49, new AnonymousClass7RY(r325, userSession18, r612, r516), C395159zJ.A00(userSession18, r612, r228, r516));
            case 48:
                AnonymousClass7P7 r229 = (AnonymousClass7P7) this.A03;
                C332807Wl r10 = r229.A08;
                AnonymousClass9HC r1110 = r229.A09;
                AnonymousClass7DR r326 = (AnonymousClass7DR) ((AnonymousClass0eM) this.A01).getValue();
                UserSession userSession19 = r229.A07;
                C331037Pg r613 = (C331037Pg) this.A02;
                0qQ.A0B(r326, 2);
                boolean z5 = r1110.A1X;
                C3265877j r120 = new C3265877j(z5);
                if (r613 != null) {
                    obj = new PAB(0wj.A01, r613);
                } else {
                    obj = new Object();
                }
                C74545Pwe pwe = (C74545Pwe) obj;
                return new C327997Da(r326, new C71873OsG(userSession19, pwe, 0sr.A1M(new AnonymousClass7DY[]{r120, new C3266077l(new AnonymousClass7DX(r10), new P83(pwe), r120.A00(r10), new AnonymousClass7DV(r10, z5), r10, r1110, (C3266177m) null, false)})));
            default:
                AnonymousClass7P7 r121 = (AnonymousClass7P7) this.A03;
                return NYD.A00(r121.A06, r121.A07, (AnonymousClass7DR) ((AnonymousClass0eM) this.A02).getValue(), r121.A08, r121.A09, (C72492P8b) ((AnonymousClass0eM) this.A01).getValue());
        }
        return C60340gF.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9MH(AnonymousClass7P7 r2, AnonymousClass0eM r3, AnonymousClass0eM r4, int i) {
        super(0);
        this.A00 = i;
        this.A03 = r2;
        switch (i) {
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
            case 31:
                this.A02 = r3;
                this.A01 = r4;
                break;
            default:
                this.A01 = r3;
                this.A02 = r4;
                break;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9MH(int i, Object obj, Object obj2, Object obj3) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
    }
}
