package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.effect.AttributedAREffect;
import com.instagram.model.reels.Reel;
import com.instagram.model.shopping.ProductAREffectContainer;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.JlW  reason: case insensitive filesystem */
public final class C60438JlW extends 2Rw {
    public int A00;
    public String A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Integer A05;
    public final List A06 = AnonymousClass7TE.A1C();
    public final Handler A07 = AnonymousClass7TF.A0D();
    public final C63589Kzc A08;
    public final C66500MUe A09;
    public final AnonymousClass0iw A0A;
    public final UserSession A0B;
    public final boolean A0C;

    public C60438JlW(Activity activity, C63589Kzc kzc, C66500MUe mUe, AnonymousClass0iw r7, UserSession userSession, Integer num, int i, int i2, boolean z) {
        float f;
        C51969G9p.A1N(num, 4, userSession);
        this.A09 = mUe;
        this.A03 = i;
        this.A05 = num;
        this.A04 = i2;
        this.A0C = z;
        this.A08 = kzc;
        this.A0A = r7;
        this.A0B = userSession;
        switch (num.intValue()) {
            case 1:
                f = 0.75f;
                break;
            case 2:
                f = 0.78f;
                break;
            case 3:
            case 4:
                f = 1.0f;
                break;
            case 5:
                f = 0.9f;
                break;
            default:
                f = 0.59f;
                break;
        }
        this.A02 = (int) (((float) (0nA.A09(activity) - (i * (i2 + 1)))) / (((float) i2) * f));
        this.A00 = i2 * 2;
        A00(this);
    }

    public final void A03(List list, boolean z) {
        0qQ.A0B(list, 0);
        List list2 = this.A06;
        if (list2.size() >= this.A00) {
            int size = list2.size();
            list2.addAll(size - this.A00, list);
            notifyItemRangeChanged(size, list.size());
            if (!z) {
                int size2 = list2.size();
                list2.subList(size2 - this.A00, size2).clear();
                int i = this.A00;
                notifyItemRangeRemoved(size2 - i, i);
                this.A00 = 0;
            }
        }
    }

    public final void A04(List list, boolean z) {
        0qQ.A0B(list, 0);
        List list2 = this.A06;
        list2.clear();
        if (this.A0C && AnonymousClass7TE.A1b(list)) {
            LQR lqr = LQR.A05;
            0qQ.A08(lqr);
            list2.add(lqr);
        }
        LQR lqr2 = LQR.A04;
        0qQ.A08(lqr2);
        list2.add(lqr2);
        list2.addAll(list);
        if (z) {
            A00(this);
        }
        notifyDataSetChanged();
    }

    public final void onBindViewHolder(C249703kE r13, int i) {
        C60689Jpa jpa;
        boolean z;
        String str;
        IgTextView igTextView;
        AttributedAREffect attributedAREffect;
        ProductAREffectContainer productAREffectContainer;
        int A072 = JTP.A07(this, r13, 0, i);
        if (A072 == 0) {
            jpa = (C60689Jpa) r13;
            C62947Koz koz = ((LQR) this.A06.get(i)).A00;
            if (koz != null) {
                AnonymousClass0iw r6 = this.A0A;
                jpa.A01 = koz;
                jpa.A0A.set(!C63051Kqg.A00(jpa.A08));
                AtomicBoolean atomicBoolean = jpa.A09;
                atomicBoolean.set(false);
                Reel reel = koz.A03;
                if (reel == null || (attributedAREffect = reel.A0G) == null || (productAREffectContainer = attributedAREffect.A04) == null || (str = productAREffectContainer.A00.A01.A0e) == null) {
                    str = koz.A06;
                }
                0qQ.A07(str);
                String str2 = koz.A07;
                if (!(str2 == null || (igTextView = jpa.A03) == null)) {
                    igTextView.setText(str2);
                }
                String str3 = koz.A08;
                if (str3 != null) {
                    2eS.A03(jpa.itemView, str3);
                    2eS.A04(jpa.itemView, AnonymousClass05K.A00);
                }
                View view = jpa.itemView;
                view.setContentDescription(DbW.A0h(view.getContext(), str, 2131953137));
                2eS.A01(jpa.itemView);
                IgTextView igTextView2 = jpa.A02;
                if (igTextView2 != null) {
                    igTextView2.setText(str);
                }
                if (koz.A0A) {
                    IgImageView igImageView = jpa.A04;
                    if (igImageView != null) {
                        UserSession userSession = jpa.A05;
                        Context A0S = AnonymousClass7TE.A0S(jpa.A06);
                        String A0o = JTP.A0o(koz.A00());
                        int dimensionPixelSize = A0S.getResources().getDimensionPixelSize(R.dimen.add_account_icon_circle_radius);
                        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, AnonymousClass6LW.A07);
                        gradientDrawable.setShape(1);
                        igImageView.setImageDrawable(new C59999Jd8(A0S, gradientDrawable, userSession, A0o, dimensionPixelSize));
                    }
                    atomicBoolean.set(true);
                    C60689Jpa.A00(jpa);
                } else {
                    IgImageView igImageView2 = jpa.A04;
                    if (igImageView2 != null) {
                        ImageUrl A002 = koz.A00();
                        0qQ.A07(A002);
                        igImageView2.setUrl(A002, r6);
                    }
                }
                z = koz.A0B;
            } else {
                throw AnonymousClass7TE.A0y();
            }
        } else if (A072 == 6) {
            jpa = (C60689Jpa) r13;
            z = DbW.A1a(this.A01);
            jpa.A0A.set(!C63051Kqg.A00(jpa.A08));
            jpa.A09.set(false);
            String A16 = AnonymousClass7TE.A16(DbS.A07(jpa), 2131953136);
            View view2 = jpa.itemView;
            view2.setContentDescription(DbW.A0h(view2.getContext(), A16, 2131953137));
            2eS.A01(jpa.itemView);
            IgTextView igTextView3 = jpa.A02;
            if (igTextView3 != null) {
                igTextView3.setText(A16);
            }
            Drawable drawable = DbS.A07(jpa).getDrawable(R.drawable.effect_no_selection);
            if (drawable != null) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                AnonymousClass8DV r2 = new AnonymousClass8DV(DbU.A05(jpa.itemView), bitmapDrawable.getBitmap());
                r2.A02(((float) bitmapDrawable.getIntrinsicWidth()) / 2.0f);
                IgImageView igImageView3 = jpa.A04;
                if (igImageView3 != null) {
                    igImageView3.setImageDrawable(r2);
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        } else if (A072 == 2) {
            C60682JpT jpT = (C60682JpT) r13;
            int i2 = i % this.A04;
            if (i2 == 0) {
                jpT.A00();
                return;
            } else {
                this.A07.postDelayed(new C65843M1j(jpT), (long) (i2 * 600));
                return;
            }
        } else if (A072 != 3 && A072 != 4) {
            throw AnonymousClass7TE.A0z("unhandled item type");
        } else {
            return;
        }
        jpa.itemView.setSelected(z);
        jpa.itemView.setAccessibilityDelegate(new U30(z));
        C60005JdE jdE = jpa.A07;
        jdE.A04 = z;
        jdE.invalidateSelf();
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        Context A0C2 = JTP.A0C(viewGroup, 0);
        LayoutInflater from = LayoutInflater.from(A0C2);
        if (i != 0) {
            if (i == 2) {
                View A0A2 = DbU.A0A(from, viewGroup, R.layout.camera_effects_view_preview_video_loading_holder, false);
                0nA.A0V(A0A2, this.A02);
                return new C60682JpT(A0A2);
            } else if (i == 4) {
                View A0A3 = DbU.A0A(from, viewGroup, R.layout.effect_mini_gallery_category_page_header, false);
                0nA.A0V(A0A3, this.A02 / 2);
                int i3 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                String A16 = AnonymousClass7TE.A16(A0C2, 2131966540);
                0qQ.A0B(A0A3, 1);
                C249703kE r3 = new C249703kE(A0A3);
                AnonymousClass7TG.A0R(A0A3, R.id.mini_gallery_category_page_header_text_view).setText(A16);
                return r3;
            } else if (i != 6) {
                throw AnonymousClass7TE.A0z("unhandled item type");
            }
        }
        Integer num = this.A05;
        int intValue = num.intValue();
        if (intValue == 0) {
            i2 = R.layout.effect_mini_gallery_effect_preview_view_holder;
        } else if (intValue == 2) {
            i2 = R.layout.effect_mini_gallery_effect_preview_holder_with_title;
        } else if (intValue != 4) {
            i2 = R.layout.effect_mini_gallery_effect_preview_holder_no_image_with_title_and_reels_count;
            if (intValue != 5) {
                i2 = R.layout.effect_mini_gallery_effect_preview_holder_no_image;
            }
        } else {
            i2 = R.layout.effect_mini_gallery_effect_preview_holder_no_image_with_title;
        }
        View A0A4 = DbU.A0A(from, viewGroup, i2, false);
        0nA.A0V(A0A4, this.A02);
        C60689Jpa jpa = new C60689Jpa(A0A4, this.A0B, num);
        jpa.A00 = this.A09;
        return jpa;
    }

    public static final void A00(C60438JlW jlW) {
        int i = jlW.A00;
        for (int i2 = 0; i2 < i; i2++) {
            List list = jlW.A06;
            LQR lqr = LQR.A02;
            0qQ.A08(lqr);
            list.add(lqr);
        }
    }

    public static final void A01(C60438JlW jlW, String str, boolean z) {
        int A022;
        if (str == null) {
            A022 = jlW.A06.indexOf(LQR.A04);
        } else {
            A022 = jlW.A02(str);
            if (A022 >= 0) {
                C62947Koz koz = ((LQR) jlW.A06.get(A022)).A00;
                if (koz != null) {
                    koz.A0B = z;
                }
            } else {
                return;
            }
        }
        jlW.notifyItemChanged(A022);
    }

    public final int A02(String str) {
        String str2;
        List list = this.A06;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C62947Koz koz = ((LQR) list.get(i)).A00;
            if (koz != null) {
                str2 = koz.A05;
            } else {
                str2 = null;
            }
            if (0qQ.A0K(str2, str)) {
                return i;
            }
        }
        return -1;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-443505005);
        int size = this.A06.size();
        AnonymousClass0fD.A0A(-1970945486, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        int A032 = AnonymousClass0fD.A03(-1664542530);
        int i2 = ((LQR) this.A06.get(i)).A01;
        AnonymousClass0fD.A0A(-1931136486, A032);
        return i2;
    }
}
