package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.recyclerpager.HorizontalRecyclerPager;
import com.instagram.util.recyclerview.LinearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1;

/* renamed from: X.2sJ  reason: invalid class name */
public final class AnonymousClass2sJ extends C231632rz {
    public C2363833n A00;
    public C2363633l A01;
    public C2357130x A02;
    public LinearLayoutManager A03;
    public final UserSession A04;
    public final Context A05;

    public final String getBinderGroupName() {
        return "BusinessConversionNetego";
    }

    public final int getViewTypeCount() {
        return 4;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r3, Object obj, Object obj2) {
        AnonymousClass5j1 r4 = (AnonymousClass5j1) obj;
        C57249IUk iUk = (C57249IUk) obj2;
        C2363833n r1 = this.A00;
        r1.getClass();
        String str = iUk.A04;
        r1.A00 = r4;
        r1.A01 = str;
        if (iUk.CdP()) {
            r3.A7U(3);
            return;
        }
        this.A02.getClass();
        r3.A7U(0);
        this.A02.A02(r4, iUk, 0);
        r3.A7U(1);
        this.A02.A02(r4, iUk, 1);
        r3.A7U(2);
        this.A02.A02(r4, iUk, 2);
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        return ((AnonymousClass5j1) obj).getId().hashCode();
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        if (i == 0 || i == 1 || i == 2 || i == 3) {
            return AnonymousClass972.MUTABLE_FLAG_MASK;
        }
        throw new IllegalStateException(002.A0O("Could not get ViewModel hash for item type ", i));
    }

    public AnonymousClass2sJ(Context context, UserSession userSession) {
        this.A05 = context;
        this.A04 = userSession;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        View.OnClickListener onClickListener;
        TextView textView;
        int A032 = AnonymousClass0fD.A03(1874703526);
        AnonymousClass5j1 r10 = (AnonymousClass5j1) obj;
        C57249IUk iUk = (C57249IUk) obj2;
        if (i == 0) {
            Object tag = view.getTag();
            tag.getClass();
            V3P v3p = (V3P) tag;
            String str = ((BDz) r10.A00).A05;
            C2357130x r0 = this.A02;
            r0.getClass();
            onClickListener = new IB9(r10, iUk, r0);
            v3p.A01.setText(str);
            textView = v3p.A00;
            AnonymousClass0fU.A00(onClickListener, textView);
            C2357130x r1 = this.A02;
            r1.getClass();
            0qQ.A0B(r10, 0);
            C230072os r02 = r1.A0M;
            2el r3 = r02.A00;
            C229932oe r2 = r02.A01;
            String id = r10.getId();
            id.getClass();
            r3.A05(view, r2.A00(002.A0b(id, ":", i)));
        } else if (i == 1) {
            Object tag2 = view.getTag();
            tag2.getClass();
            C48219Eb0 eb0 = (C48219Eb0) tag2;
            Context context = this.A05;
            C2357130x r5 = this.A02;
            r5.getClass();
            UserSession userSession = this.A04;
            0qQ.A0B(eb0, 1);
            0qQ.A0B(context, 2);
            0qQ.A0B(userSession, 4);
            HorizontalRecyclerPager horizontalRecyclerPager = eb0.A00;
            horizontalRecyclerPager.A15(new C46859Dmb(userSession, eb0));
            2Rw r12 = horizontalRecyclerPager.A0A;
            if (r12 == null) {
                horizontalRecyclerPager.setAdapter(new UAG(context, horizontalRecyclerPager, 0eE.A00(userSession).A00(), r5));
            } else if (r12 instanceof UAG) {
                r12.notifyDataSetChanged();
            }
            C2357130x r13 = this.A02;
            r13.getClass();
            0qQ.A0B(r10, 0);
            C230072os r022 = r13.A0M;
            2el r32 = r022.A00;
            C229932oe r22 = r022.A01;
            String id2 = r10.getId();
            id2.getClass();
            r32.A05(view, r22.A00(002.A0b(id2, ":", i)));
        } else if (i == 2) {
            Object tag3 = view.getTag();
            tag3.getClass();
            this.A02.getClass();
            onClickListener = this.A00;
            onClickListener.getClass();
            TextView textView2 = ((V3A) tag3).A00;
            textView2.setText(((BDz) r10.A00).A03);
            textView = textView2;
            AnonymousClass0fU.A00(onClickListener, textView);
            C2357130x r132 = this.A02;
            r132.getClass();
            0qQ.A0B(r10, 0);
            C230072os r0222 = r132.A0M;
            2el r322 = r0222.A00;
            C229932oe r222 = r0222.A01;
            String id22 = r10.getId();
            id22.getClass();
            r322.A05(view, r222.A00(002.A0b(id22, ":", i)));
        } else if (i == 3) {
            C2363633l r14 = this.A01;
            r14.getClass();
            r14.A01(view, this.A04, r10, iUk);
        } else {
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException(AnonymousClass000.A00(33));
            AnonymousClass0fD.A0A(-1593404327, A032);
            throw unsupportedOperationException;
        }
        AnonymousClass0fD.A0A(483696769, A032);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.V3P, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v0, types: [X.Eb0, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v8, types: [X.V3A, java.lang.Object] */
    public final View createView(int i, ViewGroup viewGroup) {
        View inflate;
        int i2;
        int A032 = AnonymousClass0fD.A03(-724925529);
        if (i == 0) {
            inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.netego_title, viewGroup, false);
            ? obj = new Object();
            obj.A01 = (TextView) inflate.requireViewById(R.id.title);
            obj.A00 = inflate.requireViewById(R.id.more_options_button);
            inflate.setTag(obj);
            i2 = -2063490658;
        } else if (i == 1) {
            Context context = this.A05;
            LinearLayoutManager linearLayoutManager = this.A03;
            LinearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1 linearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1 = new LinearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1(context, (Boolean) null);
            if (linearLayoutManager != null) {
                linearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1.A1P(linearLayoutManager.A1M());
            }
            this.A03 = linearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1;
            linearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1.A0v(true);
            0qQ.A0B(viewGroup, 0);
            0qQ.A0B(context, 1);
            inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.business_netego_carousel, viewGroup, false);
            0qQ.A0A(inflate);
            0qQ.A0B(inflate, 1);
            ? obj2 = new Object();
            View findViewById = inflate.findViewById(R.id.business_netego_carousel_view);
            0qQ.A07(findViewById);
            obj2.A00 = (HorizontalRecyclerPager) findViewById;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
            int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.ad4ad_button_left_right_margin);
            HorizontalRecyclerPager horizontalRecyclerPager = obj2.A00;
            horizontalRecyclerPager.A11(new AnonymousClass3V7(dimensionPixelSize2, dimensionPixelSize));
            horizontalRecyclerPager.A01 = dimensionPixelSize2 - dimensionPixelSize;
            horizontalRecyclerPager.setLayoutManager(linearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1);
            inflate.setTag(obj2);
            i2 = 146804371;
        } else if (i == 2) {
            Context context2 = viewGroup.getContext();
            inflate = LayoutInflater.from(context2).inflate(R.layout.blue_button_footer, viewGroup, false);
            inflate.setBackgroundColor(context2.getColor(2Yu.A0H(context2, R.attr.backgroundColorSecondary)));
            View requireViewById = inflate.requireViewById(R.id.footer_view);
            ? obj3 = new Object();
            obj3.A00 = (TextView) requireViewById.requireViewById(R.id.footer_text_view);
            inflate.setTag(obj3);
            i2 = 1714492135;
        } else if (i == 3) {
            inflate = C2363733m.A00(this.A05, viewGroup, "v1", 1);
            i2 = -123025758;
        } else {
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Unhandled view type");
            AnonymousClass0fD.A0A(1880211942, A032);
            throw unsupportedOperationException;
        }
        AnonymousClass0fD.A0A(i2, A032);
        return inflate;
    }
}
