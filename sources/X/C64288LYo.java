package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.LYo  reason: case insensitive filesystem */
public final class C64288LYo implements View.OnTouchListener, C41821B2b {
    public int A00 = -1;
    public float A01 = -1.0f;
    public int A02 = -1;
    public boolean A03;
    public final /* synthetic */ K5W A04;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean A1U = AnonymousClass7TF.A1U(0, view, motionEvent);
        K5W k5w = this.A04;
        if (k5w.A0E == null) {
            return false;
        }
        if (k5w.A06 != null) {
            int actionMasked = motionEvent.getActionMasked();
            int i = -1;
            if (actionMasked != 0) {
                if (actionMasked != A1U) {
                    if (actionMasked == 2) {
                        if (!k5w.A0N) {
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
                        k5w.A0N = A1U;
                        A00(motionEvent.getRawX() - this.A01);
                        this.A01 = motionEvent.getRawX();
                        return true;
                    } else if (actionMasked != 3) {
                        return false;
                    }
                } else if (!k5w.A0N) {
                    float x = motionEvent.getX();
                    ViewGroup viewGroup = k5w.A08;
                    if (viewGroup != null) {
                        if (x < AnonymousClass7TE.A02(viewGroup) * 0.33333334f) {
                            K5W.A03(k5w, -1);
                        } else {
                            float x2 = motionEvent.getX();
                            ViewGroup viewGroup2 = k5w.A08;
                            if (viewGroup2 != null) {
                                if (x2 > AnonymousClass7TE.A02(viewGroup2) * 0.6666667f) {
                                    K5W.A03(k5w, A1U ? 1 : 0);
                                } else if (!(!this.A03)) {
                                    View view2 = k5w.A07;
                                    if (view2 != null) {
                                        view2.setVisibility(0);
                                        this.A01 = -1.0f;
                                        this.A02 = -1;
                                    }
                                    0qQ.A0F("playButton");
                                    throw AnonymousClass00P.createAndThrow();
                                }
                            }
                        }
                    }
                    0qQ.A0F("clipsReviewContainer");
                    throw AnonymousClass00P.createAndThrow();
                }
                C66567MWv mWv = k5w.A0E;
                if (mWv != null) {
                    mWv.start();
                }
                this.A01 = -1.0f;
                this.A02 = -1;
            } else {
                View view3 = k5w.A07;
                if (view3 != null) {
                    view3.setVisibility(8);
                    C66567MWv mWv2 = k5w.A0E;
                    if (mWv2 != null) {
                        z = mWv2.isPlaying();
                    } else {
                        z = false;
                    }
                    this.A03 = z;
                    C66567MWv mWv3 = k5w.A0E;
                    if (mWv3 != null) {
                        mWv3.pause();
                    }
                    C66567MWv mWv4 = k5w.A0E;
                    if (mWv4 != null) {
                        i = mWv4.getCurrentPosition();
                    }
                    this.A02 = i;
                    this.A01 = motionEvent.getRawX();
                }
                0qQ.A0F("playButton");
                throw AnonymousClass00P.createAndThrow();
            }
            k5w.A0N = false;
            return true;
        }
        throw AnonymousClass7TE.A0y();
    }

    public C64288LYo(K5W k5w) {
        this.A04 = k5w;
    }

    private final void A00(float f) {
        int i;
        int i2;
        K5W k5w = this.A04;
        TextureView textureView = k5w.A06;
        if (k5w.A0E != null && textureView != null) {
            float A022 = f / (AnonymousClass7TE.A02(textureView) / 2.0f);
            AnonymousClass8Q3 r1 = k5w.A0C;
            if (r1 != null) {
                AnonymousClass8Q2 r0 = k5w.A0G;
                String str = "clipsReviewTrimMode";
                if (r0 != null) {
                    if (r1 == r0) {
                        i2 = k5w.A01;
                        i = k5w.A00;
                    } else {
                        i = C60295Jit.A01(k5w.A0X).A00;
                        i2 = 0;
                    }
                    int i3 = this.A02;
                    int A002 = (int) 0mi.A00(((float) i3) + (A022 * ((float) (i - i2))), (float) i2, (float) i);
                    if (Math.abs(A002 - i3) > 50 || (A002 == 0 && i3 != 0)) {
                        AnonymousClass8Q3 r12 = k5w.A0C;
                        if (r12 != null) {
                            AnonymousClass8Q2 r02 = k5w.A0G;
                            if (r02 != null) {
                                if (r12 == r02) {
                                    r02.Dxd(A002, 0, 0);
                                }
                                C66567MWv mWv = k5w.A0E;
                                if (mWv != null) {
                                    mWv.seekTo(A002);
                                }
                                int i4 = this.A02;
                                AnonymousClass8Q3 r13 = k5w.A0C;
                                if (r13 == null) {
                                    str = "currentReviewMode";
                                } else {
                                    AnonymousClass8Q2 r03 = k5w.A0G;
                                    if (r03 != null) {
                                        if (r13 != r03) {
                                            C65067Lml lml = k5w.A0T;
                                            if (C63161KsU.A00(lml, i4) != C63161KsU.A00(lml, A002)) {
                                                AnonymousClass2S0.A01.A05(5);
                                            }
                                        }
                                        this.A02 = A002;
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        return;
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            0qQ.A0F("currentReviewMode");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final boolean CV7() {
        String str;
        C66567MWv mWv;
        K5W k5w = this.A04;
        AnonymousClass8Q3 r3 = k5w.A0C;
        if (r3 == null) {
            str = "currentReviewMode";
        } else {
            AnonymousClass8Q2 r0 = k5w.A0G;
            str = "clipsReviewTrimMode";
            if (r0 != null) {
                if (r3 != r0 || r0.A02 != AnonymousClass05K.A01 || (mWv = k5w.A0E) == null || !mWv.isPlaying()) {
                    return false;
                }
                return true;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DhO(float f) {
        C66567MWv mWv = this.A04.A0E;
        if (mWv != null) {
            this.A02 = mWv.getCurrentPosition();
            A00(f);
        }
    }

    public final void DlF() {
        K5W k5w = this.A04;
        C66567MWv mWv = k5w.A0E;
        if (mWv != null) {
            int i = 0;
            boolean isPlaying = mWv.isPlaying();
            C66567MWv mWv2 = k5w.A0E;
            if (isPlaying) {
                if (mWv2 != null) {
                    mWv2.pause();
                }
            } else if (mWv2 != null) {
                mWv2.start();
            }
            View view = k5w.A07;
            if (view == null) {
                0qQ.A0F("playButton");
                throw AnonymousClass00P.createAndThrow();
            }
            if (!isPlaying) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }
}
