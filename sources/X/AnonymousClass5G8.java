package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5G8  reason: invalid class name */
public final class AnonymousClass5G8 {
    public Context A00;
    public AnonymousClass0iw A01;
    public UserSession A02;
    public Integer A03;
    public List A04 = new ArrayList();
    public List A05 = new ArrayList();
    public Map A06 = new HashMap();
    public final boolean A07;
    public final boolean A08;

    public AnonymousClass5G8(Context context, AnonymousClass0iw r6, UserSession userSession, Integer num, List list, boolean z, boolean z2) {
        List list2;
        this.A02 = userSession;
        this.A03 = num;
        this.A00 = context;
        this.A01 = r6;
        this.A07 = z;
        this.A08 = z2;
        for (int i = 0; i < list.size(); i++) {
            Reel reel = (Reel) list.get(i);
            if (reel.A0z(this.A02)) {
                list2 = this.A04;
            } else {
                list2 = this.A05;
            }
            list2.add(reel);
            this.A06.put(reel, Integer.valueOf(i));
        }
    }
}
