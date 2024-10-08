package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.4nY  reason: invalid class name and case insensitive filesystem */
public class C274014nY extends LayoutInflater {
    public static final String[] A04 = {"android.widget.", "android.webkit.", "android.app."};
    public final LayoutInflater A00;
    public final boolean A01;
    public final C274604oj A02 = new C274604oj();
    public final boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C274014nY(Context context, LayoutInflater layoutInflater, boolean z, boolean z2) {
        super(layoutInflater, context);
        0qQ.A0B(layoutInflater, 1);
        this.A00 = layoutInflater;
        this.A01 = z;
        this.A03 = z2;
    }

    public LayoutInflater cloneInContext(Context context) {
        0qQ.A0B(context, 0);
        LayoutInflater cloneInContext = this.A00.cloneInContext(context);
        0qQ.A07(cloneInContext);
        return new C274014nY(context, cloneInContext, this.A01, this.A03);
    }

    public final View onCreateView(String str, AttributeSet attributeSet) {
        View view;
        0qQ.A0B(str, 0);
        0qQ.A0B(attributeSet, 1);
        String[] strArr = A04;
        int i = 0;
        while (true) {
            view = null;
            if (i >= 3) {
                break;
            }
            try {
                view = createView(str, strArr[i], attributeSet);
            } catch (ClassNotFoundException unused) {
            }
            if (view != null) {
                break;
            }
            i++;
        }
        if (view != null) {
            return view;
        }
        View onCreateView = super.onCreateView(str, attributeSet);
        0qQ.A07(onCreateView);
        return onCreateView;
    }

    public View inflate(int i, ViewGroup viewGroup, boolean z) {
        LayoutInflater layoutInflater;
        View inflate;
        View inflate2;
        if (this.A03) {
            C274604oj r4 = this.A02;
            if (r4.tryLock()) {
                try {
                    if (this.A01) {
                        inflate2 = super.inflate(i, viewGroup, z);
                    } else {
                        inflate2 = this.A00.inflate(i, viewGroup, z);
                    }
                    0qQ.A0A(inflate2);
                    return inflate2;
                } finally {
                    r4.unlock();
                }
            } else {
                0KC.A0D("IgLayoutInflater", 002.A0u("Thread conflict, cloning to avoid locking thisThread = ", Thread.currentThread().getName(), " holderThread=", r4.A00()));
                Context context = getContext();
                0qQ.A07(context);
                layoutInflater = cloneInContext(context);
                inflate = layoutInflater.inflate(i, viewGroup, z);
            }
        } else if (this.A01) {
            inflate = super.inflate(i, viewGroup, z);
        } else {
            layoutInflater = this.A00;
            inflate = layoutInflater.inflate(i, viewGroup, z);
        }
        0qQ.A0A(inflate);
        return inflate;
    }

    public final View inflate(XmlPullParser xmlPullParser, ViewGroup viewGroup, boolean z) {
        View inflate;
        if (!this.A03) {
            inflate = super.inflate(xmlPullParser, viewGroup, z);
        } else {
            C274604oj r4 = this.A02;
            if (r4.tryLock()) {
                try {
                    inflate = super.inflate(xmlPullParser, viewGroup, z);
                } finally {
                    r4.unlock();
                }
            } else {
                0KC.A0D("IgLayoutInflater", 002.A0u("Thread conflict, cloning to avoid locking thisThread = ", Thread.currentThread().getName(), " holderThread=", r4.A00()));
                Context context = getContext();
                0qQ.A07(context);
                inflate = cloneInContext(context).inflate(xmlPullParser, viewGroup, z);
            }
        }
        0qQ.A0A(inflate);
        return inflate;
    }
}
