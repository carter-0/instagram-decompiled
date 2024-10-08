package com.instagram.reels.prompt.model;

import X.0nH;
import X.0qQ;
import X.0sn;
import X.0sr;
import X.1QE;
import X.1hu;
import X.2Yu;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.C17946Vib;
import X.C273914nO;
import X.C273924nP;
import X.C2802350v;
import X.C317876nz;
import X.C317886o0;
import X.C318046oG;
import X.C376399Hv;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.android.R;
import com.instagram.api.schemas.CameraTool;
import com.instagram.api.schemas.GenAIToolInfoDictIntf;
import com.instagram.api.schemas.StoryPromptTappableData;
import com.instagram.api.schemas.StoryPromptTappableDataIntf;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.api.schemas.StoryTemplateAssetDictIntf;
import com.instagram.api.schemas.StoryTemplateDictIntf;
import com.instagram.api.schemas.StoryTemplateStaticOverlayDictIntf;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

public final class PromptStickerModel implements Parcelable, C2802350v {
    public static final Parcelable.Creator CREATOR = new C376399Hv(72);
    public StoryPromptTappableDataIntf A00;
    public final int A01;
    public final User A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x008a, code lost:
        if (r7.A00.Bhw() == com.instagram.api.schemas.StoryPromptType.A0B) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ad, code lost:
        if (r5 != X.C59809JZd.A02) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00cf, code lost:
        if (r5 != X.C59809JZd.A03) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f1, code lost:
        if (X.C59808JZc.A00(r6) != X.C59809JZd.A02) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0136, code lost:
        if (r1 != true) goto L_0x0138;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PromptStickerModel(com.instagram.api.schemas.StoryPromptTappableDataIntf r8) {
        /*
            r7 = this;
            r4 = 1
            X.0qQ.A0B(r8, r4)
            r7.<init>()
            r7.A00 = r8
            java.lang.String r0 = r8.getId()
            r7.A03 = r0
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r7.A00
            java.lang.String r0 = r0.Bhs()
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = ""
        L_0x0019:
            r7.A04 = r0
            com.instagram.api.schemas.StoryPromptTappableDataIntf r1 = r7.A00
            com.instagram.user.model.User r0 = r1.BYz()
            r7.A02 = r0
            com.instagram.api.schemas.StoryPromptDisablementState r2 = r1.Axh()
            com.instagram.api.schemas.StoryPromptDisablementState r1 = com.instagram.api.schemas.StoryPromptDisablementState.DISABLED
            r3 = 0
            r0 = 0
            if (r2 != r1) goto L_0x002e
            r0 = 1
        L_0x002e:
            r7.A01 = r0
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r7.A00
            java.lang.Boolean r0 = r0.CYj()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            boolean r0 = X.0qQ.A0K(r0, r2)
            r7.A0E = r0
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r7.A00
            java.lang.Boolean r0 = r0.BBm()
            X.0qQ.A0K(r0, r2)
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r7.A00
            java.lang.Boolean r0 = r0.CUt()
            boolean r0 = X.0qQ.A0K(r0, r2)
            r7.A09 = r0
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r7.A00
            java.lang.String r1 = r0.Bhs()
            java.lang.String r0 = "clips_creator_invite"
            boolean r0 = X.0qQ.A0K(r1, r0)
            r7.A07 = r0
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r7.A00
            com.instagram.api.schemas.StoryPromptType r1 = r0.Bhw()
            com.instagram.api.schemas.StoryPromptType r0 = com.instagram.api.schemas.StoryPromptType.MAGIC_MOD_RESTYLE
            if (r1 == r0) goto L_0x008c
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r7.A00
            com.instagram.api.schemas.StoryPromptType r1 = r0.Bhw()
            com.instagram.api.schemas.StoryPromptType r0 = com.instagram.api.schemas.StoryPromptType.MAGIC_MOD_BACKDROP
            if (r1 == r0) goto L_0x008c
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r7.A00
            com.instagram.api.schemas.StoryPromptType r1 = r0.Bhw()
            com.instagram.api.schemas.StoryPromptType r0 = com.instagram.api.schemas.StoryPromptType.MAGIC_MOD_ADD_YOURS_WITH_BACKDROP
            if (r1 == r0) goto L_0x008c
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r7.A00
            com.instagram.api.schemas.StoryPromptType r5 = r0.Bhw()
            com.instagram.api.schemas.StoryPromptType r1 = com.instagram.api.schemas.StoryPromptType.MAGIC_MOD_BRUSH
            r0 = 0
            if (r5 != r1) goto L_0x008d
        L_0x008c:
            r0 = 1
        L_0x008d:
            r7.A0D = r0
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r7.A00
            com.instagram.api.schemas.StoryPromptType r1 = r0.Bhw()
            com.instagram.api.schemas.StoryPromptType r0 = com.instagram.api.schemas.StoryPromptType.STORY_TEMPLATE
            r6 = 0
            if (r1 != r0) goto L_0x00af
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r7.A00
            com.instagram.api.schemas.GenAIToolInfoDictIntf r0 = r0.B91()
            if (r0 == 0) goto L_0x0153
            com.instagram.api.schemas.CameraTool r0 = r0.C8A()
        L_0x00a6:
            X.JZd r5 = X.C59808JZc.A00(r0)
            X.JZd r1 = X.C59809JZd.IMAGINE
            r0 = 1
            if (r5 == r1) goto L_0x00b0
        L_0x00af:
            r0 = 0
        L_0x00b0:
            r7.A0C = r0
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r7.A00
            com.instagram.api.schemas.StoryPromptType r1 = r0.Bhw()
            com.instagram.api.schemas.StoryPromptType r0 = com.instagram.api.schemas.StoryPromptType.IMAGINE_ME
            if (r1 != r0) goto L_0x00d1
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r7.A00
            com.instagram.api.schemas.GenAIToolInfoDictIntf r0 = r0.B91()
            if (r0 == 0) goto L_0x0150
            com.instagram.api.schemas.CameraTool r0 = r0.C8A()
        L_0x00c8:
            X.JZd r5 = X.C59808JZc.A00(r0)
            X.JZd r1 = X.C59809JZd.IMAGINE_ME
            r0 = 1
            if (r5 == r1) goto L_0x00d2
        L_0x00d1:
            r0 = 0
        L_0x00d2:
            r7.A0B = r0
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r7.A00
            com.instagram.api.schemas.StoryPromptType r1 = r0.Bhw()
            com.instagram.api.schemas.StoryPromptType r0 = com.instagram.api.schemas.StoryPromptType.IMAGINE
            if (r1 != r0) goto L_0x00f3
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r7.A00
            com.instagram.api.schemas.GenAIToolInfoDictIntf r0 = r0.B91()
            if (r0 == 0) goto L_0x00ea
            com.instagram.api.schemas.CameraTool r6 = r0.C8A()
        L_0x00ea:
            X.JZd r5 = X.C59808JZc.A00(r6)
            X.JZd r1 = X.C59809JZd.IMAGINE
            r0 = 1
            if (r5 == r1) goto L_0x00f4
        L_0x00f3:
            r0 = 0
        L_0x00f4:
            r7.A0A = r0
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r7.A00
            com.instagram.api.schemas.StoryTemplateDictIntf r0 = r0.C1M()
            if (r0 == 0) goto L_0x010a
            com.instagram.api.schemas.StoryTemplateAssetDictIntf r0 = r0.C4X()
            if (r0 == 0) goto L_0x010a
            java.lang.String r0 = r0.Aer()
            if (r0 != 0) goto L_0x011e
        L_0x010a:
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r7.A00
            com.instagram.api.schemas.StoryTemplateDictIntf r0 = r0.C1M()
            if (r0 == 0) goto L_0x014e
            com.instagram.api.schemas.StoryTemplateAssetDictIntf r0 = r0.C4X()
            if (r0 == 0) goto L_0x014e
            com.instagram.model.mediasize.ImageInfo r0 = r0.Aew()
            if (r0 == 0) goto L_0x014e
        L_0x011e:
            r0 = 1
        L_0x011f:
            r7.A06 = r0
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r7.A00
            com.instagram.api.schemas.StoryTemplateDictIntf r0 = r0.C1M()
            if (r0 == 0) goto L_0x0138
            java.util.List r0 = r0.C0B()
            if (r0 == 0) goto L_0x0138
            boolean r0 = r0.isEmpty()
            r1 = r0 ^ 1
            r0 = 1
            if (r1 == r4) goto L_0x0139
        L_0x0138:
            r0 = 0
        L_0x0139:
            r7.A05 = r0
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r7.A00
            com.instagram.api.schemas.ElectionAddYoursInfoDictIntf r0 = r0.B0N()
            if (r0 == 0) goto L_0x014b
            java.lang.Boolean r0 = r0.AxP()
            boolean r3 = X.0qQ.A0K(r0, r2)
        L_0x014b:
            r7.A08 = r3
            return
        L_0x014e:
            r0 = 0
            goto L_0x011f
        L_0x0150:
            r0 = r6
            goto L_0x00c8
        L_0x0153:
            r0 = r6
            goto L_0x00a6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.reels.prompt.model.PromptStickerModel.<init>(com.instagram.api.schemas.StoryPromptTappableDataIntf):void");
    }

    public final void A0C(List list) {
        0qQ.A0B(list, 0);
        C17946Vib AKQ = this.A00.AKQ();
        AKQ.A0R = list;
        this.A00 = AKQ.A00();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }

    public final int A01(Context context) {
        int A012;
        int i;
        StoryPromptType Bhw = this.A00.Bhw();
        if (Bhw != null) {
            int ordinal = Bhw.ordinal();
            if (ordinal == 7 || ordinal == 6) {
                i = R.attr.igds_color_creation_tools_pink;
            } else if (ordinal == 9) {
                i = R.attr.igds_color_creation_tools_purple;
            } else if (ordinal == 5) {
                i = R.attr.igds_color_creation_tools_grey_09;
            }
            Integer valueOf = Integer.valueOf(i);
            if (valueOf != null) {
                A012 = 2Yu.A0H(context, valueOf.intValue());
                return context.getColor(A012);
            }
        }
        A012 = 1QE.A01(context);
        return context.getColor(A012);
    }

    public final StoryPromptTappableData A02() {
        return this.A00.FAs(new 1hu((UserSession) null));
    }

    public final StoryPromptType A03() {
        StoryPromptType Bhw = this.A00.Bhw();
        if (Bhw == null) {
            return StoryPromptType.DEFAULT;
        }
        return Bhw;
    }

    public final String A05() {
        String mediaId = this.A00.getMediaId();
        if (mediaId == null) {
            return "";
        }
        return mediaId;
    }

    public final LinkedHashMap A06() {
        long j;
        long j2;
        StoryTemplateAssetDictIntf C4X;
        List<StoryTemplateStaticOverlayDictIntf> C1I;
        List C0G;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String obj = C318046oG.TEXT.toString();
        StoryTemplateDictIntf C1M = this.A00.C1M();
        long j3 = 0;
        if (C1M == null || (C0G = C1M.C0G()) == null) {
            j = 0;
        } else {
            j = (long) C0G.size();
        }
        linkedHashMap.put(obj, Long.valueOf(j));
        String obj2 = C318046oG.GIF.toString();
        StoryTemplateDictIntf C1M2 = this.A00.C1M();
        if (C1M2 == null || (C1I = C1M2.C1I()) == null) {
            j2 = 0;
        } else {
            int i = 0;
            if (!(C1I instanceof Collection) || !C1I.isEmpty()) {
                for (StoryTemplateStaticOverlayDictIntf Bzp : C1I) {
                    if (0qQ.A0K(Bzp.Bzp(), "gif") && (i = i + 1) < 0) {
                        0sr.A1S();
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
            }
            j2 = (long) i;
        }
        linkedHashMap.put(obj2, Long.valueOf(j2));
        String obj3 = C318046oG.GALLERY.toString();
        StoryTemplateDictIntf C1M3 = this.A00.C1M();
        if (!(C1M3 == null || (C4X = C1M3.C4X()) == null || C4X.BGO() == null)) {
            j3 = 1;
        }
        linkedHashMap.put(obj3, Long.valueOf(j3));
        return linkedHashMap;
    }

    public final void A07(StoryTemplateDictIntf storyTemplateDictIntf) {
        C17946Vib AKQ = this.A00.AKQ();
        AKQ.A07 = storyTemplateDictIntf;
        this.A00 = AKQ.A00();
    }

    public final void A09(String str) {
        C17946Vib AKQ = this.A00.AKQ();
        AKQ.A0L = str;
        this.A00 = AKQ.A00();
    }

    public final void A0A(String str) {
        C17946Vib AKQ = this.A00.AKQ();
        AKQ.A0P = str;
        this.A00 = AKQ.A00();
    }

    public final void A0B(String str) {
        C17946Vib AKQ = this.A00.AKQ();
        if (str == null) {
            str = "";
        }
        AKQ.A0Q = str;
        this.A00 = AKQ.A00();
    }

    public final boolean A0D() {
        StoryTemplateDictIntf C1M = this.A00.C1M();
        if (C1M == null || C1M.BV3() == null) {
            return false;
        }
        return true;
    }

    public final boolean A0E() {
        List<StoryTemplateStaticOverlayDictIntf> list;
        StoryTemplateDictIntf C1M = this.A00.C1M();
        if (C1M != null) {
            list = C1M.C1I();
        } else {
            list = null;
        }
        if (list == null) {
            return false;
        }
        for (StoryTemplateStaticOverlayDictIntf Bzp : list) {
            if (!Bzp.Bzp().equals("gif")) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0F() {
        if (this.A00.Bhw() == StoryPromptType.MAGIC_MOD_ADD_YOURS_WITH_BACKDROP) {
            return true;
        }
        return false;
    }

    public final boolean A0G() {
        if (this.A00.Bhw() == StoryPromptType.BEFORE_AND_AFTER) {
            return true;
        }
        return false;
    }

    public final boolean A0H() {
        return 0qQ.A0K(this.A00.CQE(), true);
    }

    public final boolean A0I() {
        CameraTool cameraTool;
        if (this.A0B) {
            GenAIToolInfoDictIntf B91 = this.A00.B91();
            if (B91 != null) {
                cameraTool = B91.C8A();
            } else {
                cameraTool = null;
            }
            if (cameraTool != CameraTool.MEMU_IN_FEED_WITH_MIMICRY) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A0J() {
        if (0qQ.A0K(this.A00.Bzk(), "backdrop_sticker_default") || 0qQ.A0K(this.A00.Bzk(), "restyle_sticker_default") || 0qQ.A0K(this.A00.Bzk(), "backdrop_sticker_with_facepile_style") || 0qQ.A0K(this.A00.Bzk(), "restyle_sticker_with_facepile_style") || 0qQ.A0K(this.A00.Bzk(), "add_yours_backdrop_sticker_default")) {
            return true;
        }
        return false;
    }

    public final boolean A0K() {
        return 0qQ.A0K(this.A00.CZB(), true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r1 != false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0L() {
        /*
            r2 = this;
            java.lang.String r0 = r2.A03
            if (r0 == 0) goto L_0x000b
            boolean r1 = X.00l.A0W(r0)
            r0 = 0
            if (r1 == 0) goto L_0x000c
        L_0x000b:
            r0 = 1
        L_0x000c:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.reels.prompt.model.PromptStickerModel.A0L():boolean");
    }

    public final boolean A0M() {
        if (this.A00.Bhw() == StoryPromptType.STORY_TEMPLATE) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ List B5h() {
        return 0sn.A00;
    }

    public final C273914nO BkW() {
        C317876nz r0;
        List singletonList;
        C318046oG r1;
        String str;
        C273914nO r2 = new C273914nO();
        r2.A01 = C273924nP.STATIC_STICKERS;
        if (A0H()) {
            C317876nz r02 = C317876nz.A0a;
            r1 = C318046oG.CLIPS_PROMPT;
            str = "clips_prompt_sticker_bundle_id";
        } else {
            if (this.A00.Bhw() == StoryPromptType.MAGIC_MOD_BACKDROP || this.A00.Bhw() == StoryPromptType.MAGIC_MOD_ADD_YOURS_WITH_BACKDROP) {
                r0 = C317876nz.A15;
            } else if (this.A00.Bhw() == StoryPromptType.MAGIC_MOD_RESTYLE) {
                r0 = C317876nz.A16;
            } else if (this.A00.Bhw() == StoryPromptType.IMAGINE_ME) {
                r0 = C317876nz.A0w;
            } else {
                C317876nz r03 = C317876nz.A0a;
                r1 = C318046oG.PROMPT;
                str = "prompt_sticker_bundle_id";
            }
            singletonList = Collections.singletonList(r0.A0Z);
            0qQ.A07(singletonList);
            r2.A06 = singletonList;
            return r2;
        }
        singletonList = C317886o0.A06(r1, str).A01();
        r2.A06 = singletonList;
        return r2;
    }

    public final Integer CAk() {
        if (this.A0D) {
            return AnonymousClass05K.A0y;
        }
        if (this.A0C) {
            return AnonymousClass05K.A13;
        }
        if (this.A0B) {
            return AnonymousClass05K.A16;
        }
        if (this.A0A) {
            return AnonymousClass05K.A14;
        }
        if (A0H()) {
            return AnonymousClass05K.A0M;
        }
        if (A0G()) {
            return AnonymousClass05K.A0O;
        }
        return AnonymousClass05K.A0L;
    }

    public final int A00() {
        if (!A0J()) {
            return 0nH.A0C(this.A00.getBackgroundColor(), -1);
        }
        return -1;
    }

    public final PromptStickerModel A04() {
        return new PromptStickerModel(new C17946Vib(A02()).A00());
    }

    public final void A08(User user) {
        ArrayList A1M = 0sr.A1M(new User[]{user});
        A1M.addAll(this.A00.B3f());
        A0C(A1M);
        int Bak = this.A00.Bak() + 1;
        C17946Vib AKQ = this.A00.AKQ();
        AKQ.A00 = Bak;
        this.A00 = AKQ.A00();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PromptStickerModel(com.instagram.api.schemas.GenAIToolInfoDict r36, com.instagram.api.schemas.StoryPromptType r37, com.instagram.user.model.User r38, java.lang.Integer r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.util.List r45, int r46, int r47, boolean r48, boolean r49, boolean r50) {
        /*
            r35 = this;
            r32 = r42
            r5 = 0
            r7 = 0
            r0 = 1
            r2 = r40
            X.0qQ.A0B(r2, r0)
            r0 = 4
            r1 = r45
            X.0qQ.A0B(r1, r0)
            r0 = 14
            r6 = r39
            X.0qQ.A0B(r6, r0)
            java.lang.String r0 = java.lang.String.valueOf(r47)
            com.instagram.api.schemas.StoryPromptDisablementState r9 = X.C281995Aj.A00(r0)
            com.instagram.api.schemas.StoryPromptType r0 = com.instagram.api.schemas.StoryPromptType.BEFORE_AND_AFTER
            r4 = 1
            r3 = 0
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r5)
            r12 = r37
            if (r12 != r0) goto L_0x002c
            r3 = 1
        L_0x002c:
            com.instagram.api.schemas.StoryPromptType r0 = com.instagram.api.schemas.StoryPromptType.SPEAKEASY
            if (r12 == r0) goto L_0x0031
            r4 = 0
        L_0x0031:
            if (r42 != 0) goto L_0x0035
            java.lang.String r32 = ""
        L_0x0035:
            int r0 = r6.intValue()
            if (r0 == 0) goto L_0x007b
            java.lang.String r30 = "clips_creator_invite"
        L_0x003d:
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r3)
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r48)
            java.lang.Boolean r21 = java.lang.Boolean.valueOf(r49)
            java.lang.Boolean r23 = java.lang.Boolean.valueOf(r4)
            java.lang.Boolean r24 = java.lang.Boolean.valueOf(r50)
            com.instagram.api.schemas.StoryPromptTappableData r6 = new com.instagram.api.schemas.StoryPromptTappableData
            r8 = r36
            r14 = r38
            r29 = r41
            r27 = r43
            r31 = r44
            r34 = r46
            r10 = r7
            r11 = r7
            r13 = r7
            r18 = r15
            r19 = r15
            r20 = r15
            r22 = r15
            r25 = r15
            r26 = r15
            r28 = r2
            r33 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r0 = r35
            r0.<init>(r6)
            return
        L_0x007b:
            java.lang.String r30 = ""
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.reels.prompt.model.PromptStickerModel.<init>(com.instagram.api.schemas.GenAIToolInfoDict, com.instagram.api.schemas.StoryPromptType, com.instagram.user.model.User, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, int, int, boolean, boolean, boolean):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PromptStickerModel() {
        /*
            r16 = this;
            r1 = 0
            java.lang.String r5 = ""
            X.0sn r10 = X.0sn.A00
            r11 = 0
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            com.instagram.api.schemas.StoryPromptType r2 = com.instagram.api.schemas.StoryPromptType.DEFAULT
            r0 = r16
            r3 = r1
            r6 = r5
            r7 = r1
            r8 = r1
            r9 = r1
            r12 = r11
            r13 = r11
            r14 = r11
            r15 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.reels.prompt.model.PromptStickerModel.<init>():void");
    }
}
