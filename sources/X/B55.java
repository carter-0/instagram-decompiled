package X;

import android.graphics.drawable.Drawable;
import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AppreciationUFIEntryActionType;
import com.instagram.api.schemas.ClipsBreakingCreatorInfo;
import com.instagram.api.schemas.ClipsCreationEntryPoint;
import com.instagram.api.schemas.MusicCanonicalType;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.OriginalityInfo;
import com.instagram.api.schemas.ProfessionalClipsUpsellType;
import com.instagram.clips.model.metadata.ClipsContextualHighlightInfoIntf;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.clips.ClipsShoppingInfoIntf;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public final class B55 extends C52050GCw implements AnonymousClass32U, MRT {
    public int A00;
    public final UserSession A01;
    public final GD6 A02;

    public B55(UserSession userSession, GD6 gd6) {
        0qQ.A0B(userSession, 2);
        this.A02 = gd6;
        this.A01 = userSession;
    }

    public final void DI6(Drawable drawable) {
        C245423cs r7;
        Object r2;
        C245363cl r5;
        BDp bDp;
        C245393cp r22;
        Object r72;
        C245413cr r0;
        TreeJNI r3;
        TreeJNI treeJNI;
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        TreeUpdaterJNI treeUpdaterJNI4;
        String str;
        TreeUpdaterJNI treeUpdaterJNI5;
        TreeUpdaterJNI treeUpdaterJNI6;
        TreeUpdaterJNI treeUpdaterJNI7;
        TreeUpdaterJNI treeUpdaterJNI8;
        String str2;
        TreeUpdaterJNI treeUpdaterJNI9;
        TreeUpdaterJNI treeUpdaterJNI10;
        ArrayList arrayList;
        TreeUpdaterJNI treeUpdaterJNI11;
        TreeUpdaterJNI treeUpdaterJNI12;
        TreeUpdaterJNI treeUpdaterJNI13;
        TreeUpdaterJNI treeUpdaterJNI14;
        TreeUpdaterJNI treeUpdaterJNI15;
        TreeUpdaterJNI treeUpdaterJNI16;
        TreeUpdaterJNI treeUpdaterJNI17;
        String str3;
        ArrayList arrayList2;
        TreeUpdaterJNI treeUpdaterJNI18;
        TreeUpdaterJNI treeUpdaterJNI19;
        TreeUpdaterJNI FHC;
        TreeUpdaterJNI treeUpdaterJNI20;
        TreeUpdaterJNI treeUpdaterJNI21;
        TreeUpdaterJNI treeUpdaterJNI22;
        TreeUpdaterJNI treeUpdaterJNI23;
        JU8 ju8;
        Drawable drawable2 = drawable;
        0qQ.A0B(drawable2, 0);
        int i = this.A00;
        if (i >= 0) {
            C52009GBg gBg = this.A02.A0A;
            if (i < gBg.A0A()) {
                C267324bN A0E = gBg.A0E(this.A00);
                0qQ.A0B(A0E, 0);
                AnonymousClass3W1 r23 = gBg.BzC(A0E).A0E;
                if (!(r23 == null || (ju8 = r23.A0g) == null || ju8.A01 == null)) {
                    r23.A1Y = new WeakReference(drawable2);
                    AnonymousClass3W1.A00(r23, 42);
                    r23.A0G(drawable2);
                }
                1Xj r4 = A0E.A02;
                if (r4 != null) {
                    UserSession userSession = this.A01;
                    0qQ.A0B(userSession, 0);
                    AnonymousClass5AV r24 = null;
                    11Z.A06(AnonymousClass000.A00(4406));
                    C67231sQ clipsMetadata = r4.A0C.getClipsMetadata();
                    AnonymousClass1s2 A1M = r4.A1M();
                    if (A1M != null) {
                        r7 = A1M.B21();
                        if (r7 != null) {
                            r24 = r7.CB3();
                        }
                    } else {
                        r7 = null;
                    }
                    if (clipsMetadata != null && A1M != null && r7 != null && r24 != null) {
                        C45331CuZ AK7 = r24.AK7();
                        int B9I = r24.B9I() + 1;
                        AK7.A00 = B9I;
                        AnonymousClass5AV r52 = AK7.A02;
                        if (r52 instanceof C43903CHx) {
                            AppreciationUFIEntryActionType appreciationUFIEntryActionType = AK7.A01;
                            0qQ.A0B(appreciationUFIEntryActionType, 0);
                            r2 = C41847B3o.A0o(r52, new 0eP[]{AnonymousClass7TE.A1L("action_type", appreciationUFIEntryActionType.A00), AnonymousClass7TE.A1L("gift_count", Integer.valueOf(AK7.A00))});
                        } else {
                            r2 = new AnonymousClass5AU(AK7.A01, B9I);
                        }
                        C45396Cvc AK6 = r7.AK6();
                        AK6.A03 = (AnonymousClass5AV) r2;
                        C245423cs r53 = AK6.A04;
                        if (r53 instanceof C43900CHu) {
                            TreeUpdaterJNI treeUpdaterJNI24 = TreeUpdaterJNI.$redex_init_class;
                            C245373cm r02 = AK6.A00;
                            TreeUpdaterJNI treeUpdaterJNI25 = null;
                            if (r02 != null) {
                                treeUpdaterJNI21 = r02.FHC();
                            } else {
                                treeUpdaterJNI21 = null;
                            }
                            0eP A1L = AnonymousClass7TE.A1L(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT, treeUpdaterJNI21);
                            AnonymousClass5AT r03 = AK6.A01;
                            if (r03 != null) {
                                treeUpdaterJNI22 = r03.FHC();
                            } else {
                                treeUpdaterJNI22 = null;
                            }
                            0eP A1L2 = AnonymousClass7TE.A1L("overflow", treeUpdaterJNI22);
                            C245403cq r04 = AK6.A02;
                            if (r04 != null) {
                                treeUpdaterJNI23 = r04.FHC();
                            } else {
                                treeUpdaterJNI23 = null;
                            }
                            0eP A1L3 = AnonymousClass7TE.A1L("pill", treeUpdaterJNI23);
                            AnonymousClass5AV r05 = AK6.A03;
                            if (r05 != null) {
                                treeUpdaterJNI25 = r05.FHC();
                            }
                            r72 = C41847B3o.A0o(r53, new 0eP[]{A1L, A1L2, A1L3, AnonymousClass7TE.A1L("ufi", treeUpdaterJNI25)});
                        } else {
                            C245373cm r06 = AK6.A00;
                            AnonymousClass5AU r6 = null;
                            if (r06 != null) {
                                r5 = r06.F0S();
                            } else {
                                r5 = null;
                            }
                            AnonymousClass5AT r07 = AK6.A01;
                            if (r07 != null) {
                                bDp = r07.F0U();
                            } else {
                                bDp = null;
                            }
                            C245403cq r08 = AK6.A02;
                            if (r08 != null) {
                                r22 = r08.F0V();
                            } else {
                                r22 = null;
                            }
                            AnonymousClass5AV r09 = AK6.A03;
                            if (r09 != null) {
                                r6 = r09.F0W();
                            }
                            r72 = new C245413cr(r5, bDp, r22, r6);
                        }
                        C245423cs r73 = (C245423cs) r72;
                        C45338Cug AKV = A1M.AKV();
                        AKV.A00 = r73;
                        AnonymousClass1s2 r54 = AKV.A02;
                        if (r54 instanceof B60) {
                            TreeUpdaterJNI treeUpdaterJNI26 = TreeUpdaterJNI.$redex_init_class;
                            0eP A1L4 = AnonymousClass7TE.A1L("enabled", Boolean.valueOf(AKV.A01));
                            if (r73 != null) {
                                treeUpdaterJNI20 = r73.FHC();
                            } else {
                                treeUpdaterJNI20 = null;
                            }
                            r3 = C41847B3o.A0o(r54, new 0eP[]{A1L4, AnonymousClass7TE.A1L("entry_point_container", treeUpdaterJNI20)});
                        } else {
                            boolean z = AKV.A01;
                            if (r73 != null) {
                                r0 = r73.F0T();
                            } else {
                                r0 = null;
                            }
                            r3 = new 1s1(r0, z);
                        }
                        C295345o0 AKX = clipsMetadata.AKX();
                        AKX.A0G = (AnonymousClass1s2) r3;
                        TreeUpdaterJNI treeUpdaterJNI27 = null;
                        new 1E9(new 1hu((UserSession) null), 6, false);
                        C67231sQ r74 = AKX.A0b;
                        if (r74 instanceof C41900B5v) {
                            0eP[] r62 = new 0eP[37];
                            C67021rj r25 = AKX.A01;
                            if (r25 != null) {
                                treeUpdaterJNI = r25.FHC();
                            } else {
                                treeUpdaterJNI = null;
                            }
                            0eP A1L5 = AnonymousClass7TE.A1L("achievements_info", treeUpdaterJNI);
                            C67061rp r26 = AKX.A0C;
                            if (r26 != null) {
                                treeUpdaterJNI2 = r26.FHC();
                            } else {
                                treeUpdaterJNI2 = null;
                            }
                            0eP A1L6 = AnonymousClass7TE.A1L("additional_audio_info", treeUpdaterJNI2);
                            C270484go r27 = AKX.A02;
                            if (r27 != null) {
                                treeUpdaterJNI3 = r27.FHC();
                            } else {
                                treeUpdaterJNI3 = null;
                            }
                            0eP A1L7 = AnonymousClass7TE.A1L("asset_recommendation_info", treeUpdaterJNI3);
                            C67091rt r28 = AKX.A00;
                            if (r28 != null) {
                                treeUpdaterJNI4 = r28.FHC();
                            } else {
                                treeUpdaterJNI4 = null;
                            }
                            0eP A1L8 = AnonymousClass7TE.A1L("audio_ranking_info", treeUpdaterJNI4);
                            MusicCanonicalType musicCanonicalType = AKX.A07;
                            if (musicCanonicalType != null) {
                                str = musicCanonicalType.A00;
                            } else {
                                str = null;
                            }
                            0eP A1L9 = AnonymousClass7TE.A1L("audio_type", str);
                            C67111rx r29 = AKX.A0D;
                            if (r29 != null) {
                                treeUpdaterJNI5 = r29.FHC();
                            } else {
                                treeUpdaterJNI5 = null;
                            }
                            0eP A1L10 = AnonymousClass7TE.A1L("branded_content_tag_info", treeUpdaterJNI5);
                            C270504gq r210 = AKX.A0E;
                            if (r210 != null) {
                                treeUpdaterJNI6 = r210.FHC();
                            } else {
                                treeUpdaterJNI6 = null;
                            }
                            0eP A1L11 = AnonymousClass7TE.A1L("breaking_content_info", treeUpdaterJNI6);
                            ClipsBreakingCreatorInfo clipsBreakingCreatorInfo = AKX.A03;
                            if (clipsBreakingCreatorInfo != null) {
                                treeUpdaterJNI7 = clipsBreakingCreatorInfo.FHC();
                            } else {
                                treeUpdaterJNI7 = null;
                            }
                            0eP A1L12 = AnonymousClass7TE.A1L("breaking_creator_info", treeUpdaterJNI7);
                            C270524gs r211 = AKX.A0F;
                            if (r211 != null) {
                                treeUpdaterJNI8 = r211.FHC();
                            } else {
                                treeUpdaterJNI8 = null;
                            }
                            0eP A1L13 = AnonymousClass7TE.A1L("challenge_info", treeUpdaterJNI8);
                            ClipsCreationEntryPoint clipsCreationEntryPoint = AKX.A04;
                            if (clipsCreationEntryPoint != null) {
                                str2 = clipsCreationEntryPoint.A00;
                            } else {
                                str2 = null;
                            }
                            0eP A1L14 = AnonymousClass7TE.A1L("clips_creation_entry_point", str2);
                            AnonymousClass1s2 r212 = AKX.A0G;
                            if (r212 != null) {
                                treeUpdaterJNI9 = r212.FHC();
                            } else {
                                treeUpdaterJNI9 = null;
                            }
                            0eP A1L15 = AnonymousClass7TE.A1L("content_appreciation_info", treeUpdaterJNI9);
                            ClipsContextualHighlightInfoIntf clipsContextualHighlightInfoIntf = AKX.A0H;
                            if (clipsContextualHighlightInfoIntf != null) {
                                treeUpdaterJNI10 = clipsContextualHighlightInfoIntf.FHC();
                            } else {
                                treeUpdaterJNI10 = null;
                            }
                            0eP A1L16 = AnonymousClass7TE.A1L("contextual_highlight_info", treeUpdaterJNI10);
                            List<DSU> list = AKX.A0Z;
                            if (list != null) {
                                arrayList = AnonymousClass7TE.A1C();
                                for (DSU dsu : list) {
                                    if (dsu != null) {
                                        arrayList.add(dsu.FHC());
                                    }
                                }
                            } else {
                                arrayList = null;
                            }
                            0eP A1L17 = AnonymousClass7TE.A1L("cutout_sticker_info", arrayList);
                            0eP A1L18 = AnonymousClass7TE.A1L("disable_use_in_clips_client_cache", AKX.A0N);
                            C270534gt r213 = AKX.A05;
                            if (r213 != null) {
                                treeUpdaterJNI11 = r213.FHC();
                            } else {
                                treeUpdaterJNI11 = null;
                            }
                            0eP A1L19 = AnonymousClass7TE.A1L("external_media_info", treeUpdaterJNI11);
                            0eP A1L20 = AnonymousClass7TE.A1L("featured_label", AKX.A0V);
                            0eP A1L21 = AnonymousClass7TE.A1L("high_intent_follow_eligible", AKX.A0O);
                            0eP A1L22 = AnonymousClass7TE.A1L("is_fan_club_promo_video", AKX.A0P);
                            0eP A1L23 = AnonymousClass7TE.A1L("is_fan_club_welcome_video", AKX.A0Q);
                            0eP A1L24 = AnonymousClass7TE.A1L("is_public_chat_welcome_video", AKX.A0R);
                            0eP A1L25 = AnonymousClass7TE.A1L("is_shared_to_fb", AKX.A0S);
                            C67161s9 r214 = AKX.A0I;
                            if (r214 != null) {
                                treeUpdaterJNI12 = r214.FHC();
                            } else {
                                treeUpdaterJNI12 = null;
                            }
                            0eP A1L26 = AnonymousClass7TE.A1L("mashup_info", treeUpdaterJNI12);
                            C270544gu r215 = AKX.A06;
                            if (r215 != null) {
                                treeUpdaterJNI13 = r215.FHC();
                            } else {
                                treeUpdaterJNI13 = null;
                            }
                            0eP A1L27 = AnonymousClass7TE.A1L("merchandising_pill_info", treeUpdaterJNI13);
                            0eP A1L28 = AnonymousClass7TE.A1L("music_canonical_id", AKX.A0W);
                            MusicInfo musicInfo = AKX.A08;
                            if (musicInfo != null) {
                                treeUpdaterJNI14 = musicInfo.FHC();
                            } else {
                                treeUpdaterJNI14 = null;
                            }
                            0eP A1L29 = AnonymousClass7TE.A1L("music_info", treeUpdaterJNI14);
                            C270554gv r216 = AKX.A0J;
                            if (r216 != null) {
                                treeUpdaterJNI15 = r216.FHC();
                            } else {
                                treeUpdaterJNI15 = null;
                            }
                            0eP A1L30 = AnonymousClass7TE.A1L("nux_info", treeUpdaterJNI15);
                            OriginalSoundDataIntf originalSoundDataIntf = AKX.A09;
                            if (originalSoundDataIntf != null) {
                                treeUpdaterJNI16 = originalSoundDataIntf.FHC();
                            } else {
                                treeUpdaterJNI16 = null;
                            }
                            System.arraycopy(new 0eP[]{A1L5, A1L6, A1L7, A1L8, A1L9, A1L10, A1L11, A1L12, A1L13, A1L14, A1L15, A1L16, A1L17, A1L18, A1L19, A1L20, A1L21, A1L22, A1L23, A1L24, A1L25, A1L26, A1L27, A1L28, A1L29, A1L30, AnonymousClass7TE.A1L("original_sound_info", treeUpdaterJNI16)}, 0, r62, 0, 27);
                            OriginalityInfo originalityInfo = AKX.A0A;
                            if (originalityInfo != null) {
                                treeUpdaterJNI17 = originalityInfo.FHC();
                            } else {
                                treeUpdaterJNI17 = null;
                            }
                            0eP A1L31 = AnonymousClass7TE.A1L("originality_info", treeUpdaterJNI17);
                            ProfessionalClipsUpsellType professionalClipsUpsellType = AKX.A0B;
                            if (professionalClipsUpsellType != null) {
                                str3 = professionalClipsUpsellType.A00;
                            } else {
                                str3 = null;
                            }
                            0eP A1L32 = AnonymousClass7TE.A1L("professional_clips_upsell_type", str3);
                            0eP A1L33 = AnonymousClass7TE.A1L("reusable_text_attribute_string", AKX.A0X);
                            List<C248923io> list2 = AKX.A0a;
                            if (list2 != null) {
                                arrayList2 = AnonymousClass7TE.A1C();
                                for (C248923io r217 : list2) {
                                    if (!(r217 == null || (FHC = r217.FHC()) == null)) {
                                        arrayList2.add(FHC);
                                    }
                                }
                            } else {
                                arrayList2 = null;
                            }
                            0eP A1L34 = AnonymousClass7TE.A1L("reusable_text_info", arrayList2);
                            ClipsShoppingInfoIntf clipsShoppingInfoIntf = AKX.A0M;
                            if (clipsShoppingInfoIntf != null) {
                                treeUpdaterJNI18 = clipsShoppingInfoIntf.FHC();
                            } else {
                                treeUpdaterJNI18 = null;
                            }
                            0eP A1L35 = AnonymousClass7TE.A1L("shopping_info", treeUpdaterJNI18);
                            0eP A1L36 = AnonymousClass7TE.A1L("show_achievements", AKX.A0T);
                            0eP A1L37 = AnonymousClass7TE.A1L("show_tips", AKX.A0U);
                            0eP A1L38 = AnonymousClass7TE.A1L("stripped_media_id", AKX.A0Y);
                            C270564gw r218 = AKX.A0K;
                            if (r218 != null) {
                                treeUpdaterJNI19 = r218.FHC();
                            } else {
                                treeUpdaterJNI19 = null;
                            }
                            0eP A1L39 = AnonymousClass7TE.A1L("template_info", treeUpdaterJNI19);
                            C270584gy r010 = AKX.A0L;
                            if (r010 != null) {
                                treeUpdaterJNI27 = r010.FHC();
                            }
                            System.arraycopy(new 0eP[]{A1L31, A1L32, A1L33, A1L34, A1L35, A1L36, A1L37, A1L38, A1L39, AnonymousClass7TE.A1L("viewer_interaction_settings", treeUpdaterJNI27)}, 0, r62, 27, 10);
                            treeJNI = C41847B3o.A0o(r74, r62);
                        } else {
                            treeJNI = AKX.A00();
                        }
                        r4.A3v((C67231sQ) treeJNI);
                        r4.AE7(userSession);
                    }
                }
            }
        }
    }

    public final /* synthetic */ void DVz(int i) {
    }

    public final /* synthetic */ void DW0(int i) {
    }

    public final /* synthetic */ void DWA(int i, int i2) {
    }

    public final /* synthetic */ void DWY() {
    }

    public final /* synthetic */ void DhG(float f, float f2) {
    }

    public final /* synthetic */ void DhU(Integer num) {
    }

    public final /* synthetic */ void Dpv() {
    }

    public final /* synthetic */ void Dpy(C267324bN r1, int i) {
    }

    public final void A0A() {
        int i;
        C52012GBj gBj = this.A02;
        if (gBj != null) {
            gBj.A0J(this);
        }
        C52012GBj gBj2 = this.A02;
        if (gBj2 != null) {
            i = gBj2.A06();
        } else {
            i = this.A00;
        }
        this.A00 = i;
    }

    public final void DW8(int i, int i2) {
        this.A00 = i;
    }
}
