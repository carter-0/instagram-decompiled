package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Uel  reason: case insensitive filesystem */
public final class C15557Uel extends C231632rz {
    public final Context A00;
    public final UserSession A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-654452252);
        C255773uh r2 = (C255773uh) obj;
        VWD vwd = (VWD) view.getTag();
        if (vwd != null) {
            UserSession userSession = this.A01;
            C272024jy A002 = C297825sP.A00(r2);
            A002.getClass();
            List A012 = AnonymousClass9OX.A01(A002);
            int[] A04 = C297825sP.A04(userSession, A002, false);
            int A003 = C17043VFr.A00(A002.A02);
            Context context = vwd.A00;
            int color = context.getColor(A003);
            int size = A012.size();
            LayoutInflater from = LayoutInflater.from(context);
            LinearLayout linearLayout = vwd.A01;
            int childCount = size - linearLayout.getChildCount();
            int i2 = 0;
            int i3 = -childCount;
            if (childCount >= 0) {
                while (i2 < childCount) {
                    View inflate = from.inflate(R.layout.reel_dashboard_poll_v2_result_option_row, linearLayout, false);
                    vwd.A02.add(new C17660Vbq(inflate));
                    linearLayout.addView(inflate);
                    i2++;
                }
            } else {
                while (i2 < i3) {
                    linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
                    List list = vwd.A02;
                    list.remove(C51966G9m.A06(list));
                    i2++;
                }
            }
            int i4 = 0;
            while (true) {
                List list2 = vwd.A02;
                if (i4 >= list2.size()) {
                    break;
                }
                C17660Vbq vbq = (C17660Vbq) list2.get(i4);
                C272014jx r11 = (C272014jx) A012.get(i4);
                int i5 = A04[i4];
                String A06 = 0mp.A06("%s %s", new Object[]{r11.getText(), DbW.A0h(vbq.A00, r11.Arb(), 2131969557)});
                String A062 = 0mp.A06("%d%%", AnonymousClass7TF.A1b(i5));
                vbq.A01.setColors(new int[]{color, color});
                vbq.A05.setText(A06);
                vbq.A04.setText(A06);
                vbq.A07.setText(A062);
                vbq.A06.setText(A062);
                View view2 = vbq.A02;
                view2.setClipBounds(new Rect(0, 0, (int) (((float) view2.getWidth()) * (((float) i5) / 100.0f)), view2.getHeight()));
                i4++;
            }
        }
        AnonymousClass0fD.A0A(1996447540, A03);
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        C272024jy A002 = C297825sP.A00((C255773uh) obj);
        A002.getClass();
        return AnonymousClass9OX.A00(A002).hashCode();
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return C297825sP.A02(this.A01, (C255773uh) obj).hashCode();
    }

    public C15557Uel(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-1366030002);
        View A0C = DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.reel_dashboard_poll_v2_result);
        A0C.setTag(new VWD(A0C));
        AnonymousClass0fD.A0A(1099096868, A03);
        return A0C;
    }
}
