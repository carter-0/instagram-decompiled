package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.AttributionUser;
import com.instagram.api.schemas.ProfilePicture;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoAttributionConfiguration;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.feed.media.EffectActionSheetIntf;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.model.reels.ReelHeaderAttributionType;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.model.shopping.EffectThumbnailImageDictIntf;
import com.instagram.model.shopping.ProductItemWithARIntf;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.reels.viewer.attribution.model.ReelAttributionModel;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6We  reason: invalid class name and case insensitive filesystem */
public abstract class C308916We {
    public boolean A00;
    public final UserSession A01;
    public final AnonymousClass0iw A02;
    public final 0wc A03;
    public final C255773uh A04;

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(X.1Xj r14) {
        /*
            r13 = this;
            r7 = 0
            X.0wc r6 = r13.A03
            java.lang.String r5 = "story_viewer_attribution_tap"
            X.0kJ r4 = r6.A00
            X.0Aj r12 = r6.A00(r4, r5)
            X.3uh r0 = r13.A04
            r3 = 0
            if (r0 == 0) goto L_0x0015
            com.instagram.user.model.User r1 = r0.A0i
        L_0x0012:
            r10 = -1
            goto L_0x0017
        L_0x0015:
            r1 = r3
            goto L_0x0012
        L_0x0017:
            java.lang.String r0 = r14.A2n()     // Catch:{ NumberFormatException -> 0x0036 }
            if (r0 == 0) goto L_0x002e
            long r8 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0036 }
            if (r1 == 0) goto L_0x0040
            java.lang.String r0 = r1.getId()     // Catch:{ NumberFormatException -> 0x002c }
            long r10 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x002c }
            goto L_0x0040
        L_0x002c:
            r2 = move-exception
            goto L_0x0039
        L_0x002e:
            java.lang.String r1 = "Media id is null"
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException     // Catch:{ NumberFormatException -> 0x0036 }
            r0.<init>(r1)     // Catch:{ NumberFormatException -> 0x0036 }
            throw r0     // Catch:{ NumberFormatException -> 0x0036 }
        L_0x0036:
            r2 = move-exception
            r8 = -1
        L_0x0039:
            java.lang.String r1 = "ReelAttributionType"
            java.lang.String r0 = "Can't parse mediaId or authorId"
            X.0wb.A06(r1, r0, r2)
        L_0x0040:
            X.1Xy r0 = r14.A0C
            X.50l r0 = r0.BDc()
            if (r0 == 0) goto L_0x005a
            java.util.List r0 = r0.AZX()
            if (r0 == 0) goto L_0x005a
            java.lang.Object r0 = X.00k.A0O(r0, r7)
            X.50j r0 = (X.C2801550j) r0
            if (r0 == 0) goto L_0x005a
            java.lang.String r3 = r0.Bkc()
        L_0x005a:
            boolean r0 = r12.isSampled()
            if (r0 == 0) goto L_0x00a0
            X.0Aj r2 = r6.A00(r4, r5)
            java.lang.String r0 = r13.A02()
            java.util.List r1 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r1)
            java.lang.String r0 = "attribution_type"
            r2.AAe(r0, r1)
            X.0iw r0 = r13.A02
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "containermodule"
            r2.AAJ(r0, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            java.lang.String r0 = "media_id"
            r2.A9F(r0, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            java.lang.String r0 = "author_id"
            r2.A9F(r0, r1)
            java.lang.String r0 = "reel_id"
            r2.AAJ(r0, r3)
            java.lang.String r1 = X.AnonymousClass1K6.A00
            java.lang.String r0 = "canonical_nav_chain"
            r2.AAJ(r0, r1)
            r2.Cgf()
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C308916We.A07(X.1Xj):void");
    }

    public final ReelHeaderAttributionType A01() {
        if (this instanceof AnonymousClass6X6) {
            return ((AnonymousClass6X6) this).A01;
        }
        if (this instanceof C308976Wk) {
            C308976Wk r1 = (C308976Wk) this;
            1Xj r3 = r1.A03.A0b;
            if (r3 != null) {
                UserSession userSession = r1.A01;
                if (r3.A6c(userSession)) {
                    return ReelHeaderAttributionType.META_QUEST_ATTRIBUTION;
                }
                if (r3.A6d(userSession)) {
                    return ReelHeaderAttributionType.HORIZON_WORLDS_ATTRIBUTION;
                }
                if (r3.A6a(userSession)) {
                    return ReelHeaderAttributionType.ICONIC_ENTRYPOINTS;
                }
            }
            return ReelHeaderAttributionType.WEARABLE_ATTRIBUTION;
        } else if (this instanceof AnonymousClass6XK) {
            return ((AnonymousClass6XK) this).A01;
        } else {
            if (this instanceof AnonymousClass6X5) {
                return ((AnonymousClass6X5) this).A02;
            }
            if (this instanceof C309096Wx) {
                return ((C309096Wx) this).A01;
            }
            if (this instanceof AnonymousClass6XB) {
                return ReelHeaderAttributionType.EFFECT_ATTRIBUTION;
            }
            if (this instanceof AnonymousClass6XN) {
                return ((AnonymousClass6XN) this).A01;
            }
            if (this instanceof C309006Wn) {
                return ((C309006Wn) this).A01;
            }
            if (this instanceof AnonymousClass6XL) {
                return ((AnonymousClass6XL) this).A01;
            }
            if (this instanceof C309026Wp) {
                return ((C309026Wp) this).A01;
            }
            if (this instanceof AnonymousClass6XH) {
                return ((AnonymousClass6XH) this).A02;
            }
            if (this instanceof AnonymousClass6XG) {
                return ((AnonymousClass6XG) this).A01;
            }
            if (this instanceof AnonymousClass6XA) {
                return ReelHeaderAttributionType.RESHARED_REEL_ATTRIBUTION;
            }
            if (this instanceof AnonymousClass6XV) {
                return ((AnonymousClass6XV) this).A01;
            }
            if (this instanceof AnonymousClass6XE) {
                return ((AnonymousClass6XE) this).A01;
            }
            if (this instanceof AnonymousClass6X7) {
                return ReelHeaderAttributionType.APP_ATTRIBUTION;
            }
            if (this instanceof C309046Wr) {
                return ((C309046Wr) this).A00;
            }
            if (this instanceof C309106Wy) {
                return ((C309106Wy) this).A01;
            }
            if (this instanceof C309056Ws) {
                return ReelHeaderAttributionType.STATE_SPONSORED_MEDIA_LABEL_ATTRIBUTION;
            }
            if (this instanceof AnonymousClass6XP) {
                return ((AnonymousClass6XP) this).A01;
            }
            if (this instanceof AnonymousClass6X2) {
                return ((AnonymousClass6X2) this).A02;
            }
            if (this instanceof AnonymousClass6X4) {
                return ReelHeaderAttributionType.CLIPS_ATTRIBUTION;
            }
            if (this instanceof AnonymousClass6XX) {
                return ((AnonymousClass6XX) this).A01;
            }
            if (this instanceof C309116Wz) {
                return ((C309116Wz) this).A02;
            }
            if (this instanceof C308966Wj) {
                return ReelHeaderAttributionType.SPONSORED_TAG_ATTRIBUTION;
            }
            if (this instanceof AnonymousClass6X9) {
                return ReelHeaderAttributionType.PERSISTED_REEL_ATTRIBUTION;
            }
            if (this instanceof C308986Wl) {
                return ReelHeaderAttributionType.VIDEO_CALL_ATTRIBUTION;
            }
            if (this instanceof C308996Wm) {
                return ReelHeaderAttributionType.UNLOCKABLE_STICKER;
            }
            if (this instanceof C309016Wo) {
                return ((C309016Wo) this).A00;
            }
            if (this instanceof C308956Wi) {
                return ((C308956Wi) this).A01;
            }
            if (this instanceof C309036Wq) {
                return ((C309036Wq) this).A00;
            }
            if (this instanceof AnonymousClass6XM) {
                return ((AnonymousClass6XM) this).A02;
            }
            if (this instanceof AnonymousClass6XJ) {
                return ((AnonymousClass6XJ) this).A01;
            }
            if (this instanceof C308936Wg) {
                return ((C308936Wg) this).A01;
            }
            if (this instanceof AnonymousClass6X0) {
                return ((AnonymousClass6X0) this).A02;
            }
            if (this instanceof C308946Wh) {
                return ((C308946Wh) this).A01;
            }
            if (this instanceof C309076Wv) {
                return ((C309076Wv) this).A01;
            }
            if (this instanceof C308906Wd) {
                return ((C308906Wd) this).A03;
            }
            if (this instanceof AnonymousClass6XU) {
                return ((AnonymousClass6XU) this).A01;
            }
            if (this instanceof AnonymousClass6XR) {
                return ((AnonymousClass6XR) this).A02;
            }
            if (this instanceof AnonymousClass6X1) {
                return ReelHeaderAttributionType.INTERNAL_ATTRIBUTION;
            }
            if (this instanceof AnonymousClass6XT) {
                return ((AnonymousClass6XT) this).A01;
            }
            if (this instanceof C309086Ww) {
                return ((C309086Ww) this).A00;
            }
            if (this instanceof AnonymousClass6XI) {
                return ((AnonymousClass6XI) this).A01;
            }
            if (this instanceof AnonymousClass6XF) {
                return ((AnonymousClass6XF) this).A01;
            }
            if (this instanceof AnonymousClass6XQ) {
                return ((AnonymousClass6XQ) this).A00;
            }
            if (this instanceof C308926Wf) {
                return ((C308926Wf) this).A00;
            }
            if (this instanceof C309066Wt) {
                return ((C309066Wt) this).A02;
            }
            if (this instanceof AnonymousClass6XO) {
                return ((AnonymousClass6XO) this).A01;
            }
            if (this instanceof AnonymousClass6XW) {
                return ((AnonymousClass6XW) this).A00;
            }
            if (this instanceof AnonymousClass6XZ) {
                return ((AnonymousClass6XZ) this).A02;
            }
            if (this instanceof AnonymousClass6XY) {
                return ((AnonymousClass6XY) this).A01;
            }
            if (this instanceof AnonymousClass6XC) {
                return ((AnonymousClass6XC) this).A02;
            }
            if (this instanceof AnonymousClass6X8) {
                return ReelHeaderAttributionType.BLOKS_ATTRIBUTION;
            }
            return ReelHeaderAttributionType.AREFFECT_PREVIEW_ATTRIBUTION;
        }
    }

    public final String A02() {
        CreativeConfigIntf AsO;
        C306106Ku A032;
        ProductDetailsProductItemDictIntf BgJ;
        if (this instanceof AnonymousClass6X6) {
            return "music";
        }
        if (this instanceof AnonymousClass6XK) {
            return "polaroid_frame";
        }
        if (this instanceof AnonymousClass6X5) {
            return "clips_reshare";
        }
        if (this instanceof C309096Wx) {
            return ((C309096Wx) this).A06;
        }
        if (this instanceof AnonymousClass6XB) {
            AnonymousClass6XB r1 = (AnonymousClass6XB) this;
            CreativeConfigIntf creativeConfigIntf = r1.A02;
            if (creativeConfigIntf == null) {
                0wb.A03("EffectAttributionType", "null media for tap logging");
                return "unknown";
            }
            if (C309146Xc.A00(r1.A00, creativeConfigIntf)) {
                if (182.A06(0Tu.A06, r1.A01, 36311186824036819L)) {
                    return "unknown";
                }
            }
            C306106Ku A033 = C284745Nt.A03(creativeConfigIntf);
            ProductItemWithARIntf B0B = creativeConfigIntf.B0B();
            if (B0B != null && (BgJ = B0B.BgJ()) != null) {
                C14502TxO.A00(BgJ);
                return "face_effect";
            } else if (A033 == null) {
                return "face_effect";
            } else {
                String B3W = creativeConfigIntf.B3W();
                switch (A033.ordinal()) {
                    case 2:
                    case 4:
                        return "superzoom";
                    case 3:
                        return "focus";
                    case 5:
                        if (B3W == null) {
                            return "boomerang";
                        }
                        return "face_effect";
                    case 8:
                        if (B3W == null) {
                            return "layout";
                        }
                        return "face_effect";
                    case 10:
                        return "dual";
                    default:
                        return "face_effect";
                }
            }
        } else if (this instanceof AnonymousClass6XN) {
            return "mention_reshare";
        } else {
            if (this instanceof C309006Wn) {
                return "translation";
            }
            if (this instanceof AnonymousClass6XL) {
                return "memory_story";
            }
            if (this instanceof C309026Wp) {
                return "story_template";
            }
            if (this instanceof AnonymousClass6XH) {
                return "gen_ai_detection";
            }
            if (this instanceof AnonymousClass6XG) {
                return "avatar_sticker";
            }
            if (this instanceof AnonymousClass6XA) {
                return "archive";
            }
            if (this instanceof AnonymousClass6XV) {
                return "cutout_anything";
            }
            if (this instanceof AnonymousClass6XE) {
                return "create";
            }
            if (this instanceof AnonymousClass6X7) {
                AnonymousClass6X7 r2 = (AnonymousClass6X7) this;
                1Xj r12 = r2.A02.A0b;
                if (r12 == null || !C63402KwN.A00(r2.A01, r12)) {
                    return "third_party";
                }
                return "created_on_facebook";
            } else if (this instanceof C309046Wr) {
                return "stories_teaser";
            } else {
                if (this instanceof C309106Wy) {
                    return ((C309106Wy) this).A06;
                }
                if (this instanceof C308976Wk) {
                    return ((C308976Wk) this).A06;
                }
                if (this instanceof C309056Ws) {
                    return "state_controlled_media_label";
                }
                if (this instanceof AnonymousClass6XP) {
                    return "message_share";
                }
                if (this instanceof AnonymousClass6X2) {
                    return "clips_full_screen_reshare";
                }
                if (this instanceof AnonymousClass6X4) {
                    return "clips";
                }
                if (this instanceof AnonymousClass6XX) {
                    return "barcelona_share";
                }
                if (this instanceof C309116Wz) {
                    return "highlights";
                }
                if (this instanceof C308966Wj) {
                    return "sponsored";
                }
                if (this instanceof AnonymousClass6X9) {
                    return "archive";
                }
                if (this instanceof C308986Wl) {
                    return "video_call";
                }
                if (this instanceof C308996Wm) {
                    return "unlockable_sticker";
                }
                if (this instanceof C309016Wo) {
                    return AnonymousClass000.A00(1866);
                }
                if (this instanceof C308956Wi) {
                    return "suggested_reel";
                }
                if (this instanceof C309036Wq) {
                    return "story_snapshot";
                }
                if (this instanceof AnonymousClass6XM) {
                    return "share_to_friends_story_profile";
                }
                if (this instanceof AnonymousClass6XJ) {
                    return "secret_sticker";
                }
                if (this instanceof C308936Wg) {
                    return "roll_call_first_take";
                }
                if (this instanceof AnonymousClass6X0) {
                    return "highlights";
                }
                if (this instanceof C308946Wh) {
                    return "quicksnap_recap";
                }
                if (this instanceof C309076Wv) {
                    return "public_collection";
                }
                if (this instanceof C308906Wd) {
                    return "multiple_lists";
                }
                if (this instanceof AnonymousClass6XU) {
                    return "imagine_genai_attribution";
                }
                if (this instanceof AnonymousClass6XR) {
                    return "magic_mod";
                }
                if (this instanceof AnonymousClass6X1) {
                    return "internal";
                }
                if (this instanceof AnonymousClass6XT) {
                    return "imagine_template";
                }
                if (this instanceof C309086Ww) {
                    return ((C309086Ww) this).A05;
                }
                if (this instanceof AnonymousClass6XI) {
                    return "gen_ai_sticker";
                }
                if (this instanceof AnonymousClass6XF) {
                    return "gallery_grid_format";
                }
                if (this instanceof AnonymousClass6XQ) {
                    return "published_superlative";
                }
                if (this instanceof C308926Wf) {
                    return "roll_call_first_take";
                }
                if (this instanceof C309066Wt) {
                    return "explore_shareable_grid";
                }
                if (this instanceof AnonymousClass6XO) {
                    return AnonymousClass000.A00(4610);
                }
                if (this instanceof AnonymousClass6XW) {
                    return "channel_challenge";
                }
                if (this instanceof AnonymousClass6XZ) {
                    return "campfire_self_view";
                }
                if (this instanceof AnonymousClass6XY) {
                    return "campfire";
                }
                if (this instanceof AnonymousClass6XC) {
                    1Xj r0 = ((AnonymousClass6XC) this).A01;
                    if (r0 == null || (AsO = r0.A0C.AsO()) == null || (A032 = C284745Nt.A03(AsO)) == null) {
                        return "unknown";
                    }
                    switch (A032.ordinal()) {
                        case 2:
                        case 4:
                            return "superzoom";
                        case 3:
                            return "focus";
                        case 5:
                            return "boomerang";
                        case 8:
                            return "layout";
                        case 10:
                            return "dual";
                        default:
                            return "unknown";
                    }
                } else if (!(this instanceof AnonymousClass6X8)) {
                    return "face_effect_preview";
                } else {
                    1Xj r02 = ((AnonymousClass6X8) this).A01.A0b;
                    if (r02 != null) {
                        String A2z = r02.A2z();
                        if (A2z != null) {
                            return A2z;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:146:0x01dc, code lost:
        X.0wb.A03("CanvasAttributionType", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x038b, code lost:
        r0 = r4.A00.getString(r1);
        X.0qQ.A0A(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0394, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:?, code lost:
        return "";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A03() {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.C309006Wn
            if (r0 == 0) goto L_0x000a
            r0 = r5
            X.6Wn r0 = (X.C309006Wn) r0
            java.lang.String r0 = r0.A05
            return r0
        L_0x000a:
            boolean r0 = r5 instanceof X.AnonymousClass6XK
            if (r0 == 0) goto L_0x0014
            r0 = r5
            X.6XK r0 = (X.AnonymousClass6XK) r0
            java.lang.String r0 = r0.A05
            return r0
        L_0x0014:
            boolean r0 = r5 instanceof X.AnonymousClass6X6
            if (r0 == 0) goto L_0x001e
            r0 = r5
            X.6X6 r0 = (X.AnonymousClass6X6) r0
            java.lang.String r0 = r0.A05
            return r0
        L_0x001e:
            boolean r0 = r5 instanceof X.C308976Wk
            if (r0 == 0) goto L_0x004c
            r1 = r5
            X.6Wk r1 = (X.C308976Wk) r1
            com.instagram.model.reels.ReelHeaderAttributionType r0 = r1.A01()
            int r2 = r0.ordinal()
            r0 = 47
            if (r2 == r0) goto L_0x0046
            r0 = 46
            android.content.Context r1 = r1.A01
            if (r2 == r0) goto L_0x0042
            r0 = 2131971695(0x7f134e6f, float:1.9580377E38)
        L_0x003a:
            java.lang.String r0 = r1.getString(r0)
        L_0x003e:
            X.0qQ.A07(r0)
            return r0
        L_0x0042:
            r0 = 2131971676(0x7f134e5c, float:1.9580338E38)
            goto L_0x003a
        L_0x0046:
            android.content.Context r1 = r1.A01
            r0 = 2131971681(0x7f134e61, float:1.9580348E38)
            goto L_0x003a
        L_0x004c:
            boolean r0 = r5 instanceof X.C308986Wl
            if (r0 != 0) goto L_0x01df
            boolean r0 = r5 instanceof X.C308996Wm
            if (r0 == 0) goto L_0x005d
            r0 = r5
            X.6Wm r0 = (X.C308996Wm) r0
            android.content.Context r1 = r0.A00
            r0 = 2131971689(0x7f134e69, float:1.9580364E38)
            goto L_0x003a
        L_0x005d:
            boolean r0 = r5 instanceof X.C309016Wo
            if (r0 == 0) goto L_0x0067
            r0 = r5
            X.6Wo r0 = (X.C309016Wo) r0
            java.lang.String r0 = r0.A03
            return r0
        L_0x0067:
            boolean r0 = r5 instanceof X.C308956Wi
            if (r0 == 0) goto L_0x0071
            r0 = r5
            X.6Wi r0 = (X.C308956Wi) r0
            java.lang.String r0 = r0.A05
            return r0
        L_0x0071:
            boolean r0 = r5 instanceof X.C309026Wp
            if (r0 == 0) goto L_0x007b
            r0 = r5
            X.6Wp r0 = (X.C309026Wp) r0
            java.lang.String r0 = r0.A05
            return r0
        L_0x007b:
            boolean r0 = r5 instanceof X.C309036Wq
            if (r0 == 0) goto L_0x0085
            r0 = r5
            X.6Wq r0 = (X.C309036Wq) r0
            java.lang.String r0 = r0.A03
            return r0
        L_0x0085:
            boolean r0 = r5 instanceof X.C309046Wr
            if (r0 == 0) goto L_0x008f
            r0 = r5
            X.6Wr r0 = (X.C309046Wr) r0
            java.lang.String r0 = r0.A03
            return r0
        L_0x008f:
            boolean r0 = r5 instanceof X.C309056Ws
            if (r0 == 0) goto L_0x00a8
            r1 = r5
            X.6Ws r1 = (X.C309056Ws) r1
            boolean r0 = r1.A09()
            if (r0 == 0) goto L_0x01df
            android.text.SpannableStringBuilder r0 = X.C309056Ws.A00(r1)
            java.lang.String r0 = r0.toString()
            X.0qQ.A0A(r0)
            return r0
        L_0x00a8:
            boolean r0 = r5 instanceof X.C308966Wj
            if (r0 == 0) goto L_0x00dc
            r2 = r5
            X.6Wj r2 = (X.C308966Wj) r2
            X.3uh r1 = r2.A01
            X.1Xj r0 = r1.A0b
            if (r0 == 0) goto L_0x01df
            boolean r0 = r0.A5l()
            if (r0 == 0) goto L_0x01df
            boolean r0 = r1.A0z()
            if (r0 == 0) goto L_0x01df
            com.instagram.user.model.User r0 = r1.A0L()
            if (r0 == 0) goto L_0x0354
            android.content.Context r2 = r2.A00
            r1 = 2131971774(0x7f134ebe, float:1.9580537E38)
            java.lang.String r0 = r0.getUsername()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r2.getString(r1, r0)
            X.0qQ.A07(r0)
            return r0
        L_0x00dc:
            boolean r0 = r5 instanceof X.AnonymousClass6XM
            if (r0 == 0) goto L_0x00e6
            r0 = r5
            X.6XM r0 = (X.AnonymousClass6XM) r0
            java.lang.String r0 = r0.A07
            return r0
        L_0x00e6:
            boolean r0 = r5 instanceof X.AnonymousClass6XJ
            if (r0 == 0) goto L_0x00f0
            r0 = r5
            X.6XJ r0 = (X.AnonymousClass6XJ) r0
            java.lang.String r0 = r0.A03
            return r0
        L_0x00f0:
            boolean r0 = r5 instanceof X.C308936Wg
            if (r0 == 0) goto L_0x00fa
            r0 = r5
            X.6Wg r0 = (X.C308936Wg) r0
            java.lang.String r0 = r0.A05
            return r0
        L_0x00fa:
            boolean r0 = r5 instanceof X.AnonymousClass6XA
            if (r0 == 0) goto L_0x0108
            r0 = r5
            X.6XA r0 = (X.AnonymousClass6XA) r0
            android.content.Context r1 = r0.A00
        L_0x0103:
            r0 = 2131971696(0x7f134e70, float:1.9580379E38)
            goto L_0x003a
        L_0x0108:
            boolean r0 = r5 instanceof X.AnonymousClass6X0
            if (r0 == 0) goto L_0x0116
            r0 = r5
            X.6X0 r0 = (X.AnonymousClass6X0) r0
            android.content.Context r1 = r0.A00
            r0 = 2131967974(0x7f133fe6, float:1.957283E38)
            goto L_0x003a
        L_0x0116:
            boolean r0 = r5 instanceof X.C308946Wh
            if (r0 == 0) goto L_0x0120
            r0 = r5
            X.6Wh r0 = (X.C308946Wh) r0
            java.lang.String r0 = r0.A05
            return r0
        L_0x0120:
            boolean r0 = r5 instanceof X.C309076Wv
            if (r0 == 0) goto L_0x012a
            r0 = r5
            X.6Wv r0 = (X.C309076Wv) r0
            java.lang.String r0 = r0.A05
            return r0
        L_0x012a:
            boolean r0 = r5 instanceof X.AnonymousClass6X9
            if (r0 == 0) goto L_0x0134
            r0 = r5
            X.6X9 r0 = (X.AnonymousClass6X9) r0
            android.content.Context r1 = r0.A00
            goto L_0x0103
        L_0x0134:
            boolean r0 = r5 instanceof X.C309116Wz
            if (r0 == 0) goto L_0x013e
            r0 = r5
            X.6Wz r0 = (X.C309116Wz) r0
            java.lang.String r0 = r0.A06
            return r0
        L_0x013e:
            boolean r0 = r5 instanceof X.C308906Wd
            if (r0 == 0) goto L_0x0148
            r0 = r5
            X.6Wd r0 = (X.C308906Wd) r0
            java.lang.String r0 = r0.A07
            return r0
        L_0x0148:
            boolean r0 = r5 instanceof X.AnonymousClass6X3
            if (r0 != 0) goto L_0x01df
            boolean r0 = r5 instanceof X.AnonymousClass6XU
            if (r0 == 0) goto L_0x016e
            r3 = r5
            X.6XU r3 = (X.AnonymousClass6XU) r3
            java.lang.Integer r0 = r3.A05
            if (r0 == 0) goto L_0x01df
            int r2 = r0.intValue()
            r0 = 0
            r1 = 2131971566(0x7f134dee, float:1.9580115E38)
            if (r2 != r0) goto L_0x0164
            r1 = 2131971567(0x7f134def, float:1.9580117E38)
        L_0x0164:
            android.content.Context r0 = r3.A00
            java.lang.String r0 = r0.getString(r1)
            X.0qQ.A07(r0)
            return r0
        L_0x016e:
            boolean r0 = r5 instanceof X.AnonymousClass6XP
            if (r0 == 0) goto L_0x0196
            r3 = r5
            X.6XP r3 = (X.AnonymousClass6XP) r3
            X.8D7 r2 = r3.A03
            r1 = 1
            if (r2 == 0) goto L_0x018f
            boolean r0 = r2.A02()
            if (r0 == r1) goto L_0x0188
            X.UOB r0 = r2.A0E
            if (r0 == 0) goto L_0x018f
            java.lang.String r0 = r0.A0E
            if (r0 == 0) goto L_0x018f
        L_0x0188:
            android.content.Context r1 = r3.A00
            r0 = 2131971725(0x7f134e8d, float:1.9580437E38)
            goto L_0x003a
        L_0x018f:
            android.content.Context r1 = r3.A00
            r0 = 2131971747(0x7f134ea3, float:1.9580482E38)
            goto L_0x003a
        L_0x0196:
            boolean r0 = r5 instanceof X.AnonymousClass6XN
            if (r0 == 0) goto L_0x01a0
            r0 = r5
            X.6XN r0 = (X.AnonymousClass6XN) r0
            java.lang.String r0 = r0.A06
            return r0
        L_0x01a0:
            boolean r0 = r5 instanceof X.AnonymousClass6XL
            if (r0 == 0) goto L_0x0254
            r0 = r5
            X.6XL r0 = (X.AnonymousClass6XL) r0
            java.lang.String r0 = r0.A06
            return r0
        L_0x01aa:
            boolean r0 = r5 instanceof X.AnonymousClass6XE
            if (r0 == 0) goto L_0x01e5
            r4 = r5
            X.6XE r4 = (X.AnonymousClass6XE) r4
            X.87G r0 = X.AnonymousClass6XE.A00(r4)
            if (r0 == 0) goto L_0x01df
            X.87I r3 = r0.A04
            if (r3 != 0) goto L_0x01bd
            X.87I r3 = X.AnonymousClass87I.EMPTY
        L_0x01bd:
            int r0 = r3.ordinal()
            java.lang.String r2 = "CanvasAttributionType"
            switch(r0) {
                case -1: goto L_0x01e2;
                case 1: goto L_0x036c;
                case 4: goto L_0x0380;
                case 5: goto L_0x037c;
                case 6: goto L_0x0378;
                case 7: goto L_0x0384;
                case 8: goto L_0x0370;
                case 9: goto L_0x0368;
                case 17: goto L_0x0374;
                case 18: goto L_0x0388;
                case 19: goto L_0x0364;
                case 20: goto L_0x0360;
                case 31: goto L_0x035c;
                default: goto L_0x01c6;
            }
        L_0x01c6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Tried to infer dialog option text from DialElement, but DialElement.getType is "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", and there is no header text currently mapped to that type"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x01dc:
            X.0wb.A03(r2, r0)
        L_0x01df:
            java.lang.String r0 = ""
            return r0
        L_0x01e2:
            java.lang.String r0 = "Tried to infer dialog option from DialElement, but DialElement.getType is null"
            goto L_0x01dc
        L_0x01e5:
            boolean r0 = r5 instanceof X.AnonymousClass6XZ
            if (r0 == 0) goto L_0x01ef
            r0 = r5
            X.6XZ r0 = (X.AnonymousClass6XZ) r0
            java.lang.String r0 = r0.A08
            return r0
        L_0x01ef:
            boolean r0 = r5 instanceof X.AnonymousClass6XY
            if (r0 == 0) goto L_0x01f9
            r0 = r5
            X.6XY r0 = (X.AnonymousClass6XY) r0
            java.lang.String r0 = r0.A06
            return r0
        L_0x01f9:
            boolean r0 = r5 instanceof X.AnonymousClass6XC
            if (r0 == 0) goto L_0x0203
            r0 = r5
            X.6XC r0 = (X.AnonymousClass6XC) r0
            java.lang.String r0 = r0.A06
            return r0
        L_0x0203:
            boolean r0 = r5 instanceof X.AnonymousClass6X8
            if (r0 == 0) goto L_0x0229
            r0 = r5
            X.6X8 r0 = (X.AnonymousClass6X8) r0
            X.3uh r0 = r0.A01
            X.1Xj r0 = r0.A0b
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x039b
            X.1Xy r0 = r0.A0C
            java.util.List r0 = r0.C0D()
            if (r0 == 0) goto L_0x0395
            java.lang.Object r0 = X.00k.A0J(r0)
            X.DTq r0 = (X.C46287DTq) r0
            if (r0 == 0) goto L_0x0395
            java.lang.String r0 = r0.Ad5()
            if (r0 == 0) goto L_0x0395
            return r0
        L_0x0229:
            boolean r0 = r5 instanceof X.AnonymousClass6XX
            if (r0 == 0) goto L_0x0233
            r0 = r5
            X.6XX r0 = (X.AnonymousClass6XX) r0
            java.lang.String r0 = r0.A05
            return r0
        L_0x0233:
            boolean r0 = r5 instanceof X.AnonymousClass6XG
            if (r0 == 0) goto L_0x023d
            r0 = r5
            X.6XG r0 = (X.AnonymousClass6XG) r0
            java.lang.String r0 = r0.A05
            return r0
        L_0x023d:
            boolean r0 = r5 instanceof X.AnonymousClass6X7
            if (r0 == 0) goto L_0x01df
            r0 = r5
            X.6X7 r0 = (X.AnonymousClass6X7) r0
            android.content.Context r2 = r0.A00
            r1 = 2131971578(0x7f134dfa, float:1.958014E38)
            X.3uh r0 = r0.A02
            X.1Xj r0 = r0.A0b
            if (r0 == 0) goto L_0x03a9
            java.lang.String r0 = r0.A2x()
            goto L_0x026d
        L_0x0254:
            boolean r0 = r5 instanceof X.AnonymousClass6XR
            if (r0 == 0) goto L_0x0277
            r0 = r5
            X.6XR r0 = (X.AnonymousClass6XR) r0
            android.content.Context r2 = r0.A00
            r1 = 2131971548(0x7f134ddc, float:1.9580078E38)
            X.8hK r0 = r0.A01
            if (r0 == 0) goto L_0x03a1
            int r0 = r0.A04
            java.lang.String r0 = r2.getString(r0)
            X.0qQ.A07(r0)
        L_0x026d:
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r2.getString(r1, r0)
            goto L_0x003e
        L_0x0277:
            boolean r0 = r5 instanceof X.AnonymousClass6X1
            if (r0 != 0) goto L_0x01df
            boolean r0 = r5 instanceof X.AnonymousClass6XT
            if (r0 == 0) goto L_0x0285
            r0 = r5
            X.6XT r0 = (X.AnonymousClass6XT) r0
            java.lang.String r0 = r0.A05
            return r0
        L_0x0285:
            boolean r0 = r5 instanceof X.C309106Wy
            if (r0 == 0) goto L_0x028f
            r0 = r5
            X.6Wy r0 = (X.C309106Wy) r0
            java.lang.String r0 = r0.A07
            return r0
        L_0x028f:
            boolean r0 = r5 instanceof X.C309096Wx
            if (r0 == 0) goto L_0x0299
            r0 = r5
            X.6Wx r0 = (X.C309096Wx) r0
            java.lang.String r0 = r0.A07
            return r0
        L_0x0299:
            boolean r0 = r5 instanceof X.C309086Ww
            if (r0 == 0) goto L_0x02a3
            r0 = r5
            X.6Ww r0 = (X.C309086Ww) r0
            java.lang.String r0 = r0.A06
            return r0
        L_0x02a3:
            boolean r0 = r5 instanceof X.AnonymousClass6XI
            if (r0 == 0) goto L_0x02ad
            r0 = r5
            X.6XI r0 = (X.AnonymousClass6XI) r0
            java.lang.String r0 = r0.A05
            return r0
        L_0x02ad:
            boolean r0 = r5 instanceof X.AnonymousClass6XH
            if (r0 == 0) goto L_0x02b7
            r0 = r5
            X.6XH r0 = (X.AnonymousClass6XH) r0
            java.lang.String r0 = r0.A05
            return r0
        L_0x02b7:
            boolean r0 = r5 instanceof X.AnonymousClass6XF
            if (r0 == 0) goto L_0x02c1
            r0 = r5
            X.6XF r0 = (X.AnonymousClass6XF) r0
            java.lang.String r0 = r0.A05
            return r0
        L_0x02c1:
            boolean r0 = r5 instanceof X.AnonymousClass6XQ
            if (r0 == 0) goto L_0x02cb
            r0 = r5
            X.6XQ r0 = (X.AnonymousClass6XQ) r0
            java.lang.String r0 = r0.A04
            return r0
        L_0x02cb:
            boolean r0 = r5 instanceof X.C308926Wf
            if (r0 == 0) goto L_0x02d5
            r0 = r5
            X.6Wf r0 = (X.C308926Wf) r0
            java.lang.String r0 = r0.A04
            return r0
        L_0x02d5:
            boolean r0 = r5 instanceof X.C309066Wt
            if (r0 == 0) goto L_0x02df
            r0 = r5
            X.6Wt r0 = (X.C309066Wt) r0
            java.lang.String r0 = r0.A06
            return r0
        L_0x02df:
            boolean r0 = r5 instanceof X.AnonymousClass6XB
            if (r0 == 0) goto L_0x02ed
            r0 = r5
            X.6XB r0 = (X.AnonymousClass6XB) r0
            android.content.Context r1 = r0.A00
            r0 = 2131971672(0x7f134e58, float:1.958033E38)
            goto L_0x003a
        L_0x02ed:
            boolean r0 = r5 instanceof X.AnonymousClass6XV
            if (r0 == 0) goto L_0x032e
            r4 = r5
            X.6XV r4 = (X.AnonymousClass6XV) r4
            com.instagram.common.session.UserSession r3 = r4.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323083883129677(0x810ba700002b4d, double:3.0342027367856993E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            r2 = 0
            X.3uh r0 = r4.A02
            X.1Xj r0 = r0.A0b
            if (r1 == 0) goto L_0x0325
            if (r0 == 0) goto L_0x0316
            X.1Xy r0 = r0.A0C
            java.util.List r0 = r0.Av3()
        L_0x0310:
            if (r0 == 0) goto L_0x0316
            int r2 = r0.size()
        L_0x0316:
            android.content.Context r0 = r4.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131820632(0x7f110058, float:1.9273984E38)
            java.lang.String r0 = r1.getQuantityString(r0, r2)
            goto L_0x003e
        L_0x0325:
            if (r0 == 0) goto L_0x0316
            X.1Xy r0 = r0.A0C
            java.util.List r0 = r0.Av2()
            goto L_0x0310
        L_0x032e:
            boolean r0 = r5 instanceof X.AnonymousClass6XO
            if (r0 != 0) goto L_0x01df
            boolean r0 = r5 instanceof X.AnonymousClass6X5
            if (r0 == 0) goto L_0x033c
            r0 = r5
            X.6X5 r0 = (X.AnonymousClass6X5) r0
            java.lang.String r0 = r0.A06
            return r0
        L_0x033c:
            boolean r0 = r5 instanceof X.AnonymousClass6X4
            if (r0 == 0) goto L_0x034a
            r0 = r5
            X.6X4 r0 = (X.AnonymousClass6X4) r0
            android.content.Context r1 = r0.A00
            r0 = 2131971669(0x7f134e55, float:1.9580324E38)
            goto L_0x003a
        L_0x034a:
            boolean r0 = r5 instanceof X.AnonymousClass6XW
            if (r0 == 0) goto L_0x01aa
            r0 = r5
            X.6XW r0 = (X.AnonymousClass6XW) r0
            java.lang.String r0 = r0.A05
            return r0
        L_0x0354:
            java.lang.String r1 = "Need non-null sponsor for this 'Visit Profile' button/dialog option"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x035c:
            r1 = 2131971673(0x7f134e59, float:1.9580332E38)
            goto L_0x038b
        L_0x0360:
            r1 = 2131971671(0x7f134e57, float:1.9580328E38)
            goto L_0x038b
        L_0x0364:
            r1 = 2131971680(0x7f134e60, float:1.9580346E38)
            goto L_0x038b
        L_0x0368:
            r1 = 2131971679(0x7f134e5f, float:1.9580344E38)
            goto L_0x038b
        L_0x036c:
            r1 = 2131971694(0x7f134e6e, float:1.9580375E38)
            goto L_0x038b
        L_0x0370:
            r1 = 2131971687(0x7f134e67, float:1.958036E38)
            goto L_0x038b
        L_0x0374:
            r1 = 2131971675(0x7f134e5b, float:1.9580336E38)
            goto L_0x038b
        L_0x0378:
            r1 = 2131971685(0x7f134e65, float:1.9580356E38)
            goto L_0x038b
        L_0x037c:
            r1 = 2131971684(0x7f134e64, float:1.9580354E38)
            goto L_0x038b
        L_0x0380:
            r1 = 2131971683(0x7f134e63, float:1.9580352E38)
            goto L_0x038b
        L_0x0384:
            r1 = 2131971670(0x7f134e56, float:1.9580326E38)
            goto L_0x038b
        L_0x0388:
            r1 = 2131971693(0x7f134e6d, float:1.9580373E38)
        L_0x038b:
            android.content.Context r0 = r4.A00
            java.lang.String r0 = r0.getString(r1)
            X.0qQ.A0A(r0)
            return r0
        L_0x0395:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x039b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x03a1:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x03a9:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C308916We.A03():java.lang.String");
    }

    public final List A05() {
        ReelAttributionModel reelAttributionModel;
        String str;
        String str2;
        C255783ui r0;
        CreativeConfigIntf creativeConfigIntf;
        CreativeConfigIntf AsO;
        String str3;
        EffectInfoBottomSheetConfiguration A012;
        ImageUrl imageUrl;
        ImageUrl imageUrl2;
        List list;
        List list2;
        boolean z;
        Boolean COY;
        EffectActionSheetIntf Azy;
        EffectActionSheetIntf Azy2;
        AttributionUser attributionUser;
        ProfilePicture Bh6;
        EffectThumbnailImageDictIntf C6y;
        MusicOverlayStickerModel musicOverlayStickerModel;
        C255783ui r02;
        if (this instanceof C309076Wv) {
            return ((C309076Wv) this).A06;
        }
        if (this instanceof AnonymousClass6X6) {
            AnonymousClass6X6 r1 = (AnonymousClass6X6) this;
            reelAttributionModel = new ReelAttributionModel(r1.A01);
            List Bkd = r1.A02.Bkd(AnonymousClass3WT.MUSIC_OVERLAY);
            if (Bkd == null || (r02 = (C255783ui) 00k.A0J(Bkd)) == null) {
                musicOverlayStickerModel = null;
            } else {
                musicOverlayStickerModel = r02.A0u;
            }
            if (musicOverlayStickerModel != null) {
                reelAttributionModel.A03 = musicOverlayStickerModel;
                try {
                    StringWriter stringWriter = new StringWriter();
                    17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
                    C255673uX.A00(A0A, musicOverlayStickerModel, true);
                    A0A.close();
                    reelAttributionModel.A05 = stringWriter.toString();
                } catch (IOException unused) {
                    str = "ReelAttributionModel";
                    str2 = "Could not json serialize MusicAssetModel";
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else if (this instanceof C309066Wt) {
            return ((C309066Wt) this).A07;
        } else {
            if (this instanceof AnonymousClass6XB) {
                AnonymousClass6XB r12 = (AnonymousClass6XB) this;
                ArrayList arrayList = new ArrayList();
                CreativeConfigIntf creativeConfigIntf2 = r12.A02;
                if (creativeConfigIntf2 == null) {
                    return arrayList;
                }
                C306106Ku r11 = null;
                ReelViewerConfig reelViewerConfig = r12.A04;
                if (reelViewerConfig != null && !reelViewerConfig.A04) {
                    String B3W = creativeConfigIntf2.B3W();
                    EffectPreviewIntf B0A = creativeConfigIntf2.B0A();
                    if (B0A == null || (str3 = B0A.getName()) == null) {
                        str3 = creativeConfigIntf2.getCaptureType();
                    }
                    if (!(B3W == null || str3 == null)) {
                        C306106Ku r5 = C306106Ku.LAYOUT;
                        if (!C284745Nt.A0B(creativeConfigIntf2, r5) && !C284745Nt.A0B(creativeConfigIntf2, C306106Ku.DUAL) && (!C284745Nt.A0B(creativeConfigIntf2, C306106Ku.BOOMERANG) || creativeConfigIntf2.B3W() != null)) {
                            Context context = r12.A00;
                            UserSession userSession = r12.A01;
                            EffectPreviewIntf B0A2 = creativeConfigIntf2.B0A();
                            if (B0A2 == null || (C6y = B0A2.C6y()) == null) {
                                imageUrl = null;
                            } else {
                                imageUrl = C6y.CCI();
                            }
                            String A06 = C284745Nt.A06(creativeConfigIntf2);
                            String A05 = C284745Nt.A05(creativeConfigIntf2);
                            EffectPreviewIntf B0A3 = creativeConfigIntf2.B0A();
                            if (((B0A3 == null || (attributionUser = B0A3.AdD()) == null) && (attributionUser = creativeConfigIntf2.AdD()) == null) || (Bh6 = attributionUser.Bh6()) == null) {
                                imageUrl2 = null;
                            } else {
                                imageUrl2 = Bh6.CCI();
                            }
                            String failureReason = creativeConfigIntf2.getFailureReason();
                            if (C284745Nt.A0A(creativeConfigIntf2)) {
                                r11 = C284745Nt.A03(creativeConfigIntf2);
                            }
                            ProductItemWithARIntf B0B = creativeConfigIntf2.B0B();
                            EffectPreviewIntf B0A4 = creativeConfigIntf2.B0A();
                            boolean z2 = true;
                            if (B0A4 == null || !"SAVED".equals(B0A4.getSaveStatus())) {
                                z2 = false;
                            }
                            EffectPreviewIntf B0A5 = creativeConfigIntf2.B0A();
                            if (B0A5 == null || (Azy2 = B0A5.Azy()) == null || (list = Azy2.BfN()) == null) {
                                list = 0sn.A00;
                            }
                            EffectPreviewIntf B0A6 = creativeConfigIntf2.B0A();
                            if (B0A6 == null || (Azy = B0A6.Azy()) == null || (list2 = Azy.BqS()) == null) {
                                list2 = 0sn.A00;
                            }
                            String Bbn = creativeConfigIntf2.Bbn();
                            C62622Kit A042 = C284745Nt.A04(creativeConfigIntf2);
                            EffectPreviewIntf B0A7 = creativeConfigIntf2.B0A();
                            if (B0A7 == null || (COY = B0A7.COY()) == null) {
                                z = false;
                            } else {
                                z = COY.booleanValue();
                            }
                            A012 = LPR.A00(context, userSession, imageUrl, imageUrl2, r11, A042, B0B, B3W, str3, A06, A05, failureReason, Bbn, r12.A07, list, list2, 5, z2, z, reelViewerConfig.A08);
                        } else if (C284745Nt.A0B(creativeConfigIntf2, r5, C306106Ku.DUAL) && creativeConfigIntf2.B02() != null) {
                            A012 = LPR.A01(r12.A00, creativeConfigIntf2, r12.A07);
                        }
                        ImmutableList immutableList = A012.A02;
                        if (immutableList != null && !immutableList.isEmpty()) {
                            Iterator it = immutableList.iterator();
                            while (it.hasNext()) {
                                EffectInfoAttributionConfiguration effectInfoAttributionConfiguration = (EffectInfoAttributionConfiguration) it.next();
                                if (effectInfoAttributionConfiguration.A02 == null) {
                                    ReelAttributionModel reelAttributionModel2 = new ReelAttributionModel(ReelHeaderAttributionType.EFFECT_ATTRIBUTION);
                                    reelAttributionModel2.A01 = effectInfoAttributionConfiguration;
                                    arrayList.add(reelAttributionModel2);
                                }
                            }
                        }
                    }
                }
                if (!C309146Xc.A00(r12.A00, creativeConfigIntf2)) {
                    return arrayList;
                }
                if (182.A06(0Tu.A06, r12.A01, 36311186824036819L)) {
                    return arrayList;
                }
                C306106Ku A032 = C284745Nt.A03(creativeConfigIntf2);
                ReelAttributionModel reelAttributionModel3 = new ReelAttributionModel(ReelHeaderAttributionType.CAMERA_FORMAT_ATTRIBUTION);
                reelAttributionModel3.A02 = A032;
                arrayList.add(reelAttributionModel3);
                return arrayList;
            } else if (this instanceof AnonymousClass6X5) {
                return ((AnonymousClass6X5) this).A07;
            } else {
                if (this instanceof AnonymousClass6X4) {
                    ReelAttributionModel reelAttributionModel4 = new ReelAttributionModel(ReelHeaderAttributionType.CLIPS_ATTRIBUTION);
                    reelAttributionModel4.A02 = C306106Ku.CLIPS;
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(reelAttributionModel4);
                    return arrayList2;
                } else if (this instanceof AnonymousClass6XC) {
                    AnonymousClass6XC r13 = (AnonymousClass6XC) this;
                    ArrayList arrayList3 = new ArrayList();
                    Context context2 = r13.A00;
                    1Xj r2 = r13.A01;
                    C306106Ku r3 = null;
                    if (r2 != null) {
                        creativeConfigIntf = r2.A0C.AsO();
                    } else {
                        creativeConfigIntf = null;
                    }
                    if (!C309146Xc.A00(context2, creativeConfigIntf)) {
                        return arrayList3;
                    }
                    if (!(r2 == null || (AsO = r2.A0C.AsO()) == null)) {
                        r3 = C284745Nt.A03(AsO);
                    }
                    ReelAttributionModel reelAttributionModel5 = new ReelAttributionModel(ReelHeaderAttributionType.CAMERA_FORMAT_ATTRIBUTION);
                    reelAttributionModel5.A02 = r3;
                    arrayList3.add(reelAttributionModel5);
                    return arrayList3;
                } else if (!(this instanceof AnonymousClass6XG)) {
                    return 0sn.A00;
                } else {
                    AnonymousClass6XG r14 = (AnonymousClass6XG) this;
                    reelAttributionModel = new ReelAttributionModel(r14.A01);
                    List Bkd2 = r14.A02.Bkd(AnonymousClass3WT.AVATAR);
                    C14015ToH toH = null;
                    if (!(Bkd2 == null || !(!Bkd2.isEmpty()) || (r0 = (C255783ui) 00k.A0O(Bkd2, 0)) == null)) {
                        toH = r0.A0C;
                    }
                    if (toH != null) {
                        reelAttributionModel.A00 = toH;
                        try {
                            StringWriter stringWriter2 = new StringWriter();
                            17W A0A2 = AnonymousClass15o.A00.A0A(stringWriter2);
                            C14014ToG.A00(A0A2, toH);
                            A0A2.close();
                            reelAttributionModel.A04 = stringWriter2.toString();
                        } catch (IOException unused2) {
                            str = "ReelAttributionModel";
                            str2 = "Could not json serialize AvatarStickerDict";
                        }
                    }
                }
            }
        }
        List singletonList = Collections.singletonList(reelAttributionModel);
        0qQ.A07(singletonList);
        return singletonList;
        0wb.A03(str, str2);
        List singletonList2 = Collections.singletonList(reelAttributionModel);
        0qQ.A07(singletonList2);
        return singletonList2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:272:0x03d9, code lost:
        if (r2.A00 != false) goto L_0x03db;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06() {
        /*
            r11 = this;
            X.3uh r0 = r11.A04
            if (r0 == 0) goto L_0x0017
            X.1Xj r0 = r0.A0b
            if (r0 == 0) goto L_0x0017
            r11.A07(r0)
            r2 = r11
            boolean r0 = r11 instanceof X.AnonymousClass6X6
            if (r0 == 0) goto L_0x0018
            X.6X6 r2 = (X.AnonymousClass6X6) r2
            X.6ml r0 = r2.A04
            r0.DSg()
        L_0x0017:
            return
        L_0x0018:
            boolean r0 = r11 instanceof X.AnonymousClass6XN
            if (r0 == 0) goto L_0x0028
            X.6XN r2 = (X.AnonymousClass6XN) r2
            X.6ml r1 = r2.A04
            com.instagram.user.model.User r0 = r2.A05
            if (r0 == 0) goto L_0x03fb
            r1.DVa(r0)
            return
        L_0x0028:
            boolean r0 = r11 instanceof X.C309096Wx
            if (r0 == 0) goto L_0x0069
            X.6Wx r2 = (X.C309096Wx) r2
            X.3uh r3 = r2.A02
            X.1Xj r0 = r3.A0b
            if (r0 == 0) goto L_0x0067
            X.1Xy r0 = r0.A0C
            X.50l r0 = r0.BDc()
            if (r0 == 0) goto L_0x0067
            java.util.List r1 = r0.AZX()
            if (r1 == 0) goto L_0x0067
            r0 = 0
            java.lang.Object r0 = X.00k.A0O(r1, r0)
            X.50j r0 = (X.C2801550j) r0
            if (r0 == 0) goto L_0x0067
            java.lang.String r4 = r0.Bkc()
        L_0x004f:
            com.instagram.user.model.User r3 = r3.A0i
            if (r4 == 0) goto L_0x0017
            if (r3 == 0) goto L_0x0017
            X.6ml r1 = r2.A05
            X.6lO r0 = r2.A04
            X.6ld r0 = r0.A0P
            android.widget.TextView r0 = r0.A02
            if (r0 != 0) goto L_0x041e
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0067:
            r4 = 0
            goto L_0x004f
        L_0x0069:
            boolean r0 = r11 instanceof X.C308976Wk
            if (r0 == 0) goto L_0x0077
            X.6Wk r2 = (X.C308976Wk) r2
            X.6ml r1 = r2.A05
            X.3uh r0 = r2.A03
            r1.E0G(r0)
            return
        L_0x0077:
            boolean r0 = r11 instanceof X.C308986Wl
            if (r0 != 0) goto L_0x0017
            boolean r0 = r11 instanceof X.C308996Wm
            if (r0 == 0) goto L_0x0089
            X.6Wm r2 = (X.C308996Wm) r2
            X.6ml r1 = r2.A02
            X.3uh r0 = r2.A01
            r1.Dv3(r0)
            return
        L_0x0089:
            boolean r0 = r11 instanceof X.C309006Wn
            if (r0 == 0) goto L_0x00a1
            X.6Wn r2 = (X.C309006Wn) r2
            X.3uh r0 = r2.A02
            X.1Xj r0 = r0.A0b
            if (r0 == 0) goto L_0x040b
            X.6ml r1 = r2.A04
            java.lang.String r0 = r0.A30()
            if (r0 == 0) goto L_0x0403
            r1.Dtw(r0)
            return
        L_0x00a1:
            boolean r0 = r11 instanceof X.C309016Wo
            if (r0 != 0) goto L_0x0017
            boolean r0 = r11 instanceof X.C308956Wi
            if (r0 != 0) goto L_0x0017
            boolean r0 = r11 instanceof X.C309026Wp
            if (r0 == 0) goto L_0x00bb
            X.6Wp r2 = (X.C309026Wp) r2
            X.3uh r4 = r2.A02
            X.1Xj r0 = r4.A0b
            if (r0 == 0) goto L_0x040e
            X.6ml r0 = r2.A04
        L_0x00b7:
            r0.Dns(r4)
            return
        L_0x00bb:
            boolean r0 = r11 instanceof X.C309036Wq
            if (r0 != 0) goto L_0x0017
            boolean r0 = r11 instanceof X.C309046Wr
            if (r0 != 0) goto L_0x0017
            boolean r0 = r11 instanceof X.C309056Ws
            if (r0 == 0) goto L_0x00fc
            X.6Ws r2 = (X.C309056Ws) r2
            com.instagram.user.model.User r4 = r2.A04
            X.3uh r3 = r2.A01
            X.1Xj r1 = r3.A0b
            boolean r0 = r2.A09()
            if (r0 == 0) goto L_0x0017
            if (r4 == 0) goto L_0x0017
            if (r1 == 0) goto L_0x0017
            com.instagram.common.session.UserSession r0 = r2.A01
            X.70U r5 = new X.70U
            r5.<init>(r0)
            java.lang.String r7 = r4.getId()
            X.4Cl r0 = r4.A03
            java.lang.String r8 = r0.C9f()
            X.RIv r6 = X.C8956RIv.STORIES
            r10 = 1
            java.lang.String r9 = r1.A2n()
            r5.A00(r6, r7, r8, r9, r10)
            X.6ml r1 = r2.A03
            X.6a7 r0 = r2.A05
            r1.Dmv(r3, r4, r0)
            return
        L_0x00fc:
            boolean r0 = r11 instanceof X.C308966Wj
            if (r0 == 0) goto L_0x010c
            X.6Wj r2 = (X.C308966Wj) r2
            X.6ml r3 = r2.A05
            X.3mM r1 = r2.A02
            X.3uh r0 = r2.A01
            r3.DWF(r0, r1)
            return
        L_0x010c:
            boolean r0 = r11 instanceof X.AnonymousClass6XM
            if (r0 == 0) goto L_0x011c
            X.6XM r2 = (X.AnonymousClass6XM) r2
            com.instagram.user.model.User r1 = r2.A06
            if (r1 == 0) goto L_0x0017
            X.6ml r0 = r2.A05
            r0.DkB(r1)
            return
        L_0x011c:
            boolean r0 = r11 instanceof X.AnonymousClass6XJ
            if (r0 != 0) goto L_0x0017
            boolean r0 = r11 instanceof X.C308936Wg
            if (r0 != 0) goto L_0x0017
            boolean r0 = r11 instanceof X.AnonymousClass6XA
            if (r0 == 0) goto L_0x0130
            X.6XA r2 = (X.AnonymousClass6XA) r2
            X.6ml r0 = r2.A03
        L_0x012c:
            r0.Cvr()
            return
        L_0x0130:
            boolean r0 = r11 instanceof X.AnonymousClass6X0
            if (r0 != 0) goto L_0x0017
            boolean r0 = r11 instanceof X.C308946Wh
            if (r0 == 0) goto L_0x0140
            X.6Wh r2 = (X.C308946Wh) r2
            X.6ml r0 = r2.A04
            r0.DbM()
            return
        L_0x0140:
            boolean r0 = r11 instanceof X.C309076Wv
            if (r0 == 0) goto L_0x014e
            X.6Wv r2 = (X.C309076Wv) r2
            X.6ml r1 = r2.A04
            X.3uh r0 = r2.A02
            r1.Dau(r0)
            return
        L_0x014e:
            boolean r0 = r11 instanceof X.AnonymousClass6XK
            if (r0 == 0) goto L_0x015c
            X.6XK r2 = (X.AnonymousClass6XK) r2
            X.6ml r1 = r2.A04
            X.3uh r0 = r2.A02
            r1.DXy(r0)
            return
        L_0x015c:
            boolean r0 = r11 instanceof X.AnonymousClass6X9
            if (r0 == 0) goto L_0x0165
            X.6X9 r2 = (X.AnonymousClass6X9) r2
            X.6ml r0 = r2.A04
            goto L_0x012c
        L_0x0165:
            boolean r0 = r11 instanceof X.C309116Wz
            if (r0 == 0) goto L_0x018d
            X.6Wz r2 = (X.C309116Wz) r2
            X.3uh r0 = r2.A03
            com.instagram.user.model.User r4 = r0.A0i
            if (r4 == 0) goto L_0x0017
            X.6ml r3 = r2.A05
            java.lang.String r1 = "myWeek:"
            java.lang.String r0 = r4.getId()
            java.lang.String r1 = X.002.A0R(r1, r0)
            X.6lO r0 = r2.A04
            X.6ld r0 = r0.A0P
            android.widget.TextView r0 = r0.A02
            if (r0 == 0) goto L_0x0416
            android.graphics.RectF r0 = X.0nA.A0F(r0)
            r3.DJM(r0, r4, r1)
            return
        L_0x018d:
            boolean r0 = r11 instanceof X.C308906Wd
            if (r0 == 0) goto L_0x0199
            X.6Wd r2 = (X.C308906Wd) r2
            X.6ml r0 = r2.A06
            r0.CwP()
            return
        L_0x0199:
            boolean r0 = r11 instanceof X.AnonymousClass6X3
            if (r0 != 0) goto L_0x0017
            boolean r0 = r11 instanceof X.AnonymousClass6XU
            if (r0 == 0) goto L_0x01be
            X.6XU r2 = (X.AnonymousClass6XU) r2
            X.3uh r4 = r2.A02
            X.1Xj r0 = r4.A0b
            if (r0 != 0) goto L_0x0205
            X.0wj r3 = X.0wj.A01
            r2 = 817897396(0x30c01fb4, float:1.3978849E-9)
            java.lang.String r1 = "MetaAIAttributionType missing media for Meta AI attribution "
        L_0x01b0:
            java.lang.String r0 = r4.A0k
            java.lang.String r0 = X.002.A0R(r1, r0)
            X.0f9 r0 = r3.AEf(r0, r2)
            r0.report()
            return
        L_0x01be:
            boolean r0 = r11 instanceof X.AnonymousClass6XP
            if (r0 == 0) goto L_0x01cd
            X.6XP r2 = (X.AnonymousClass6XP) r2
            X.6ml r3 = r2.A05
            X.3uh r1 = r2.A02
            r0 = 1
            r3.DRo(r1, r0)
            return
        L_0x01cd:
            boolean r0 = r11 instanceof X.AnonymousClass6XL
            if (r0 == 0) goto L_0x01dd
            X.6XL r2 = (X.AnonymousClass6XL) r2
            X.6ml r3 = r2.A05
            X.3uh r1 = r2.A02
            X.3mM r0 = r2.A03
            r3.DR5(r1, r0)
            return
        L_0x01dd:
            boolean r0 = r11 instanceof X.AnonymousClass6XR
            if (r0 == 0) goto L_0x01e9
            X.6XR r2 = (X.AnonymousClass6XR) r2
            X.6ml r0 = r2.A05
            r0.DPV()
            return
        L_0x01e9:
            boolean r0 = r11 instanceof X.AnonymousClass6X1
            if (r0 != 0) goto L_0x0017
            boolean r0 = r11 instanceof X.AnonymousClass6XT
            if (r0 == 0) goto L_0x022b
            X.6XT r2 = (X.AnonymousClass6XT) r2
            X.3uh r4 = r2.A02
            X.1Xj r0 = r4.A0b
            if (r0 != 0) goto L_0x0201
            X.0wj r3 = X.0wj.A01
            r2 = 817897396(0x30c01fb4, float:1.3978849E-9)
            java.lang.String r1 = "ImagineTemplatesAttributionType missing media for Imagine attribution "
            goto L_0x01b0
        L_0x0201:
            X.6ml r0 = r2.A04
            goto L_0x00b7
        L_0x0205:
            X.1Xy r0 = r0.A0C
            com.instagram.feed.media.CreativeConfigIntf r0 = r0.AsO()
            if (r0 == 0) goto L_0x0229
            java.util.List r0 = r0.B92()
            if (r0 == 0) goto L_0x0229
            java.lang.Object r0 = X.00k.A0J(r0)
            com.instagram.api.schemas.GenAIToolInfoDictIntf r0 = (com.instagram.api.schemas.GenAIToolInfoDictIntf) r0
            if (r0 == 0) goto L_0x0229
            java.lang.String r3 = r0.Bhm()
        L_0x021f:
            java.lang.Integer r1 = r2.A05
            if (r1 == 0) goto L_0x0017
            X.6ml r0 = r2.A04
            r0.DRw(r4, r1, r3)
            return
        L_0x0229:
            r3 = 0
            goto L_0x021f
        L_0x022b:
            boolean r0 = r11 instanceof X.C309106Wy
            if (r0 == 0) goto L_0x026c
            X.6Wy r2 = (X.C309106Wy) r2
            X.3uh r3 = r2.A02
            X.1Xj r0 = r3.A0b
            if (r0 == 0) goto L_0x026a
            X.1Xy r0 = r0.A0C
            X.50l r0 = r0.BDc()
            if (r0 == 0) goto L_0x026a
            java.util.List r1 = r0.AZX()
            if (r1 == 0) goto L_0x026a
            r0 = 0
            java.lang.Object r0 = X.00k.A0O(r1, r0)
            X.50j r0 = (X.C2801550j) r0
            if (r0 == 0) goto L_0x026a
            java.lang.String r4 = r0.Bkc()
        L_0x0252:
            com.instagram.user.model.User r3 = r3.A0i
            if (r4 == 0) goto L_0x0017
            if (r3 == 0) goto L_0x0017
            X.6ml r1 = r2.A05
            X.6lO r0 = r2.A04
            X.6le r0 = r0.A0Q
            android.widget.TextView r0 = r0.A02
            if (r0 != 0) goto L_0x041e
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x026a:
            r4 = 0
            goto L_0x0252
        L_0x026c:
            boolean r0 = r11 instanceof X.C309086Ww
            if (r0 == 0) goto L_0x027c
            X.6Ww r2 = (X.C309086Ww) r2
            X.6ml r3 = r2.A04
            X.3uh r1 = r2.A01
            X.3mM r0 = r2.A02
            r3.DIO(r1, r0)
            return
        L_0x027c:
            boolean r0 = r11 instanceof X.AnonymousClass6XI
            if (r0 == 0) goto L_0x028a
            X.6XI r2 = (X.AnonymousClass6XI) r2
            X.6ml r1 = r2.A04
            X.3uh r0 = r2.A02
            r1.DHf(r0)
            return
        L_0x028a:
            boolean r0 = r11 instanceof X.AnonymousClass6XH
            if (r0 == 0) goto L_0x02c2
            X.6XH r2 = (X.AnonymousClass6XH) r2
            X.3uh r0 = r2.A03
            X.1Xj r1 = r0.A0b
            r1.getClass()
            com.instagram.common.session.UserSession r5 = r2.A01
            X.0iw r0 = r2.A01
            java.lang.String r7 = r0.getModuleName()
            java.lang.String r9 = r1.A2n()
            X.9OT r3 = X.AnonymousClass9OT.STORY
            com.instagram.api.schemas.MediaGenAIDetectionMethod r4 = r1.A1I()
            java.lang.String r8 = "genai_transparency_label_click"
            r6 = 0
            X.C250563lf.A0e(r3, r4, r5, r6, r7, r8, r9)
            android.content.Context r2 = r2.A00
            java.lang.String r6 = r0.getModuleName()
            java.lang.String r7 = r1.A2n()
            com.instagram.api.schemas.MediaGenAIDetectionMethod r4 = r1.A1I()
            r8 = 0
            X.JUL.A00(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x02c2:
            boolean r0 = r11 instanceof X.AnonymousClass6XF
            if (r0 == 0) goto L_0x02d0
            X.6XF r2 = (X.AnonymousClass6XF) r2
            X.6ml r1 = r2.A04
            X.3uh r0 = r2.A02
            r1.DHU(r0)
            return
        L_0x02d0:
            boolean r0 = r11 instanceof X.AnonymousClass6XQ
            if (r0 == 0) goto L_0x02de
            X.6XQ r2 = (X.AnonymousClass6XQ) r2
            X.6ml r1 = r2.A03
            X.3uh r0 = r2.A01
            r1.DH5(r0)
            return
        L_0x02de:
            boolean r0 = r11 instanceof X.C308926Wf
            if (r0 != 0) goto L_0x0017
            boolean r0 = r11 instanceof X.C309066Wt
            if (r0 == 0) goto L_0x02ee
            X.6Wt r2 = (X.C309066Wt) r2
            X.6ml r0 = r2.A05
            r0.DDi()
            return
        L_0x02ee:
            boolean r0 = r11 instanceof X.AnonymousClass6XB
            if (r0 == 0) goto L_0x030c
            X.6XB r2 = (X.AnonymousClass6XB) r2
            android.content.Context r0 = r2.A00
            boolean r0 = X.C305756Jk.A00(r0)
            if (r0 == 0) goto L_0x0017
            X.6mm r4 = r2.A05
            android.view.View r0 = r2.A01
            android.graphics.RectF r3 = X.0nA.A0F(r0)
            com.instagram.feed.media.CreativeConfigIntf r1 = r2.A02
            java.lang.String r0 = r2.A07
            r4.DBS(r3, r1, r0)
            return
        L_0x030c:
            boolean r0 = r11 instanceof X.AnonymousClass6XV
            if (r0 == 0) goto L_0x0324
            X.6XV r2 = (X.AnonymousClass6XV) r2
            X.3uh r0 = r2.A02
            X.1Xj r0 = r0.A0b
            if (r0 == 0) goto L_0x0017
            java.lang.String r1 = r0.getId()
            if (r1 == 0) goto L_0x0017
            X.6ml r0 = r2.A04
            r0.D7Y(r1)
            return
        L_0x0324:
            boolean r0 = r11 instanceof X.AnonymousClass6XO
            if (r0 != 0) goto L_0x0017
            boolean r0 = r11 instanceof X.AnonymousClass6X5
            if (r0 == 0) goto L_0x0336
            X.6X5 r2 = (X.AnonymousClass6X5) r2
            X.6ml r1 = r2.A05
            X.3uh r0 = r2.A03
            r1.D42(r0)
            return
        L_0x0336:
            boolean r0 = r11 instanceof X.AnonymousClass6X4
            if (r0 == 0) goto L_0x0344
            X.6X4 r2 = (X.AnonymousClass6X4) r2
            X.6ml r1 = r2.A03
            X.3uh r0 = r2.A01
            r1.D3a(r0)
            return
        L_0x0344:
            boolean r0 = r11 instanceof X.AnonymousClass6XW
            if (r0 == 0) goto L_0x0352
            X.6XW r2 = (X.AnonymousClass6XW) r2
            X.6ml r1 = r2.A03
            X.3uh r0 = r2.A01
            r1.D1P(r0)
            return
        L_0x0352:
            boolean r0 = r11 instanceof X.AnonymousClass6XE
            if (r0 == 0) goto L_0x0362
            X.6XE r2 = (X.AnonymousClass6XE) r2
            X.6ml r1 = r2.A04
            X.87G r0 = X.AnonymousClass6XE.A00(r2)
            r1.D0j(r0)
            return
        L_0x0362:
            boolean r0 = r11 instanceof X.AnonymousClass6XZ
            if (r0 == 0) goto L_0x037a
            X.6XZ r2 = (X.AnonymousClass6XZ) r2
            X.82k r0 = r2.A01
            if (r0 == 0) goto L_0x0017
            X.6ml r2 = r2.A06
            java.lang.String r1 = r0.BAL()
            java.lang.String r0 = r0.getName()
            r2.D0K(r1, r0)
            return
        L_0x037a:
            boolean r0 = r11 instanceof X.AnonymousClass6XY
            if (r0 == 0) goto L_0x0392
            X.6XY r2 = (X.AnonymousClass6XY) r2
            X.82k r0 = r2.A00
            if (r0 == 0) goto L_0x0017
            X.6ml r2 = r2.A04
            java.lang.String r1 = r0.BAL()
            java.lang.String r0 = r0.getName()
            r2.D0H(r1, r0)
            return
        L_0x0392:
            boolean r0 = r11 instanceof X.AnonymousClass6XC
            if (r0 == 0) goto L_0x039e
            X.6XC r2 = (X.AnonymousClass6XC) r2
            X.6ml r0 = r2.A04
            r0.D13()
            return
        L_0x039e:
            boolean r0 = r11 instanceof X.AnonymousClass6X8
            if (r0 == 0) goto L_0x03ac
            X.6X8 r2 = (X.AnonymousClass6X8) r2
            X.6ml r1 = r2.A03
            X.3uh r0 = r2.A01
            r1.CyS(r0)
            return
        L_0x03ac:
            boolean r0 = r11 instanceof X.AnonymousClass6XX
            if (r0 == 0) goto L_0x03ba
            X.6XX r2 = (X.AnonymousClass6XX) r2
            X.6ml r1 = r2.A04
            X.3uh r0 = r2.A02
            r1.Cxo(r0)
            return
        L_0x03ba:
            boolean r0 = r11 instanceof X.AnonymousClass6XG
            if (r0 == 0) goto L_0x03c8
            X.6XG r2 = (X.AnonymousClass6XG) r2
            X.6ml r1 = r2.A04
            X.3uh r0 = r2.A02
            r1.CxC(r0)
            return
        L_0x03c8:
            boolean r0 = r11 instanceof X.AnonymousClass6X7
            if (r0 == 0) goto L_0x0017
            X.6X7 r2 = (X.AnonymousClass6X7) r2
            android.content.Context r0 = r2.A00
            boolean r0 = X.2eO.A00(r0)
            if (r0 != 0) goto L_0x03db
            boolean r0 = r2.A00
            r4 = 1
            if (r0 == 0) goto L_0x03dc
        L_0x03db:
            r4 = 0
        L_0x03dc:
            X.3uh r3 = r2.A02
            X.1Xj r1 = r3.A0b
            if (r1 == 0) goto L_0x0426
            com.instagram.common.session.UserSession r0 = r2.A01
            boolean r0 = X.C63402KwN.A00(r0, r1)
            if (r0 == 0) goto L_0x0426
            X.6ml r1 = r2.A04
            com.instagram.user.model.User r0 = r3.A0i
            if (r0 == 0) goto L_0x03f8
            java.lang.String r0 = r0.getUsername()
        L_0x03f4:
            r1.DE6(r0)
            return
        L_0x03f8:
            java.lang.String r0 = ""
            goto L_0x03f4
        L_0x03fb:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0403:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x040b:
            java.lang.String r1 = "TranslationAttributionType"
            goto L_0x0410
        L_0x040e:
            java.lang.String r1 = "StoryTemplateAttributionType"
        L_0x0410:
            java.lang.String r0 = "media is null"
            X.0wb.A03(r1, r0)
            return
        L_0x0416:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x041e:
            android.graphics.RectF r0 = X.0nA.A0F(r0)
            r1.DJM(r0, r3, r4)
            return
        L_0x0426:
            X.6ml r1 = r2.A04
            if (r4 == 0) goto L_0x0432
            X.6lO r0 = r2.A03
            X.6lQ r0 = r0.A08
            r1.Cva(r3, r0)
            return
        L_0x0432:
            r1.CvZ(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C308916We.A06():void");
    }

    public final boolean A08() {
        UserSession userSession;
        0Tu r2;
        long j;
        boolean z;
        if (this instanceof AnonymousClass6X6) {
            1Xj r0 = ((AnonymousClass6X6) this).A02.A0b;
            z = false;
            if (r0 != null) {
                ArrayList A3F = r0.A3F();
                0qQ.A0B(A3F, 0);
                MusicOverlayStickerModel A05 = C271404in.A05(A3F);
                if (A05 == null || !A05.A0t) {
                    return true;
                }
            }
        } else if ((this instanceof AnonymousClass6X5) || (this instanceof AnonymousClass6XB) || (this instanceof AnonymousClass6XN) || (this instanceof C309006Wn) || (this instanceof C309096Wx) || (this instanceof AnonymousClass6XL) || (this instanceof AnonymousClass6XH) || (this instanceof AnonymousClass6XG) || (this instanceof AnonymousClass6XA) || (this instanceof AnonymousClass6XE)) {
            return true;
        } else {
            if (this instanceof AnonymousClass6X7) {
                z = false;
                if (((AnonymousClass6X7) this).A02.A0b != null) {
                    return true;
                }
            } else if (this instanceof C309046Wr) {
                return false;
            } else {
                if (this instanceof C308976Wk) {
                    C308976Wk r02 = (C308976Wk) this;
                    return r02.A07.contains(r02.A01());
                } else if (this instanceof C309026Wp) {
                    return true;
                } else {
                    if (this instanceof AnonymousClass6XK) {
                        userSession = this.A01;
                        r2 = 0Tu.A05;
                        j = 36320223434907761L;
                    } else if ((this instanceof AnonymousClass6XP) || (this instanceof AnonymousClass6X4) || (this instanceof AnonymousClass6XX) || (this instanceof C309116Wz) || (this instanceof AnonymousClass6XV)) {
                        return true;
                    } else {
                        if (this instanceof C308966Wj) {
                            C255773uh r1 = ((C308966Wj) this).A01;
                            1Xj r03 = r1.A0b;
                            if (r03 == null || !r03.A5l()) {
                                return false;
                            }
                            boolean A0z = r1.A0z();
                            z = true;
                            if (!A0z) {
                                return false;
                            }
                        } else if (this instanceof C308986Wl) {
                            return false;
                        } else {
                            if (this instanceof C308996Wm) {
                                return true;
                            }
                            if ((this instanceof C309016Wo) || (this instanceof C308956Wi) || (this instanceof C309036Wq)) {
                                return false;
                            }
                            if (this instanceof C309056Ws) {
                                return A09();
                            }
                            if (this instanceof AnonymousClass6XM) {
                                return true;
                            }
                            if ((this instanceof AnonymousClass6XJ) || (this instanceof C308936Wg) || (this instanceof AnonymousClass6X0)) {
                                return false;
                            }
                            if ((this instanceof C308946Wh) || (this instanceof C309076Wv) || (this instanceof AnonymousClass6X9) || (this instanceof C308906Wd)) {
                                return true;
                            }
                            if (this instanceof AnonymousClass6XU) {
                                userSession = this.A01;
                                r2 = 0Tu.A05;
                                j = 36327258591869206L;
                            } else if (this instanceof AnonymousClass6XR) {
                                return true;
                            } else {
                                if (this instanceof AnonymousClass6X1) {
                                    return false;
                                }
                                if (this instanceof AnonymousClass6XT) {
                                    userSession = this.A01;
                                    r2 = 0Tu.A05;
                                    j = 36325480475014122L;
                                } else if ((this instanceof C309106Wy) || (this instanceof C309086Ww) || (this instanceof AnonymousClass6XI) || (this instanceof AnonymousClass6XF) || (this instanceof AnonymousClass6X2) || (this instanceof AnonymousClass6XQ)) {
                                    return true;
                                } else {
                                    if (this instanceof C308926Wf) {
                                        return false;
                                    }
                                    if (this instanceof C309066Wt) {
                                        return true;
                                    }
                                    if (this instanceof AnonymousClass6XO) {
                                        return false;
                                    }
                                    if ((this instanceof AnonymousClass6XW) || (this instanceof AnonymousClass6XZ) || (this instanceof AnonymousClass6XY) || (this instanceof AnonymousClass6XC)) {
                                        return true;
                                    }
                                    if (!(this instanceof AnonymousClass6X8)) {
                                        return false;
                                    }
                                    C255773uh r22 = ((AnonymousClass6X8) this).A01;
                                    if (r22.A0e != C250963mL.MEDIA) {
                                        return false;
                                    }
                                    1Xj r04 = r22.A0b;
                                    r04.getClass();
                                    List C0D = r04.A0C.C0D();
                                    if (C0D == null) {
                                        return false;
                                    }
                                    C0D.isEmpty();
                                    return false;
                                }
                            }
                        }
                    }
                    return 182.A06(r2, userSession, j);
                }
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007c, code lost:
        if (r1 != false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x06bf, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x06c5, code lost:
        if (X.1Xj.A0X(r1) == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x06cf, code lost:
        if (X.1Xj.A0X(r1).isEmpty() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:?, code lost:
        return true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028 A[EDGE_INSN: B:480:0x0028->B:11:0x0028 ?: BREAK  
    EDGE_INSN: B:483:0x0028->B:11:0x0028 ?: BREAK  , ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:423:0x06ad  */
    /* JADX WARNING: Removed duplicated region for block: B:483:0x0028 A[EDGE_INSN: B:483:0x0028->B:11:0x0028 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A09() {
        /*
            r9 = this;
            boolean r0 = r9 instanceof X.C308976Wk
            if (r0 == 0) goto L_0x002a
            r2 = r9
            X.6Wk r2 = (X.C308976Wk) r2
            X.3uh r1 = r2.A03
            boolean r0 = r1.CWu()
            if (r0 == 0) goto L_0x0028
            X.1Xj r0 = r1.A0b
            if (r0 == 0) goto L_0x0798
            X.1Xy r0 = r0.A0C
            X.JSO r0 = r0.CGF()
            if (r0 == 0) goto L_0x0028
            java.util.Set r1 = r2.A07
            com.instagram.model.reels.ReelHeaderAttributionType r0 = r2.A01()
            boolean r0 = r1.contains(r0)
        L_0x0025:
            r1 = 1
            if (r0 != 0) goto L_0x0029
        L_0x0028:
            r1 = 0
        L_0x0029:
            return r1
        L_0x002a:
            boolean r0 = r9 instanceof X.C308986Wl
            if (r0 == 0) goto L_0x005c
            r0 = r9
            X.6Wl r0 = (X.C308986Wl) r0
            X.3uh r2 = r0.A01
            X.3mL r1 = r2.A0e
            X.3mL r0 = X.C250963mL.MEDIA
            if (r1 != r0) goto L_0x0028
            X.1Xj r2 = r2.A0b
            r2.getClass()
            X.1Xy r0 = r2.A0C
            X.DT3 r0 = r0.CDu()
            r1 = 1
            if (r0 == 0) goto L_0x0028
            boolean r0 = r0.CQ3()
            if (r0 != r1) goto L_0x0028
            X.1Xy r0 = r2.A0C
            X.DT3 r0 = r0.CDu()
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = r0.CDt()
            if (r0 != 0) goto L_0x0029
            goto L_0x0028
        L_0x005c:
            boolean r0 = r9 instanceof X.C308996Wm
            if (r0 == 0) goto L_0x0082
            r0 = r9
            X.6Wm r0 = (X.C308996Wm) r0
            X.3uh r0 = r0.A01
            X.1Xj r0 = r0.A0b
            if (r0 == 0) goto L_0x007e
            X.1Xy r0 = r0.A0C
            com.instagram.api.schemas.StoryUnlockableStickerTappableObject r0 = r0.C1O()
            if (r0 == 0) goto L_0x007e
            java.util.List r0 = r0.Bzq()
            if (r0 == 0) goto L_0x007e
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x007f
        L_0x007e:
            r0 = 1
        L_0x007f:
            r1 = r0 ^ 1
            return r1
        L_0x0082:
            boolean r0 = r9 instanceof X.C309006Wn
            if (r0 == 0) goto L_0x0090
            r0 = r9
            X.6Wn r0 = (X.C309006Wn) r0
            X.3uh r0 = r0.A02
            boolean r1 = r0.A10()
            return r1
        L_0x0090:
            boolean r0 = r9 instanceof X.C309016Wo
            if (r0 == 0) goto L_0x00a2
            r2 = r9
            X.6Wo r2 = (X.C309016Wo) r2
            X.3mM r0 = r2.A01
            com.instagram.model.reels.Reel r1 = r0.A0H
            com.instagram.common.session.UserSession r0 = r2.A01
            boolean r1 = r1.A18(r0)
            return r1
        L_0x00a2:
            boolean r0 = r9 instanceof X.C308956Wi
            if (r0 == 0) goto L_0x00c9
            r2 = r9
            X.6Wi r2 = (X.C308956Wi) r2
            X.3mM r0 = r2.A03
            com.instagram.model.reels.Reel r1 = r0.A0H
            boolean r0 = r1.A0q()
            if (r0 != 0) goto L_0x00c7
            boolean r0 = r1.A0u()
            if (r0 == 0) goto L_0x0028
            X.3uh r0 = r2.A02
            com.instagram.user.model.User r0 = r0.A0i
            if (r0 == 0) goto L_0x0028
            com.instagram.user.model.FollowStatus r1 = r0.B6o()
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A06
            if (r1 != r0) goto L_0x0028
        L_0x00c7:
            r1 = 1
            return r1
        L_0x00c9:
            boolean r0 = r9 instanceof X.C309026Wp
            if (r0 == 0) goto L_0x00e1
            r0 = r9
            X.6Wp r0 = (X.C309026Wp) r0
            X.3uh r1 = r0.A02
            boolean r0 = r1.A1j()
            if (r0 == 0) goto L_0x0028
            boolean r0 = r1.A1K()
        L_0x00dc:
            r1 = 1
            if (r0 == 0) goto L_0x0029
            goto L_0x0028
        L_0x00e1:
            boolean r0 = r9 instanceof X.C309036Wq
            if (r0 == 0) goto L_0x00ef
            r0 = r9
            X.6Wq r0 = (X.C309036Wq) r0
            X.3uh r0 = r0.A01
            boolean r1 = r0.A1i()
            return r1
        L_0x00ef:
            boolean r0 = r9 instanceof X.C309046Wr
            if (r0 == 0) goto L_0x00fd
            r0 = r9
            X.6Wr r0 = (X.C309046Wr) r0
            X.3uh r0 = r0.A01
            boolean r1 = r0.A1E()
            return r1
        L_0x00fd:
            boolean r0 = r9 instanceof X.C309056Ws
            if (r0 == 0) goto L_0x0131
            r3 = r9
            X.6Ws r3 = (X.C309056Ws) r3
            com.instagram.user.model.User r2 = r3.A04
            X.3uh r0 = r3.A01
            X.1Xj r1 = r0.A0b
            if (r2 == 0) goto L_0x0028
            boolean r0 = X.AnonymousClass3ZQ.A03(r2)
            if (r0 == 0) goto L_0x0028
            if (r1 == 0) goto L_0x0028
            com.instagram.common.session.UserSession r0 = r3.A01
            X.70U r3 = new X.70U
            r3.<init>(r0)
            java.lang.String r5 = r2.getId()
            X.4Cl r0 = r2.A03
            java.lang.String r6 = r0.C9f()
            X.RIv r4 = X.C8956RIv.STORIES
            r8 = 0
            java.lang.String r7 = r1.A2n()
            r3.A00(r4, r5, r6, r7, r8)
            r1 = 1
            return r1
        L_0x0131:
            boolean r0 = r9 instanceof X.C308966Wj
            if (r0 == 0) goto L_0x0154
            r0 = r9
            X.6Wj r0 = (X.C308966Wj) r0
            X.3uh r1 = r0.A01
            boolean r0 = r1.A0z()
            if (r0 != 0) goto L_0x00c7
            X.1Xj r1 = r1.A0b
            if (r1 == 0) goto L_0x0028
            boolean r0 = r1.A5l()
            if (r0 != 0) goto L_0x00c7
            X.1Xy r0 = r1.A0C
            X.3ZV r0 = r0.AaD()
            if (r0 == 0) goto L_0x0028
            goto L_0x00c7
        L_0x0154:
            boolean r0 = r9 instanceof X.AnonymousClass6XM
            if (r0 == 0) goto L_0x016f
            r1 = r9
            X.6XM r1 = (X.AnonymousClass6XM) r1
            com.instagram.user.model.User r0 = r1.A06
            if (r0 == 0) goto L_0x0028
            X.3ui r0 = r1.A03
            if (r0 == 0) goto L_0x016d
            java.lang.String r1 = r0.A1g
        L_0x0165:
            java.lang.String r0 = "photo_credit_immersive"
            boolean r0 = X.0qQ.A0K(r1, r0)
            goto L_0x0025
        L_0x016d:
            r1 = 0
            goto L_0x0165
        L_0x016f:
            boolean r0 = r9 instanceof X.AnonymousClass6XJ
            if (r0 != 0) goto L_0x0028
            boolean r0 = r9 instanceof X.C308936Wg
            if (r0 == 0) goto L_0x018b
            r1 = r9
            X.6Wg r1 = (X.C308936Wg) r1
            X.3uh r0 = r1.A02
            boolean r0 = r0.A1e()
            if (r0 == 0) goto L_0x0028
            X.3BK r0 = r1.A03
            java.lang.Long r0 = r0.A00
            r1 = 1
            if (r0 != 0) goto L_0x0029
            goto L_0x0028
        L_0x018b:
            boolean r0 = r9 instanceof X.AnonymousClass6XA
            if (r0 == 0) goto L_0x01a5
            r2 = r9
            X.6XA r2 = (X.AnonymousClass6XA) r2
            X.3uh r1 = r2.A01
            boolean r0 = r1.A1d()
            if (r0 == 0) goto L_0x0028
            com.instagram.common.session.UserSession r0 = r2.A01
            java.lang.Long r0 = r1.A0O(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0029
            goto L_0x0028
        L_0x01a5:
            boolean r0 = r9 instanceof X.AnonymousClass6X0
            if (r0 == 0) goto L_0x01cc
            r2 = r9
            X.6X0 r2 = (X.AnonymousClass6X0) r2
            com.instagram.model.reels.Reel r0 = r2.A01
            boolean r0 = r0.A0l()
            r1 = 1
            if (r0 == 0) goto L_0x0028
            X.3uh r0 = r2.A03
            X.1Xj r0 = r0.A0b
            if (r0 == 0) goto L_0x0028
            X.1Xy r0 = r0.A0C
            java.lang.Boolean r2 = r0.Cds()
        L_0x01c1:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != r1) goto L_0x0028
            return r1
        L_0x01cc:
            boolean r0 = r9 instanceof X.C308946Wh
            if (r0 == 0) goto L_0x01e1
            r0 = r9
            X.6Wh r0 = (X.C308946Wh) r0
            X.3uh r0 = r0.A02
            X.1Xj r0 = r0.A0b
            r1 = 1
            if (r0 == 0) goto L_0x0028
            X.1Xy r0 = r0.A0C
            java.lang.Boolean r2 = r0.CaF()
            goto L_0x01c1
        L_0x01e1:
            boolean r0 = r9 instanceof X.C309076Wv
            if (r0 == 0) goto L_0x01fd
            r0 = r9
            X.6Wv r0 = (X.C309076Wv) r0
            X.3uh r0 = r0.A02
            java.util.List r2 = r0.A0b()
            r1 = 1
            if (r2 == 0) goto L_0x0028
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L_0x072f
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x072f
            goto L_0x0028
        L_0x01fd:
            boolean r0 = r9 instanceof X.AnonymousClass6XK
            if (r0 == 0) goto L_0x020d
            r0 = r9
            X.6XK r0 = (X.AnonymousClass6XK) r0
            X.3uh r1 = r0.A02
            X.3WT r0 = X.AnonymousClass3WT.POLAROID_STICKER
            boolean r1 = r1.A1t(r0)
            return r1
        L_0x020d:
            boolean r0 = r9 instanceof X.AnonymousClass6X9
            if (r0 == 0) goto L_0x0224
            r2 = r9
            X.6X9 r2 = (X.AnonymousClass6X9) r2
            X.3BQ r1 = r2.A02
            X.3BQ r0 = X.AnonymousClass3BQ.DIRECT
            if (r1 != r0) goto L_0x0028
            X.3mM r0 = r2.A01
            com.instagram.model.reels.Reel r0 = r0.A0H
            boolean r0 = r0.A0b()
            goto L_0x0025
        L_0x0224:
            boolean r0 = r9 instanceof X.C309116Wz
            if (r0 == 0) goto L_0x0241
            r2 = r9
            X.6Wz r2 = (X.C309116Wz) r2
            com.instagram.model.reels.Reel r0 = r2.A01
            java.lang.String r0 = r0.A0o
            if (r0 == 0) goto L_0x0028
            X.3uh r0 = r2.A03
            java.lang.String r1 = r0.A0j
            X.0eM r0 = r2.A07
            java.lang.Object r0 = r0.getValue()
            boolean r0 = X.0qQ.A0K(r1, r0)
            goto L_0x0025
        L_0x0241:
            boolean r0 = r9 instanceof X.AnonymousClass6X6
            if (r0 == 0) goto L_0x0263
            r0 = r9
            X.6X6 r0 = (X.AnonymousClass6X6) r0
            X.3uh r2 = r0.A02
            boolean r0 = r2.CWu()
            r1 = 0
            if (r0 == 0) goto L_0x0029
            X.1Xj r0 = r2.A0b
            if (r0 == 0) goto L_0x0029
            java.util.List r0 = r2.A0b()
            if (r0 == 0) goto L_0x0029
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = X.C271404in.A06(r0)
            if (r0 == 0) goto L_0x0029
            goto L_0x00c7
        L_0x0263:
            boolean r0 = r9 instanceof X.C308906Wd
            if (r0 == 0) goto L_0x02b4
            r5 = r9
            X.6Wd r5 = (X.C308906Wd) r5
            com.instagram.common.session.UserSession r3 = r5.A01
            X.0Tu r2 = X.0Tu.A06
            r0 = 36319901312556751(0x8108c200031ecf, double:3.032190066340198E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r1 = 0
            if (r0 != 0) goto L_0x0029
            X.3uh r0 = r5.A04
            X.1Xj r0 = r0.A0b
            if (r0 == 0) goto L_0x0029
            X.1Xy r0 = r0.A0C
            X.DSP r0 = r0.C1N()
            if (r0 == 0) goto L_0x0029
            java.util.List r0 = r0.AdE()
            if (r0 == 0) goto L_0x0029
            java.util.Iterator r4 = r0.iterator()
        L_0x0292:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0029
            java.lang.Object r3 = r4.next()
            X.DTS r3 = (X.DTS) r3
            com.instagram.api.schemas.StoryTextAttributionType r2 = r3.AdA()
            com.instagram.api.schemas.StoryTextAttributionType r0 = com.instagram.api.schemas.StoryTextAttributionType.MULTIPLE_LISTS
            if (r2 != r0) goto L_0x0292
            java.lang.String r0 = r3.getText()
            r5.A00 = r0
            java.util.List r0 = r3.Agp()
            r5.A01 = r0
            r1 = 1
            return r1
        L_0x02b4:
            boolean r0 = r9 instanceof X.AnonymousClass6XU
            if (r0 == 0) goto L_0x02dc
            r2 = r9
            X.6XU r2 = (X.AnonymousClass6XU) r2
            X.3uh r1 = r2.A02
            boolean r0 = r1.CWu()
            if (r0 == 0) goto L_0x0028
            java.lang.Integer r0 = r2.A05
            if (r0 == 0) goto L_0x0028
            boolean r0 = r1.A1K()
            if (r0 != 0) goto L_0x0028
            com.instagram.common.session.UserSession r3 = r2.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327258591803669(0x810f7300073915, double:3.0368428393613344E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            goto L_0x0025
        L_0x02dc:
            boolean r0 = r9 instanceof X.AnonymousClass6XP
            if (r0 == 0) goto L_0x02ec
            r0 = r9
            X.6XP r0 = (X.AnonymousClass6XP) r0
            java.lang.String r0 = r0.A06
            boolean r0 = X.0mp.A0B(r0)
            r1 = r0 ^ 1
            return r1
        L_0x02ec:
            boolean r0 = r9 instanceof X.AnonymousClass6XN
            if (r0 == 0) goto L_0x030b
            r1 = r9
            X.6XN r1 = (X.AnonymousClass6XN) r1
            com.instagram.user.model.User r0 = r1.A05
            if (r0 == 0) goto L_0x0028
            X.3uh r1 = r1.A02
            boolean r0 = r1.CcK()
            if (r0 != 0) goto L_0x0028
            X.1Xj r0 = r1.A0b
            if (r0 == 0) goto L_0x00c7
            boolean r0 = r0.A5l()
            if (r0 != 0) goto L_0x0028
            goto L_0x00c7
        L_0x030b:
            boolean r0 = r9 instanceof X.AnonymousClass6XL
            if (r0 == 0) goto L_0x031b
            r0 = r9
            X.6XL r0 = (X.AnonymousClass6XL) r0
            X.3mM r0 = r0.A03
            com.instagram.model.reels.Reel r0 = r0.A0H
            boolean r1 = r0.A0k()
            return r1
        L_0x031b:
            boolean r0 = r9 instanceof X.AnonymousClass6XR
            if (r0 == 0) goto L_0x0355
            r4 = r9
            X.6XR r4 = (X.AnonymousClass6XR) r4
            X.3uh r3 = r4.A03
            boolean r2 = r3.CWu()
            r1 = 1
            if (r2 == 0) goto L_0x066e
            X.8hK r0 = r4.A01
            if (r0 == 0) goto L_0x066e
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r3.A0J()
            if (r0 == 0) goto L_0x066e
            boolean r0 = r0.A0F()
            if (r0 != r1) goto L_0x066e
            com.instagram.common.session.UserSession r4 = r4.A01
            X.0Tu r0 = X.0Tu.A05
            r2 = 36319918495768327(0x8108c600361f07, double:3.03220093307239E-306)
            boolean r0 = X.182.A06(r0, r4, r2)
            if (r0 != 0) goto L_0x0029
            java.lang.Boolean r0 = X.C364778lz.A00(r4)
            boolean r0 = r0.booleanValue()
        L_0x0352:
            if (r0 == 0) goto L_0x0028
            return r1
        L_0x0355:
            boolean r0 = r9 instanceof X.AnonymousClass6X1
            if (r0 == 0) goto L_0x0387
            r1 = r9
            X.6X1 r1 = (X.AnonymousClass6X1) r1
            com.instagram.common.session.UserSession r0 = r1.A01
            boolean r0 = X.2R8.A00(r0)
            if (r0 == 0) goto L_0x0028
            X.3uh r2 = r1.A00
            boolean r0 = r2.A1L()
            if (r0 != 0) goto L_0x00c7
            X.3mL r1 = r2.A0e
            X.3mL r0 = X.C250963mL.MEDIA
            if (r1 != r0) goto L_0x0028
            X.1Xj r0 = r2.A0b
            r0.getClass()
            X.1Xy r0 = r0.A0C
            java.lang.Boolean r0 = r0.CTL()
            if (r0 == 0) goto L_0x0028
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0028
            goto L_0x00c7
        L_0x0387:
            boolean r0 = r9 instanceof X.AnonymousClass6XT
            if (r0 == 0) goto L_0x0395
            r0 = r9
            X.6XT r0 = (X.AnonymousClass6XT) r0
            X.3uh r0 = r0.A02
            boolean r1 = r0.A1K()
            return r1
        L_0x0395:
            boolean r0 = r9 instanceof X.C309106Wy
            if (r0 == 0) goto L_0x03ce
            r4 = r9
            X.6Wy r4 = (X.C309106Wy) r4
            X.3uh r3 = r4.A02
            X.1Xj r0 = r3.A0b
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0029
            X.1Xy r0 = r0.A0C
            X.50l r0 = r0.BDc()
            if (r0 == 0) goto L_0x0029
            java.util.List r0 = r0.AZX()
            if (r0 == 0) goto L_0x0029
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r2) goto L_0x0029
            X.3BQ r2 = r4.A03
            X.3BQ r0 = X.AnonymousClass3BQ.PROFILE_HIGHLIGHTS_TRAY
            if (r2 == r0) goto L_0x0029
            X.3BQ r0 = X.AnonymousClass3BQ.HIGHLIGHTS_ATTRIBUTION
            if (r2 == r0) goto L_0x0029
            X.3BQ r0 = X.AnonymousClass3BQ.HIGHLIGHTS_INDICATOR
            if (r2 == r0) goto L_0x0029
            boolean r0 = r3.A0P
            if (r0 == 0) goto L_0x0029
            goto L_0x00c7
        L_0x03ce:
            boolean r0 = r9 instanceof X.C309096Wx
            if (r0 == 0) goto L_0x0407
            r4 = r9
            X.6Wx r4 = (X.C309096Wx) r4
            X.3uh r3 = r4.A02
            X.1Xj r0 = r3.A0b
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0029
            X.1Xy r0 = r0.A0C
            X.50l r0 = r0.BDc()
            if (r0 == 0) goto L_0x0029
            java.util.List r0 = r0.AZX()
            if (r0 == 0) goto L_0x0029
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r2) goto L_0x0029
            X.3BQ r2 = r4.A03
            X.3BQ r0 = X.AnonymousClass3BQ.PROFILE_HIGHLIGHTS_TRAY
            if (r2 == r0) goto L_0x0029
            X.3BQ r0 = X.AnonymousClass3BQ.HIGHLIGHTS_ATTRIBUTION
            if (r2 == r0) goto L_0x0029
            X.3BQ r0 = X.AnonymousClass3BQ.HIGHLIGHTS_INDICATOR
            if (r2 == r0) goto L_0x0029
            boolean r0 = r3.A0P
            if (r0 != 0) goto L_0x0029
            goto L_0x00c7
        L_0x0407:
            boolean r0 = r9 instanceof X.C309086Ww
            if (r0 == 0) goto L_0x0419
            r0 = r9
            X.6Ww r0 = (X.C309086Ww) r0
            X.3uh r0 = r0.A01
            X.1Xj r0 = r0.A0b
            if (r0 == 0) goto L_0x0028
            boolean r1 = r0.A4j()
            return r1
        L_0x0419:
            boolean r0 = r9 instanceof X.AnonymousClass6XI
            if (r0 == 0) goto L_0x043d
            r0 = r9
            X.6XI r0 = (X.AnonymousClass6XI) r0
            X.3uh r2 = r0.A02
            X.3mL r1 = r2.A0e
            X.3mL r0 = X.C250963mL.MEDIA
            if (r1 != r0) goto L_0x0028
            X.1Xj r0 = r2.A0b
            r0.getClass()
            X.1Xy r0 = r0.A0C
            java.lang.Boolean r1 = r0.BBF()
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = X.0qQ.A0K(r1, r0)
            return r1
        L_0x043d:
            boolean r0 = r9 instanceof X.AnonymousClass6XH
            if (r0 == 0) goto L_0x0458
            r0 = r9
            X.6XH r0 = (X.AnonymousClass6XH) r0
            X.3uh r3 = r0.A03
            com.instagram.common.session.UserSession r2 = r0.A01
            X.3mL r1 = r3.A0e
            X.3mL r0 = X.C250963mL.MEDIA
            if (r1 != r0) goto L_0x0028
            X.1Xj r0 = r3.A0b
            r0.getClass()
            boolean r1 = r0.A6Y(r2)
            return r1
        L_0x0458:
            boolean r0 = r9 instanceof X.AnonymousClass6XF
            if (r0 != 0) goto L_0x0028
            boolean r0 = r9 instanceof X.AnonymousClass6X2
            if (r0 == 0) goto L_0x046a
            r0 = r9
            X.6X2 r0 = (X.AnonymousClass6X2) r0
            com.instagram.user.model.User r0 = r0.A06
            r1 = 0
            if (r0 == 0) goto L_0x0029
            goto L_0x00c7
        L_0x046a:
            boolean r0 = r9 instanceof X.AnonymousClass6XQ
            if (r0 == 0) goto L_0x0488
            r4 = r9
            X.6XQ r4 = (X.AnonymousClass6XQ) r4
            com.instagram.common.session.UserSession r3 = r4.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319424570989969(0x81085300001d91, double:3.031888573053681E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0028
            X.3uh r0 = r4.A01
            boolean r0 = r0.A1c()
            goto L_0x0025
        L_0x0488:
            boolean r0 = r9 instanceof X.C308926Wf
            if (r0 == 0) goto L_0x04bb
            r3 = r9
            X.6Wf r3 = (X.C308926Wf) r3
            X.3uh r2 = r3.A01
            X.3mL r1 = r2.A0e
            X.3mL r0 = X.C250963mL.MEDIA
            if (r1 != r0) goto L_0x0028
            X.1Xj r0 = r2.A0b
            r0.getClass()
            X.1Xy r0 = r0.A0C
            java.lang.Boolean r1 = r0.CTk()
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0028
            boolean r0 = r2.A1e()
            if (r0 != 0) goto L_0x0028
            X.3BK r0 = r3.A02
            boolean r0 = r0.A02(r2)
            goto L_0x00dc
        L_0x04bb:
            boolean r0 = r9 instanceof X.C309066Wt
            if (r0 == 0) goto L_0x04f6
            r3 = r9
            X.6Wt r3 = (X.C309066Wt) r3
            X.3uh r0 = r3.A03
            java.util.List r2 = r0.A0b()
            r1 = 1
            if (r2 == 0) goto L_0x0028
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L_0x04d7
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x04d7
            goto L_0x0028
        L_0x04d7:
            java.util.Iterator r2 = r2.iterator()
        L_0x04db:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r2.next()
            X.3ui r0 = (X.C255783ui) r0
            X.BEf r0 = r0.A0G
            if (r0 == 0) goto L_0x04db
            com.instagram.common.session.UserSession r4 = r3.A01
            X.0Tu r0 = X.0Tu.A05
            r2 = 36320081701183437(0x8108ec00031fcd, double:3.032304144834081E-306)
            goto L_0x067d
        L_0x04f6:
            boolean r0 = r9 instanceof X.AnonymousClass6XB
            if (r0 == 0) goto L_0x051e
            r2 = r9
            X.6XB r2 = (X.AnonymousClass6XB) r2
            X.3uh r4 = r2.A03
            r1 = 1
            if (r4 == 0) goto L_0x0028
            boolean r0 = r4.CWu()
            if (r0 != r1) goto L_0x0028
            android.content.Context r3 = r2.A00
            com.instagram.common.session.UserSession r2 = r2.A01
            X.1Xj r0 = r4.A0b
            if (r0 == 0) goto L_0x051c
            X.1Xy r0 = r0.A0C
            com.instagram.feed.media.CreativeConfigIntf r0 = r0.AsO()
        L_0x0516:
            boolean r0 = X.C309136Xb.A01(r3, r2, r0)
            goto L_0x0352
        L_0x051c:
            r0 = 0
            goto L_0x0516
        L_0x051e:
            boolean r0 = r9 instanceof X.AnonymousClass6XV
            if (r0 == 0) goto L_0x0558
            r3 = r9
            X.6XV r3 = (X.AnonymousClass6XV) r3
            X.3uh r0 = r3.A02
            X.1Xj r2 = r0.A0b
            r1 = 1
            if (r2 == 0) goto L_0x0028
            com.instagram.common.session.UserSession r4 = r3.A01
            X.1Xy r0 = r2.A0C
            java.util.List r0 = r0.Av2()
            if (r0 == 0) goto L_0x053f
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r1) goto L_0x053f
            return r1
        L_0x053f:
            X.1Xy r0 = r2.A0C
            java.util.List r0 = r0.Av3()
            if (r0 == 0) goto L_0x0028
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r1) goto L_0x0028
            X.0Tu r0 = X.0Tu.A05
            r2 = 36323083883129677(0x810ba700002b4d, double:3.0342027367856993E-306)
            goto L_0x067d
        L_0x0558:
            boolean r0 = r9 instanceof X.AnonymousClass6XO
            if (r0 == 0) goto L_0x0578
            r2 = r9
            X.6XO r2 = (X.AnonymousClass6XO) r2
            X.3uh r0 = r2.A02
            X.3QO r1 = r0.A0B()
            X.3QO r0 = X.AnonymousClass3QO.CLOSE_FRIENDS
            if (r1 != r0) goto L_0x0028
            com.instagram.common.session.UserSession r3 = r2.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316912015315656(0x81060a000312c8, double:3.0302996227279955E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            goto L_0x0025
        L_0x0578:
            boolean r0 = r9 instanceof X.AnonymousClass6X5
            if (r0 == 0) goto L_0x0599
            r0 = r9
            X.6X5 r0 = (X.AnonymousClass6X5) r0
            X.3uh r3 = r0.A03
            boolean r0 = r3.CWu()
            if (r0 == 0) goto L_0x0028
            java.util.List r1 = r3.A0b()
            if (r1 == 0) goto L_0x0028
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x06a3
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x06a3
            goto L_0x0028
        L_0x0599:
            boolean r0 = r9 instanceof X.AnonymousClass6X4
            if (r0 == 0) goto L_0x05b8
            r0 = r9
            X.6X4 r0 = (X.AnonymousClass6X4) r0
            X.3uh r1 = r0.A01
            boolean r0 = r1.CWu()
            if (r0 == 0) goto L_0x0028
            X.1Xj r0 = r1.A0b
            if (r0 == 0) goto L_0x0028
            X.1Xy r0 = r0.A0C
            com.instagram.feed.media.CreativeConfigIntf r0 = r0.AsO()
            boolean r0 = X.C309126Xa.A01(r0)
            goto L_0x0025
        L_0x05b8:
            boolean r0 = r9 instanceof X.AnonymousClass6XW
            if (r0 == 0) goto L_0x05c8
            r0 = r9
            X.6XW r0 = (X.AnonymousClass6XW) r0
            java.lang.String r0 = r0.A04
            boolean r0 = X.0mp.A0B(r0)
            r1 = r0 ^ 1
            return r1
        L_0x05c8:
            boolean r0 = r9 instanceof X.AnonymousClass6XE
            if (r0 == 0) goto L_0x05e7
            r0 = r9
            X.6XE r0 = (X.AnonymousClass6XE) r0
            X.3uh r2 = r0.A02
            boolean r0 = r2.CWu()
            r1 = 0
            if (r0 == 0) goto L_0x0029
            X.1Xj r0 = r2.A0b
            r0.getClass()
            X.1Xy r0 = r0.A0C
            X.5OM r0 = r0.As9()
            if (r0 == 0) goto L_0x0029
            goto L_0x00c7
        L_0x05e7:
            boolean r0 = r9 instanceof X.AnonymousClass6XZ
            if (r0 == 0) goto L_0x0606
            r2 = r9
            X.6XZ r2 = (X.AnonymousClass6XZ) r2
            X.3uh r0 = r2.A03
            X.3QO r1 = r0.A0B()
            X.3QO r0 = X.AnonymousClass3QO.HALLPASS
            if (r1 != r0) goto L_0x0028
            X.82k r0 = r2.A01
            if (r0 == 0) goto L_0x0028
            X.3mM r0 = r2.A04
            com.instagram.model.reels.Reel r0 = r0.A0H
            boolean r0 = r0.A0g()
            goto L_0x00dc
        L_0x0606:
            boolean r0 = r9 instanceof X.AnonymousClass6XY
            if (r0 == 0) goto L_0x0616
            r0 = r9
            X.6XY r0 = (X.AnonymousClass6XY) r0
            X.3mM r0 = r0.A02
            com.instagram.model.reels.Reel r0 = r0.A0H
            boolean r1 = r0.A0g()
            return r1
        L_0x0616:
            boolean r0 = r9 instanceof X.AnonymousClass6XC
            if (r0 == 0) goto L_0x0648
            r3 = r9
            X.6XC r3 = (X.AnonymousClass6XC) r3
            X.3uh r2 = r3.A03
            boolean r0 = r2.CWu()
            if (r0 == 0) goto L_0x0028
            android.content.Context r1 = r3.A00
            X.1Xj r0 = r2.A0b
            if (r0 == 0) goto L_0x0646
            X.1Xy r0 = r0.A0C
            com.instagram.feed.media.CreativeConfigIntf r0 = r0.AsO()
        L_0x0631:
            boolean r0 = X.C309146Xc.A00(r1, r0)
            if (r0 == 0) goto L_0x0028
            com.instagram.common.session.UserSession r3 = r3.A01
            X.0Tu r2 = X.0Tu.A06
            r0 = 36311186824036819(0x8100d5000501d3, double:3.026678988709764E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            goto L_0x0025
        L_0x0646:
            r0 = 0
            goto L_0x0631
        L_0x0648:
            boolean r0 = r9 instanceof X.AnonymousClass6XX
            if (r0 == 0) goto L_0x0683
            r3 = r9
            X.6XX r3 = (X.AnonymousClass6XX) r3
            X.3uh r2 = r3.A02
            X.1Xj r0 = r2.A0b
            r1 = 1
            if (r0 == 0) goto L_0x0028
            boolean r0 = r0.A6J()
            if (r0 != r1) goto L_0x0028
            X.3WT r0 = X.AnonymousClass3WT.TEXT_POST_STICKER
            boolean r0 = r2.A1t(r0)
            if (r0 == 0) goto L_0x0028
            com.instagram.common.session.UserSession r4 = r3.A01
            X.0Tu r0 = X.0Tu.A05
            r2 = 36323315811822661(0x810bdd00072c45, double:3.034349409425044E-306)
            goto L_0x067d
        L_0x066e:
            if (r2 == 0) goto L_0x0028
            X.8hK r0 = r4.A01
            if (r0 == 0) goto L_0x0028
            com.instagram.common.session.UserSession r4 = r4.A01
            X.0Tu r0 = X.0Tu.A05
            r2 = 36319918492360414(0x8108c600021ede, double:3.032200930917212E-306)
        L_0x067d:
            boolean r0 = X.182.A06(r0, r4, r2)
            goto L_0x0352
        L_0x0683:
            boolean r0 = r9 instanceof X.AnonymousClass6XG
            if (r0 == 0) goto L_0x06d3
            r2 = r9
            X.6XG r2 = (X.AnonymousClass6XG) r2
            X.3uh r1 = r2.A02
            X.3WT r0 = X.AnonymousClass3WT.AVATAR
            boolean r0 = r1.A1t(r0)
            if (r0 == 0) goto L_0x0028
            com.instagram.common.session.UserSession r3 = r2.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319858362752697(0x8108b800011eb9, double:3.032162904711169E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            goto L_0x00dc
        L_0x06a3:
            java.util.Iterator r2 = r1.iterator()
        L_0x06a7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r2.next()
            X.3ui r0 = (X.C255783ui) r0
            com.instagram.model.mediatype.ProductType r1 = r0.A0m
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.CLIPS
            if (r1 == r0) goto L_0x06bd
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.IGTV
            if (r1 != r0) goto L_0x06a7
        L_0x06bd:
            X.1Xj r1 = r3.A0b
            if (r1 == 0) goto L_0x00c7
            java.util.ArrayList r0 = X.1Xj.A0X(r1)
            if (r0 == 0) goto L_0x00c7
            java.util.ArrayList r0 = X.1Xj.A0X(r1)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00c7
            goto L_0x0028
        L_0x06d3:
            boolean r0 = r9 instanceof X.AnonymousClass6X7
            if (r0 == 0) goto L_0x0744
            r3 = r9
            X.6X7 r3 = (X.AnonymousClass6X7) r3
            X.3uh r2 = r3.A02
            boolean r0 = r2.CWu()
            if (r0 == 0) goto L_0x0028
            X.3mL r1 = r2.A0e
            X.3mL r0 = X.C250963mL.MEDIA
            if (r1 != r0) goto L_0x0028
            X.1Xj r2 = r2.A0b
            r2.getClass()
            X.1Xy r0 = r2.A0C
            X.54e r1 = r0.C09()
            if (r1 == 0) goto L_0x0028
            java.lang.String r0 = r1.getId()
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = r1.getName()
            if (r0 == 0) goto L_0x0028
            X.1Xy r0 = r2.A0C
            X.54e r0 = r0.C09()
            if (r0 == 0) goto L_0x072d
            java.lang.String r1 = r0.getId()
        L_0x070d:
            java.lang.String r0 = "203979757489108"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c7
            com.instagram.common.session.UserSession r3 = r3.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316327899631845(0x810582000110e5, double:3.0299302256175084E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            X.0qQ.A0A(r0)
            if (r1 == 0) goto L_0x0028
            goto L_0x00c7
        L_0x072d:
            r1 = 0
            goto L_0x070d
        L_0x072f:
            java.util.Iterator r2 = r2.iterator()
        L_0x0733:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r2.next()
            X.3ui r0 = (X.C255783ui) r0
            X.BG5 r0 = r0.A0M
            if (r0 == 0) goto L_0x0733
            return r1
        L_0x0744:
            boolean r0 = r9 instanceof X.AnonymousClass6XD
            if (r0 == 0) goto L_0x0752
            r0 = r9
            X.6XD r0 = (X.AnonymousClass6XD) r0
            X.3uh r0 = r0.A01
            boolean r1 = r0.A12()
            return r1
        L_0x0752:
            r4 = r9
            X.6X8 r4 = (X.AnonymousClass6X8) r4
            X.3uh r3 = r4.A01
            boolean r0 = r3.CWu()
            r1 = 1
            if (r0 == 0) goto L_0x0028
            X.3mL r2 = r3.A0e
            X.3mL r0 = X.C250963mL.MEDIA
            if (r2 != r0) goto L_0x0028
            X.1Xj r2 = r3.A0b
            r2.getClass()
            X.1Xy r0 = r2.A0C
            java.util.List r0 = r0.C0D()
            if (r0 == 0) goto L_0x0028
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0028
            java.lang.String r2 = r2.A2z()
            java.lang.String r0 = "FB_TO_IG_XPOST"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0029
            com.instagram.common.session.UserSession r3 = r4.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314463883758141(0x8103d000000a3d, double:3.0287514144731885E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            X.0qQ.A0A(r0)
            return r1
        L_0x0798:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C308916We.A09():boolean");
    }

    public C308916We(AnonymousClass0iw r2, UserSession userSession, C255773uh r4) {
        this.A01 = userSession;
        this.A02 = r2;
        this.A04 = r4;
        this.A03 = AnonymousClass0kN.A01(r2, userSession);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v197, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:1008:0x161a, code lost:
        if (r3 != null) goto L_0x08fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1304:0x1c1f, code lost:
        r4 = 0;
        r7.setText(X.C250563lf.A0F(r8.A00, r8.A01, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1305:0x1c2b, code lost:
        r5.setVisibility(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1306:0x1c2e, code lost:
        r6.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1307:0x1c31, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x0b12, code lost:
        if (r5 != null) goto L_0x1c2e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:1002:0x15db  */
    /* JADX WARNING: Removed duplicated region for block: B:1005:0x15ff  */
    /* JADX WARNING: Removed duplicated region for block: B:1225:0x1add  */
    /* JADX WARNING: Removed duplicated region for block: B:1348:0x1ce7  */
    /* JADX WARNING: Removed duplicated region for block: B:1355:0x1d04  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x04fd  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x051b  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0522  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0542  */
    /* JADX WARNING: Removed duplicated region for block: B:727:0x0f80  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A04() {
        /*
            r25 = this;
            r1 = r25
            boolean r0 = r1 instanceof X.AnonymousClass6X6
            if (r0 == 0) goto L_0x0041
            r5 = r1
            X.6X6 r5 = (X.AnonymousClass6X6) r5
            X.6lO r0 = r5.A03
            X.52z r3 = r0.A07
            X.3uh r1 = r5.A02
            X.3WT r0 = X.AnonymousClass3WT.MUSIC_OVERLAY
            java.util.List r0 = r1.Bkd(r0)
            if (r0 == 0) goto L_0x0039
            java.lang.Object r0 = X.00k.A0J(r0)
            X.3ui r0 = (X.C255783ui) r0
            if (r0 == 0) goto L_0x0039
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r0.A0u
        L_0x0021:
            java.lang.String r4 = "Required value was null."
            if (r0 == 0) goto L_0x003b
            X.4Ke r2 = X.C263314Kg.A02(r0)
            com.instagram.common.session.UserSession r1 = r5.A00
            r0 = 0
            X.C263314Kg.A04(r1, r0, r3, r2)
            android.view.ViewGroup r3 = r3.A01
            if (r3 != 0) goto L_0x08fa
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x0039:
            r0 = 0
            goto L_0x0021
        L_0x003b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x0041:
            boolean r0 = r1 instanceof X.AnonymousClass6XK
            if (r0 == 0) goto L_0x00b1
            r6 = r1
            X.6XK r6 = (X.AnonymousClass6XK) r6
            X.6lO r0 = r6.A03
            X.6lk r5 = r0.A0Z
            android.view.ViewGroup r0 = r5.A00
            if (r0 != 0) goto L_0x0075
            android.view.ViewStub r0 = r5.A03
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r1, r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r5.A00 = r1
            r0 = 2131439543(0x7f0b2fb7, float:1.8501044E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.A01 = r0
            r0 = 2131439542(0x7f0b2fb6, float:1.8501042E38)
            android.view.View r0 = r1.findViewById(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = (com.instagram.common.ui.widget.imageview.IgImageView) r0
            r5.A02 = r0
        L_0x0075:
            android.view.ViewGroup r0 = r5.A00
            r4 = 0
            if (r0 == 0) goto L_0x007d
            r0.setVisibility(r4)
        L_0x007d:
            android.widget.TextView r3 = r5.A01
            if (r3 == 0) goto L_0x0093
            android.content.Context r0 = r6.A00
            android.content.res.Resources r2 = r0.getResources()
            r1 = 2131969527(0x7f1345f7, float:1.957598E38)
            java.lang.String[] r0 = new java.lang.String[r4]
            android.text.Spanned r0 = X.0bC.A01(r2, r0, r1)
            r3.setText(r0)
        L_0x0093:
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r5.A02
            if (r2 == 0) goto L_0x00a7
            android.content.Context r1 = r6.A00
            r0 = 2131099843(0x7f0600c3, float:1.781205E38)
            int r0 = r1.getColor(r0)
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r0)
            r2.setColorFilter(r0)
        L_0x00a7:
            android.view.ViewGroup r0 = r5.A00
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            return r0
        L_0x00b1:
            boolean r0 = r1 instanceof X.AnonymousClass6X5
            if (r0 == 0) goto L_0x0114
            r0 = r1
            X.6X5 r0 = (X.AnonymousClass6X5) r0
            android.content.Context r5 = r0.A00
            com.instagram.common.session.UserSession r2 = r0.A01
            X.6lO r0 = r0.A04
            X.6lS r4 = r0.A0p
            r3 = 0
            r0 = 2
            X.0qQ.A0B(r4, r0)
            r0 = 2131953215(0x7f13063f, float:1.9542895E38)
            java.lang.String r0 = r5.getString(r0)
            X.0qQ.A07(r0)
            android.text.SpannableString r0 = X.0nA.A0G(r0)
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>(r0)
            X.C250563lf.A0M(r5, r1, r2)
            r4.A00()
            android.widget.TextView r0 = r4.A02
            java.lang.String r2 = "Required value was null."
            if (r0 == 0) goto L_0x010e
            r0.setText(r1)
            android.widget.ImageView r1 = r4.A01
            if (r1 == 0) goto L_0x0108
            r0 = 2131238684(0x7f081f1c, float:1.8093654E38)
            r1.setImageResource(r0)
            android.view.ViewGroup r0 = r4.A00
            if (r0 == 0) goto L_0x0102
            r0.setVisibility(r3)
            android.view.ViewGroup r3 = r4.A00
            if (r3 != 0) goto L_0x08fa
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0102:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0108:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x010e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0114:
            boolean r0 = r1 instanceof X.C309096Wx
            if (r0 == 0) goto L_0x01a0
            r2 = r1
            X.6Wx r2 = (X.C309096Wx) r2
            X.6lO r0 = r2.A04
            X.6ld r6 = r0.A0P
            r6.A00()
            android.view.ViewGroup r0 = r6.A01
            r3 = 0
            if (r0 == 0) goto L_0x012a
            r0.setVisibility(r3)
        L_0x012a:
            android.content.Context r7 = r2.A00
            r1 = 2131971526(0x7f134dc6, float:1.9580034E38)
            r8 = 1
            java.lang.String r0 = X.C309096Wx.A00(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r7.getString(r1, r0)
            X.0qQ.A07(r0)
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>(r0)
            java.lang.String r0 = X.C309096Wx.A00(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = r7.getString(r1, r0)
            X.0qQ.A07(r1)
            java.lang.String r0 = X.C309096Wx.A00(r2)
            int r4 = X.00l.A08(r1, r0, r3, r3)
            r0 = 0
            if (r4 < 0) goto L_0x015f
            r0 = 1
        L_0x015f:
            java.lang.String r3 = "Check failed."
            if (r0 == 0) goto L_0x019a
            java.lang.String r1 = X.C309096Wx.A00(r2)
            java.util.regex.Pattern r0 = X.0mp.A00
            int r2 = r1.length()
            int r2 = r2 + r4
            if (r2 < 0) goto L_0x0194
            android.text.style.StyleSpan r1 = new android.text.style.StyleSpan
            r1.<init>(r8)
            r0 = 33
            r5.setSpan(r1, r4, r2, r0)
            android.graphics.drawable.Drawable r0 = X.C306026Km.A00(r7)
            X.C306026Km.A01(r7, r0, r5)
            android.widget.TextView r0 = r6.A02
            if (r0 == 0) goto L_0x0188
            r0.setText(r5)
        L_0x0188:
            android.view.ViewGroup r3 = r6.A01
            if (r3 != 0) goto L_0x08fa
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0194:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x019a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x01a0:
            boolean r0 = r1 instanceof X.AnonymousClass6XB
            if (r0 == 0) goto L_0x034a
            r0 = r1
            X.6XB r0 = (X.AnonymousClass6XB) r0
            com.instagram.common.session.UserSession r12 = r0.A01
            com.instagram.feed.media.CreativeConfigIntf r11 = r0.A02
            X.6lS r1 = r0.A06
            r10 = 0
            r0 = 2
            X.0qQ.A0B(r1, r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            if (r11 != 0) goto L_0x020b
            java.lang.String r1 = "EffectAttributionViewBinder"
            java.lang.String r0 = "Media is null"
            X.0wb.A03(r1, r0)
        L_0x01c0:
            java.util.Iterator r7 = r6.iterator()
        L_0x01c4:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x07e8
            java.lang.Object r1 = r7.next()
            android.view.View r1 = (android.view.View) r1
            r0 = 2131432247(0x7f0b1337, float:1.8486246E38)
            android.view.View r5 = r1.findViewById(r0)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x01c4
            java.lang.CharSequence r4 = r5.getText()
            android.content.Context r3 = r5.getContext()
            X.0qQ.A07(r3)
            X.0qQ.A0A(r4)
            r0 = 1
            X.0qQ.A0B(r4, r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36312020047364989(0x8101970000037d, double:3.02720592249762E-306)
            boolean r0 = X.182.A06(r2, r12, r0)
            if (r0 == 0) goto L_0x0207
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>(r4)
            android.graphics.drawable.Drawable r0 = X.C306026Km.A00(r3)
            X.C306026Km.A01(r3, r0, r1)
            r4 = r1
        L_0x0207:
            r5.setText(r4)
            goto L_0x01c4
        L_0x020b:
            java.util.List r0 = r11.B02()
            if (r0 == 0) goto L_0x0347
            int r9 = r0.size()
        L_0x0215:
            android.view.ViewStub r0 = r1.A03
            android.content.Context r8 = r0.getContext()
            X.0qQ.A07(r8)
            r1.A00()
            android.view.ViewGroup r7 = r1.A00
            if (r7 == 0) goto L_0x01c0
            android.widget.ImageView r5 = r1.A01
            if (r5 == 0) goto L_0x01c0
            android.widget.TextView r4 = r1.A02
            if (r4 == 0) goto L_0x01c0
            java.lang.String r1 = X.C284745Nt.A05(r11)
            com.instagram.model.shopping.ProductItemWithARIntf r0 = r11.B0B()
            if (r0 == 0) goto L_0x0341
            com.instagram.user.model.ProductDetailsProductItemDictIntf r0 = r0.BgJ()
            if (r0 == 0) goto L_0x0341
            com.instagram.user.model.User r0 = r0.BRo()
            if (r0 == 0) goto L_0x0341
            com.instagram.model.shopping.ProductItemWithARIntf r0 = r11.B0B()
            if (r0 == 0) goto L_0x01c0
            com.instagram.user.model.ProductDetailsProductItemDictIntf r0 = r0.BgJ()
            if (r0 == 0) goto L_0x01c0
            com.instagram.user.model.User r0 = r0.BRo()
            if (r0 == 0) goto L_0x01c0
            X.4Cl r0 = r0.A03
            java.lang.String r3 = r0.getUsername()
        L_0x025b:
            if (r3 == 0) goto L_0x01c0
            if (r1 == 0) goto L_0x01c0
            X.6Ku r14 = X.C284745Nt.A03(r11)
            r0 = 0
            r5.setColorFilter(r0)
            com.instagram.model.shopping.ProductItemWithARIntf r0 = r11.B0B()
            r1 = 0
            if (r0 == 0) goto L_0x026f
            r1 = 1
        L_0x026f:
            java.lang.Boolean r0 = X.C306096Kt.A00(r12)
            boolean r0 = r0.booleanValue()
            r2 = 2131231720(0x7f0803e8, float:1.8079529E38)
            if (r0 == 0) goto L_0x027f
            r2 = 2131238248(0x7f081d68, float:1.809277E38)
        L_0x027f:
            if (r1 == 0) goto L_0x02ef
            r0 = 2131238787(0x7f081f83, float:1.8093863E38)
            r13 = 2131100036(0x7f060184, float:1.7812442E38)
            android.graphics.drawable.Drawable r0 = r8.getDrawable(r0)
            if (r0 == 0) goto L_0x02e6
            android.graphics.drawable.Drawable r2 = r0.mutate()
            X.0qQ.A07(r2)
            android.graphics.drawable.Drawable r1 = r2.mutate()
            int r0 = r8.getColor(r13)
            r1.setTint(r0)
        L_0x029f:
            r5.setImageDrawable(r2)
        L_0x02a2:
            r0 = 1
            if (r9 > r0) goto L_0x02c8
            android.content.res.Resources r2 = r8.getResources()
            r1 = 2131961542(0x7f1326c6, float:1.9559784E38)
            java.lang.String r0 = X.C309136Xb.A00(r8, r12, r11)
            java.lang.String[] r0 = new java.lang.String[]{r0, r3}
            android.text.Spanned r0 = X.0bC.A01(r2, r0, r1)
            r4.setText(r0)
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
        L_0x02bd:
            r4.setEllipsize(r0)
            r7.setVisibility(r10)
            r6.add(r7)
            goto L_0x01c0
        L_0x02c8:
            android.content.res.Resources r5 = r8.getResources()
            r2 = 2131820840(0x7f110128, float:1.9274406E38)
            int r9 = r9 - r0
            java.lang.String r1 = X.C309136Xb.A00(r8, r12, r11)
            java.lang.String r0 = java.lang.String.valueOf(r9)
            java.lang.String[] r0 = new java.lang.String[]{r1, r3, r0}
            android.text.Spanned r0 = X.0bC.A02(r5, r0, r2, r9)
            r4.setText(r0)
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.START
            goto L_0x02bd
        L_0x02e6:
            java.lang.String r1 = "EffectAttributionViewBinder"
            java.lang.String r0 = "getTintedDrawable() drawable is null"
            X.0wb.A03(r1, r0)
            r2 = 0
            goto L_0x029f
        L_0x02ef:
            boolean r0 = X.C309146Xc.A00(r8, r11)
            if (r0 == 0) goto L_0x030f
            X.0Tu r13 = X.0Tu.A05
            r0 = 36311186824036819(0x8100d5000501d3, double:3.026678988709764E-306)
            boolean r0 = X.182.A06(r13, r12, r0)
            if (r0 != 0) goto L_0x030f
            java.lang.String r1 = r11.B3W()
            if (r14 == 0) goto L_0x030f
            int r0 = r14.ordinal()
            switch(r0) {
                case 2: goto L_0x0333;
                case 3: goto L_0x0337;
                case 4: goto L_0x0333;
                case 5: goto L_0x033b;
                case 6: goto L_0x030f;
                case 7: goto L_0x030f;
                case 8: goto L_0x0323;
                case 9: goto L_0x030f;
                case 10: goto L_0x0313;
                default: goto L_0x030f;
            }
        L_0x030f:
            r5.setImageResource(r2)
            goto L_0x02a2
        L_0x0313:
            java.util.List r0 = r11.B02()
            if (r0 == 0) goto L_0x031f
            int r0 = r0.size()
            if (r0 != 0) goto L_0x030f
        L_0x031f:
            r2 = 2131238232(0x7f081d58, float:1.8092737E38)
            goto L_0x030f
        L_0x0323:
            java.util.List r0 = r11.B02()
            if (r0 == 0) goto L_0x032f
            int r0 = r0.size()
            if (r0 != 0) goto L_0x030f
        L_0x032f:
            r2 = 2131239104(0x7f0820c0, float:1.8094506E38)
            goto L_0x030f
        L_0x0333:
            r2 = 2131240041(0x7f082469, float:1.8096406E38)
            goto L_0x030f
        L_0x0337:
            r2 = 2131237319(0x7f0819c7, float:1.8090885E38)
            goto L_0x030f
        L_0x033b:
            if (r1 != 0) goto L_0x030f
            r2 = 2131231161(0x7f0801b9, float:1.8078395E38)
            goto L_0x030f
        L_0x0341:
            java.lang.String r3 = X.C284745Nt.A06(r11)
            goto L_0x025b
        L_0x0347:
            r9 = 0
            goto L_0x0215
        L_0x034a:
            boolean r0 = r1 instanceof X.AnonymousClass6XN
            if (r0 == 0) goto L_0x03d6
            r6 = r1
            X.6XN r6 = (X.AnonymousClass6XN) r6
            X.6lO r0 = r6.A03
            X.6lo r5 = r0.A0V
            android.view.View r0 = r5.A00
            if (r0 != 0) goto L_0x0398
            android.view.ViewStub r1 = r5.A04
            r0 = 2131628906(0x7f0e136a, float:1.8885118E38)
            r1.setLayoutResource(r0)
            android.view.View r2 = r1.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r2, r0)
            r5.A00 = r2
            r0 = 0
            if (r2 == 0) goto L_0x03d4
            r1 = 2131428191(0x7f0b035f, float:1.847802E38)
            android.view.View r1 = r2.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
        L_0x0378:
            r5.A01 = r1
            android.view.View r2 = r5.A00
            if (r2 == 0) goto L_0x03d2
            r1 = 2131428197(0x7f0b0365, float:1.8478032E38)
            android.view.View r1 = r2.findViewById(r1)
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = (com.instagram.common.ui.widget.imageview.CircularImageView) r1
        L_0x0387:
            r5.A03 = r1
            android.view.View r1 = r5.A00
            if (r1 == 0) goto L_0x0396
            r0 = 2131428195(0x7f0b0363, float:1.8478028E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0396:
            r5.A02 = r0
        L_0x0398:
            com.instagram.user.model.User r4 = r6.A05
            r3 = 0
            if (r4 == 0) goto L_0x03c6
            android.widget.ImageView r1 = r5.A01
            if (r1 == 0) goto L_0x03a7
            r0 = 2131238720(0x7f081f40, float:1.8093727E38)
            r1.setImageResource(r0)
        L_0x03a7:
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = r5.A03
            if (r2 == 0) goto L_0x03b4
            com.instagram.common.typedurl.ImageUrl r1 = r4.Bh3()
            X.0iw r0 = r6.A00
            r2.setUrl(r1, r0)
        L_0x03b4:
            android.widget.TextView r1 = r5.A02
            if (r1 == 0) goto L_0x03bf
            java.lang.String r0 = r4.getUsername()
            r1.setText(r0)
        L_0x03bf:
            android.view.View r0 = r5.A00
            if (r0 == 0) goto L_0x03c6
            r0.setVisibility(r3)
        L_0x03c6:
            android.view.View r0 = r5.A00
            if (r0 != 0) goto L_0x1bd5
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x03d2:
            r1 = r0
            goto L_0x0387
        L_0x03d4:
            r1 = r0
            goto L_0x0378
        L_0x03d6:
            boolean r0 = r1 instanceof X.C309006Wn
            if (r0 == 0) goto L_0x042a
            r4 = r1
            X.6Wn r4 = (X.C309006Wn) r4
            X.6lO r0 = r4.A03
            X.6lY r3 = r0.A0j
            android.view.ViewGroup r0 = r3.A00
            if (r0 != 0) goto L_0x03ff
            android.view.ViewStub r0 = r3.A02
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r1, r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r3.A00 = r1
            r0 = 2131439618(0x7f0b3002, float:1.8501196E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.A01 = r0
        L_0x03ff:
            android.view.ViewGroup r1 = r3.A00
            if (r1 == 0) goto L_0x0407
            r0 = 0
            r1.setVisibility(r0)
        L_0x0407:
            android.widget.TextView r2 = r3.A01
            if (r2 == 0) goto L_0x0417
            android.content.Context r1 = r4.A00
            r0 = 2131953232(0x7f130650, float:1.954293E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setText(r0)
        L_0x0417:
            android.widget.TextView r1 = r3.A01
            if (r1 == 0) goto L_0x0420
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.2eS.A04(r1, r0)
        L_0x0420:
            android.view.ViewGroup r0 = r3.A00
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            return r0
        L_0x042a:
            boolean r0 = r1 instanceof X.AnonymousClass6XL
            if (r0 == 0) goto L_0x0466
            r4 = r1
            X.6XL r4 = (X.AnonymousClass6XL) r4
            X.6lO r0 = r4.A04
            X.6ll r0 = r0.A0U
            X.2eb r3 = r0.A00
            android.view.View r1 = r3.A01()
            r0 = 0
            r1.setVisibility(r0)
            android.view.View r2 = r3.A01()
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.content.Context r1 = r4.A00
            r0 = 2131953224(0x7f130648, float:1.9542913E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setText(r0)
            android.view.View r1 = r3.A01()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.2eS.A04(r1, r0)
            android.view.View r0 = r3.A01()
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            return r0
        L_0x0466:
            boolean r0 = r1 instanceof X.C309026Wp
            if (r0 == 0) goto L_0x0551
            r9 = r1
            X.6Wp r9 = (X.C309026Wp) r9
            X.3uh r0 = r9.A02
            java.util.List r0 = r0.A0b()
            r8 = 0
            r5 = 1
            r2 = 0
            if (r0 == 0) goto L_0x04e9
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r0.iterator()
        L_0x0481:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x04a8
            java.lang.Object r4 = r6.next()
            r3 = r4
            X.3ui r3 = (X.C255783ui) r3
            X.3WT r1 = r3.A11
            X.3WT r0 = X.AnonymousClass3WT.PROMPT
            if (r1 != r0) goto L_0x0481
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r3.A0F()
            if (r0 == 0) goto L_0x04a6
            com.instagram.api.schemas.StoryPromptType r1 = r0.A03()
        L_0x049e:
            com.instagram.api.schemas.StoryPromptType r0 = com.instagram.api.schemas.StoryPromptType.STORY_TEMPLATE
            if (r1 != r0) goto L_0x0481
            r7.add(r4)
            goto L_0x0481
        L_0x04a6:
            r1 = r8
            goto L_0x049e
        L_0x04a8:
            java.lang.Object r0 = X.00k.A0J(r7)
            X.3ui r0 = (X.C255783ui) r0
            if (r0 == 0) goto L_0x04e9
            com.instagram.reels.prompt.model.PromptStickerModel r1 = r0.A0F()
            if (r1 == 0) goto L_0x04e9
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r1.A00
            int r8 = r0.Bak()
            boolean r1 = r1.A0M()
            r0 = 3
            if (r1 == 0) goto L_0x04c4
            r0 = 2
        L_0x04c4:
            if (r8 <= r0) goto L_0x04e9
            android.content.Context r6 = r9.A00
            android.content.res.Resources r7 = r6.getResources()
            r4 = 2131820563(0x7f110013, float:1.9273844E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            android.content.res.Resources r1 = r6.getResources()
            X.0qQ.A07(r1)
            r0 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r0 = X.C253673rC.A04(r1, r3, r0, r2, r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r4 = r7.getQuantityString(r4, r8, r0)
            goto L_0x04f2
        L_0x04e9:
            android.content.Context r6 = r9.A00
            r0 = 2131953230(0x7f13064e, float:1.9542925E38)
            java.lang.String r4 = r6.getString(r0)
        L_0x04f2:
            X.0qQ.A0A(r4)
            X.6lO r0 = r9.A03
            X.6lZ r3 = r0.A0g
            android.view.ViewGroup r0 = r3.A00
            if (r0 != 0) goto L_0x0517
            android.view.ViewStub r0 = r3.A02
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r1, r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r3.A00 = r1
            r0 = 2131441965(0x7f0b392d, float:1.8505957E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.A01 = r0
        L_0x0517:
            android.view.ViewGroup r0 = r3.A00
            if (r0 == 0) goto L_0x051e
            r0.setVisibility(r2)
        L_0x051e:
            android.widget.TextView r2 = r3.A01
            if (r2 == 0) goto L_0x053e
            r0 = 2131953229(0x7f13064d, float:1.9542923E38)
            java.lang.String r1 = r6.getString(r0)
            X.0qQ.A07(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r4}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
            java.lang.String r0 = java.lang.String.format(r1, r0)
            X.0qQ.A07(r0)
            r2.setText(r0)
        L_0x053e:
            android.widget.TextView r1 = r3.A01
            if (r1 == 0) goto L_0x0547
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.2eS.A04(r1, r0)
        L_0x0547:
            android.view.ViewGroup r0 = r3.A00
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            return r0
        L_0x0551:
            boolean r0 = r1 instanceof X.AnonymousClass6XH
            if (r0 == 0) goto L_0x05f5
            r4 = r1
            X.6XH r4 = (X.AnonymousClass6XH) r4
            X.3uh r0 = r4.A03
            X.1Xj r1 = r0.A0b
            r1.getClass()
            com.instagram.common.session.UserSession r10 = r4.A01
            boolean r7 = X.JUL.A01(r10)
            X.0iw r0 = r4.A01
            java.lang.String r12 = r0.getModuleName()
            java.lang.String r14 = r1.A2n()
            X.9OT r8 = X.AnonymousClass9OT.STORY
            com.instagram.api.schemas.MediaGenAIDetectionMethod r9 = r1.A1I()
            java.lang.String r13 = "genai_transparency_label_impression"
            r11 = 0
            X.C250563lf.A0e(r8, r9, r10, r11, r12, r13, r14)
            X.6lO r0 = r4.A04
            X.6lg r6 = r0.A0M
            android.view.ViewGroup r0 = r6.A00
            if (r0 != 0) goto L_0x05a8
            android.view.ViewStub r0 = r6.A03
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r1, r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r6.A00 = r1
            r0 = 2131439416(0x7f0b2f38, float:1.8500787E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.A01 = r0
            r0 = 2131439417(0x7f0b2f39, float:1.8500789E38)
            android.view.View r0 = r1.findViewById(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = (com.instagram.common.ui.widget.imageview.IgImageView) r0
            r6.A02 = r0
        L_0x05a8:
            android.view.ViewGroup r0 = r6.A00
            r5 = 0
            if (r0 == 0) goto L_0x05b0
            r0.setVisibility(r5)
        L_0x05b0:
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r6.A02
            if (r1 == 0) goto L_0x05bc
            r0 = 0
            if (r7 == 0) goto L_0x05b9
            r0 = 8
        L_0x05b9:
            r1.setVisibility(r0)
        L_0x05bc:
            android.widget.TextView r3 = r6.A01
            if (r3 == 0) goto L_0x05d7
            android.content.Context r0 = r4.A00
            android.content.res.Resources r2 = r0.getResources()
            r1 = 2131963013(0x7f132c85, float:1.9562767E38)
            if (r7 == 0) goto L_0x05ce
            r1 = 2131963014(0x7f132c86, float:1.956277E38)
        L_0x05ce:
            java.lang.String[] r0 = new java.lang.String[r5]
            android.text.Spanned r0 = X.0bC.A01(r2, r0, r1)
            r3.setText(r0)
        L_0x05d7:
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r6.A02
            if (r2 == 0) goto L_0x05eb
            android.content.Context r1 = r4.A00
            r0 = 2131099843(0x7f0600c3, float:1.781205E38)
            int r0 = r1.getColor(r0)
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r0)
            r2.setColorFilter(r0)
        L_0x05eb:
            android.view.ViewGroup r0 = r6.A00
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            return r0
        L_0x05f5:
            boolean r0 = r1 instanceof X.AnonymousClass6XG
            if (r0 == 0) goto L_0x068c
            r7 = r1
            X.6XG r7 = (X.AnonymousClass6XG) r7
            X.6lO r0 = r7.A03
            X.6lf r4 = r0.A09
            android.view.ViewGroup r0 = r4.A00
            if (r0 != 0) goto L_0x0629
            android.view.ViewStub r0 = r4.A03
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r1, r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r4.A00 = r1
            r0 = 2131439360(0x7f0b2f00, float:1.8500673E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.A01 = r0
            r0 = 2131439361(0x7f0b2f01, float:1.8500675E38)
            android.view.View r0 = r1.findViewById(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = (com.instagram.common.ui.widget.imageview.IgImageView) r0
            r4.A02 = r0
        L_0x0629:
            android.view.ViewGroup r0 = r4.A00
            r6 = 0
            if (r0 == 0) goto L_0x0631
            r0.setVisibility(r6)
        L_0x0631:
            android.content.Context r5 = r7.A00
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131953519(0x7f13076f, float:1.9543511E38)
            java.lang.String r0 = r1.getString(r0)
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>(r0)
            java.lang.String r0 = " • "
            r3.append(r0)
            X.6Jl r2 = new X.6Jl
            r2.<init>()
            int r1 = r3.length()
            r0 = 33
            r3.setSpan(r2, r6, r1, r0)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131953518(0x7f13076e, float:1.954351E38)
            java.lang.String r0 = r1.getString(r0)
            r3.append(r0)
            com.instagram.common.session.UserSession r0 = r7.A01
            X.C250563lf.A0M(r5, r3, r0)
            android.widget.TextView r0 = r4.A01
            if (r0 == 0) goto L_0x0670
            r0.setText(r3)
        L_0x0670:
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r4.A02
            if (r1 == 0) goto L_0x0682
            r0 = 2131099843(0x7f0600c3, float:1.781205E38)
            int r0 = r5.getColor(r0)
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r0)
            r1.setColorFilter(r0)
        L_0x0682:
            android.view.ViewGroup r0 = r4.A00
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            return r0
        L_0x068c:
            boolean r0 = r1 instanceof X.AnonymousClass6XA
            if (r0 == 0) goto L_0x0739
            r4 = r1
            X.6XA r4 = (X.AnonymousClass6XA) r4
            X.6lO r8 = r4.A02
            android.widget.TextView r0 = r8.A03
            if (r0 != 0) goto L_0x06b9
            android.content.Context r0 = r4.A00
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131628905(0x7f0e1369, float:1.8885116E38)
            r0 = 0
            android.view.View r1 = r2.inflate(r1, r0)
            r0 = 9
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r8.A03 = r1
            com.instagram.reels.viewer.attribution.CyclingFrameLayout r0 = r8.A0H
            r0.addView(r1)
        L_0x06b9:
            android.text.SpannableStringBuilder r9 = new android.text.SpannableStringBuilder
            r9.<init>()
            com.instagram.common.session.UserSession r3 = r4.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327748218206887(0x810fe500093aa7, double:3.037152481070297E-306)
            boolean r2 = X.182.A06(r2, r3, r0)
            android.content.Context r0 = r4.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131971603(0x7f134e13, float:1.958019E38)
            if (r2 == 0) goto L_0x06d9
            r0 = 2131974450(0x7f135932, float:1.9585964E38)
        L_0x06d9:
            java.lang.String r0 = r1.getString(r0)
            r9.append(r0)
            int r2 = r9.length()
            java.lang.String r0 = " • "
            r9.append(r0)
            r0 = -1
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r1.<init>(r0)
            int r0 = r9.length()
            r7 = 0
            r9.setSpan(r1, r2, r0, r7)
            X.3uh r0 = r4.A01
            java.lang.Long r0 = r0.A0O(r3)
            if (r0 == 0) goto L_0x0731
            long r0 = r0.longValue()
            double r5 = (double) r0
            long r3 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r0
            double r1 = (double) r3
            java.lang.String r0 = "MMMM d"
            java.lang.String r0 = X.1G0.A0F(r0, r5, r1)
            r9.append(r0)
            android.widget.TextView r1 = r8.A03
            if (r1 == 0) goto L_0x0720
            java.lang.String r0 = r9.toString()
            r1.setText(r0)
        L_0x0720:
            android.widget.TextView r0 = r8.A03
            if (r0 == 0) goto L_0x0727
            r0.setVisibility(r7)
        L_0x0727:
            android.widget.TextView r0 = r8.A03
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            return r0
        L_0x0731:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0739:
            boolean r0 = r1 instanceof X.AnonymousClass6XV
            if (r0 == 0) goto L_0x076f
            r0 = r1
            X.6XV r0 = (X.AnonymousClass6XV) r0
            X.6lO r0 = r0.A03
            X.6lz r3 = r0.A0G
            android.view.ViewGroup r2 = r3.A00
            if (r2 != 0) goto L_0x0757
            android.view.ViewStub r0 = r3.A01
            android.view.View r2 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r2, r0)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r3.A00 = r2
        L_0x0757:
            java.lang.String r1 = "Required value was null."
            if (r2 == 0) goto L_0x0769
            r0 = 0
            r2.setVisibility(r0)
            android.view.ViewGroup r3 = r3.A00
            if (r3 != 0) goto L_0x08fa
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0769:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x076f:
            boolean r0 = r1 instanceof X.AnonymousClass6XE
            if (r0 == 0) goto L_0x07ee
            r8 = r1
            X.6XE r8 = (X.AnonymousClass6XE) r8
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            X.6lO r0 = r8.A03
            X.6lV r2 = r0.A0E
            android.view.ViewGroup r0 = r2.A00
            if (r0 != 0) goto L_0x07a9
            android.view.ViewStub r0 = r2.A03
            android.view.View r1 = r0.inflate()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x07ec
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
        L_0x078f:
            r2.A00 = r1
            if (r1 == 0) goto L_0x07a9
            r0 = 2131439378(0x7f0b2f12, float:1.850071E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = (com.instagram.common.ui.widget.imageview.IgImageView) r0
            r2.A02 = r0
            r0 = 2131439377(0x7f0b2f11, float:1.8500707E38)
            android.view.View r0 = r1.requireViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.A01 = r0
        L_0x07a9:
            android.view.ViewGroup r5 = r2.A00
            if (r5 == 0) goto L_0x07e8
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r2.A02
            if (r1 == 0) goto L_0x07e8
            android.widget.TextView r7 = r2.A01
            if (r7 == 0) goto L_0x07e8
            r0 = 8
            r1.setVisibility(r0)
            X.87G r0 = X.AnonymousClass6XE.A00(r8)
            if (r0 == 0) goto L_0x07e8
            X.87I r1 = r0.A04
            if (r1 != 0) goto L_0x07c6
            X.87I r1 = X.AnonymousClass87I.EMPTY
        L_0x07c6:
            int r0 = r1.ordinal()
            java.lang.String r3 = "CanvasAttributionType"
            switch(r0) {
                case -1: goto L_0x07e9;
                case 1: goto L_0x1a79;
                case 4: goto L_0x1a60;
                case 5: goto L_0x1a65;
                case 6: goto L_0x1a6a;
                case 7: goto L_0x1a5b;
                case 8: goto L_0x1a74;
                case 9: goto L_0x1a7e;
                case 17: goto L_0x1a6f;
                case 18: goto L_0x1a56;
                case 19: goto L_0x1a83;
                case 20: goto L_0x1a88;
                case 31: goto L_0x1c1c;
                default: goto L_0x07cf;
            }
        L_0x07cf:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Tried to infer header text from DialElement, but DialElement.getType is "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = ", and there is no header text currently mapped to that type"
            r2.append(r0)
        L_0x07e1:
            java.lang.String r0 = r2.toString()
        L_0x07e5:
            X.0wb.A03(r3, r0)
        L_0x07e8:
            return r6
        L_0x07e9:
            java.lang.String r0 = "Tried to infer header text from DialElement, but DialElement.getType is null"
            goto L_0x07e5
        L_0x07ec:
            r1 = 0
            goto L_0x078f
        L_0x07ee:
            boolean r0 = r1 instanceof X.AnonymousClass6X7
            if (r0 == 0) goto L_0x08bf
            r4 = r1
            X.6X7 r4 = (X.AnonymousClass6X7) r4
            X.3uh r0 = r4.A02
            X.1Xj r10 = r0.A0b
            java.lang.String r3 = "Required value was null."
            if (r10 == 0) goto L_0x1ab1
            X.6lO r0 = r4.A03
            X.6lQ r6 = r0.A08
            android.view.ViewGroup r0 = r6.A00
            if (r0 != 0) goto L_0x082a
            android.view.ViewStub r0 = r6.A03
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r1, r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r6.A00 = r1
            r0 = 2131439357(0x7f0b2efd, float:1.8500667E38)
            android.view.View r0 = r1.findViewById(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = (com.instagram.common.ui.widget.imageview.IgImageView) r0
            r6.A02 = r0
            r0 = 2131439356(0x7f0b2efc, float:1.8500665E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.A01 = r0
        L_0x082a:
            X.1Xy r0 = r10.A0C
            X.54e r0 = r0.C09()
            if (r0 == 0) goto L_0x08bc
            java.lang.String r0 = r0.Ac4()
            com.instagram.common.typedurl.SimpleImageUrl r2 = new com.instagram.common.typedurl.SimpleImageUrl
            r2.<init>(r0)
        L_0x083b:
            X.1Xy r0 = r10.A0C
            X.54e r0 = r0.C09()
            if (r0 == 0) goto L_0x08ba
            java.lang.String r9 = r0.Ac1()
        L_0x0847:
            android.widget.TextView r0 = r6.A01
            if (r0 == 0) goto L_0x1aab
            android.content.Context r8 = r0.getContext()
            r7 = 0
            if (r2 == 0) goto L_0x08b0
            boolean r0 = X.C253833rU.A02(r2)
            if (r0 != 0) goto L_0x08b0
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r6.A02
            if (r1 == 0) goto L_0x1a9f
            X.0iw r0 = r4.A01
            r1.setUrl(r2, r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r6.A02
            if (r0 == 0) goto L_0x1a99
            r0.setVisibility(r7)
        L_0x0868:
            android.widget.TextView r5 = r6.A01
            if (r5 == 0) goto L_0x1a93
            java.lang.String r4 = ""
            java.util.regex.Pattern r0 = X.0mp.A00
            if (r9 != 0) goto L_0x0873
            r9 = r4
        L_0x0873:
            X.1Xy r0 = r10.A0C
            X.54e r0 = r0.C09()
            if (r0 == 0) goto L_0x0881
            java.lang.String r2 = r0.getContentUrl()
            if (r2 != 0) goto L_0x0882
        L_0x0881:
            r2 = r4
        L_0x0882:
            java.lang.String r1 = r10.A2y()
            if (r1 != 0) goto L_0x0889
            r1 = r4
        L_0x0889:
            java.lang.String r0 = r10.A2x()
            if (r0 != 0) goto L_0x0890
            r0 = r4
        L_0x0890:
            android.text.SpannableStringBuilder r0 = X.C250563lf.A03(r8, r9, r2, r1, r0)
            r5.setText(r0)
            android.view.ViewGroup r0 = r6.A00
            if (r0 == 0) goto L_0x1a8d
            r0.setVisibility(r7)
            android.view.ViewGroup r0 = r6.A00
            if (r0 == 0) goto L_0x08a5
            r0.setVisibility(r7)
        L_0x08a5:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.view.ViewGroup r0 = r6.A00
            r1.add(r0)
            return r1
        L_0x08b0:
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r6.A02
            if (r1 == 0) goto L_0x1aa5
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0868
        L_0x08ba:
            r9 = 0
            goto L_0x0847
        L_0x08bc:
            r2 = 0
            goto L_0x083b
        L_0x08bf:
            boolean r0 = r1 instanceof X.C309046Wr
            if (r0 == 0) goto L_0x0904
            r0 = r1
            X.6Wr r0 = (X.C309046Wr) r0
            X.6lO r0 = r0.A02
            X.6lx r2 = r0.A0e
            android.view.ViewGroup r0 = r2.A00
            if (r0 != 0) goto L_0x08e8
            android.view.ViewStub r0 = r2.A02
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r1, r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r2.A00 = r1
            r0 = 2131441851(0x7f0b38bb, float:1.8505725E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.A01 = r0
        L_0x08e8:
            android.widget.TextView r1 = r2.A01
            if (r1 == 0) goto L_0x08f2
            r0 = 2131961836(0x7f1327ec, float:1.956038E38)
            r1.setText(r0)
        L_0x08f2:
            android.view.ViewGroup r3 = r2.A00
            if (r3 == 0) goto L_0x0902
            r0 = 0
            r3.setVisibility(r0)
        L_0x08fa:
            java.util.List r0 = java.util.Collections.singletonList(r3)
            X.0qQ.A07(r0)
            return r0
        L_0x0902:
            r3 = 0
            goto L_0x08fa
        L_0x0904:
            boolean r0 = r1 instanceof X.C309106Wy
            if (r0 == 0) goto L_0x09d9
            r8 = r1
            X.6Wy r8 = (X.C309106Wy) r8
            X.6lO r0 = r8.A04
            X.6le r6 = r0.A0Q
            android.view.ViewGroup r0 = r6.A01
            if (r0 != 0) goto L_0x093d
            android.view.ViewStub r0 = r6.A03
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r1, r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r6.A01 = r1
            r2 = 0
            if (r1 == 0) goto L_0x09d6
            r0 = 2131439431(0x7f0b2f47, float:1.8500817E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x092e:
            r6.A02 = r0
            android.view.ViewGroup r1 = r6.A01
            if (r1 == 0) goto L_0x093b
            r0 = 2131439989(0x7f0b3175, float:1.8501949E38)
            android.view.View r2 = r1.findViewById(r0)
        L_0x093b:
            r6.A00 = r2
        L_0x093d:
            android.view.ViewGroup r0 = r6.A01
            r9 = 0
            if (r0 == 0) goto L_0x0945
            r0.setVisibility(r9)
        L_0x0945:
            android.content.Context r11 = r8.A00
            X.3BQ r7 = r8.A03
            X.3BQ r5 = X.AnonymousClass3BQ.IN_FEED_HIGHLIGHTS_TRAY
            r1 = 2131971528(0x7f134dc8, float:1.9580038E38)
            if (r7 != r5) goto L_0x0953
            r1 = 2131963399(0x7f132e07, float:1.956355E38)
        L_0x0953:
            r12 = 1
            java.lang.String r0 = X.C309106Wy.A00(r8)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r11.getString(r1, r0)
            X.0qQ.A07(r0)
            android.text.SpannableStringBuilder r10 = new android.text.SpannableStringBuilder
            r10.<init>(r0)
            r1 = 2131971528(0x7f134dc8, float:1.9580038E38)
            if (r7 != r5) goto L_0x0970
            r1 = 2131963399(0x7f132e07, float:1.956355E38)
        L_0x0970:
            java.lang.String r0 = X.C309106Wy.A00(r8)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = r11.getString(r1, r0)
            X.0qQ.A07(r1)
            java.lang.String r0 = X.C309106Wy.A00(r8)
            int r4 = X.00l.A08(r1, r0, r9, r9)
            r0 = 0
            if (r4 < 0) goto L_0x098b
            r0 = 1
        L_0x098b:
            java.lang.String r3 = "Check failed."
            if (r0 == 0) goto L_0x1abd
            java.lang.String r1 = X.C309106Wy.A00(r8)
            java.util.regex.Pattern r0 = X.0mp.A00
            int r2 = r1.length()
            int r2 = r2 + r4
            if (r2 < 0) goto L_0x1ab7
            android.text.style.StyleSpan r1 = new android.text.style.StyleSpan
            r1.<init>(r12)
            r0 = 33
            r10.setSpan(r1, r4, r2, r0)
            android.graphics.drawable.Drawable r0 = X.C306026Km.A00(r11)
            X.C306026Km.A01(r11, r0, r10)
            android.widget.TextView r0 = r6.A02
            if (r0 == 0) goto L_0x09b4
            r0.setText(r10)
        L_0x09b4:
            android.view.View r2 = r6.A00
            if (r2 == 0) goto L_0x09bf
            if (r7 != r5) goto L_0x09cb
            r0 = 8
            r2.setVisibility(r0)
        L_0x09bf:
            android.view.ViewGroup r3 = r6.A01
            if (r3 != 0) goto L_0x08fa
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x09cb:
            r2.setVisibility(r9)
            X.6ml r1 = r8.A05
            X.3uh r0 = r8.A02
            r1.DJT(r2, r0)
            goto L_0x09bf
        L_0x09d6:
            r0 = r2
            goto L_0x092e
        L_0x09d9:
            boolean r0 = r1 instanceof X.C308976Wk
            if (r0 == 0) goto L_0x0b24
            r6 = r1
            X.6Wk r6 = (X.C308976Wk) r6
            X.6lO r0 = r6.A04
            X.6la r3 = r0.A0m
            android.view.ViewGroup r0 = r3.A00
            if (r0 != 0) goto L_0x0a16
            android.view.ViewStub r0 = r3.A03
            if (r0 == 0) goto L_0x0a16
            android.view.View r2 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r2, r0)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r3.A00 = r2
            r0 = 0
            if (r2 == 0) goto L_0x0b21
            r1 = 2131439731(0x7f0b3073, float:1.8501425E38)
            android.view.View r1 = r2.findViewById(r1)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = (com.instagram.common.ui.widget.imageview.IgImageView) r1
        L_0x0a05:
            r3.A02 = r1
            android.view.ViewGroup r1 = r3.A00
            if (r1 == 0) goto L_0x0a14
            r0 = 2131439733(0x7f0b3075, float:1.850143E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0a14:
            r3.A01 = r0
        L_0x0a16:
            android.view.ViewGroup r1 = r3.A00
            if (r1 == 0) goto L_0x0b0b
            r0 = 8
            r1.setVisibility(r0)
            X.3uh r0 = r6.A03
            X.1Xj r9 = r0.A0b
            r5 = 0
            if (r9 == 0) goto L_0x0b0b
            X.1Xy r0 = r9.A0C
            X.JSO r0 = r0.CGF()
            if (r0 == 0) goto L_0x0b0b
            X.1Xy r0 = r9.A0C
            X.JSO r13 = r0.CGF()
            com.instagram.common.session.UserSession r8 = r6.A01
            r10 = 1
            boolean r0 = r9.A6N()
            if (r0 != r10) goto L_0x0a65
            java.util.concurrent.ConcurrentHashMap r7 = X.C308976Wk.A08
            java.lang.String r0 = r9.getId()
            boolean r0 = r7.containsKey(r0)
            if (r0 != 0) goto L_0x0a65
            X.HOh r4 = X.C54676HOh.ATTRIBUTE_IMPRESSION
            if (r13 == 0) goto L_0x0b1e
            com.instagram.api.schemas.WearablesAppAttributionType r2 = r13.AdB()
        L_0x0a51:
            java.lang.String r1 = r9.getId()
            java.lang.String r0 = "story"
            X.HWP.A00(r4, r2, r8, r1, r0)
            java.lang.String r1 = r9.getId()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            r7.put(r1, r0)
        L_0x0a65:
            android.view.ViewGroup r0 = r3.A00
            r4 = 0
            if (r0 == 0) goto L_0x0a6d
            r0.setVisibility(r4)
        L_0x0a6d:
            android.widget.TextView r1 = r3.A01
            if (r1 == 0) goto L_0x0af0
            if (r13 == 0) goto L_0x0b1b
            java.lang.String r0 = r13.getAttributionTitle()
        L_0x0a77:
            r1.setText(r0)
            android.widget.TextView r0 = r3.A01
            if (r0 == 0) goto L_0x0a81
            r0.setVisibility(r4)
        L_0x0a81:
            android.widget.TextView r0 = r3.A01
            if (r0 == 0) goto L_0x0b18
            android.content.Context r7 = r0.getContext()
        L_0x0a89:
            java.lang.String r0 = X.Pxd.A00(r4)
            X.0qQ.A0C(r7, r0)
            android.app.Activity r7 = (android.app.Activity) r7
            android.widget.TextView r12 = r3.A01
            X.2fy r11 = X.C226262fy.BELOW_ANCHOR
            X.HOV r2 = X.HOV.STORIES
            if (r7 == 0) goto L_0x0b16
            if (r12 == 0) goto L_0x0b16
            boolean r0 = r9.A6d(r8)
            if (r0 != r10) goto L_0x0b16
            boolean r0 = X.I40.A00(r8)
            if (r0 == 0) goto L_0x0b16
            android.content.Context r1 = r12.getContext()
            r0 = 2131976905(0x7f1362c9, float:1.9590944E38)
            java.lang.String r1 = r1.getString(r0)
            X.0qQ.A07(r1)
            X.6jx r0 = new X.6jx
            r0.<init>((java.lang.CharSequence) r1)
            X.5Gt r1 = new X.5Gt
            r1.<init>(r7, r0)
            r1.A03(r12)
            r1.A05 = r11
            X.5Gu r0 = X.C283255Gu.A0A
            r1.A07(r0)
            X.5Gu r0 = X.C283255Gu.A09
            r1.A08(r0)
            r1.A0A = r10
            X.HBl r0 = new X.HBl
            r0.<init>(r7, r2, r8, r9)
            r1.A04 = r0
            X.5Gv r0 = r1.A00()
        L_0x0adc:
            r6.A00 = r0
            android.widget.TextView r0 = r3.A01
            if (r0 == 0) goto L_0x0af0
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            if (r1 == 0) goto L_0x0af0
            X.IDr r0 = new X.IDr
            r0.<init>(r3, r6)
            r1.addOnGlobalLayoutListener(r0)
        L_0x0af0:
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r3.A02
            if (r2 == 0) goto L_0x0b0b
            if (r13 == 0) goto L_0x0afa
            java.lang.String r5 = r13.getAttributionTopIconUrl()
        L_0x0afa:
            com.instagram.common.typedurl.SimpleImageUrl r1 = new com.instagram.common.typedurl.SimpleImageUrl
            r1.<init>(r5)
            X.0iw r0 = r6.A02
            r2.setUrl(r1, r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r3.A02
            if (r0 == 0) goto L_0x0b0b
            r0.setVisibility(r4)
        L_0x0b0b:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            android.view.ViewGroup r5 = r3.A00
            if (r5 == 0) goto L_0x07e8
            goto L_0x1c2e
        L_0x0b16:
            r0 = 0
            goto L_0x0adc
        L_0x0b18:
            r7 = r5
            goto L_0x0a89
        L_0x0b1b:
            r0 = r5
            goto L_0x0a77
        L_0x0b1e:
            r2 = r5
            goto L_0x0a51
        L_0x0b21:
            r1 = r0
            goto L_0x0a05
        L_0x0b24:
            boolean r0 = r1 instanceof X.C309056Ws
            if (r0 == 0) goto L_0x0b9d
            r4 = r1
            X.6Ws r4 = (X.C309056Ws) r4
            com.instagram.user.model.User r0 = r4.A04
            if (r0 == 0) goto L_0x0b44
            com.instagram.common.session.UserSession r5 = r4.A01
            android.content.Context r3 = r4.A00
            java.lang.String r2 = r0.getId()
            X.4Cl r0 = r0.A03
            java.lang.String r1 = r0.C9f()
            if (r1 == 0) goto L_0x1ac3
            X.RIv r0 = X.C8956RIv.STORIES
            X.AnonymousClass3ZQ.A02(r3, r0, r5, r2, r1)
        L_0x0b44:
            X.6lO r3 = r4.A02
            android.widget.TextView r0 = r3.A05
            if (r0 != 0) goto L_0x0b66
            android.content.Context r0 = r4.A00
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131628905(0x7f0e1369, float:1.8885116E38)
            r0 = 0
            android.view.View r1 = r2.inflate(r1, r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.TextView"
            X.0qQ.A0C(r1, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r3.A05 = r1
            com.instagram.reels.viewer.attribution.CyclingFrameLayout r0 = r3.A0H
            r0.addView(r1)
        L_0x0b66:
            android.widget.TextView r1 = r3.A05
            if (r1 == 0) goto L_0x0b71
            android.text.SpannableStringBuilder r0 = X.C309056Ws.A00(r4)
            r1.setText(r0)
        L_0x0b71:
            android.widget.TextView r0 = r3.A05
            r1 = 0
            if (r0 == 0) goto L_0x0b79
            r0.setHighlightColor(r1)
        L_0x0b79:
            android.widget.TextView r0 = r3.A05
            if (r0 == 0) goto L_0x0b80
            r0.setVisibility(r1)
        L_0x0b80:
            android.widget.TextView r1 = r3.A05
            if (r1 == 0) goto L_0x0b8c
            X.IAb r0 = new X.IAb
            r0.<init>(r4)
            X.AnonymousClass0fU.A00(r0, r1)
        L_0x0b8c:
            android.widget.TextView r0 = r3.A05
            if (r0 == 0) goto L_0x0b93
            X.LSV.A01(r0)
        L_0x0b93:
            android.widget.TextView r0 = r3.A05
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            return r0
        L_0x0b9d:
            boolean r0 = r1 instanceof X.AnonymousClass6XP
            if (r0 == 0) goto L_0x0c69
            r7 = r1
            X.6XP r7 = (X.AnonymousClass6XP) r7
            X.6lO r0 = r7.A04
            X.6lp r5 = r0.A0W
            android.view.View r0 = r5.A00
            if (r0 != 0) goto L_0x0bd6
            android.view.ViewStub r0 = r5.A03
            android.view.View r2 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r2, r0)
            r5.A00 = r2
            r0 = 0
            if (r2 == 0) goto L_0x0c66
            r1 = 2131439485(0x7f0b2f7d, float:1.8500926E38)
            android.view.View r1 = r2.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
        L_0x0bc5:
            r5.A02 = r1
            android.view.View r1 = r5.A00
            if (r1 == 0) goto L_0x0bd4
            r0 = 2131439483(0x7f0b2f7b, float:1.8500922E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
        L_0x0bd4:
            r5.A01 = r0
        L_0x0bd6:
            android.widget.TextView r1 = r5.A02
            if (r1 == 0) goto L_0x0bdf
            java.lang.String r0 = r7.A06
            r1.setText(r0)
        L_0x0bdf:
            android.widget.ImageView r1 = r5.A01
            if (r1 == 0) goto L_0x0be9
            r0 = 2131238059(0x7f081cab, float:1.8092386E38)
            r1.setImageResource(r0)
        L_0x0be9:
            X.8D7 r0 = r7.A03
            r9 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0c53
            boolean r0 = r0.A02()
            if (r0 != r9) goto L_0x0c53
            java.lang.String r8 = r7.A06
            if (r8 == 0) goto L_0x0c3a
            android.widget.TextView r6 = r5.A02
            if (r6 == 0) goto L_0x0c3a
            android.content.Context r3 = r7.A00
            com.instagram.common.session.UserSession r10 = r7.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325613619917917(0x810df40010345d, double:3.035802552517015E-306)
            boolean r0 = X.182.A06(r2, r10, r0)
            if (r0 == 0) goto L_0x0c19
            r1 = 2131955087(0x7f130d8f, float:1.9546692E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r8}
            java.lang.String r8 = r3.getString(r1, r0)
        L_0x0c19:
            X.0qQ.A0A(r8)
            r0 = 36325613619459158(0x810df400093456, double:3.0358025522268937E-306)
            boolean r0 = X.182.A06(r2, r10, r0)
            X.0qQ.A0B(r8, r9)
            if (r0 == 0) goto L_0x0c37
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>(r8)
            android.graphics.drawable.Drawable r0 = X.C306026Km.A00(r3)
            X.C306026Km.A01(r3, r0, r1)
            r8 = r1
        L_0x0c37:
            r6.setText(r8)
        L_0x0c3a:
            com.instagram.common.session.UserSession r3 = r7.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325613619393621(0x810df400083455, double:3.035802552185448E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0c53
            android.widget.ImageView r1 = r5.A01
            if (r1 == 0) goto L_0x0c53
            r0 = 2131238318(0x7f081dae, float:1.8092911E38)
            r1.setImageResource(r0)
        L_0x0c53:
            android.view.View r0 = r5.A00
            if (r0 == 0) goto L_0x0c5a
            r0.setVisibility(r4)
        L_0x0c5a:
            android.view.View r0 = r5.A00
            if (r0 != 0) goto L_0x1bd5
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0c66:
            r1 = r0
            goto L_0x0bc5
        L_0x0c69:
            boolean r0 = r1 instanceof X.AnonymousClass6X2
            if (r0 == 0) goto L_0x0d61
            r5 = r1
            X.6X2 r5 = (X.AnonymousClass6X2) r5
            X.6lO r0 = r5.A03
            X.6m0 r3 = r0.A0K
            android.view.View r0 = r3.A00
            if (r0 != 0) goto L_0x0ca2
            android.view.ViewStub r0 = r3.A03
            android.view.View r2 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r2, r0)
            r3.A00 = r2
            r0 = 0
            if (r2 == 0) goto L_0x0d5e
            r1 = 2131439921(0x7f0b3131, float:1.850181E38)
            android.view.View r1 = r2.findViewById(r1)
            com.instagram.common.ui.base.IgSimpleImageView r1 = (com.instagram.common.ui.base.IgSimpleImageView) r1
        L_0x0c91:
            r3.A02 = r1
            android.view.View r1 = r3.A00
            if (r1 == 0) goto L_0x0ca0
            r0 = 2131439922(0x7f0b3132, float:1.8501813E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0ca0:
            r3.A01 = r0
        L_0x0ca2:
            android.content.Context r9 = r5.A00
            X.0iw r0 = r5.A01
            java.lang.String r17 = r0.getModuleName()
            com.instagram.user.model.User r4 = r5.A06
            r2 = 0
            com.instagram.user.model.User r8 = r5.A05
            r7 = 1
            com.instagram.user.model.User[] r0 = new com.instagram.user.model.User[]{r4, r8}
            java.util.List r18 = X.0sr.A1Q(r0)
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131165302(0x7f070076, float:1.7944817E38)
            int r19 = r1.getDimensionPixelSize(r0)
            java.lang.Integer r12 = X.AnonymousClass05K.A00
            r10 = 0
            r11 = r10
            r13 = r10
            r14 = r10
            r15 = r10
            r16 = r10
            r20 = r7
            r21 = r2
            r22 = r2
            r23 = r7
            r24 = r2
            android.graphics.drawable.Drawable r1 = X.C244283aw.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r3.A02
            if (r0 == 0) goto L_0x0ce1
            r0.setImageDrawable(r1)
        L_0x0ce1:
            r6 = 17
            if (r4 == 0) goto L_0x0d35
            if (r8 == 0) goto L_0x0d48
            android.content.res.Resources r9 = r9.getResources()
            r5 = 2131962808(0x7f132bb8, float:1.9562352E38)
            java.lang.String r1 = r4.getUsername()
            java.lang.String r0 = r8.getUsername()
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = r9.getString(r5, r0)
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>(r0)
            android.text.style.StyleSpan r1 = new android.text.style.StyleSpan
            r1.<init>(r7)
            java.util.EnumSet r0 = X.1sx.A01
            java.lang.String r0 = r4.getUsername()
            int r0 = r0.length()
            r5.setSpan(r1, r2, r0, r6)
            android.text.style.StyleSpan r4 = new android.text.style.StyleSpan
            r4.<init>(r7)
            int r1 = r5.length()
            java.lang.String r0 = r8.getUsername()
            int r0 = r0.length()
            int r1 = r1 - r0
            int r0 = r5.length()
            r5.setSpan(r4, r1, r0, r6)
        L_0x0d2e:
            android.widget.TextView r0 = r3.A01
            if (r0 == 0) goto L_0x0d35
            r0.setText(r5)
        L_0x0d35:
            android.view.View r0 = r3.A00
            if (r0 == 0) goto L_0x0d3c
            r0.setVisibility(r2)
        L_0x0d3c:
            android.view.View r0 = r3.A00
            if (r0 != 0) goto L_0x1bd5
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0d48:
            java.lang.String r0 = r4.getUsername()
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>(r0)
            android.text.style.StyleSpan r1 = new android.text.style.StyleSpan
            r1.<init>(r7)
            int r0 = r5.length()
            r5.setSpan(r1, r2, r0, r6)
            goto L_0x0d2e
        L_0x0d5e:
            r1 = r0
            goto L_0x0c91
        L_0x0d61:
            boolean r0 = r1 instanceof X.AnonymousClass6X4
            if (r0 == 0) goto L_0x0d7d
            X.6X4 r1 = (X.AnonymousClass6X4) r1
            android.content.Context r2 = r1.A00
            com.instagram.common.session.UserSession r3 = r1.A01
            X.3uh r0 = r1.A01
            java.util.List r6 = r0.A0b()
            X.6lO r0 = r1.A02
            X.6lS r5 = r0.A0p
            X.52z r4 = r0.A07
            r7 = 1
            java.util.ArrayList r0 = X.C309126Xa.A00(r2, r3, r4, r5, r6, r7)
            return r0
        L_0x0d7d:
            boolean r0 = r1 instanceof X.AnonymousClass6XX
            if (r0 == 0) goto L_0x0dd8
            X.6XX r1 = (X.AnonymousClass6XX) r1
            android.content.Context r3 = r1.A00
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>()
            com.instagram.common.session.UserSession r5 = r1.A01
            r0 = 2130970279(0x7f0406a7, float:1.7549264E38)
            int r0 = X.2Yu.A0H(r3, r0)
            int r7 = r3.getColor(r0)
            r8 = 0
            X.DIg r6 = X.C46002DIg.A00
            X.C69766Nrp.A00(r3, r4, r5, r6, r7, r8)
            X.6lO r3 = r1.A03
            X.6m1 r2 = r3.A0A
            android.view.ViewGroup r0 = r2.A00
            if (r0 != 0) goto L_0x0db4
            android.view.ViewStub r0 = r2.A01
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r1, r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r2.A00 = r1
        L_0x0db4:
            com.instagram.reels.viewer.attribution.CyclingFrameLayout r1 = r3.A0H
            r0 = 2131428616(0x7f0b0508, float:1.8478882E38)
            android.view.View r0 = r1.requireViewById(r0)
            X.0qQ.A07(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r4)
            android.view.ViewGroup r0 = r2.A00
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x1acb
            r0.setVisibility(r8)
            android.view.ViewGroup r3 = r2.A00
            if (r3 != 0) goto L_0x08fa
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0dd8:
            boolean r0 = r1 instanceof X.C309116Wz
            if (r0 == 0) goto L_0x0e1e
            r4 = r1
            X.6Wz r4 = (X.C309116Wz) r4
            X.6lO r0 = r4.A04
            X.6ld r3 = r0.A0P
            r3.A00()
            android.view.ViewGroup r0 = r3.A01
            r1 = 0
            if (r0 == 0) goto L_0x0dee
            r0.setVisibility(r1)
        L_0x0dee:
            android.view.View r0 = r3.A00
            if (r0 == 0) goto L_0x0df5
            r0.setVisibility(r1)
        L_0x0df5:
            com.instagram.model.reels.Reel r0 = r4.A01
            java.lang.String r0 = r0.A0o
            if (r0 != 0) goto L_0x0dfd
            java.lang.String r0 = ""
        L_0x0dfd:
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            r2.<init>(r0)
            android.content.Context r1 = r4.A00
            android.graphics.drawable.Drawable r0 = X.C306026Km.A00(r1)
            X.C306026Km.A01(r1, r0, r2)
            android.widget.TextView r0 = r3.A02
            if (r0 == 0) goto L_0x0e12
            r0.setText(r2)
        L_0x0e12:
            android.view.ViewGroup r3 = r3.A01
            if (r3 != 0) goto L_0x08fa
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0e1e:
            boolean r0 = r1 instanceof X.C308966Wj
            if (r0 == 0) goto L_0x0ecc
            r3 = r1
            X.6Wj r3 = (X.C308966Wj) r3
            X.6lO r2 = r3.A04
            android.widget.TextView r0 = r2.A04
            if (r0 != 0) goto L_0x0e47
            android.content.Context r0 = r3.A00
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r0)
            r1 = 2131628905(0x7f0e1369, float:1.8885116E38)
            r0 = 0
            android.view.View r1 = r4.inflate(r1, r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.TextView"
            X.0qQ.A0C(r1, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2.A04 = r1
            com.instagram.reels.viewer.attribution.CyclingFrameLayout r0 = r2.A0H
            r0.addView(r1)
        L_0x0e47:
            android.widget.TextView r5 = r2.A04
            if (r5 == 0) goto L_0x0e87
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>()
            X.3uh r9 = r3.A01
            X.1Xj r8 = r9.A0b
            r7 = 1
            r1 = 0
            if (r8 == 0) goto L_0x0e6b
            boolean r0 = r8.A5l()
            if (r0 != r7) goto L_0x0eb3
            android.content.Context r6 = r3.A00
            java.util.List r0 = r8.A3Q()
            android.text.SpannableStringBuilder r0 = X.C49946FGa.A01(r6, r0, r7)
        L_0x0e68:
            r4.append(r0)
        L_0x0e6b:
            com.instagram.user.model.User r0 = r9.A0L()
            if (r0 == 0) goto L_0x0e84
            boolean r0 = r0.isVerified()
            if (r0 != r7) goto L_0x0e84
            X.3BQ r0 = r3.A03
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0e84
            android.content.Context r0 = r3.A00
            X.C244273av.A07(r0, r4, r1)
        L_0x0e84:
            r5.setText(r4)
        L_0x0e87:
            android.widget.TextView r0 = r2.A04
            r1 = 0
            if (r0 == 0) goto L_0x0e8f
            r0.setHighlightColor(r1)
        L_0x0e8f:
            android.widget.TextView r0 = r2.A04
            if (r0 == 0) goto L_0x0e96
            r0.setVisibility(r1)
        L_0x0e96:
            android.widget.TextView r1 = r2.A04
            if (r1 == 0) goto L_0x0ea2
            X.IAa r0 = new X.IAa
            r0.<init>(r3)
            X.AnonymousClass0fU.A00(r0, r1)
        L_0x0ea2:
            android.widget.TextView r0 = r2.A04
            if (r0 == 0) goto L_0x0ea9
            X.LSV.A01(r0)
        L_0x0ea9:
            android.widget.TextView r0 = r2.A04
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            return r0
        L_0x0eb3:
            X.1Xy r0 = r8.A0C
            X.3ZV r0 = r0.AaD()
            if (r0 == 0) goto L_0x0e6b
            X.1Xy r0 = r8.A0C
            X.3ZV r0 = r0.AaD()
            if (r0 == 0) goto L_0x0ec9
            java.lang.String r0 = r0.Axr()
            if (r0 != 0) goto L_0x0e68
        L_0x0ec9:
            java.lang.String r0 = ""
            goto L_0x0e68
        L_0x0ecc:
            boolean r0 = r1 instanceof X.AnonymousClass6X9
            if (r0 == 0) goto L_0x0f1f
            r4 = r1
            X.6X9 r4 = (X.AnonymousClass6X9) r4
            X.6lO r3 = r4.A03
            android.widget.TextView r0 = r3.A02
            if (r0 != 0) goto L_0x0ef9
            android.content.Context r0 = r4.A00
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131628905(0x7f0e1369, float:1.8885116E38)
            r0 = 0
            android.view.View r1 = r2.inflate(r1, r0)
            r0 = 9
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r3.A02 = r1
            com.instagram.reels.viewer.attribution.CyclingFrameLayout r0 = r3.A0H
            r0.addView(r1)
        L_0x0ef9:
            android.widget.TextView r2 = r3.A02
            if (r2 == 0) goto L_0x0f0d
            android.content.Context r0 = r4.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131971603(0x7f134e13, float:1.958019E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setText(r0)
        L_0x0f0d:
            android.widget.TextView r1 = r3.A02
            if (r1 == 0) goto L_0x0f15
            r0 = 0
            r1.setVisibility(r0)
        L_0x0f15:
            android.widget.TextView r0 = r3.A02
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            return r0
        L_0x0f1f:
            boolean r0 = r1 instanceof X.C308986Wl
            if (r0 == 0) goto L_0x0fac
            r6 = r1
            X.6Wl r6 = (X.C308986Wl) r6
            X.6lO r0 = r6.A02
            X.6lU r5 = r0.A0l
            android.view.ViewGroup r0 = r5.A00
            if (r0 != 0) goto L_0x0f53
            android.view.ViewStub r0 = r5.A03
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r1, r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r5.A00 = r1
            r0 = 2131439626(0x7f0b300a, float:1.8501212E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.A01 = r0
            r0 = 2131439625(0x7f0b3009, float:1.850121E38)
            android.view.View r0 = r1.findViewById(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = (com.instagram.common.ui.widget.imageview.IgImageView) r0
            r5.A02 = r0
        L_0x0f53:
            android.widget.TextView r3 = r5.A01
            java.lang.String r4 = "Required value was null."
            if (r3 == 0) goto L_0x1ae3
            X.3uh r2 = r6.A01
            X.3mL r1 = r2.A0e
            X.3mL r0 = X.C250963mL.MEDIA
            if (r1 != r0) goto L_0x0faa
            X.1Xj r0 = r2.A0b
            r0.getClass()
            X.1Xy r0 = r0.A0C
            X.DT3 r0 = r0.CDu()
            if (r0 == 0) goto L_0x0faa
            java.lang.String r0 = r0.CDt()
        L_0x0f72:
            r3.setText(r0)
            android.content.Context r1 = r6.A00
            r0 = 2131238969(0x7f082039, float:1.8094232E38)
            android.graphics.drawable.Drawable r3 = r1.getDrawable(r0)
            if (r3 == 0) goto L_0x1add
            android.graphics.drawable.Drawable r2 = r3.mutate()
            r0 = 2131100036(0x7f060184, float:1.7812442E38)
            int r1 = r1.getColor(r0)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.setColorFilter(r1, r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r5.A02
            if (r0 == 0) goto L_0x1ad7
            r0.setImageDrawable(r3)
            android.view.ViewGroup r1 = r5.A00
            if (r1 == 0) goto L_0x1ad1
            r0 = 0
            r1.setVisibility(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.view.ViewGroup r0 = r5.A00
            r1.add(r0)
            return r1
        L_0x0faa:
            r0 = 0
            goto L_0x0f72
        L_0x0fac:
            boolean r0 = r1 instanceof X.C308996Wm
            if (r0 == 0) goto L_0x1020
            X.6Wm r1 = (X.C308996Wm) r1
            X.3uh r0 = r1.A01
            X.1Xj r0 = r0.A0b
            if (r0 == 0) goto L_0x1afb
            X.1Xy r0 = r0.A0C
            com.instagram.api.schemas.StoryUnlockableStickerTappableObject r5 = r0.C1O()
            r4 = 0
            if (r5 == 0) goto L_0x1afb
            java.util.List r0 = r5.Bzq()
            if (r0 == 0) goto L_0x1afb
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x1afb
            X.6lW r3 = r1.A03
            android.view.ViewGroup r0 = r3.A00
            if (r0 != 0) goto L_0x0ff8
            android.view.ViewStub r0 = r3.A03
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r1, r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r3.A00 = r1
            r0 = 2131443408(0x7f0b3ed0, float:1.8508883E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.A01 = r0
            r0 = 2131443409(0x7f0b3ed1, float:1.8508885E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.A02 = r0
        L_0x0ff8:
            android.widget.ImageView r1 = r3.A01
            java.lang.String r2 = "Required value was null."
            if (r1 == 0) goto L_0x1af5
            r0 = 2131238849(0x7f081fc1, float:1.8093988E38)
            r1.setImageResource(r0)
            android.widget.TextView r1 = r3.A02
            if (r1 == 0) goto L_0x1aef
            java.lang.String r0 = r5.getTitle()
            r1.setText(r0)
            android.view.ViewGroup r0 = r3.A00
            if (r0 == 0) goto L_0x1ae9
            r0.setVisibility(r4)
            android.view.ViewGroup r0 = r3.A00
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            return r0
        L_0x1020:
            boolean r0 = r1 instanceof X.C309016Wo
            if (r0 == 0) goto L_0x1068
            r2 = r1
            X.6Wo r2 = (X.C309016Wo) r2
            X.6lO r0 = r2.A02
            X.6lr r3 = r0.A0i
            android.view.ViewGroup r0 = r3.A00
            if (r0 != 0) goto L_0x104b
            android.view.ViewStub r0 = r3.A02
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r1, r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r3.A00 = r1
            if (r1 == 0) goto L_0x1b09
            r0 = 2131439561(0x7f0b2fc9, float:1.850108E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.A01 = r0
        L_0x104b:
            android.widget.TextView r1 = r3.A01
            if (r1 == 0) goto L_0x1ba5
            java.lang.String r0 = r2.A03
            r1.setText(r0)
            android.view.ViewGroup r2 = r3.A00
            java.lang.String r1 = "Required value was null."
            if (r2 == 0) goto L_0x1b03
            r0 = 0
            r2.setVisibility(r0)
            android.view.ViewGroup r3 = r3.A00
            if (r3 != 0) goto L_0x08fa
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1068:
            boolean r0 = r1 instanceof X.C308956Wi
            if (r0 == 0) goto L_0x109c
            X.6Wi r1 = (X.C308956Wi) r1
            X.6lO r0 = r1.A04
            X.6ly r0 = r0.A0h
            X.3oV r0 = r0.A00
            android.view.View r3 = r0.getView()
            r0 = 0
            r3.setVisibility(r0)
            r0 = 2131442131(0x7f0b39d3, float:1.8506293E38)
            android.view.View r2 = r3.requireViewById(r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.content.Context r1 = r1.A00
            r0 = 2131974700(0x7f135a2c, float:1.9586471E38)
            java.lang.String r0 = r1.getString(r0)
            X.0qQ.A07(r0)
            r2.setText(r0)
            java.util.List r0 = java.util.Collections.singletonList(r3)
            X.0qQ.A07(r0)
            return r0
        L_0x109c:
            boolean r0 = r1 instanceof X.C309036Wq
            if (r0 == 0) goto L_0x10e4
            r2 = r1
            X.6Wq r2 = (X.C309036Wq) r2
            X.6lO r0 = r2.A02
            X.6lt r3 = r0.A0f
            android.view.ViewGroup r0 = r3.A00
            if (r0 != 0) goto L_0x10c7
            android.view.ViewStub r0 = r3.A02
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r1, r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r3.A00 = r1
            if (r1 == 0) goto L_0x1b17
            r0 = 2131439561(0x7f0b2fc9, float:1.850108E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.A01 = r0
        L_0x10c7:
            android.widget.TextView r1 = r3.A01
            if (r1 == 0) goto L_0x1ba5
            java.lang.String r0 = r2.A03
            r1.setText(r0)
            android.view.ViewGroup r2 = r3.A00
            java.lang.String r1 = "Required value was null."
            if (r2 == 0) goto L_0x1b11
            r0 = 0
            r2.setVisibility(r0)
            android.view.ViewGroup r3 = r3.A00
            if (r3 != 0) goto L_0x08fa
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x10e4:
            boolean r0 = r1 instanceof X.AnonymousClass6XM
            if (r0 == 0) goto L_0x118a
            r4 = r1
            X.6XM r4 = (X.AnonymousClass6XM) r4
            X.6lO r0 = r4.A04
            X.6li r3 = r0.A0d
            android.view.ViewGroup r0 = r3.A00
            if (r0 != 0) goto L_0x1123
            android.view.ViewStub r0 = r3.A04
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r1, r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r3.A00 = r1
            r0 = 2131439602(0x7f0b2ff2, float:1.8501164E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.A01 = r0
            r0 = 2131439599(0x7f0b2fef, float:1.8501158E38)
            android.view.View r0 = r1.findViewById(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = (com.instagram.common.ui.widget.imageview.IgImageView) r0
            r3.A02 = r0
            r0 = 2131439600(0x7f0b2ff0, float:1.850116E38)
            android.view.View r0 = r1.findViewById(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = (com.instagram.common.ui.widget.imageview.IgImageView) r0
            r3.A03 = r0
        L_0x1123:
            com.instagram.user.model.User r6 = r4.A06
            if (r6 == 0) goto L_0x1180
            android.view.ViewGroup r0 = r3.A00
            r9 = 0
            if (r0 == 0) goto L_0x112f
            r0.setVisibility(r9)
        L_0x112f:
            android.widget.TextView r5 = r3.A01
            if (r5 == 0) goto L_0x1147
            android.content.Context r2 = r4.A00
            r1 = 2131973588(0x7f1355d4, float:1.9584216E38)
            java.lang.String r0 = r6.getUsername()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r2.getString(r1, r0)
            r5.setText(r0)
        L_0x1147:
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r3.A02
            if (r2 == 0) goto L_0x116c
            android.content.Context r0 = r4.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165231(0x7f07002f, float:1.7944673E38)
            int r8 = r1.getDimensionPixelSize(r0)
            com.instagram.common.typedurl.ImageUrl r6 = r6.Bh3()
            X.0iw r0 = r4.A01
            java.lang.String r7 = r0.getModuleName()
            X.3ay r5 = new X.3ay
            r10 = r9
            r11 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r2.setImageDrawable(r5)
        L_0x116c:
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r3.A03
            if (r2 == 0) goto L_0x1180
            android.content.Context r1 = r4.A00
            r0 = 2131099843(0x7f0600c3, float:1.781205E38)
            int r0 = r1.getColor(r0)
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r0)
            r2.setColorFilter(r0)
        L_0x1180:
            android.view.ViewGroup r0 = r3.A00
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            return r0
        L_0x118a:
            boolean r0 = r1 instanceof X.AnonymousClass6XJ
            if (r0 == 0) goto L_0x11fe
            r6 = r1
            X.6XJ r6 = (X.AnonymousClass6XJ) r6
            X.6lO r0 = r6.A02
            X.6lj r5 = r0.A0c
            android.view.ViewGroup r0 = r5.A00
            if (r0 != 0) goto L_0x11be
            android.view.ViewStub r0 = r5.A03
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r1, r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r5.A00 = r1
            r0 = 2131439593(0x7f0b2fe9, float:1.8501146E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.A01 = r0
            r0 = 2131439592(0x7f0b2fe8, float:1.8501143E38)
            android.view.View r0 = r1.findViewById(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = (com.instagram.common.ui.widget.imageview.IgImageView) r0
            r5.A02 = r0
        L_0x11be:
            android.view.ViewGroup r0 = r5.A00
            r4 = 0
            if (r0 == 0) goto L_0x11c6
            r0.setVisibility(r4)
        L_0x11c6:
            android.widget.TextView r3 = r5.A01
            if (r3 == 0) goto L_0x11dc
            android.content.Context r0 = r6.A00
            android.content.res.Resources r2 = r0.getResources()
            r1 = 2131972888(0x7f135318, float:1.9582796E38)
            java.lang.String[] r0 = new java.lang.String[r4]
            android.text.Spanned r0 = X.0bC.A01(r2, r0, r1)
            r3.setText(r0)
        L_0x11dc:
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r5.A02
            if (r2 == 0) goto L_0x11f4
            android.content.Context r1 = r6.A00
            r0 = 2130970241(0x7f040681, float:1.7549187E38)
            int r0 = X.2Yu.A0H(r1, r0)
            int r0 = r1.getColor(r0)
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r0)
            r2.setColorFilter(r0)
        L_0x11f4:
            android.view.ViewGroup r0 = r5.A00
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            return r0
        L_0x11fe:
            boolean r0 = r1 instanceof X.C308936Wg
            if (r0 == 0) goto L_0x12a5
            r7 = r1
            X.6Wg r7 = (X.C308936Wg) r7
            X.6lO r0 = r7.A04
            X.6ln r0 = r0.A0b
            X.2eb r3 = r0.A00
            android.view.View r10 = r3.A01()
            android.view.View r0 = r3.A01()
            r13 = 0
            r0.setVisibility(r13)
            X.3BK r6 = r7.A03
            java.lang.Long r0 = r6.A00
            if (r0 == 0) goto L_0x1280
            long r8 = r0.longValue()
            X.3uh r5 = r7.A02
            long r1 = r5.A03()
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x1280
            android.content.Context r4 = r10.getContext()
            r2 = 2131953226(0x7f13064a, float:1.9542917E38)
            java.lang.Long r0 = r6.A00
            if (r0 == 0) goto L_0x127e
            long r0 = r0.longValue()
            double r9 = (double) r0
            android.content.Context r0 = r7.A00
            android.content.res.Resources r6 = r0.getResources()
            X.0qQ.A07(r6)
            long r0 = r5.A03()
            double r11 = (double) r0
            java.lang.Integer r8 = X.AnonymousClass05K.A00
            X.3gq r7 = X.C247743gq.SECONDS
            r14 = r13
            r15 = r13
            r16 = r13
            r17 = r13
            java.lang.String r0 = X.1G0.A0D(r6, r7, r8, r9, r11, r13, r14, r15, r16, r17)
        L_0x1257:
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = r4.getString(r2, r0)
        L_0x125f:
            X.0qQ.A0A(r2)
            android.view.View r1 = r3.A01()
            r0 = 2131439590(0x7f0b2fe6, float:1.850114E38)
            android.view.View r0 = r1.requireViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r2)
            android.view.View r0 = r3.A01()
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            return r0
        L_0x127e:
            r0 = 0
            goto L_0x1257
        L_0x1280:
            java.lang.Long r0 = r6.A01
            r6 = 0
            if (r0 == 0) goto L_0x1294
            long r4 = r0.longValue()
            X.3uh r0 = r7.A02
            long r1 = r0.A03()
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x1294
            r6 = 1
        L_0x1294:
            android.content.Context r1 = r10.getContext()
            r0 = 2131953227(0x7f13064b, float:1.954292E38)
            if (r6 == 0) goto L_0x12a0
            r0 = 2131953228(0x7f13064c, float:1.9542921E38)
        L_0x12a0:
            java.lang.String r2 = r1.getString(r0)
            goto L_0x125f
        L_0x12a5:
            boolean r0 = r1 instanceof X.AnonymousClass6X0
            if (r0 == 0) goto L_0x12da
            r4 = r1
            X.6X0 r4 = (X.AnonymousClass6X0) r4
            X.6lO r0 = r4.A04
            X.6ld r3 = r0.A0P
            r3.A00()
            android.view.ViewGroup r1 = r3.A01
            if (r1 == 0) goto L_0x12bb
            r0 = 0
            r1.setVisibility(r0)
        L_0x12bb:
            android.widget.TextView r2 = r3.A02
            if (r2 == 0) goto L_0x12ce
            android.content.Context r1 = r4.A00
            r0 = 2131967974(0x7f133fe6, float:1.957283E38)
            java.lang.String r0 = r1.getString(r0)
            X.0qQ.A07(r0)
            r2.setText(r0)
        L_0x12ce:
            android.view.ViewGroup r3 = r3.A01
            if (r3 != 0) goto L_0x08fa
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x12da:
            boolean r0 = r1 instanceof X.C308946Wh
            if (r0 == 0) goto L_0x1325
            r4 = r1
            X.6Wh r4 = (X.C308946Wh) r4
            X.6lO r0 = r4.A03
            X.6m4 r3 = r0.A0a
            android.view.ViewGroup r0 = r3.A00
            if (r0 != 0) goto L_0x1303
            android.view.ViewStub r0 = r3.A02
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r1, r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r3.A00 = r1
            r0 = 2131439574(0x7f0b2fd6, float:1.8501107E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.A01 = r0
        L_0x1303:
            android.view.ViewGroup r1 = r3.A00
            if (r1 == 0) goto L_0x130b
            r0 = 0
            r1.setVisibility(r0)
        L_0x130b:
            android.widget.TextView r2 = r3.A01
            if (r2 == 0) goto L_0x131b
            android.content.Context r1 = r4.A00
            r0 = 2131971170(0x7f134c62, float:1.9579312E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setText(r0)
        L_0x131b:
            android.view.ViewGroup r0 = r3.A00
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            return r0
        L_0x1325:
            boolean r0 = r1 instanceof X.C309076Wv
            if (r0 == 0) goto L_0x136d
            r0 = r1
            X.6Wv r0 = (X.C309076Wv) r0
            android.content.Context r1 = r0.A00
            X.6lO r0 = r0.A03
            X.6lS r4 = r0.A0p
            r4.A00()
            android.widget.TextView r3 = r4.A02
            java.lang.String r2 = "Required value was null."
            if (r3 == 0) goto L_0x1b2b
            r0 = 2131971766(0x7f134eb6, float:1.958052E38)
            java.lang.String r0 = r1.getString(r0)
            X.0qQ.A07(r0)
            android.text.SpannableString r1 = X.0nA.A0G(r0)
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r1)
            r3.setText(r0)
            android.widget.ImageView r1 = r4.A01
            if (r1 == 0) goto L_0x1b25
            r0 = 2131238735(0x7f081f4f, float:1.8093757E38)
            r1.setImageResource(r0)
            android.view.ViewGroup r1 = r4.A00
            if (r1 == 0) goto L_0x1b1f
            r0 = 0
            r1.setVisibility(r0)
            android.view.ViewGroup r3 = r4.A00
            if (r3 != 0) goto L_0x08fa
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x136d:
            boolean r0 = r1 instanceof X.C308906Wd
            if (r0 == 0) goto L_0x13c9
            r6 = r1
            X.6Wd r6 = (X.C308906Wd) r6
            X.6lO r0 = r6.A05
            X.6lP r5 = r0.A0Y
            android.view.ViewGroup r0 = r5.A00
            if (r0 != 0) goto L_0x1396
            android.view.ViewStub r0 = r5.A02
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r1, r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r5.A00 = r1
            r0 = 2131436621(0x7f0b244d, float:1.8495118E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.A01 = r0
        L_0x1396:
            android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
            r7.<init>()
            java.lang.String r0 = r6.A00
            if (r0 == 0) goto L_0x13a2
            r7.append(r0)
        L_0x13a2:
            java.util.List r0 = r6.A01
            if (r0 == 0) goto L_0x1b31
            java.util.Iterator r4 = r0.iterator()
        L_0x13aa:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x1b31
            java.lang.Object r0 = r4.next()
            X.DSs r0 = (X.C46263DSs) r0
            X.6Jl r3 = new X.6Jl
            r3.<init>()
            int r2 = r0.Byb()
            int r1 = r0.B1Q()
            r0 = 33
            r7.setSpan(r3, r2, r1, r0)
            goto L_0x13aa
        L_0x13c9:
            boolean r0 = r1 instanceof X.AnonymousClass6XU
            if (r0 == 0) goto L_0x14bc
            r6 = r1
            X.6XU r6 = (X.AnonymousClass6XU) r6
            X.6lO r0 = r6.A03
            X.6lw r5 = r0.A0X
            android.view.ViewGroup r0 = r5.A00
            if (r0 != 0) goto L_0x13f8
            android.view.ViewStub r0 = r5.A02
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r1, r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r5.A00 = r1
            if (r1 == 0) goto L_0x1b6a
            r0 = 2131436261(0x7f0b22e5, float:1.8494387E38)
            android.view.View r1 = r1.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r5.A01 = r1
        L_0x13f8:
            android.widget.TextView r4 = r5.A01
            if (r4 == 0) goto L_0x1b80
            java.lang.Integer r0 = r6.A05
            if (r0 != 0) goto L_0x1422
            java.lang.String r0 = ""
        L_0x1402:
            r4.setText(r0)
            android.widget.TextView r1 = r5.A01
            if (r1 == 0) goto L_0x1b80
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r1.setEllipsize(r0)
            android.view.ViewGroup r2 = r5.A00
            java.lang.String r1 = "Required value was null."
            if (r2 == 0) goto L_0x1b5e
            r0 = 0
            r2.setVisibility(r0)
            android.view.ViewGroup r3 = r5.A00
            if (r3 != 0) goto L_0x08fa
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1422:
            int r1 = r0.intValue()
            r7 = 1
            r0 = 3
            if (r1 == r0) goto L_0x14a7
            if (r1 == r7) goto L_0x14a7
            r0 = 0
            if (r1 == r0) goto L_0x1445
            r0 = 2
            if (r1 != r0) goto L_0x1b64
            android.content.Context r0 = r6.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131971565(0x7f134ded, float:1.9580113E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x143f:
            X.0qQ.A0A(r0)
        L_0x1442:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            goto L_0x1402
        L_0x1445:
            X.3uh r0 = r6.A02
            java.util.List r0 = r0.A0b()
            r3 = 0
            if (r0 == 0) goto L_0x1495
            java.util.Iterator r2 = r0.iterator()
        L_0x1452:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x1493
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.3ui r0 = (X.C255783ui) r0
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r0.A0F()
            if (r0 == 0) goto L_0x1452
            boolean r0 = r0.A0B
            if (r0 != r7) goto L_0x1452
        L_0x1469:
            X.3ui r1 = (X.C255783ui) r1
            if (r1 == 0) goto L_0x1495
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r1.A0F()
            if (r0 == 0) goto L_0x1495
            com.instagram.user.model.User r0 = r0.A02
            if (r0 == 0) goto L_0x1495
            java.lang.String r3 = r0.getUsername()
            boolean r0 = X.00l.A0W(r3)
            if (r0 != 0) goto L_0x1495
            android.content.Context r0 = r6.A00
            android.content.res.Resources r2 = r0.getResources()
            r1 = 2131971568(0x7f134df0, float:1.958012E38)
            java.lang.String[] r0 = new java.lang.String[]{r3}
            android.text.Spanned r0 = X.0bC.A01(r2, r0, r1)
            goto L_0x143f
        L_0x1493:
            r1 = r3
            goto L_0x1469
        L_0x1495:
            android.content.Context r0 = r6.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131971569(0x7f134df1, float:1.9580121E38)
            java.lang.String r0 = r1.getString(r0)
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            goto L_0x143f
        L_0x14a7:
            android.content.Context r0 = r6.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131971569(0x7f134df1, float:1.9580121E38)
            java.lang.String r0 = r1.getString(r0)
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            X.0qQ.A07(r0)
            goto L_0x1442
        L_0x14bc:
            boolean r0 = r1 instanceof X.AnonymousClass6XR
            if (r0 == 0) goto L_0x1524
            r6 = r1
            X.6XR r6 = (X.AnonymousClass6XR) r6
            X.6lO r0 = r6.A04
            X.6lu r5 = r0.A0T
            android.view.ViewGroup r0 = r5.A00
            if (r0 != 0) goto L_0x14eb
            android.view.ViewStub r0 = r5.A02
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r1, r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r5.A00 = r1
            if (r1 == 0) goto L_0x1b8a
            r0 = 2131435782(0x7f0b2106, float:1.8493416E38)
            android.view.View r1 = r1.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r5.A01 = r1
        L_0x14eb:
            android.widget.TextView r4 = r5.A01
            if (r4 == 0) goto L_0x1b80
            android.content.Context r2 = r6.A00
            android.content.res.Resources r3 = r2.getResources()
            r1 = 2131971549(0x7f134ddd, float:1.958008E38)
            X.8hK r0 = r6.A01
            if (r0 == 0) goto L_0x1b78
            int r0 = r0.A04
            java.lang.String r0 = r2.getString(r0)
            X.0qQ.A07(r0)
            r2 = 0
            java.lang.String[] r0 = new java.lang.String[]{r0}
            android.text.Spanned r0 = X.0bC.A01(r3, r0, r1)
            r4.setText(r0)
            android.view.ViewGroup r0 = r5.A00
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x1b72
            r0.setVisibility(r2)
            android.view.ViewGroup r3 = r5.A00
            if (r3 != 0) goto L_0x08fa
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1524:
            boolean r0 = r1 instanceof X.AnonymousClass6X1
            if (r0 == 0) goto L_0x1569
            r0 = r1
            X.6X1 r0 = (X.AnonymousClass6X1) r0
            X.6lO r0 = r0.A01
            X.6lX r2 = r0.A0S
            android.view.ViewGroup r0 = r2.A00
            if (r0 != 0) goto L_0x154d
            android.view.ViewStub r0 = r2.A02
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r1, r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r2.A00 = r1
            r0 = 2131439561(0x7f0b2fc9, float:1.850108E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.A01 = r0
        L_0x154d:
            android.view.ViewGroup r1 = r2.A00
            if (r1 == 0) goto L_0x1555
            r0 = 0
            r1.setVisibility(r0)
        L_0x1555:
            android.widget.TextView r1 = r2.A01
            if (r1 == 0) goto L_0x155f
            r0 = 2131964446(0x7f13321e, float:1.9565674E38)
            r1.setText(r0)
        L_0x155f:
            android.view.ViewGroup r0 = r2.A00
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            return r0
        L_0x1569:
            boolean r0 = r1 instanceof X.AnonymousClass6XT
            if (r0 == 0) goto L_0x162f
            r8 = r1
            X.6XT r8 = (X.AnonymousClass6XT) r8
            X.3uh r0 = r8.A02
            java.util.List r0 = r0.A0b()
            r7 = 0
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L_0x1621
            java.util.Iterator r4 = r0.iterator()
        L_0x157f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x161e
            java.lang.Object r3 = r4.next()
            r2 = r3
            X.3ui r2 = (X.C255783ui) r2
            X.3WT r1 = r2.A11
            X.3WT r0 = X.AnonymousClass3WT.PROMPT
            if (r1 != r0) goto L_0x157f
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r2.A0F()
            if (r0 == 0) goto L_0x157f
            boolean r0 = r0.A0C
            if (r0 != r5) goto L_0x157f
        L_0x159c:
            X.3ui r3 = (X.C255783ui) r3
            if (r3 == 0) goto L_0x1621
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r3.A0F()
            if (r0 == 0) goto L_0x1621
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r0.A00
            int r0 = r0.Bak()
            if (r0 == 0) goto L_0x1621
            android.content.Context r5 = r8.A00
            android.content.res.Resources r4 = r5.getResources()
            r3 = 2131971533(0x7f134dcd, float:1.9580048E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            android.content.res.Resources r1 = r5.getResources()
            X.0qQ.A07(r1)
            r0 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r0 = X.C253673rC.A04(r1, r2, r0, r6, r6)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r7 = r4.getString(r3, r0)
        L_0x15d0:
            X.0qQ.A0A(r7)
            X.6lO r0 = r8.A03
            X.6lv r4 = r0.A0R
            android.view.ViewGroup r0 = r4.A00
            if (r0 != 0) goto L_0x15fb
            android.view.ViewStub r0 = r4.A02
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r1, r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            X.0qQ.A0B(r1, r6)
            r4.A00 = r1
            r0 = 2131434586(0x7f0b1c5a, float:1.849099E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            X.0qQ.A0B(r0, r6)
            r4.A01 = r0
        L_0x15fb:
            android.view.ViewGroup r0 = r4.A00
            if (r0 == 0) goto L_0x1b95
            r0.setVisibility(r6)
            android.widget.TextView r3 = r4.A01
            if (r3 == 0) goto L_0x1b92
            android.content.res.Resources r2 = r5.getResources()
            r1 = 2131971534(0x7f134dce, float:1.958005E38)
            java.lang.String[] r0 = new java.lang.String[]{r7}
            android.text.Spanned r0 = X.0bC.A01(r2, r0, r1)
            r3.setText(r0)
            android.view.ViewGroup r3 = r4.A00
            if (r3 == 0) goto L_0x1b95
            goto L_0x08fa
        L_0x161e:
            r3 = r7
            goto L_0x159c
        L_0x1621:
            android.content.Context r5 = r8.A00
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131971532(0x7f134dcc, float:1.9580046E38)
            java.lang.String r7 = r1.getString(r0)
            goto L_0x15d0
        L_0x162f:
            boolean r0 = r1 instanceof X.C309086Ww
            if (r0 == 0) goto L_0x165c
            r3 = r1
            X.6Ww r3 = (X.C309086Ww) r3
            X.6lO r0 = r3.A03
            X.6lc r0 = r0.A0O
            X.3oV r0 = r0.A00
            android.view.View r2 = r0.getView()
            r0 = 0
            r2.setVisibility(r0)
            r0 = 2131439424(0x7f0b2f40, float:1.8500803E38)
            android.view.View r1 = r2.requireViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r0 = X.C309086Ww.A00(r3)
            r1.setText(r0)
            java.util.List r0 = java.util.Collections.singletonList(r2)
            X.0qQ.A07(r0)
            return r0
        L_0x165c:
            boolean r0 = r1 instanceof X.AnonymousClass6XI
            if (r0 == 0) goto L_0x16cc
            r6 = r1
            X.6XI r6 = (X.AnonymousClass6XI) r6
            X.6lO r0 = r6.A03
            X.6lh r5 = r0.A0N
            android.view.ViewGroup r0 = r5.A00
            if (r0 != 0) goto L_0x1690
            android.view.ViewStub r0 = r5.A03
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r1, r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r5.A00 = r1
            r0 = 2131439419(0x7f0b2f3b, float:1.8500793E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.A01 = r0
            r0 = 2131439420(0x7f0b2f3c, float:1.8500795E38)
            android.view.View r0 = r1.findViewById(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = (com.instagram.common.ui.widget.imageview.IgImageView) r0
            r5.A02 = r0
        L_0x1690:
            android.view.ViewGroup r0 = r5.A00
            r4 = 0
            if (r0 == 0) goto L_0x1698
            r0.setVisibility(r4)
        L_0x1698:
            android.widget.TextView r3 = r5.A01
            if (r3 == 0) goto L_0x16ae
            android.content.Context r0 = r6.A00
            android.content.res.Resources r2 = r0.getResources()
            r1 = 2131952656(0x7f130410, float:1.954176E38)
            java.lang.String[] r0 = new java.lang.String[r4]
            android.text.Spanned r0 = X.0bC.A01(r2, r0, r1)
            r3.setText(r0)
        L_0x16ae:
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r5.A02
            if (r2 == 0) goto L_0x16c2
            android.content.Context r1 = r6.A00
            r0 = 2131099843(0x7f0600c3, float:1.781205E38)
            int r0 = r1.getColor(r0)
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r0)
            r2.setColorFilter(r0)
        L_0x16c2:
            android.view.ViewGroup r0 = r5.A00
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            return r0
        L_0x16cc:
            boolean r0 = r1 instanceof X.AnonymousClass6XF
            if (r0 == 0) goto L_0x1722
            r2 = r1
            X.6XF r2 = (X.AnonymousClass6XF) r2
            X.6lO r0 = r2.A03
            X.6lb r4 = r0.A0L
            android.view.ViewGroup r0 = r4.A00
            if (r0 != 0) goto L_0x16f5
            android.view.ViewStub r0 = r4.A02
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r1, r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r4.A00 = r1
            r0 = 2131439393(0x7f0b2f21, float:1.850074E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.A01 = r0
        L_0x16f5:
            android.view.ViewGroup r1 = r4.A00
            r0 = 0
            if (r1 == 0) goto L_0x16fd
            r1.setVisibility(r0)
        L_0x16fd:
            android.widget.TextView r3 = r4.A01
            if (r3 == 0) goto L_0x1718
            android.content.Context r2 = r2.A00
            r1 = 2131971466(0x7f134d8a, float:1.9579912E38)
            r0 = 2131962927(0x7f132c2f, float:1.9562593E38)
            java.lang.String r0 = r2.getString(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r2.getString(r1, r0)
            r3.setText(r0)
        L_0x1718:
            android.view.ViewGroup r0 = r4.A00
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            return r0
        L_0x1722:
            boolean r0 = r1 instanceof X.AnonymousClass6XQ
            if (r0 == 0) goto L_0x176a
            r2 = r1
            X.6XQ r2 = (X.AnonymousClass6XQ) r2
            X.6lO r0 = r2.A02
            X.6ls r3 = r0.A0J
            android.view.ViewGroup r0 = r3.A00
            if (r0 != 0) goto L_0x174d
            android.view.ViewStub r0 = r3.A02
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r1, r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r3.A00 = r1
            if (r1 == 0) goto L_0x1baf
            r0 = 2131438847(0x7f0b2cff, float:1.8499632E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.A01 = r0
        L_0x174d:
            android.widget.TextView r1 = r3.A01
            if (r1 == 0) goto L_0x1ba5
            java.lang.String r0 = r2.A04
            r1.setText(r0)
            android.view.ViewGroup r2 = r3.A00
            java.lang.String r1 = "Required value was null."
            if (r2 == 0) goto L_0x1b9f
            r0 = 0
            r2.setVisibility(r0)
            android.view.ViewGroup r3 = r3.A00
            if (r3 != 0) goto L_0x08fa
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x176a:
            boolean r0 = r1 instanceof X.C308926Wf
            if (r0 == 0) goto L_0x17aa
            r0 = r1
            X.6Wf r0 = (X.C308926Wf) r0
            X.6lO r0 = r0.A03
            X.6lm r0 = r0.A0I
            X.2eb r4 = r0.A00
            android.view.View r3 = r4.A01()
            android.view.View r1 = r4.A01()
            r0 = 0
            r1.setVisibility(r0)
            android.view.View r1 = r4.A01()
            r0 = 2131439590(0x7f0b2fe6, float:1.850114E38)
            android.view.View r2 = r1.requireViewById(r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.content.Context r1 = r3.getContext()
            r0 = 2131953225(0x7f130649, float:1.9542915E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setText(r0)
            android.view.View r0 = r4.A01()
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            return r0
        L_0x17aa:
            boolean r0 = r1 instanceof X.C309066Wt
            if (r0 == 0) goto L_0x17f2
            r0 = r1
            X.6Wt r0 = (X.C309066Wt) r0
            android.content.Context r1 = r0.A00
            X.6lO r0 = r0.A04
            X.6lS r4 = r0.A0p
            r4.A00()
            android.widget.TextView r3 = r4.A02
            java.lang.String r2 = "Required value was null."
            if (r3 == 0) goto L_0x1bc3
            r0 = 2131973610(0x7f1355ea, float:1.958426E38)
            java.lang.String r0 = r1.getString(r0)
            X.0qQ.A07(r0)
            android.text.SpannableString r1 = X.0nA.A0G(r0)
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r1)
            r3.setText(r0)
            android.widget.ImageView r1 = r4.A01
            if (r1 == 0) goto L_0x1bbd
            r0 = 2131238631(0x7f081ee7, float:1.8093546E38)
            r1.setImageResource(r0)
            android.view.ViewGroup r1 = r4.A00
            if (r1 == 0) goto L_0x1bb7
            r0 = 0
            r1.setVisibility(r0)
            android.view.ViewGroup r3 = r4.A00
            if (r3 != 0) goto L_0x08fa
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x17f2:
            boolean r0 = r1 instanceof X.AnonymousClass6XO
            if (r0 == 0) goto L_0x186f
            X.6XO r1 = (X.AnonymousClass6XO) r1
            X.6lO r6 = r1.A03
            android.widget.TextView r0 = r6.A01
            r7 = 0
            if (r0 != 0) goto L_0x181a
            android.content.Context r0 = r1.A00
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131628905(0x7f0e1369, float:1.8885116E38)
            android.view.View r1 = r1.inflate(r0, r7)
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.TextView"
            X.0qQ.A0C(r1, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r6.A01 = r1
            com.instagram.reels.viewer.attribution.CyclingFrameLayout r0 = r6.A0H
            r0.addView(r1)
        L_0x181a:
            android.widget.TextView r5 = r6.A01
            java.lang.String r3 = "Required value was null."
            r4 = 0
            if (r5 == 0) goto L_0x1862
            android.content.Context r0 = r5.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131971553(0x7f134de1, float:1.9580089E38)
            java.lang.String r0 = r1.getString(r0)
            r5.setText(r0)
            android.content.Context r2 = r5.getContext()
            r0 = 2131238092(0x7f081ccc, float:1.8092453E38)
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r0)
            if (r1 == 0) goto L_0x1bcf
            r0 = 2131099843(0x7f0600c3, float:1.781205E38)
            int r0 = r2.getColor(r0)
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r0)
            r1.setColorFilter(r0)
            r5.setCompoundDrawablesWithIntrinsicBounds(r7, r7, r1, r7)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131165190(0x7f070006, float:1.794459E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r5.setCompoundDrawablePadding(r0)
            r5.setVisibility(r4)
        L_0x1862:
            android.widget.TextView r0 = r6.A01
            if (r0 == 0) goto L_0x1bc9
            android.widget.TextView[] r0 = new android.widget.TextView[]{r0}
            java.util.ArrayList r0 = X.0sr.A1M(r0)
            return r0
        L_0x186f:
            boolean r0 = r1 instanceof X.AnonymousClass6XW
            if (r0 == 0) goto L_0x18b7
            r3 = r1
            X.6XW r3 = (X.AnonymousClass6XW) r3
            X.6lO r0 = r3.A02
            X.6lq r2 = r0.A0F
            android.view.View r0 = r2.A00
            if (r0 != 0) goto L_0x1898
            android.view.ViewStub r0 = r2.A02
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r1, r0)
            r2.A00 = r1
            if (r1 == 0) goto L_0x18b5
            r0 = 2131439381(0x7f0b2f15, float:1.8500716E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x1896:
            r2.A01 = r0
        L_0x1898:
            android.widget.TextView r1 = r2.A01
            if (r1 == 0) goto L_0x18a1
            java.lang.String r0 = r3.A04
            r1.setText(r0)
        L_0x18a1:
            android.view.View r1 = r2.A00
            r0 = 0
            if (r1 == 0) goto L_0x18a9
            r1.setVisibility(r0)
        L_0x18a9:
            android.view.View r0 = r2.A00
            if (r0 != 0) goto L_0x1bd5
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x18b5:
            r0 = 0
            goto L_0x1896
        L_0x18b7:
            boolean r0 = r1 instanceof X.AnonymousClass6XZ
            if (r0 == 0) goto L_0x1937
            r2 = r1
            X.6XZ r2 = (X.AnonymousClass6XZ) r2
            X.6lO r0 = r2.A05
            X.6m3 r7 = r0.A0D
            android.view.ViewGroup r0 = r7.A00
            if (r0 != 0) goto L_0x18e0
            android.view.ViewStub r0 = r7.A02
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r1, r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r7.A00 = r1
            r0 = 2131439376(0x7f0b2f10, float:1.8500705E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.A01 = r0
        L_0x18e0:
            android.content.Context r9 = r2.A00
            r1 = 2131971458(0x7f134d82, float:1.9579896E38)
            r8 = 1
            java.lang.String r2 = r2.A07
            r6 = 0
            java.lang.Object[] r0 = new java.lang.Object[]{r2}
            java.lang.String r5 = r9.getString(r1, r0)
            X.0qQ.A07(r5)
            r0 = 0
            int r4 = X.00l.A08(r5, r2, r6, r6)
            if (r4 < 0) goto L_0x18fc
            r0 = 1
        L_0x18fc:
            java.lang.String r1 = "Check failed."
            if (r0 == 0) goto L_0x1be4
            java.util.regex.Pattern r0 = X.0mp.A00
            int r3 = r2.length()
            int r3 = r3 + r4
            if (r3 < 0) goto L_0x1bde
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            r2.<init>(r5)
            android.text.style.StyleSpan r1 = new android.text.style.StyleSpan
            r1.<init>(r8)
            r0 = 33
            r2.setSpan(r1, r4, r3, r0)
            android.graphics.drawable.Drawable r0 = X.C306026Km.A00(r9)
            X.C306026Km.A01(r9, r0, r2)
            android.widget.TextView r0 = r7.A01
            if (r0 == 0) goto L_0x1926
            r0.setText(r2)
        L_0x1926:
            android.view.ViewGroup r0 = r7.A00
            if (r0 == 0) goto L_0x192d
            r0.setVisibility(r6)
        L_0x192d:
            android.view.ViewGroup r0 = r7.A00
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            return r0
        L_0x1937:
            boolean r0 = r1 instanceof X.AnonymousClass6XY
            if (r0 == 0) goto L_0x1981
            r3 = r1
            X.6XY r3 = (X.AnonymousClass6XY) r3
            X.6lO r0 = r3.A03
            X.6m2 r2 = r0.A0C
            android.view.ViewGroup r0 = r2.A00
            if (r0 != 0) goto L_0x1960
            android.view.ViewStub r0 = r2.A02
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r1, r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r2.A00 = r1
            r0 = 2131439374(0x7f0b2f0e, float:1.8500701E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.A01 = r0
        L_0x1960:
            com.instagram.user.model.User r0 = r3.A05
            if (r0 == 0) goto L_0x1977
            android.widget.TextView r1 = r2.A01
            if (r1 == 0) goto L_0x196f
            java.lang.String r0 = r0.getUsername()
            r1.setText(r0)
        L_0x196f:
            android.view.ViewGroup r1 = r2.A00
            if (r1 == 0) goto L_0x1977
            r0 = 0
            r1.setVisibility(r0)
        L_0x1977:
            android.view.ViewGroup r0 = r2.A00
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            return r0
        L_0x1981:
            boolean r0 = r1 instanceof X.AnonymousClass6XC
            if (r0 == 0) goto L_0x1c32
            r0 = r1
            X.6XC r0 = (X.AnonymousClass6XC) r0
            X.1Xj r1 = r0.A01
            X.6lT r4 = r0.A05
            com.instagram.common.session.UserSession r9 = r0.A01
            r0 = 1
            X.0qQ.A0B(r4, r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.String r3 = "EffectAttributionViewBinder"
            if (r1 != 0) goto L_0x199f
            java.lang.String r0 = "Media is null"
            goto L_0x07e5
        L_0x199f:
            X.1Xy r0 = r1.A0C
            com.instagram.feed.media.CreativeConfigIntf r11 = r0.AsO()
            if (r11 == 0) goto L_0x07e8
            X.6Ku r10 = X.C284745Nt.A03(r11)
            android.view.ViewStub r1 = r4.A03
            android.content.Context r8 = r1.getContext()
            X.0qQ.A07(r8)
            android.view.ViewGroup r0 = r4.A00
            if (r0 != 0) goto L_0x19e1
            android.view.View r2 = r1.inflate()
            boolean r1 = r2 instanceof android.view.ViewGroup
            r0 = 0
            if (r1 == 0) goto L_0x1a53
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
        L_0x19c3:
            r4.A00 = r2
            if (r2 == 0) goto L_0x1a50
            r1 = 2131432246(0x7f0b1336, float:1.8486244E38)
            android.view.View r1 = r2.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
        L_0x19d0:
            r4.A01 = r1
            android.view.ViewGroup r1 = r4.A00
            if (r1 == 0) goto L_0x19df
            r0 = 2131432247(0x7f0b1337, float:1.8486246E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x19df:
            r4.A02 = r0
        L_0x19e1:
            android.view.ViewGroup r5 = r4.A00
            if (r5 == 0) goto L_0x07e8
            android.widget.ImageView r2 = r4.A01
            if (r2 == 0) goto L_0x07e8
            android.widget.TextView r7 = r4.A02
            if (r7 == 0) goto L_0x07e8
            X.6Ku r0 = X.C284745Nt.A03(r11)
            if (r0 == 0) goto L_0x19fa
            int r0 = r0.ordinal()
            switch(r0) {
                case 2: goto L_0x1a40;
                case 3: goto L_0x1a44;
                case 4: goto L_0x1a40;
                case 5: goto L_0x1a48;
                case 6: goto L_0x19fa;
                case 7: goto L_0x19fa;
                case 8: goto L_0x1a4c;
                case 9: goto L_0x19fa;
                case 10: goto L_0x1a3c;
                default: goto L_0x19fa;
            }
        L_0x19fa:
            java.lang.Boolean r0 = X.C306096Kt.A00(r9)
            boolean r1 = r0.booleanValue()
            r0 = 2131231720(0x7f0803e8, float:1.8079529E38)
            if (r1 == 0) goto L_0x1a0a
            r0 = 2131238248(0x7f081d68, float:1.809277E38)
        L_0x1a0a:
            r2.setImageResource(r0)
            r4 = 0
            if (r10 == 0) goto L_0x1a2d
            int r0 = r10.ordinal()
            switch(r0) {
                case 0: goto L_0x1a2d;
                case 1: goto L_0x1bea;
                case 2: goto L_0x1bea;
                case 3: goto L_0x1bea;
                case 4: goto L_0x1bea;
                case 5: goto L_0x1bea;
                case 6: goto L_0x1a17;
                case 7: goto L_0x1bea;
                case 8: goto L_0x1bea;
                case 9: goto L_0x1a2d;
                case 10: goto L_0x1bea;
                case 11: goto L_0x1a2d;
                case 12: goto L_0x1a2d;
                default: goto L_0x1a17;
            }
        L_0x1a17:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "isEligibleForAttribution not handled: "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "ReelCaptureType"
            X.0wb.A03(r0, r1)
        L_0x1a2d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Capture type is not eligible for attribution:"
            r2.append(r0)
            r2.append(r10)
            goto L_0x07e1
        L_0x1a3c:
            r0 = 2131238232(0x7f081d58, float:1.8092737E38)
            goto L_0x1a0a
        L_0x1a40:
            r0 = 2131240041(0x7f082469, float:1.8096406E38)
            goto L_0x1a0a
        L_0x1a44:
            r0 = 2131237319(0x7f0819c7, float:1.8090885E38)
            goto L_0x1a0a
        L_0x1a48:
            r0 = 2131231161(0x7f0801b9, float:1.8078395E38)
            goto L_0x1a0a
        L_0x1a4c:
            r0 = 2131239104(0x7f0820c0, float:1.8094506E38)
            goto L_0x1a0a
        L_0x1a50:
            r1 = r0
            goto L_0x19d0
        L_0x1a53:
            r2 = r0
            goto L_0x19c3
        L_0x1a56:
            r2 = 2131971660(0x7f134e4c, float:1.9580306E38)
            goto L_0x1c1f
        L_0x1a5b:
            r2 = 2131971463(0x7f134d87, float:1.9579906E38)
            goto L_0x1c1f
        L_0x1a60:
            r2 = 2131971580(0x7f134dfc, float:1.9580143E38)
            goto L_0x1c1f
        L_0x1a65:
            r2 = 2131971596(0x7f134e0c, float:1.9580176E38)
            goto L_0x1c1f
        L_0x1a6a:
            r2 = 2131971599(0x7f134e0f, float:1.9580182E38)
            goto L_0x1c1f
        L_0x1a6f:
            r2 = 2131971523(0x7f134dc3, float:1.9580028E38)
            goto L_0x1c1f
        L_0x1a74:
            r2 = 2131971644(0x7f134e3c, float:1.9580273E38)
            goto L_0x1c1f
        L_0x1a79:
            r2 = 2131971464(0x7f134d88, float:1.9579908E38)
            goto L_0x1c1f
        L_0x1a7e:
            r2 = 2131971556(0x7f134de4, float:1.9580095E38)
            goto L_0x1c1f
        L_0x1a83:
            r2 = 2131971557(0x7f134de5, float:1.9580097E38)
            goto L_0x1c1f
        L_0x1a88:
            r2 = 2131971516(0x7f134dbc, float:1.9580014E38)
            goto L_0x1c1f
        L_0x1a8d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x1a93:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x1a99:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x1a9f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x1aa5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x1aab:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x1ab1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x1ab7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x1abd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x1ac3:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1acb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1ad1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x1ad7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x1add:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x1ae3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x1ae9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x1aef:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x1af5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x1afb:
            java.lang.String r1 = "Check failed."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1b03:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1b09:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1b11:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1b17:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1b1f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x1b25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x1b2b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x1b31:
            android.content.Context r1 = r6.A02
            android.graphics.drawable.Drawable r0 = X.C306026Km.A00(r1)
            X.C306026Km.A01(r1, r0, r7)
            android.widget.TextView r0 = r5.A01
            if (r0 == 0) goto L_0x1b41
            r0.setText(r7)
        L_0x1b41:
            android.view.ViewGroup r1 = r5.A00
            if (r1 == 0) goto L_0x1b49
            r0 = 0
            r1.setVisibility(r0)
        L_0x1b49:
            android.view.ViewGroup r2 = r5.A00
            if (r2 == 0) goto L_0x1b54
            X.6ml r1 = r6.A06
            X.3uh r0 = r6.A04
            r1.CwN(r2, r0)
        L_0x1b54:
            android.view.ViewGroup r0 = r5.A00
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            return r0
        L_0x1b5e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1b64:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x1b6a:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1b72:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1b78:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1b80:
            java.lang.String r0 = "attributionText"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x1b8a:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1b92:
            java.lang.String r0 = "attributionText"
            goto L_0x1b97
        L_0x1b95:
            java.lang.String r0 = "container"
        L_0x1b97:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x1b9f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1ba5:
            java.lang.String r0 = "subTitleText"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x1baf:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1bb7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x1bbd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x1bc3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x1bc9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x1bcf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x1bd5:
            android.view.View[] r0 = new android.view.View[]{r0}
            java.util.ArrayList r0 = X.0sr.A1M(r0)
            return r0
        L_0x1bde:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1be4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1bea:
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131951730(0x7f130072, float:1.9539883E38)
            java.lang.String r3 = r1.getString(r0)
            X.0qQ.A07(r3)
            android.content.res.Resources r2 = r8.getResources()
            r1 = 2131961542(0x7f1326c6, float:1.9559784E38)
            java.lang.String r0 = r10.A01(r8)
            java.lang.String[] r0 = new java.lang.String[]{r0, r3}
            android.text.Spanned r1 = X.0bC.A01(r2, r0, r1)
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r1)
            X.C250563lf.A0M(r8, r0, r9)
            r7.setText(r0)
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r7.setEllipsize(r0)
            goto L_0x1c2b
        L_0x1c1c:
            r2 = 2131971518(0x7f134dbe, float:1.9580018E38)
        L_0x1c1f:
            android.content.Context r1 = r8.A00
            r4 = 0
            com.instagram.common.session.UserSession r0 = r8.A01
            java.lang.CharSequence r0 = X.C250563lf.A0F(r1, r0, r2)
            r7.setText(r0)
        L_0x1c2b:
            r5.setVisibility(r4)
        L_0x1c2e:
            r6.add(r5)
            return r6
        L_0x1c32:
            boolean r0 = r1 instanceof X.AnonymousClass6X8
            if (r0 == 0) goto L_0x1d22
            r8 = r1
            X.6X8 r8 = (X.AnonymousClass6X8) r8
            X.3uh r0 = r8.A01
            X.1Xj r1 = r0.A0b
            java.lang.String r2 = "Required value was null."
            if (r1 == 0) goto L_0x1d1c
            X.6lO r0 = r8.A02
            X.6lR r4 = r0.A0B
            android.view.ViewGroup r0 = r4.A00
            if (r0 != 0) goto L_0x1c6e
            android.view.ViewStub r0 = r4.A03
            android.view.View r3 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r3, r0)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r4.A00 = r3
            r0 = 2131439364(0x7f0b2f04, float:1.8500681E38)
            android.view.View r0 = r3.findViewById(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = (com.instagram.common.ui.widget.imageview.IgImageView) r0
            r4.A02 = r0
            r0 = 2131439366(0x7f0b2f06, float:1.8500685E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.A01 = r0
        L_0x1c6e:
            X.1Xy r0 = r1.A0C
            java.util.List r0 = r0.C0D()
            if (r0 == 0) goto L_0x1cb8
            java.lang.Object r0 = X.00k.A0J(r0)
            X.DTq r0 = (X.C46287DTq) r0
            if (r0 == 0) goto L_0x1cb8
            com.instagram.common.typedurl.ImageUrl r7 = r0.Ad3()
        L_0x1c82:
            X.1Xy r0 = r1.A0C
            java.util.List r0 = r0.C0D()
            if (r0 == 0) goto L_0x1cb6
            java.lang.Object r0 = X.00k.A0J(r0)
            X.DTq r0 = (X.C46287DTq) r0
            if (r0 == 0) goto L_0x1cb6
            java.lang.String r6 = r0.Ad5()
        L_0x1c96:
            android.widget.TextView r5 = r4.A01
            if (r5 == 0) goto L_0x1d16
            r3 = 0
            if (r7 == 0) goto L_0x1cc0
            boolean r0 = X.C253833rU.A02(r7)
            if (r0 != 0) goto L_0x1cc0
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r4.A02
            if (r1 == 0) goto L_0x1cba
            X.0iw r0 = r8.A00
            r1.setUrl(r7, r0)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r4.A02
            if (r1 != 0) goto L_0x1cdd
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x1cb6:
            r6 = 0
            goto L_0x1c96
        L_0x1cb8:
            r7 = 0
            goto L_0x1c82
        L_0x1cba:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x1cc0:
            java.lang.String r1 = r1.A2z()
            java.lang.String r0 = "FB_TO_IG_XPOST"
            boolean r0 = r0.equals(r1)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r4.A02
            if (r0 == 0) goto L_0x1cfc
            if (r1 == 0) goto L_0x1d0a
            r0 = 2131238289(0x7f081d91, float:1.8092852E38)
            r1.setImageResource(r0)
            int r0 = r5.getCurrentTextColor()
            r1.setColorFilter(r0)
        L_0x1cdd:
            r1.setVisibility(r3)
        L_0x1ce0:
            r5.setText(r6)
            android.view.ViewGroup r0 = r4.A00
            if (r0 == 0) goto L_0x1d04
            r0.setVisibility(r3)
            android.view.ViewGroup r0 = r4.A00
            if (r0 == 0) goto L_0x1cf1
            r0.setVisibility(r3)
        L_0x1cf1:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.view.ViewGroup r0 = r4.A00
            r1.add(r0)
            return r1
        L_0x1cfc:
            if (r1 == 0) goto L_0x1d10
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x1ce0
        L_0x1d04:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x1d0a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x1d10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x1d16:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x1d1c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x1d22:
            r2 = r1
            X.6XD r2 = (X.AnonymousClass6XD) r2
            X.6lO r8 = r2.A02
            android.widget.TextView r0 = r8.A00
            r3 = 0
            if (r0 != 0) goto L_0x1d4b
            android.content.Context r0 = r2.A00
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131628905(0x7f0e1369, float:1.8885116E38)
            android.view.View r1 = r1.inflate(r0, r3)
            r0 = 9
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r8.A00 = r1
            com.instagram.reels.viewer.attribution.CyclingFrameLayout r0 = r8.A0H
            r0.addView(r1)
        L_0x1d4b:
            X.3uh r0 = r2.A01
            com.instagram.model.effect.AttributedAREffect r0 = r0.A05
            if (r0 == 0) goto L_0x1d92
            java.lang.String r0 = r0.A03()
            if (r0 == 0) goto L_0x1d92
            android.widget.TextView r7 = r8.A00
            r6 = 0
            if (r7 == 0) goto L_0x1d8b
            android.content.Context r5 = r2.A00
            r1 = 2131961547(0x7f1326cb, float:1.9559794E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r4 = r5.getString(r1, r0)
            X.0qQ.A07(r4)
            com.instagram.common.session.UserSession r3 = r2.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36312020047364989(0x8101970000037d, double:3.02720592249762E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x1d88
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>(r4)
            android.graphics.drawable.Drawable r0 = X.C306026Km.A00(r5)
            X.C306026Km.A01(r5, r0, r1)
            r4 = r1
        L_0x1d88:
            r7.setText(r4)
        L_0x1d8b:
            android.widget.TextView r0 = r8.A00
            if (r0 == 0) goto L_0x1d92
            r0.setVisibility(r6)
        L_0x1d92:
            android.widget.TextView r0 = r8.A00
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C308916We.A04():java.util.List");
    }
}
