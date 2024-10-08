package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.instagram.android.R;
import java.lang.ref.WeakReference;

/* renamed from: X.VzO  reason: case insensitive filesystem */
public final class C18743VzO {
    public int A00;
    public int A01 = -1;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public Drawable A06;
    public Handler A07;
    public Message A08;
    public Message A09;
    public Message A0A;
    public View A0B;
    public View A0C;
    public Button A0D;
    public Button A0E;
    public Button A0F;
    public ImageView A0G;
    public ListAdapter A0H;
    public ListView A0I;
    public TextView A0J;
    public TextView A0K;
    public NestedScrollView A0L;
    public CharSequence A0M;
    public CharSequence A0N;
    public CharSequence A0O;
    public CharSequence A0P;
    public CharSequence A0Q;
    public boolean A0R;
    public final Context A0S;
    public final View.OnClickListener A0T = new C18887WAz(this, 0);
    public final Window A0U;
    public final QAE A0V;

    public static ViewGroup A00(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            C13989Tnp.A17(view2);
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.U1j, android.os.Handler] */
    public C18743VzO(Context context, Window window, QAE qae) {
        this.A0S = context;
        this.A0V = qae;
        this.A0U = window;
        ? handler = new Handler();
        handler.A00 = new WeakReference(qae);
        this.A07 = handler;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, AnonymousClass2Z3.A04, R.attr.alertDialogStyle, 0);
        this.A00 = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.A03 = obtainStyledAttributes.getResourceId(4, 0);
        this.A04 = obtainStyledAttributes.getResourceId(5, 0);
        this.A05 = obtainStyledAttributes.getResourceId(7, 0);
        this.A02 = obtainStyledAttributes.getResourceId(3, 0);
        this.A0R = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        qae.A04().A0Q(1);
    }

    public static boolean A01(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (childCount > 0) {
                childCount--;
                if (A01(viewGroup.getChildAt(childCount))) {
                }
            }
        }
        return false;
        return true;
    }
}
