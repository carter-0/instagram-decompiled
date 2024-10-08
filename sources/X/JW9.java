package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.mediatabbar.Tab;
import com.instagram.ui.widget.mediapicker.Folder;
import com.instagram.ui.widget.trianglespinner.TriangleSpinner;
import java.util.ArrayList;
import java.util.List;

public final class JW9 extends LinearLayout implements View.OnClickListener, C252203oj, C66502MUg, MXO, AdapterView.OnItemSelectedListener {
    public BaseAdapter A00;
    public Tab A01;
    public AnonymousClass8ZZ A02;
    public MQF A03;
    public AnonymousClass8ZW A04;
    public boolean A05;
    public boolean A06;
    public final 2cs A07;
    public final UserSession A08;
    public final TriangleSpinner A09;
    public final View A0A;
    public final ImageView A0B;
    public final TextView A0C;
    public final boolean A0D;
    public final Paint A0E;
    public final TextView A0F;
    public final TextView A0G;

    public JW9(Context context, UserSession userSession, boolean z, boolean z2, boolean z3) {
        super(context, (AttributeSet) null, 0);
        ImageView imageView;
        int color;
        Integer num;
        Integer num2;
        this.A08 = userSession;
        LayoutInflater.from(context).inflate(R.layout.media_capture_action_bar, this);
        Context context2 = getContext();
        context2.getColor(R.color.badge_color);
        this.A0D = 0mk.A02(context2);
        Paint A0C2 = JTO.A0C();
        this.A0E = A0C2;
        A0C2.setColor(2Yu.A0F(context2, R.attr.creationDividerColor));
        JTO.A1N(A0C2);
        A0C2.setStrokeWidth(1.0f);
        2cs A0J = AnonymousClass7TF.A0J();
        A0J.A0A(this);
        boolean z4 = true;
        A0J.A06 = true;
        this.A07 = A0J;
        ImageView A0G2 = DbS.A0G(this, R.id.action_bar_cancel);
        if (A0G2 != null) {
            A0G2.setImageResource(R.drawable.instagram_x_pano_outline_24);
            AnonymousClass0fU.A00(this, A0G2);
            DbT.A1A(context2.getResources(), A0G2, 2131954722);
        }
        A0G2.getClass();
        this.A0B = A0G2;
        this.A09 = (TriangleSpinner) requireViewById(R.id.gallery_folder_menu);
        this.A06 = false;
        TextView A0G3 = DbU.A0G(this, R.id.photo_title);
        this.A0F = A0G3;
        setAccessibilityForHeading(A0G3);
        TextView A0G4 = DbU.A0G(this, R.id.video_title);
        this.A0G = A0G4;
        setAccessibilityForHeading(A0G4);
        TextView A0G5 = DbU.A0G(this, R.id.new_post_title);
        this.A0C = A0G5;
        setAccessibilityForHeading(A0G5);
        if (z2) {
            DbT.A18(02K.A01(context2), A0G5, 2131968297);
        }
        if (userSession != null) {
            if (182.A06(0Tu.A05, userSession, 36329041002905345L) || C355698Qz.A00(userSession)) {
                num = AnonymousClass05K.A00;
            } else {
                z4 = false;
                if (!z3 || !C322606w6.A06(userSession)) {
                    if (z) {
                        num2 = AnonymousClass05K.A00;
                    } else {
                        num2 = AnonymousClass05K.A0Y;
                    }
                    Integer num3 = AnonymousClass05K.A0N;
                    if (num2 == num3) {
                        num = AnonymousClass05K.A0Y;
                    } else {
                        num = AnonymousClass05K.A0C;
                        if (num2 == num || num2 != (num3 = AnonymousClass05K.A01)) {
                            num = num3;
                        }
                    }
                } else {
                    num = AnonymousClass05K.A0j;
                }
            }
            View A012 = JWN.A01(this, this, num, false);
            this.A0A = A012;
            if (num == AnonymousClass05K.A00) {
                imageView = (ImageView) A012;
                color = z4 ? context.getColor(2Yu.A0B(context)) : color;
                color = context2.getColor(R.color.text_link_selector);
            }
            setLayoutParams(new ViewGroup.LayoutParams(-1, AnonymousClass3D4.A00(context)));
        }
        View A013 = JWN.A01(this, this, AnonymousClass05K.A00, false);
        this.A0A = A013;
        imageView = (ImageView) A013;
        color = context2.getColor(R.color.text_link_selector);
        imageView.setColorFilter(color);
        setLayoutParams(new ViewGroup.LayoutParams(-1, AnonymousClass3D4.A00(context)));
    }

    public static void setAccessibilityForHeading(View view) {
        2eQ.A04(view, 1);
        2eQ.A03(view);
    }

    public final void A01() {
        int i;
        this.A05 = true;
        this.A01 = JXL.A00;
        if (this.A0D) {
            i = (getChildCount() - 1) - this.A01.A00;
        } else {
            i = 0;
        }
        Dq9((float) i, 0.0f);
        Dq9((float) this.A01.A00, 0.0f);
        A00(true, true, false);
        this.A0B.setImageResource(R.drawable.instagram_arrow_back_24);
        TriangleSpinner triangleSpinner = this.A09;
        triangleSpinner.setVisibility(8);
        triangleSpinner.setEnabled(false);
    }

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public final void Dq9(float f, float f2) {
        TextView textView;
        float f3 = 1.0f;
        if (f <= 0.0f) {
            TriangleSpinner triangleSpinner = this.A09;
            triangleSpinner.setAlpha(1.0f);
            triangleSpinner.setEnabled(true);
            this.A0F.setAlpha(0.0f);
        } else if (f <= 1.0f) {
            TriangleSpinner triangleSpinner2 = this.A09;
            float f4 = 1.0f - f;
            triangleSpinner2.setAlpha(f4);
            triangleSpinner2.setEnabled(false);
            this.A0F.setAlpha(1.0f - f4);
        } else {
            if (f <= 1.0f || f > 2.0f) {
                TriangleSpinner triangleSpinner3 = this.A09;
                triangleSpinner3.setAlpha(0.0f);
                triangleSpinner3.setEnabled(false);
                this.A0F.setAlpha(0.0f);
                textView = this.A0G;
            } else {
                TriangleSpinner triangleSpinner4 = this.A09;
                triangleSpinner4.setAlpha(0.0f);
                triangleSpinner4.setEnabled(false);
                float f5 = 2.0f - f;
                this.A0F.setAlpha(f5);
                textView = this.A0G;
                f3 = 1.0f - f5;
            }
            textView.setAlpha(f3);
            A02();
        }
        this.A0G.setAlpha(0.0f);
        A02();
    }

    public final /* synthetic */ void DqB(Tab tab) {
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int left = getLeft();
        int right = getRight();
        float bottom = (float) (getBottom() - 1);
        canvas.drawLine((float) left, bottom, (float) right, bottom, this.A0E);
    }

    public int getTabCount() {
        return 1;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public void setSelectedFolder(Folder folder) {
        for (int i = 0; i < getFolders().size(); i++) {
            if (((Folder) getFolders().get(i)).A02 == folder.A02) {
                this.A09.setSelection(i);
                return;
            }
        }
    }

    public void setSelectedMixedFolder(C357268Xf r5) {
        for (int i = 0; i < getCombinedFolders().size(); i++) {
            C357268Xf r2 = (C357268Xf) getCombinedFolders().get(i);
            if (r2.CAp() == r5.CAp() && r2.BEU() == r5.BEU()) {
                this.A09.setSelection(i);
                return;
            }
        }
    }

    private void A00(boolean z, boolean z2, boolean z3) {
        2cs r3 = this.A07;
        if (r3 == null) {
            return;
        }
        if (this.A05) {
            r3.A02();
            return;
        }
        double d = z2 ? 1.0d : 0.0d;
        if (z3) {
            r3.A06(d);
        } else {
            r3.A08(d, true);
        }
        this.A0A.setEnabled(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (((X.C59867Jal) r0).A0H != false) goto L_0x0028;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r4 = this;
            com.instagram.creation.base.ui.mediatabbar.Tab r1 = r4.A01
            r2 = 0
            if (r1 != 0) goto L_0x0009
            r4.A00(r2, r2, r2)
        L_0x0008:
            return
        L_0x0009:
            com.instagram.creation.base.ui.mediatabbar.Tab r0 = X.JXL.A01
            r3 = 1
            if (r1 != r0) goto L_0x0012
            r4.A00(r2, r2, r3)
            return
        L_0x0012:
            com.instagram.creation.base.ui.mediatabbar.Tab r0 = X.JXL.A02
            if (r1 != r0) goto L_0x003f
            X.MQF r0 = r4.A03
            if (r0 == 0) goto L_0x0028
            com.instagram.creation.capture.MediaCaptureFragment r0 = (com.instagram.creation.capture.MediaCaptureFragment) r0
            X.MXN r0 = r0.mCaptureProvider
            r0.getClass()
            X.Jal r0 = (X.C59867Jal) r0
            boolean r0 = r0.A0H
            r1 = 1
            if (r0 == 0) goto L_0x0029
        L_0x0028:
            r1 = 0
        L_0x0029:
            X.MQF r0 = r4.A03
            if (r0 == 0) goto L_0x003b
            com.instagram.creation.capture.MediaCaptureFragment r0 = (com.instagram.creation.capture.MediaCaptureFragment) r0
            X.MXN r0 = r0.mCaptureProvider
            r0.getClass()
            boolean r0 = r0.CJh()
            if (r0 == 0) goto L_0x003b
            r2 = 1
        L_0x003b:
            r4.A00(r1, r2, r3)
            return
        L_0x003f:
            com.instagram.creation.base.ui.mediatabbar.Tab r0 = X.JXL.A00
            if (r1 != r0) goto L_0x0008
            float r1 = X.AnonymousClass7TE.A03(r4)
            float r0 = r4.getTranslationY()
            float r1 = r1 - r0
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r1 = X.AnonymousClass7TF.A1R(r0)
            X.8ZW r0 = r4.A04
            if (r0 == 0) goto L_0x0073
            boolean r0 = r0.CX2()
            if (r0 == 0) goto L_0x0073
            if (r1 != 0) goto L_0x0063
            boolean r0 = r4.A06
            if (r0 == 0) goto L_0x0073
        L_0x0063:
            r0 = 1
        L_0x0064:
            r4.A00(r3, r0, r3)
            android.widget.ImageView r1 = r4.A0B
            boolean r0 = r4.A05
            if (r0 == 0) goto L_0x006f
            r2 = 8
        L_0x006f:
            r1.setVisibility(r2)
            return
        L_0x0073:
            r0 = 0
            goto L_0x0064
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JW9.A02():void");
    }

    public final void DmE(2cs r3) {
        this.A0A.setAlpha(JTO.A03(r3));
    }

    public List getCombinedFolders() {
        AnonymousClass8ZW r0 = this.A04;
        if (r0 == null) {
            return new ArrayList();
        }
        return r0.getCombinedFolders();
    }

    public C357268Xf getCurrentMixedFolder() {
        AnonymousClass8ZW r0 = this.A04;
        if (r0 == null) {
            return new Folder(getContext().getString(2131962524), (String) null, -1, false);
        }
        return r0.getCurrentMixedFolder();
    }

    public List getFolders() {
        AnonymousClass8ZW r0 = this.A04;
        if (r0 == null) {
            return AnonymousClass7TE.A1C();
        }
        return r0.getFolders();
    }

    public void setBaseDelegate(AnonymousClass8ZZ r1) {
        this.A02 = r1;
        if (r1 != null) {
            A02();
        }
    }

    public void setFeedCaptureDelegate(MQF mqf) {
        this.A03 = mqf;
        if (mqf != null) {
            A02();
        }
    }

    public void setGalleryDelegate(AnonymousClass8ZW r8, C361528gN r9) {
        this.A04 = r8;
        JWA jwa = new JWA(getResources(), this);
        this.A00 = jwa;
        TriangleSpinner triangleSpinner = this.A09;
        triangleSpinner.setAdapter(jwa);
        triangleSpinner.setOnItemSelectedListener(this);
        triangleSpinner.setOnTouchListener(new C64283LYj(0, this, r8, r9));
        AnonymousClass8ZW r0 = this.A04;
        if (r0 != null) {
            C59743JWb B6e = r0.B6e();
            if (B6e.A01 == null) {
                B6e.A01 = triangleSpinner;
                MBM mbm = new MBM(this, 1);
                JWc jWc = B6e.A04;
                jWc.A00 = new JG1(31, mbm, B6e);
                triangleSpinner.setBottomSheetBuilder(jWc, B6e.A02.requireActivity(), new JX3(B6e, new MBJ(1, this, B6e)));
            }
            A02();
        }
    }

    public void setNextEnabledWithColor(boolean z) {
        this.A0A.setEnabled(z);
    }

    public void setUnifiedCameraGallery(boolean z) {
        this.A06 = z;
        TextView textView = this.A0C;
        if (z) {
            textView.setAlpha(1.0f);
            TriangleSpinner triangleSpinner = this.A09;
            triangleSpinner.setAlpha(0.0f);
            triangleSpinner.setEnabled(false);
            this.A0F.setAlpha(0.0f);
            textView = this.A0G;
        }
        textView.setAlpha(0.0f);
    }

    public final void onClick(View view) {
        int i;
        int A052 = AnonymousClass0fD.A05(566638010);
        if (this.A02 == null) {
            i = 821265007;
        } else {
            if (view == this.A0B) {
                UserSession userSession = this.A08;
                if (userSession != null) {
                    C322316vd.A00(userSession).A05("profile_picture_gallery_canceled");
                    C322316vd.A00(userSession).A04(C273654mx.A00(146));
                }
                this.A02.onCancel();
            } else if (view == this.A0A && this.A07.A01 == 1.0d) {
                UserSession userSession2 = this.A08;
                if (userSession2 != null) {
                    C49061Eof.A00(userSession2).A00(EWT.EDIT_PROFILE_PIC_FLOW, AnonymousClass05K.A0j);
                    C322316vd.A00(userSession2).A05("profile_picture_gallery_confirmed");
                }
                this.A02.DUJ();
            }
            i = -1008830493;
        }
        AnonymousClass0fD.A0C(i, A052);
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        A02();
    }

    public final void DqA(Tab tab, Tab tab2) {
        this.A01 = tab2;
    }
}
