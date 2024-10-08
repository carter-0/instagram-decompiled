package X;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.ISk  reason: case insensitive filesystem */
public final class C57197ISk implements AnonymousClass36F {
    public final /* synthetic */ AnonymousClass32F A00;

    public final boolean AJb(1Xj r2) {
        0qQ.A0B(r2, 0);
        C54229H3y h3y = this.A00.A09;
        if (h3y != null) {
            return h3y.A04.A0B(r2);
        }
        DbS.A13();
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DQv(1Xj r11) {
        Intent intent;
        0qQ.A0B(r11, 0);
        AnonymousClass32F r2 = this.A00;
        C54229H3y h3y = r2.A09;
        if (h3y != null) {
            boolean A1b = AnonymousClass7TE.A1b(h3y.A04.A01);
            C54229H3y h3y2 = r2.A09;
            if (h3y2 != null) {
                C54229H3y.A00(h3y2);
                C54229H3y h3y3 = r2.A09;
                if (h3y3 != null) {
                    boolean A1b2 = AnonymousClass7TE.A1b(h3y3.A04.A01);
                    if (A1b && !A1b2) {
                        if (r2.A0H) {
                            intent = new Intent();
                            intent.putExtra("media_id", r11.getId());
                            intent.putExtra("media_type", "FEED");
                            if (r11.A2K() == AnonymousClass05K.A01) {
                                intent.putExtra("media_action", AnonymousClass000.A00(1574));
                                ImageUrl A1Q = r11.A1Q();
                                if (A1Q != null) {
                                    intent.putExtra(AnonymousClass000.A00(1586), A1Q.getUrl());
                                    intent.putExtra(AnonymousClass000.A00(1585), A1Q.getHeight());
                                    intent.putExtra(AnonymousClass000.A00(1588), A1Q.getWidth());
                                } else {
                                    throw AnonymousClass7TE.A0y();
                                }
                            } else {
                                intent.putExtra("media_action", AnonymousClass000.A00(1573));
                            }
                        } else if (r2.A08 != null) {
                            intent = new Intent();
                            intent.putExtra("media_id", r11.getId());
                            intent.putExtra("media_type", "FEED");
                        }
                        r2.requireActivity().setResult(-1, intent);
                        0hq parentFragmentManager = r2.getParentFragmentManager();
                        FragmentActivity requireActivity = r2.requireActivity();
                        if (AnonymousClass06S.A01(parentFragmentManager)) {
                            requireActivity.onBackPressed();
                        }
                    }
                    0hq r1 = r2.mFragmentManager;
                    if (!A1b || A1b2 || r1 == null || r1.A0M() <= 0) {
                        C54229H3y h3y4 = r2.A09;
                        if (h3y4 != null) {
                            h3y4.notifyDataSetChanged();
                            return;
                        }
                    } else if (r2.isResumed()) {
                        r1.A0c();
                        return;
                    } else {
                        r2.A0G = true;
                        return;
                    }
                }
            }
        }
        0qQ.A0F("adapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public C57197ISk(AnonymousClass32F r1) {
        this.A00 = r1;
    }
}
