package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.2sY  reason: invalid class name and case insensitive filesystem */
public final class C231872sY extends C231632rz implements C231882sZ {
    public final Fragment A00;
    public final UserSession A01;
    public final Context A02;
    public final AnonymousClass4DU A03;

    public C231872sY(Context context, Fragment fragment, UserSession userSession, AnonymousClass4DU r5) {
        0qQ.A0B(context, 1);
        0qQ.A0B(fragment, 2);
        this.A02 = context;
        this.A00 = fragment;
        this.A01 = userSession;
        this.A03 = r5;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        0qQ.A0B(r2, 0);
        r2.A7U(0);
    }

    public final String getBinderGroupName() {
        return "PendingMedia";
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        AnonymousClass3Q2 r5 = (AnonymousClass3Q2) obj;
        return Arrays.hashCode(new Object[]{r5.A35, r5.A3t, r5.A1f});
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public final int getViewTypeCount() {
        return 2;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        Throwable th;
        int i2;
        List list;
        Object obj3 = obj;
        int A032 = AnonymousClass0fD.A03(1077417297);
        View view2 = view;
        0qQ.A0B(view2, 1);
        0qQ.A0B(obj3, 2);
        if (view2.getTag() != null) {
            if (i == 0) {
                Object tag = view2.getTag();
                0qQ.A0C(tag, AnonymousClass000.A00(1632));
                C65533Luw luw = (C65533Luw) tag;
                FragmentActivity requireActivity = this.A00.requireActivity();
                UserSession userSession = this.A01;
                luw.A01 = C361288fz.A00(requireActivity, userSession);
                C64192LSz.A01(userSession, this, this, luw, (AnonymousClass3Q2) obj3);
            } else if (i == 1) {
                Object tag2 = view2.getTag();
                0qQ.A0C(tag2, "null cannot be cast to non-null type com.instagram.feed.pendingmedia.PendingMediaContainerViewBinder.Holder");
                C65323LrM lrM = (C65323LrM) tag2;
                AnonymousClass3Q2 r4 = (AnonymousClass3Q2) obj3;
                UserSession userSession2 = this.A01;
                0qQ.A0B(lrM, 0);
                0qQ.A0B(r4, 1);
                0qQ.A0B(userSession2, 2);
                lrM.A07 = r4;
                ArrayList arrayList = new ArrayList(r4.A4O);
                int size = arrayList.size();
                List<User> BNu = AnonymousClass0BO.A00(userSession2).BNu();
                ArrayList arrayList2 = new ArrayList();
                for (User user : BNu) {
                    if (arrayList.contains(user.getId())) {
                        arrayList2.add(user);
                    }
                }
                LinearLayout linearLayout = lrM.A05;
                linearLayout.removeAllViews();
                View view3 = lrM.A02;
                linearLayout.addView(view3);
                View[] viewArr = new View[size];
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    arrayList2.get(i3);
                    viewArr[i3] = C64192LSz.A00(lrM.A00, userSession2);
                    linearLayout.addView(viewArr[i3]);
                    View view4 = viewArr[i3];
                    if (view4 != null) {
                        int i4 = 8;
                        if (lrM.A08) {
                            i4 = 0;
                        }
                        view4.setVisibility(i4);
                        i3++;
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                int dimensionPixelSize = lrM.A00.getResources().getDimensionPixelSize(R.dimen.alert_dialog_button_cell_height);
                String str = r4.A33;
                if (str != null) {
                    lrM.A03.setImageBitmap(1MF.A0E(str, dimensionPixelSize, dimensionPixelSize));
                }
                boolean A12 = r4.A12();
                ImageView imageView = lrM.A04;
                if (A12) {
                    imageView.setBackgroundResource(R.drawable.grid_camera_icon_small);
                } else {
                    imageView.setBackground((Drawable) null);
                }
                for (int i5 = 0; i5 < size; i5++) {
                    View view5 = viewArr[i5];
                    if (!(view5 == null || view5.getTag() == null)) {
                        Object tag3 = view5.getTag();
                        0qQ.A0C(tag3, AnonymousClass000.A00(1632));
                        C64192LSz.A01(userSession2, this, (C231882sZ) null, (C65533Luw) tag3, r4);
                    }
                }
                AnonymousClass3Q2 r0 = lrM.A07;
                if (!(r0 == null || (list = r0.A4O) == null)) {
                    int size3 = new ArrayList(list).size();
                    StringBuilder sb = new StringBuilder();
                    if (size3 != 0) {
                        Integer valueOf = Integer.valueOf(size3);
                        String string = lrM.A00.getResources().getString(2131969294, new Object[]{0mp.A06("(%d/%d)", new Object[]{valueOf, valueOf})});
                        0qQ.A07(string);
                        sb.append(string);
                    }
                    lrM.A06.setText(sb.toString());
                }
                AnonymousClass0fU.A00(new LX7(lrM, viewArr), view3);
            } else {
                th = new UnsupportedOperationException();
                i2 = -231125295;
            }
            AnonymousClass0fD.A0A(-692693054, A032);
            return;
        }
        th = new IllegalStateException("holder in PendingMediaBinderGroup cannot be null!");
        i2 = 1624742386;
        AnonymousClass0fD.A0A(i2, A032);
        throw th;
    }

    public final void D31(1Xj r8) {
        XSW xsw;
        AnonymousClass37D A012;
        String id = r8.getId();
        Fragment fragment = this.A00;
        if (fragment.getActivity() != null) {
            View view = fragment.mView;
            if (view != null) {
                0nA.A0N(view);
            }
            if (id != null) {
                2FW A002 = C55018Hap.A00(r8);
                if (r8.A5T()) {
                    xsw = XSW.A0G;
                } else {
                    xsw = XSW.A07;
                }
                1ap r1 = 1as.A04.A02;
                UserSession userSession = this.A01;
                AnonymousClass4DU r3 = this.A03;
                C49731F3w A07 = r1.A07(r3, userSession, A002);
                A07.A06(id);
                A07.A07.putSerializable(C273654mx.A00(56), xsw);
                if (r3 != null) {
                    A07.A04(r3);
                }
                DirectShareSheetFragment A003 = A07.A00();
                FragmentActivity activity = fragment.getActivity();
                if (activity != null && (A012 = AnonymousClass37D.A00.A01(activity)) != null) {
                    A012.A0J(A003);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, X.LrM] */
    public final View createView(int i, ViewGroup viewGroup) {
        View A002;
        int A032 = AnonymousClass0fD.A03(1221661082);
        if (i == 0) {
            Context context = this.A02;
            UserSession userSession = this.A01;
            AnonymousClass0t1.A01.A01(userSession);
            A002 = C64192LSz.A00(context, userSession);
        } else if (i == 1) {
            Context context2 = this.A02;
            0qQ.A0B(context2, 0);
            ? obj = new Object();
            obj.A00 = context2;
            View inflate = LayoutInflater.from(context2).inflate(R.layout.layout_cross_posting_pengding_media, (ViewGroup) null, false);
            obj.A02 = inflate;
            obj.A03 = (ImageView) inflate.requireViewById(R.id.row_header_imageview);
            obj.A06 = (TextView) obj.A02.requireViewById(R.id.row_header_textview);
            obj.A04 = (ImageView) obj.A02.requireViewById(R.id.row_header_imageview_overlay);
            obj.A01 = obj.A02.requireViewById(R.id.row_header_caret);
            LinearLayout linearLayout = new LinearLayout(obj.A00);
            obj.A05 = linearLayout;
            linearLayout.setOrientation(1);
            obj.A05.addView(obj.A02);
            obj.A05.setTag(obj);
            A002 = obj.A05;
        } else {
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
            AnonymousClass0fD.A0A(-140234789, A032);
            throw unsupportedOperationException;
        }
        AnonymousClass0fD.A0A(1726454498, A032);
        return A002;
    }
}
