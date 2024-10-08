package X;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.Eiw  reason: case insensitive filesystem */
public abstract class C48711Eiw {
    public static final Object A00(C307896Rx r15, AnonymousClass6Tm r16) {
        String str;
        View view;
        ViewGroup viewGroup;
        C229382nI A06 = C308206Td.A06(r15);
        FragmentActivity A04 = C308206Td.A04(r15);
        List list = r16.A00;
        C276544tV r0 = (C276544tV) list.get(1);
        if (r0 != null) {
            str = r0.A0F();
        } else {
            str = null;
        }
        Fragment A00 = C48296EcF.A00(A04);
        if (!(A00 == null || (view = A00.mView) == null || (viewGroup = (ViewGroup) view.getParent()) == null || A00.mDetached || A00.mRemoving)) {
            C3034368u r7 = (C3034368u) list.get(0);
            View findViewWithTag = viewGroup.findViewWithTag("story_viewer_media_container_view_tag");
            0qQ.A0B(A04, 1);
            C273694n2 r14 = new C273694n2(A04);
            if (findViewWithTag != null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(findViewWithTag.getWidth(), findViewWithTag.getHeight());
                layoutParams.setMargins(0, findViewWithTag.getTop(), 0, 0);
                r14.setLayoutParams(layoutParams);
            }
            SparseArray sparseArray = new SparseArray();
            C307786Rm r02 = r15.A03;
            if (r02 != null) {
                Object obj = r02.A01.get(R.id.video_player_origin);
                if (PlayerOrigin.class.isInstance(obj) && obj != null) {
                    sparseArray.put(R.id.video_player_origin, obj);
                }
            }
            AnonymousClass6NR A002 = AnonymousClass6NS.A00(A04, r7, A06);
            A002.A00 = sparseArray;
            AnonymousClass6NS A003 = A002.A00();
            A003.A07(r14);
            viewGroup.setOnKeyListener(new FPN(viewGroup, r14, A003));
            0h9 r13 = A00.mLifecycleRegistry;
            C50133FQq fQq = new C50133FQq(viewGroup, r13, r14, A003, str);
            r13.A09(fQq);
            r14.setTag(R.id.stories_overlay, fQq);
            viewGroup.addView(r14);
            r14.setVisibility(0);
        }
        return null;
    }
}
