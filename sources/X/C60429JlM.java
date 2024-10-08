package X;

import android.app.Activity;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.effect.AttributedAREffect;
import com.instagram.model.reels.Reel;
import com.instagram.model.shopping.ProductAREffectContainer;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.JlM  reason: case insensitive filesystem */
public final class C60429JlM extends 2Rw {
    public K71 A00;
    public final int A01;
    public final AnonymousClass3B3 A02 = new C60467Jlz(this, 8);
    public final UserSession A03;
    public final String A04;
    public final HashSet A05 = AnonymousClass7TE.A1F();
    public final List A06;
    public final boolean A07;
    public final int A08;
    public final int A09;
    public final Activity A0A;
    public final Handler A0B = new Handler();
    public final K71 A0C;
    public final AnonymousClass0iw A0D;

    public C60429JlM(Activity activity, K71 k71, K71 k712, AnonymousClass0iw r11, UserSession userSession, String str) {
        this.A0A = activity;
        this.A06 = AnonymousClass7TE.A1C();
        this.A03 = userSession;
        this.A0D = r11;
        this.A00 = k71;
        this.A01 = 2;
        int i = 0;
        this.A0C = k712;
        this.A04 = str;
        this.A07 = true;
        int A092 = 0nA.A09(activity);
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.photo_grid_spacing);
        int i2 = dimensionPixelSize % 2;
        this.A09 = (A092 - (i2 != 0 ? dimensionPixelSize + (2 - i2) : dimensionPixelSize)) / 2;
        int A093 = 0nA.A09(activity);
        int A022 = AnonymousClass7TF.A02(activity, R.dimen.photo_grid_spacing);
        int i3 = A022 % 2;
        this.A08 = (int) (((float) (A093 - (i3 != 0 ? A022 + (2 - i3) : A022))) / (2.0f * 0.643f));
        do {
            this.A06.add(LQR.A02);
            i++;
        } while (i < 6);
        this.A06.add(LQR.A03);
    }

    public final 1Xj A00(int i) {
        LQR lqr;
        C62947Koz koz;
        List A0O;
        List list = this.A06;
        if (list == null || i >= list.size() || (lqr = (LQR) list.get(i)) == null || (koz = lqr.A00) == null) {
            return null;
        }
        UserSession userSession = this.A03;
        Reel reel = koz.A03;
        if (reel == null || (A0O = reel.A0O(userSession)) == null || A0O.isEmpty()) {
            return null;
        }
        return ((C255773uh) AnonymousClass7TE.A13(A0O)).A0b;
    }

    public final void onBindViewHolder(C249703kE r10, int i) {
        String str;
        AttributedAREffect attributedAREffect;
        ProductAREffectContainer productAREffectContainer;
        LQR lqr = (LQR) this.A06.get(i);
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0) {
            C62947Koz koz = lqr.A00;
            if (koz != null) {
                C60709Jpu jpu = (C60709Jpu) r10;
                AnonymousClass0iw r7 = this.A0D;
                jpu.A01 = koz;
                Reel reel = koz.A03;
                if (reel == null || (attributedAREffect = reel.A0G) == null || (productAREffectContainer = attributedAREffect.A04) == null || (str = productAREffectContainer.A00.A01.A0e) == null) {
                    str = koz.A06;
                }
                if (str != null) {
                    jpu.A04.setText(str);
                    View view = jpu.itemView;
                    view.setContentDescription(DbW.A0h(view.getContext(), str, 2131953137));
                }
                if (koz.A01() != null) {
                    TextView textView = jpu.A03;
                    DbX.A13(textView.getContext(), textView, koz.A01(), 2131961547);
                    textView.setVisibility(0);
                }
                ImageUrl A002 = koz.A00();
                if (A002 != null) {
                    jpu.A06.setUrl(A002, r7);
                }
                ImageUrl imageUrl = koz.A02;
                if (imageUrl != null) {
                    jpu.A05.A02(imageUrl, (String) null);
                }
                jpu.A02 = koz.A03;
                1Xj A003 = A00(i);
                if (A003 != null) {
                    K71 k71 = this.A0C;
                    int i2 = lqr.A01;
                    View view2 = jpu.itemView;
                    C55594HkE hkE = new C55594HkE(i / 2, i);
                    0qQ.A0B(view2, 1);
                    if (i2 == 0) {
                        C55593HkD hkD = k71.A02;
                        if (hkD == null) {
                            0qQ.A0F("gridImpressionsTracker");
                            throw AnonymousClass00P.createAndThrow();
                        }
                        C2354830a A004 = AnonymousClass30Y.A00(A003, hkE, A003.getId());
                        A004.A00(hkD.A00);
                        C51967G9n.A0z(view2, A004, hkD.A01);
                        return;
                    }
                    0wb.A03(K71.__redex_internal_original_name, 002.A0O("Unhandled preview item type: ", i2));
                }
            }
        } else if (itemViewType == 1) {
            0kD.A01("EffectsPreviewVideoAdapter", "ITEM_TYPE_HERO_UNIT should never have null hero unit");
        } else if (itemViewType == 2) {
            C60682JpT jpT = (C60682JpT) r10;
            int i3 = i % 2;
            if (i3 == 0) {
                jpT.A00();
            } else {
                this.A0B.postDelayed(new M6W(jpT, this), (long) (i3 * 600));
            }
        } else if (itemViewType != 3) {
            throw AnonymousClass7TE.A0z("unhandled item type");
        }
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(270619770);
        int size = this.A06.size();
        AnonymousClass0fD.A0A(-596288762, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        int A032 = AnonymousClass0fD.A03(-521040218);
        int i2 = ((LQR) this.A06.get(i)).A01;
        AnonymousClass0fD.A0A(-85443868, A032);
        return i2;
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater A0D2 = DbV.A0D(viewGroup);
        if (i == 0) {
            View inflate = A0D2.inflate(R.layout.camera_effects_view_preview_video_view_holder, viewGroup, false);
            0nA.A0V(inflate, this.A08);
            0nA.A0f(inflate, this.A09);
            C60709Jpu jpu = new C60709Jpu(inflate);
            jpu.A00 = this.A00;
            return jpu;
        } else if (i == 1) {
            return new C60670JpH(A0D2.inflate(R.layout.hero_unit_layout, viewGroup, false), this.A03, this);
        } else {
            if (i == 2) {
                View inflate2 = A0D2.inflate(R.layout.camera_effects_view_preview_video_loading_holder, viewGroup, false);
                0nA.A0V(inflate2, this.A08);
                return new C60682JpT(inflate2);
            } else if (i == 3) {
                return new C60683JpU(A0D2.inflate(R.layout.camera_effects_bottom_loading, viewGroup, false), 0, this);
            } else {
                throw AnonymousClass7TE.A0z("unhandled item type");
            }
        }
    }
}
