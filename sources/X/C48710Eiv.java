package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;

/* renamed from: X.Eiv  reason: case insensitive filesystem */
public abstract class C48710Eiv {
    public static Object A00(C307896Rx r4, AnonymousClass6Tm r5) {
        String A0F;
        View view;
        ViewGroup viewGroup;
        C308206Td.A09(r4);
        FragmentActivity A04 = C308206Td.A04(r4);
        C276544tV r0 = (C276544tV) DbW.A0e(r5);
        if (r0 == null) {
            A0F = null;
        } else {
            A0F = r0.A0F();
        }
        Fragment A00 = C48296EcF.A00(A04);
        if (A00 != null && (view = A00.mView) != null && (viewGroup = (ViewGroup) view.getParent()) != null && !A00.mDetached && !A00.mRemoving) {
            if (A0F == null) {
                A0F = "";
            }
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (childCount >= 0) {
                    C50133FQq fQq = (C50133FQq) viewGroup.getChildAt(childCount).getTag(R.id.stories_overlay);
                    if (fQq != null && A0F.equals(fQq.A00)) {
                        fQq.onDestroy();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return null;
    }
}
