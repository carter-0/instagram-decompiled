package X;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.direct.messagethread.store.intf.MessageListLayoutManager;

/* renamed from: X.AcO  reason: case insensitive filesystem */
public final class C40453AcO implements C332697Wa {
    public C62320sa A00;
    public C62320sa A01;
    public C62320sa A02;
    public boolean A03 = true;
    public boolean A04;
    public final Handler A05;
    public final C332697Wa A06;

    public final void D6Y(Bundle bundle, C333197Ya r4) {
        0qQ.A0B(r4, 0);
        this.A04 = false;
        if (this.A03) {
            this.A00 = new C41567AwZ(44, r4, this, bundle);
            this.A01 = null;
            this.A02 = null;
            return;
        }
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        this.A06.D6Y(bundle, r4);
    }

    public final void D70(C333517Zg r3) {
        0qQ.A0B(r3, 0);
        this.A04 = false;
        boolean z = this.A03;
        C62320sa r0 = this.A00;
        if (!z) {
            if (r0 != null) {
                r0.invoke();
            }
            this.A00 = null;
            this.A01 = null;
            this.A02 = null;
            this.A06.D70(r3);
        } else if (r0 != null) {
            this.A01 = new C73665Phe(5, this, r3);
            this.A02 = null;
        } else {
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void Dys(View view, RecyclerView recyclerView, C333517Zg r7, MessageListLayoutManager messageListLayoutManager) {
        0qQ.A0B(view, 0);
        C333517Zg r2 = r7;
        MessageListLayoutManager messageListLayoutManager2 = messageListLayoutManager;
        AnonymousClass7TG.A1U(recyclerView, messageListLayoutManager, r7);
        this.A04 = false;
        boolean z = this.A03;
        C62320sa r0 = this.A00;
        if (!z) {
            if (r0 != null) {
                r0.invoke();
            }
            C62320sa r02 = this.A01;
            if (r02 != null) {
                r02.invoke();
            }
            this.A00 = null;
            this.A01 = null;
            this.A02 = null;
            this.A06.Dys(view, recyclerView, r7, messageListLayoutManager);
        } else if (r0 == null) {
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else if (this.A01 != null) {
            this.A02 = new C58218IoM(19, r2, messageListLayoutManager2, this, view, recyclerView);
        } else {
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }

    public final void onDestroy() {
        this.A04 = false;
        if (!this.A03 && this.A00 == null) {
            this.A06.onDestroy();
        }
    }

    public final void onDestroyView() {
        this.A04 = false;
        if (!this.A03 && this.A00 == null && this.A01 == null && this.A02 == null) {
            this.A06.onDestroyView();
        }
    }

    public final void onPause() {
        this.A04 = false;
        if (!this.A03 && this.A00 == null && this.A01 == null && this.A02 == null) {
            this.A06.onPause();
        }
    }

    public final void onResume() {
        this.A04 = true;
        if (!this.A03) {
            C62320sa r0 = this.A00;
            if (r0 != null) {
                r0.invoke();
            }
            C62320sa r02 = this.A01;
            if (r02 != null) {
                r02.invoke();
            }
            C62320sa r03 = this.A02;
            if (r03 != null) {
                r03.invoke();
            }
            this.A00 = null;
            this.A01 = null;
            this.A02 = null;
            this.A06.onResume();
        }
    }

    public final void onStop() {
        this.A04 = false;
        if (!this.A03 && this.A00 == null && this.A01 == null && this.A02 == null) {
            this.A06.onStop();
        }
    }

    public final void CvY() {
        this.A05.postDelayed(new C40871Akf(this), 1000);
    }

    public final void D7F() {
        if (this.A03) {
            this.A03 = false;
            if (this.A04) {
                C62320sa r0 = this.A00;
                if (r0 != null) {
                    r0.invoke();
                }
                C62320sa r02 = this.A01;
                if (r02 != null) {
                    r02.invoke();
                }
                C62320sa r03 = this.A02;
                if (r03 != null) {
                    r03.invoke();
                }
                this.A00 = null;
                this.A01 = null;
                this.A02 = null;
                this.A06.onResume();
            }
        }
    }

    public /* synthetic */ C40453AcO(C332697Wa r3) {
        Handler A0D = AnonymousClass7TF.A0D();
        this.A06 = r3;
        this.A05 = A0D;
    }
}
