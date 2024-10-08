package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.2s6  reason: invalid class name and case insensitive filesystem */
public final class C231682s6 extends C231632rz {
    public C2357130x A00;
    public final Context A01;
    public final AnonymousClass0iw A02;

    public final String getBinderGroupName() {
        return "FamilyBridgesBasicNetego";
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public final int getViewTypeCount() {
        return 6;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        Drawable drawable;
        int A03 = AnonymousClass0fD.A03(64300896);
        this.A00.getClass();
        AnonymousClass3O8 r13 = (AnonymousClass3O8) obj;
        C57248IUj iUj = (C57248IUj) obj2;
        View view2 = view;
        int i2 = i;
        if (i == 0) {
            Context context = this.A01;
            Object tag = view2.getTag();
            tag.getClass();
            C63783L6p l6p = (C63783L6p) tag;
            C2357130x r4 = this.A00;
            try {
                drawable = AnonymousClass2dd.A00(context.getResources(), R.drawable.growth_family_bridges_app_icons_netegofacebooklogo);
            } catch (Resources.NotFoundException unused) {
                drawable = context.getDrawable(R.drawable.growth_family_bridges_app_icons_netegofacebooklogo);
            }
            l6p.A00.setImageDrawable(drawable);
            TextView textView = l6p.A01;
            textView.setText(((C53441GoZ) r13.A00).A0C);
            textView.getPaint().setFakeBoldText(true);
            textView.setTextColor(context.getColor(R.color.gradient_dark));
            IBV ibv = new IBV(r13, iUj, r4);
            ColorFilterAlphaImageView colorFilterAlphaImageView = l6p.A02;
            AnonymousClass0fU.A00(ibv, colorFilterAlphaImageView);
            colorFilterAlphaImageView.setVisibility(0);
        } else if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
            Context context2 = this.A01;
            Object tag2 = view2.getTag();
            tag2.getClass();
            F0Z f0z = (F0Z) tag2;
            AnonymousClass0iw r9 = this.A02;
            AnonymousClass0fU.A00(new IAP(iUj), f0z.A00);
            MediaFrameLayout mediaFrameLayout = f0z.A05;
            C53441GoZ goZ = (C53441GoZ) r13.A00;
            mediaFrameLayout.A00 = goZ.A00;
            IgProgressImageView igProgressImageView = f0z.A04;
            igProgressImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            igProgressImageView.setUrl(goZ.A03, r9);
            List list = goZ.A0E;
            if (list != null && !list.isEmpty()) {
                List list2 = f0z.A06;
                if (list2.size() <= list.size()) {
                    f0z.A01.setVisibility(0);
                    for (int i3 = 0; i3 < list2.size(); i3++) {
                        View view3 = (View) list2.get(i3);
                        if (view3.getParent() instanceof FrameLayout) {
                            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                            shapeDrawable.getPaint().setColor((int) goZ.A01);
                            ((View) view3.getParent()).setBackgroundDrawable(shapeDrawable);
                        }
                        ((IgImageView) list2.get(i3)).setUrl((ImageUrl) list.get(i3), r9);
                    }
                    f0z.A02.setBackgroundColor(context2.getColor(R.color.baseline_neutral_80));
                    TextView textView2 = f0z.A03;
                    textView2.setText(goZ.A0A);
                    textView2.getPaint().setFakeBoldText(true);
                    1OO A0J = 1NK.A00().A0J(goZ.A04, (String) null);
                    A0J.A0I = false;
                    A0J.A02(new FVZ(context2, f0z));
                    A0J.A01();
                }
            }
            f0z.A01.setVisibility(8);
            f0z.A02.setBackgroundColor(context2.getColor(R.color.baseline_neutral_80));
            TextView textView22 = f0z.A03;
            textView22.setText(goZ.A0A);
            textView22.getPaint().setFakeBoldText(true);
            1OO A0J2 = 1NK.A00().A0J(goZ.A04, (String) null);
            A0J2.A0I = false;
            A0J2.A02(new FVZ(context2, f0z));
            A0J2.A01();
        } else if (i2 == 5) {
            Object tag3 = view2.getTag();
            tag3.getClass();
            C17522VZb vZb = (C17522VZb) tag3;
            C2357130x r3 = this.A00;
            C57248IUj iUj2 = vZb.A00;
            if (!(iUj2 == null || iUj2 == iUj)) {
                iUj2.A00 = null;
            }
            vZb.A00 = iUj;
            iUj.A00 = new WeakReference(vZb);
            if (!iUj.A01) {
                C55691Hlo hlo = C55691Hlo.A02;
                if (hlo == null) {
                    hlo = new C55691Hlo();
                    C55691Hlo.A02 = hlo;
                }
                int hashCode = iUj.hashCode();
                HashMap hashMap = hlo.A01;
                Integer valueOf = Integer.valueOf(hashCode);
                Runnable runnable = (Runnable) hashMap.get(valueOf);
                if (runnable != null) {
                    hlo.A00.removeCallbacks(runnable);
                    hashMap.remove(valueOf);
                }
                C57844IhN ihN = new C57844IhN(iUj, hlo);
                hashMap.put(Integer.valueOf(iUj.hashCode()), ihN);
                hlo.A00.postDelayed(ihN, 4000);
            }
            TextView textView3 = vZb.A02;
            textView3.setText(((C53441GoZ) r13.A00).A07);
            textView3.getPaint().setFakeBoldText(true);
            ColorFilterAlphaImageView colorFilterAlphaImageView2 = vZb.A03;
            colorFilterAlphaImageView2.setNormalColor(vZb.A04.A01);
            colorFilterAlphaImageView2.setActiveColor(-1);
            colorFilterAlphaImageView2.setVisibility(0);
            C17003VEd.A00(vZb, iUj.A01);
            AnonymousClass0fU.A00(new C56745IAu(r13, r3), vZb.A01);
        } else {
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Unhandled view type");
            AnonymousClass0fD.A0A(460469882, A03);
            throw unsupportedOperationException;
        }
        C230072os r0 = this.A00.A0M;
        2el r32 = r0.A00;
        C229932oe r2 = r0.A01;
        String id = r13.getId();
        id.getClass();
        r32.A05(view2, r2.A00(002.A0b(id, ":", i2)));
        AnonymousClass0fD.A0A(940541573, A03);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r5, Object obj, Object obj2) {
        AnonymousClass3O8 r6 = (AnonymousClass3O8) obj;
        C57248IUj iUj = (C57248IUj) obj2;
        if (!iUj.CdP()) {
            int i = 0;
            r5.A7U(0);
            C2357130x r0 = this.A00;
            r0.getClass();
            r0.A02(r6, iUj, 0);
            List list = ((C53441GoZ) r6.A00).A0E;
            if (list != null) {
                i = list.size();
            }
            int i2 = 1;
            if (i != 0) {
                if (i != 1) {
                    i2 = 3;
                    if (i != 2) {
                        i2 = 4;
                    }
                } else {
                    r5.A7U(2);
                    this.A00.A02(r6, iUj, 2);
                    r5.A7U(5);
                    this.A00.A02(r6, iUj, 5);
                }
            }
            r5.A7U(i2);
            this.A00.A02(r6, iUj, i2);
            r5.A7U(5);
            this.A00.A02(r6, iUj, 5);
        }
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        return ((C53441GoZ) ((AnonymousClass3O8) obj).A00).A09.hashCode();
    }

    public C231682s6(Context context, AnonymousClass0iw r2) {
        this.A01 = context;
        this.A02 = r2;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        View inflate;
        int A03 = AnonymousClass0fD.A03(-864294842);
        if (i != 0) {
            int i2 = 1;
            if (i != 1) {
                if (i != 2) {
                    i2 = 3;
                    if (i == 3) {
                        inflate = C48985EnN.A00(this.A01, 2, viewGroup);
                    } else if (i != 4) {
                        if (i == 5) {
                            Context context = this.A01;
                            inflate = LayoutInflater.from(context).inflate(R.layout.family_bridges_basic_netego_footer, viewGroup, false);
                            inflate.setTag(new C17522VZb(inflate, context));
                        } else {
                            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Unhandled view type");
                            AnonymousClass0fD.A0A(710917976, A03);
                            throw unsupportedOperationException;
                        }
                    }
                }
                inflate = C48985EnN.A00(this.A01, i2, viewGroup);
            } else {
                inflate = C48985EnN.A00(this.A01, 0, viewGroup);
            }
        } else {
            inflate = LayoutInflater.from(this.A01).inflate(R.layout.family_bridges_feed_header_view, viewGroup, false);
            inflate.setTag(new C63783L6p(inflate));
        }
        AnonymousClass0fD.A0A(1712643438, A03);
        return inflate;
    }
}
