package X;

import android.graphics.Rect;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.7Nb  reason: invalid class name and case insensitive filesystem */
public final class C330497Nb {
    public DirectMessageIdentifier A00;
    public Integer A01 = AnonymousClass05K.A00;
    public boolean A02;
    public final Rect A03 = new Rect();
    public final LinearLayoutManager A04;
    public final RecyclerView A05;
    public final UserSession A06;
    public final C330507Nc A07;
    public final AnonymousClass7ZY A08;
    public final C330737Nz A09;
    public final AnonymousClass7L3 A0A;
    public final C234262xW A0B;
    public final Set A0C;
    public final AnonymousClass0eM A0D = AnonymousClass0eN.A01(new AnonymousClass9LO(this, 35));
    public final AnonymousClass0eM A0E = AnonymousClass0eN.A01(new AnonymousClass9LO(this, 36));
    public final boolean A0F;

    public final void A00(boolean z) {
        if (this.A02) {
            11Z.A02(new C330947Ow(this, z));
        }
    }

    public C330497Nb(LinearLayoutManager linearLayoutManager, RecyclerView recyclerView, UserSession userSession, AnonymousClass7ZY r6, AnonymousClass7L3 r7, boolean z) {
        C330737Nz r0;
        this.A06 = userSession;
        this.A0A = r7;
        this.A05 = recyclerView;
        this.A04 = linearLayoutManager;
        this.A08 = r6;
        this.A0F = z;
        Object value = this.A0D.getValue();
        0qQ.A07(value);
        if (((Boolean) value).booleanValue()) {
            r0 = new C330737Nz(new C22356Y0j(this));
        } else {
            r0 = null;
        }
        this.A09 = r0;
        this.A0B = new C234262xW();
        this.A07 = new C330507Nc(this);
        this.A0C = new LinkedHashSet();
    }
}
