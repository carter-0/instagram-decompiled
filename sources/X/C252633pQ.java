package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.3pQ  reason: invalid class name and case insensitive filesystem */
public abstract class C252633pQ {
    public final AnonymousClass0eM A00;
    public final boolean A01;

    public final View A04(Context context, ViewGroup viewGroup) {
        View view;
        0qQ.A0B(context, 0);
        AnonymousClass0qt r0 = (AnonymousClass0qt) this.A00.getValue();
        if (r0 != null) {
            List list = (List) ((C258233yg) r0).A00.get(A02());
            if (!(list == null || (view = (View) 018.A15(list)) == null || !(viewGroup instanceof RecyclerView))) {
                if (this.A01) {
                    int i = W28.A0A;
                    view.setTag(947501445, true);
                }
                A05(view);
                return view;
            }
        }
        View A03 = A03(context, viewGroup);
        A03.setTag(R.id.layout_id, Integer.valueOf(A02()));
        return A03;
    }

    public int A02() {
        if (this instanceof AnonymousClass4EZ) {
            return R.layout.row_feed_media_media_group;
        }
        if (this instanceof AnonymousClass417) {
            return R.layout.row_feed_comment;
        }
        if (this instanceof AnonymousClass3z4) {
            AnonymousClass3z4 r2 = (AnonymousClass3z4) this;
            boolean z = r2.A07;
            if (z && r2.A04.A01()) {
                return R.layout.social_ufi_sandwich_dots_with_larger_cta_optimized_with_dots;
            }
            if (r2.A04.A01()) {
                return R.layout.social_ufi_sandwich_dots_with_larger_cta_optimized;
            }
            if (z) {
                return R.layout.row_feed_media_ufi_bar_bold_with_dots;
            }
            return R.layout.row_feed_media_ufi_bar_bold;
        } else if (this instanceof AnonymousClass41M) {
            return R.layout.row_feed_media_feedback;
        } else {
            if (!(this instanceof C2607346v)) {
                return R.layout.row_feed_media_profile_header;
            }
            if (182.A06(0Tu.A05, ((C2607346v) this).A00, 36327563534154246L)) {
                return R.layout.row_feed_view_all_comments_viewstub;
            }
            return R.layout.row_feed_view_all_comments;
        }
    }

    public View A03(Context context, ViewGroup viewGroup) {
        View A012;
        Object A002;
        int A03;
        int dimensionPixelSize;
        int i;
        AnonymousClass3TP r6;
        ViewGroup viewGroup2 = viewGroup;
        if (this instanceof AnonymousClass4EZ) {
            AnonymousClass4EZ r3 = (AnonymousClass4EZ) this;
            A03 = AnonymousClass0fD.A03(-1329065664);
            0qQ.A0B(context, 0);
            LayoutInflater from = LayoutInflater.from(context);
            0qQ.A07(from);
            View A013 = 2Su.A01(from, new ViewGroup.LayoutParams(-1, -2), viewGroup2, R.layout.row_feed_media_media_group, false, true);
            0qQ.A0B(A013, 1);
            AnonymousClass3TP r62 = new AnonymousClass3TP(context, true);
            r62.addView(A013);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            r62.setLayoutParams(layoutParams);
            AnonymousClass4EA A06 = r3.A06(r62, r3.A03);
            r62.setTag(A06);
            A06.A01.A01();
            r62.addOnAttachStateChangeListener(new AnonymousClass9NN(r3, A06));
            i = 851158396;
            r6 = r62;
        } else {
            if (this instanceof AnonymousClass417) {
                0qQ.A0B(context, 0);
                LayoutInflater from2 = LayoutInflater.from(context);
                0qQ.A07(from2);
                A012 = 2Su.A01(from2, new ViewGroup.LayoutParams(-1, -2), viewGroup2, R.layout.row_feed_comment, false, true);
                A002 = new AnonymousClass419(A012);
            } else if (this instanceof AnonymousClass3z4) {
                AnonymousClass3z4 r32 = (AnonymousClass3z4) this;
                A03 = AnonymousClass0fD.A03(355288341);
                0qQ.A0B(context, 0);
                int A02 = r32.A02();
                LayoutInflater from3 = LayoutInflater.from(context);
                0qQ.A07(from3);
                if (r32.A04.A01()) {
                    dimensionPixelSize = -2;
                } else {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.audience_selector_pill_layout_height);
                }
                View A014 = 2Su.A01(from3, new ViewGroup.LayoutParams(-1, dimensionPixelSize), viewGroup2, A02, false, true);
                A014.setTag(new C254013rn(A014, r32.A07));
                i = -757274411;
                r6 = A014;
            } else if (this instanceof AnonymousClass41M) {
                AnonymousClass41M r33 = (AnonymousClass41M) this;
                0qQ.A0B(context, 0);
                A012 = LayoutInflater.from(context).inflate(R.layout.row_feed_media_feedback, viewGroup, false);
                int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                0qQ.A0A(A012);
                String str = r33.A03;
                A002 = new C254023ro(A012, r33.A00, r33.A01, r33.A02, str);
            } else if (this instanceof C2607346v) {
                C2607346v r2 = (C2607346v) this;
                0qQ.A0B(context, 0);
                int A022 = r2.A02();
                LayoutInflater from4 = LayoutInflater.from(context);
                0qQ.A07(from4);
                A012 = 2Su.A01(from4, new ViewGroup.LayoutParams(-1, -2), viewGroup2, A022, false, true);
                A002 = new AnonymousClass49J(A012, r2.A01);
            } else {
                0qQ.A0B(context, 0);
                LayoutInflater from5 = LayoutInflater.from(context);
                0qQ.A07(from5);
                A012 = 2Su.A01(from5, new ViewGroup.LayoutParams(-1, -2), viewGroup2, R.layout.row_feed_media_profile_header, false, true);
                A002 = AnonymousClass476.A00(A012);
            }
            A012.setTag(A002);
            return A012;
        }
        AnonymousClass0fD.A0A(i, A03);
        return r6;
    }

    public void A05(View view) {
        int dimensionPixelSize;
        ViewGroup.LayoutParams layoutParams;
        Object r1;
        if (this instanceof AnonymousClass4EZ) {
            AnonymousClass4EZ r2 = (AnonymousClass4EZ) this;
            0qQ.A0B(view, 0);
            if (view.getTag() == null) {
                AnonymousClass4EA A06 = r2.A06(view, r2.A03);
                view.setTag(A06);
                A06.A01.A01();
                view.addOnAttachStateChangeListener(new AnonymousClass9NN(r2, A06));
            } else {
                return;
            }
        } else {
            if (this instanceof C252643pR) {
                0qQ.A0B(view, 0);
                if (view.getTag() == null) {
                    r1 = AnonymousClass476.A00(view);
                } else {
                    return;
                }
            } else if (this instanceof C2607346v) {
                C2607346v r12 = (C2607346v) this;
                0qQ.A0B(view, 0);
                if (view.getTag() == null) {
                    r1 = new AnonymousClass49J(view, r12.A01);
                } else {
                    return;
                }
            } else if (this instanceof AnonymousClass417) {
                0qQ.A0B(view, 0);
                if (view.getTag() == null) {
                    r1 = new AnonymousClass419(view);
                } else {
                    return;
                }
            } else if (this instanceof AnonymousClass3z4) {
                AnonymousClass3z4 r22 = (AnonymousClass3z4) this;
                0qQ.A0B(view, 0);
                if (view.getTag() == null) {
                    view.setTag(new C254013rn(view, r22.A07));
                    Context context = view.getContext();
                    0qQ.A07(context);
                    if (r22.A04.A01()) {
                        dimensionPixelSize = -2;
                    } else {
                        dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.audience_selector_pill_layout_height);
                    }
                    layoutParams = new ViewGroup.LayoutParams(-1, dimensionPixelSize);
                    view.setLayoutParams(layoutParams);
                }
                return;
            } else {
                return;
            }
            view.setTag(r1);
        }
        layoutParams = new ViewGroup.LayoutParams(-1, -2);
        view.setLayoutParams(layoutParams);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (X.C231482rk.A01() != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C252633pQ(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            X.0eO r2 = X.0eO.A03
            r1 = 47
            X.9Ku r0 = new X.9Ku
            r0.<init>(r4, r1)
            X.0eM r0 = X.AnonymousClass0eN.A00(r2, r0)
            r3.A00 = r0
            boolean r0 = X.C231482rk.A00()
            if (r0 != 0) goto L_0x001f
            boolean r1 = X.C231482rk.A01()
            r0 = 0
            if (r1 == 0) goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            r3.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C252633pQ.<init>(android.content.Context):void");
    }
}
