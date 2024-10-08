package X;

import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.SbW  reason: case insensitive filesystem */
public final class C11509SbW implements View.OnTouchListener {
    public static final Pattern A08 = Pattern.compile("(?i)^https://(.*)\\.facebook\\.com/(flx/warn|fblynx/warn|si/linkclick/warn)/(.*)");
    public boolean A00;
    public boolean A01;
    public final 02R A02;
    public final SRY A03;
    public final A9z A04;
    public final String A05;
    public final List A06;
    public final List A07;

    public C11509SbW(02R r1, SRY sry, A9z a9z, String str, List list, List list2) {
        this.A04 = a9z;
        this.A05 = str;
        this.A03 = sry;
        this.A06 = list;
        this.A07 = list2;
        this.A02 = r1;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            A9z a9z = this.A04;
            if (a9z.A0p) {
                a9z.A01++;
            }
        }
        if (!this.A00) {
            this.A00 = true;
            if (view != null) {
                C7903QcV.A00(view).A0c = true;
            }
            Iterator it = this.A07.iterator();
            while (it.hasNext()) {
                it.next();
            }
            SRY sry = this.A03;
            SRY.A02(new QJe(sry, 0), sry, false);
        }
        if (!this.A01) {
            String str = this.A05;
            if (str != null) {
                if (!DbV.A1b(str, A08)) {
                    this.A02.accept(true);
                    for (C7578QKt qKt : this.A06) {
                        if (!qKt.A02) {
                            C7578QKt.A00(qKt);
                        }
                    }
                    this.A01 = true;
                }
            }
            return false;
        }
        for (C13923TlR DsY : this.A07) {
            DsY.DsY(motionEvent, view);
        }
        return false;
    }
}
