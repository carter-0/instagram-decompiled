package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.JXq  reason: case insensitive filesystem */
public final class C59773JXq implements View.OnTouchListener, C41821B2b {
    public int A00 = -1;
    public float A01 = -1.0f;
    public int A02 = -1;
    public boolean A03;
    public final /* synthetic */ C59767JXi A04;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean A1U = AnonymousClass7TF.A1U(0, view, motionEvent);
        C59767JXi jXi = this.A04;
        if (!jXi.A0H || jXi.A0B == null) {
            return false;
        }
        if (jXi.A07 == null) {
            0kD.A07(C59767JXi.__redex_internal_original_name, "textureView is null", (Throwable) null);
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = -1;
        if (actionMasked != 0) {
            if (actionMasked != A1U) {
                if (actionMasked == 2) {
                    if (!jXi.A0G) {
                        float A002 = AnonymousClass7TE.A00(motionEvent.getRawX(), this.A01);
                        Context A0S = AnonymousClass7TE.A0S(view);
                        int i2 = this.A00;
                        if (i2 == -1) {
                            i2 = DbS.A02(A0S, 5);
                            this.A00 = i2;
                        }
                        if (A002 < ((float) i2)) {
                            return A1U;
                        }
                    }
                    jXi.A0G = A1U;
                    A00(motionEvent.getRawX() - this.A01);
                    this.A01 = motionEvent.getRawX();
                    return true;
                } else if (actionMasked != 3) {
                    return false;
                }
            } else if (!jXi.A0G) {
                float x = motionEvent.getX();
                ViewGroup viewGroup = jXi.A0N;
                if (x < AnonymousClass7TE.A02(viewGroup) * 0.33333334f) {
                    C59767JXi.A06(jXi, -1);
                } else if (motionEvent.getX() > AnonymousClass7TE.A02(viewGroup) * 0.6666667f) {
                    C59767JXi.A06(jXi, A1U ? 1 : 0);
                } else if (!(!this.A03)) {
                    jXi.A0M.setVisibility(0);
                    this.A01 = -1.0f;
                    this.A02 = -1;
                }
            }
            C66567MWv mWv = jXi.A0B;
            if (mWv != null) {
                mWv.start();
            }
            this.A01 = -1.0f;
            this.A02 = -1;
        } else {
            jXi.A0M.setVisibility(8);
            C66567MWv mWv2 = jXi.A0B;
            if (mWv2 != null) {
                z = mWv2.isPlaying();
            } else {
                z = false;
            }
            this.A03 = z;
            C66567MWv mWv3 = jXi.A0B;
            if (mWv3 != null) {
                mWv3.pause();
            }
            C66567MWv mWv4 = jXi.A0B;
            if (mWv4 != null) {
                i = mWv4.getCurrentPosition();
            }
            this.A02 = i;
            this.A01 = motionEvent.getRawX();
        }
        jXi.A0G = false;
        return true;
    }

    public C59773JXq(C59767JXi jXi) {
        this.A04 = jXi;
    }

    private final void A00(float f) {
        int i;
        int i2;
        C59767JXi jXi = this.A04;
        TextureView textureView = jXi.A07;
        if (jXi.A0B != null && textureView != null) {
            float A022 = f / (AnonymousClass7TE.A02(textureView) / 2.0f);
            AnonymousClass8Q3 r6 = jXi.A0A;
            AnonymousClass8Q2 r2 = jXi.A0X;
            if (r6 == r2) {
                i2 = jXi.A02;
                i = jXi.A01;
            } else {
                i = jXi.A0D.A00;
                i2 = 0;
            }
            int i3 = this.A02;
            int A002 = (int) 0mi.A00(((float) i3) + (A022 * ((float) (i - i2))), (float) i2, (float) i);
            if (Math.abs(A002 - i3) > 50 || (A002 == 0 && i3 != 0)) {
                if (r6 == r2) {
                    r2.Dxd(A002, 0, 0);
                }
                C66567MWv mWv = jXi.A0B;
                if (mWv != null) {
                    mWv.seekTo(A002);
                }
                int i4 = this.A02;
                if (jXi.A0A != r2) {
                    C59770JXl jXl = jXi.A0V;
                    if (C63161KsU.A00(jXl, i4) != C63161KsU.A00(jXl, A002)) {
                        AnonymousClass2S0.A01.A05(5);
                    }
                }
                this.A02 = A002;
            }
        }
    }

    public final boolean CV7() {
        C66567MWv mWv;
        C59767JXi jXi = this.A04;
        AnonymousClass8Q3 r1 = jXi.A0A;
        AnonymousClass8Q2 r0 = jXi.A0X;
        if (r1 != r0 || r0.A02 != AnonymousClass05K.A01 || (mWv = jXi.A0B) == null || !mWv.isPlaying()) {
            return false;
        }
        return true;
    }

    public final void DhO(float f) {
        C66567MWv mWv = this.A04.A0B;
        if (mWv != null) {
            this.A02 = mWv.getCurrentPosition();
            A00(f);
        }
    }

    public final void DlF() {
        C59767JXi jXi = this.A04;
        C66567MWv mWv = jXi.A0B;
        if (mWv != null) {
            int i = 0;
            boolean isPlaying = mWv.isPlaying();
            C66567MWv mWv2 = jXi.A0B;
            if (isPlaying) {
                if (mWv2 != null) {
                    mWv2.pause();
                }
            } else if (mWv2 != null) {
                mWv2.start();
            }
            View view = jXi.A0M;
            if (!isPlaying) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }
}
