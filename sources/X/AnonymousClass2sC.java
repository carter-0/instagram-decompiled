package X;

import android.app.Activity;
import android.content.Context;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.recyclerpager.HorizontalRecyclerPager;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2sC  reason: invalid class name */
public final class AnonymousClass2sC extends C231632rz {
    public int A00;
    public C230072os A01;
    public C2357130x A02;
    public boolean A03;
    public Activity A04;
    public final Context A05;
    public final AnonymousClass0iw A06;
    public final UserSession A07;
    public final C230062or A08;

    public final String getBinderGroupName() {
        return AnonymousClass000.A00(2280);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        View.OnClickListener w93;
        int i2;
        int A032 = AnonymousClass0fD.A03(1435552226);
        UserSession userSession = this.A07;
        AnonymousClass0iw r8 = this.A06;
        View view2 = view;
        C17706Vcb vcb = (C17706Vcb) view2.getTag();
        WWQ wwq = (WWQ) obj;
        C230062or r2 = this.A08;
        C2357130x r26 = this.A02;
        C57246IUh iUh = (C57246IUh) obj2;
        Activity activity = this.A04;
        if (this.A03) {
            HorizontalRecyclerPager horizontalRecyclerPager = vcb.A0A;
            horizontalRecyclerPager.setVisibility(0);
            vcb.A09.setVisibility(0);
            C53092GiQ giQ = new C53092GiQ(iUh);
            horizontalRecyclerPager.A0b();
            horizontalRecyclerPager.A15(giQ);
            Parcelable parcelable = iUh.A00;
            C252553pI r0 = horizontalRecyclerPager.A0D;
            if (!(parcelable == null || r0 == null)) {
                r0.A1P(parcelable);
            }
            ArrayList arrayList = new ArrayList(wwq.A00());
            int i3 = 0;
            while (i3 < arrayList.size()) {
                User user = ((C17496VXz) arrayList.get(i3)).A02;
                if (user == null || (!user.A2A() && !user.A2D())) {
                    arrayList.remove(i3);
                    i3--;
                }
                i3++;
            }
            if (arrayList.isEmpty()) {
                C16946VBy.A00(vcb, 8, true);
            } else {
                horizontalRecyclerPager.setAdapter(new UA2(activity, r8, userSession, r2, vcb, wwq, arrayList));
                C16946VBy.A00(vcb, 0, true);
            }
        } else {
            LinearLayout linearLayout = vcb.A04;
            linearLayout.setVisibility(0);
            List list = wwq.A00;
            if (list != null) {
                i2 = list.size();
            } else {
                i2 = 0;
            }
            int childCount = linearLayout.getChildCount();
            if (i2 < childCount) {
                int i4 = childCount - i2;
                for (int i5 = 0; i5 < i4; i5++) {
                    linearLayout.removeViewAt(0);
                    vcb.A0B.remove(0);
                }
            } else if (i2 > childCount) {
                int i6 = i2 - childCount;
                LayoutInflater from = LayoutInflater.from(linearLayout.getContext());
                for (int i7 = 0; i7 < i6; i7++) {
                    View inflate = from.inflate(R.layout.netego_row_follow_request, (ViewGroup) null);
                    vcb.A0B.add(new C17627VbJ(inflate));
                    linearLayout.addView(inflate);
                }
            }
            List A002 = wwq.A00();
            boolean z = false;
            for (int i8 = 0; i8 < A002.size(); i8++) {
                C17627VbJ vbJ = (C17627VbJ) vcb.A0B.get(i8);
                C17496VXz vXz = (C17496VXz) A002.get(i8);
                User user2 = vXz.A02;
                if (user2 == null || (!user2.A2D() && !user2.A2A())) {
                    vbJ.A00.setVisibility(8);
                    boolean z2 = z;
                    z = false;
                    if (!z2) {
                    }
                } else {
                    View view3 = vbJ.A00;
                    view3.setVisibility(0);
                    String id = user2.getId();
                    if (r2.A05.add(id)) {
                        DdQ.A02(r2.A01, r2.A02, id, i8);
                    }
                    AnonymousClass0fU.A00(new W9j(r2, user2, i8), view3);
                    vbJ.A05.setUrl(user2.Bh3(), r8);
                    TextView textView = vbJ.A04;
                    textView.setText(user2.getUsername());
                    String fullName = user2.getFullName();
                    boolean isEmpty = TextUtils.isEmpty(fullName);
                    TextView textView2 = vbJ.A03;
                    if (isEmpty) {
                        textView2.setVisibility(8);
                    } else {
                        textView2.setText(fullName);
                        textView2.setVisibility(0);
                    }
                    C244273av.A0B(textView, user2.isVerified());
                    String str = vXz.A03;
                    boolean isEmpty2 = TextUtils.isEmpty(str);
                    TextView textView3 = vbJ.A02;
                    if (!isEmpty2) {
                        textView3.setText(str);
                        textView3.setVisibility(0);
                    } else {
                        textView3.setVisibility(8);
                    }
                    FollowButton followButton = vbJ.A06;
                    followButton.A0J.A03(r8, userSession, user2);
                    boolean A2D = user2.A2D();
                    TextView textView4 = vbJ.A01;
                    if (A2D) {
                        textView4.setVisibility(0);
                        followButton.setVisibility(8);
                    } else {
                        textView4.setVisibility(8);
                        followButton.setVisibility(0);
                    }
                    AnonymousClass0fU.A00(new C18859W9x(r2, vbJ, user2, i8), textView4);
                }
                z = true;
            }
            if (!z) {
                C16946VBy.A00(vcb, 8, false);
            } else {
                C16946VBy.A00(vcb, 0, false);
            }
        }
        TextView textView5 = vcb.A06;
        if (textView5.getVisibility() == 0) {
            w93 = new W92(r2);
        } else {
            textView5 = vcb.A07;
            w93 = new W93(r2);
        }
        AnonymousClass0fU.A00(w93, textView5);
        AnonymousClass0fU.A00(new IBC(iUh, wwq, r26), vcb.A03);
        this.A01.EBq(view2, wwq);
        AnonymousClass0fD.A0A(843203947, A032);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
        this.A01.A9R((WWQ) obj, (C57246IUh) obj2);
    }

    public AnonymousClass2sC(Activity activity, Context context, AnonymousClass0iw r3, UserSession userSession, C230062or r5, C230072os r6) {
        this.A05 = context;
        this.A04 = activity;
        this.A07 = userSession;
        this.A06 = r3;
        this.A08 = r5;
        this.A01 = r6;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(620742040);
        Context context = this.A05;
        int i2 = this.A00;
        boolean z = this.A03;
        LayoutInflater from = LayoutInflater.from(context);
        View inflate = from.inflate(R.layout.netego_follow_requests, viewGroup, false);
        C17706Vcb vcb = new C17706Vcb(inflate);
        if (z) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
            AnonymousClass3V7 r0 = new AnonymousClass3V7(dimensionPixelSize, dimensionPixelSize);
            vcb.A00 = r0;
            HorizontalRecyclerPager horizontalRecyclerPager = vcb.A0A;
            horizontalRecyclerPager.A11(r0);
            horizontalRecyclerPager.A01 = context.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
            horizontalRecyclerPager.setLayoutManager(new LinearLayoutManager(context, 0, false));
        } else {
            for (int i3 = 0; i3 < i2; i3++) {
                View inflate2 = from.inflate(R.layout.netego_row_follow_request, (ViewGroup) null);
                vcb.A0B.add(new C17627VbJ(inflate2));
                vcb.A04.addView(inflate2);
            }
        }
        vcb.A01.post(new C20024Wjk(vcb));
        inflate.setTag(vcb);
        AnonymousClass0fD.A0A(1209613846, A032);
        return inflate;
    }
}
