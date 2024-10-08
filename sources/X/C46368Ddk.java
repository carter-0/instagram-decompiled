package X;

import android.app.Application;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse;
import com.instagram.avatars.coinflip.AvatarCoinFlipSticker;
import com.instagram.avatars.graphql.AvatarCustomizationOptionsRepository;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.stickersearch.AvatarStickerPreRenderInteractor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ddk  reason: case insensitive filesystem */
public final class C46368Ddk extends 2YL {
    public final AvatarCustomizationOptionsRepository A00;
    public final 0wc A01;
    public final UserSession A02;
    public final 26t A03;
    public final AvatarStickerPreRenderInteractor A04;
    public final 0V2 A05 = 10D.A01(AnonymousClass05K.A00, 2, 0);
    public final 05G A06 = DbS.A10(new JVH());

    public /* synthetic */ C46368Ddk(AvatarCustomizationOptionsRepository avatarCustomizationOptionsRepository, UserSession userSession) {
        AvatarStickerPreRenderInteractor avatarStickerPreRenderInteractor = new AvatarStickerPreRenderInteractor((Application) null, userSession, 126);
        26t A002 = 26G.A00(userSession);
        AnonymousClass0kM r1 = new AnonymousClass0kM(userSession);
        r1.A00 = DbS.A0O("avatar_coin_flip_customization");
        0wc A003 = r1.A00();
        AnonymousClass7TG.A1R(A002, A003);
        this.A02 = userSession;
        this.A04 = avatarStickerPreRenderInteractor;
        this.A00 = avatarCustomizationOptionsRepository;
        this.A03 = A002;
        this.A01 = A003;
    }

    public final void A00() {
        C317846nw r4;
        if (DcE.A00(this.A02)) {
            r4 = C317846nw.COIN_FLIP_CUSTOMIZATION_POSES_440_400;
        } else {
            r4 = C317846nw.COIN_FLIP_CUSTOMIZATION_ALL_POSES;
        }
        AnonymousClass7TE.A1Z(new MHD((Object) r4, (Object) this, (AnonymousClass4D7) null, 44), C318116oQ.A00(this));
    }

    public final void A03(AvatarCoinFlipBackgroundOptionResponse avatarCoinFlipBackgroundOptionResponse) {
        Object value;
        JVH jvh;
        05G r2 = this.A06;
        do {
            value = r2.getValue();
            jvh = (JVH) value;
        } while (!r2.AIY(value, new JVH(jvh.A01, jvh.A02, avatarCoinFlipBackgroundOptionResponse, jvh.A04, jvh.A05, 0)));
    }

    public final void A04(C43746C7q c7q) {
        Object value;
        JVH jvh;
        05G r2 = this.A06;
        do {
            value = r2.getValue();
            jvh = (JVH) value;
        } while (!r2.AIY(value, new JVH(jvh.A01, jvh.A02, jvh.A03, c7q, jvh.A05, 0)));
    }

    public final void A05(boolean z, boolean z2) {
        List list;
        if (!z || (list = (List) DbZ.A0J(this.A06).A02) == null || list.isEmpty()) {
            Dba.A1S(this, C318116oQ.A00(this), 8, z2);
        }
    }

    public final void A01() {
        String str;
        List list;
        List list2;
        AvatarCoinFlipBackgroundOptionResponse avatarCoinFlipBackgroundOptionResponse;
        ViewModelListUpdate A0R = DbS.A0R();
        05G r5 = this.A06;
        if (!(DbZ.A0J(r5).A03 != null || (list = (List) DbZ.A0J(r5).A01) == null || list.isEmpty() || (list2 = (List) DbZ.A0J(r5).A01) == null || (avatarCoinFlipBackgroundOptionResponse = (AvatarCoinFlipBackgroundOptionResponse) 00k.A0O(list2, 0)) == null)) {
            A03(avatarCoinFlipBackgroundOptionResponse);
        }
        List<AvatarCoinFlipBackgroundOptionResponse> list3 = (List) DbZ.A0J(r5).A01;
        if (list3 != null) {
            ArrayList A0r = AnonymousClass7TG.A0r(list3);
            for (AvatarCoinFlipBackgroundOptionResponse avatarCoinFlipBackgroundOptionResponse2 : list3) {
                String str2 = avatarCoinFlipBackgroundOptionResponse2.A02;
                AvatarCoinFlipBackgroundOptionResponse avatarCoinFlipBackgroundOptionResponse3 = (AvatarCoinFlipBackgroundOptionResponse) DbZ.A0J(r5).A03;
                if (avatarCoinFlipBackgroundOptionResponse3 != null) {
                    str = avatarCoinFlipBackgroundOptionResponse3.A02;
                } else {
                    str = null;
                }
                A0r.add(new C47247DtY(avatarCoinFlipBackgroundOptionResponse2, new C51654FyG(this, 0), 0qQ.A0K(str2, str)));
            }
            A0R.A01(A0r);
        }
        this.A05.FIA(new DxI((AvatarCoinFlipBackgroundOptionResponse) DbZ.A0J(r5).A03, A0R));
    }

    public final void A02() {
        ImmutableList A0E;
        C250663lr r10;
        String str;
        ViewModelListUpdate A0R = DbS.A0R();
        05G r8 = this.A06;
        List<C43746C7q> list = (List) DbZ.A0J(r8).A02;
        C250663lr r3 = null;
        if (list != null) {
            ArrayList A0r = AnonymousClass7TG.A0r(list);
            for (C43746C7q c7q : list) {
                String A07 = c7q.A07("sticker_pack_id");
                C250663lr r0 = (C250663lr) DbZ.A0J(r8).A04;
                if (r0 != null) {
                    str = r0.A07("sticker_pack_id");
                } else {
                    str = null;
                }
                A0r.add(new C47248DtZ(c7q, new C51654FyG(this, 1), 0qQ.A0K(A07, str)));
            }
            A0R.A01(A0r);
        }
        C43746C7q c7q2 = (C43746C7q) DbZ.A0J(r8).A04;
        if (c7q2 != null && (A0E = c7q2.A0E()) != null && A0E.size() >= 3) {
            ImmutableList A0E2 = c7q2.A0E();
            if (A0E2 != null) {
                r10 = (C250663lr) 00k.A0O(A0E2, 1);
            } else {
                r10 = null;
            }
            ImmutableList A0E3 = c7q2.A0E();
            if (A0E3 != null) {
                r3 = (C250663lr) 00k.A0O(A0E3, 2);
            }
            if (r10 != null && r3 != null) {
                0V2 r9 = this.A05;
                String valueOf = String.valueOf(r10.A09("cdn_url"));
                int coercedIntField = r10.getCoercedIntField(4, "margin_top");
                String A002 = C273654mx.A00(333);
                int coercedIntField2 = r10.getCoercedIntField(7, A002);
                String A003 = C273654mx.A00(334);
                int coercedIntField3 = r10.getCoercedIntField(5, A003);
                String A004 = C273654mx.A00(335);
                r9.FIA(new DxJ(new AvatarCoinFlipSticker(valueOf, coercedIntField, coercedIntField2, coercedIntField3, r10.getCoercedIntField(6, A004), r10.getCoercedIntField(8, IgReactMediaPickerNativeModule.HEIGHT)), new AvatarCoinFlipSticker(String.valueOf(r3.A09("cdn_url")), r3.getCoercedIntField(4, "margin_top"), r3.getCoercedIntField(7, A002), r3.getCoercedIntField(5, A003), r3.getCoercedIntField(6, A004), r3.getCoercedIntField(8, IgReactMediaPickerNativeModule.HEIGHT)), A0R));
            }
        }
    }
}
