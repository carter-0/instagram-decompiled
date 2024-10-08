package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.instagram.nux.cal.model.FXCalAgeInfo;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Weu  reason: case insensitive filesystem */
public final class C19753Weu implements X5E {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C19753Weu(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void D1Z(IgRadioGroup igRadioGroup, int i) {
        String str;
        Object next;
        String str2;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver.OnPreDrawListener onPreDrawListener;
        FXCalAgeInfo fXCalAgeInfo;
        switch (this.A00) {
            case 0:
                List list = ((C60989Jul) this.A02).A01;
                Iterator it = list.iterator();
                do {
                    str = null;
                    if (it.hasNext()) {
                        next = it.next();
                        str2 = ((C61050Jvo) next).A06;
                        C61050Jvo jvo = (C61050Jvo) 00k.A0O(list, i);
                        if (jvo != null) {
                            str = jvo.A06;
                        }
                    } else {
                        return;
                    }
                } while (!0qQ.A0K(str2, str));
                if (next != null) {
                    C51965G9l.A1W(this.A01, next);
                    return;
                }
                return;
            case 1:
                Object tag = igRadioGroup.requireViewById(i).getTag();
                if ((tag instanceof C16607Uy3) && tag != null) {
                    C15309UaG uaG = (C15309UaG) this.A02;
                    uaG.A02().A03.Epw(tag);
                    viewTreeObserver = ((View) this.A01).getViewTreeObserver();
                    if (viewTreeObserver != null) {
                        onPreDrawListener = uaG.A06;
                        break;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 2:
                Object tag2 = igRadioGroup.requireViewById(i).getTag();
                if ((tag2 instanceof C16607Uy3) && tag2 != null) {
                    C15306UaD uaD = (C15306UaD) this.A02;
                    C13990Tnq.A0U(uaD.A08).A07.Epw(tag2);
                    viewTreeObserver = ((View) this.A01).getViewTreeObserver();
                    if (viewTreeObserver != null) {
                        onPreDrawListener = uaD.A06;
                        break;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                break;
            default:
                View view = (View) this.A02;
                if (!view.isEnabled()) {
                    view.setEnabled(true);
                }
                E1F e1f = (E1F) this.A01;
                if (i == 1) {
                    String str3 = e1f.A04.A02;
                    str3.getClass();
                    e1f.A07 = str3;
                    fXCalAgeInfo = e1f.A04;
                } else {
                    String str4 = e1f.A03.A02;
                    str4.getClass();
                    e1f.A07 = str4;
                    fXCalAgeInfo = e1f.A03;
                }
                String str5 = fXCalAgeInfo.A03;
                str5.getClass();
                e1f.A08 = str5;
                return;
        }
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
    }
}
