package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.BlockableCoordinatorLayout;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel;
import com.instagram.music.common.model.MusicAssetModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8hW  reason: invalid class name and case insensitive filesystem */
public final class C362208hW {
    public RecyclerView A00;
    public MusicAssetModel A01;
    public C252063oV A02;
    public final Activity A03;
    public final Context A04;
    public final UserSession A05;
    public final C357638Yz A06;
    public final AnonymousClass8ZY A07;
    public final C362198hV A08;
    public final C362258hb A09;
    public final AnonymousClass8XA A0A;
    public final GalleryMemoriesViewModel A0B;
    public final Map A0C = new LinkedHashMap();
    public final AnonymousClass0eM A0D;
    public final View A0E;
    public final ViewGroup A0F;
    public final BlockableCoordinatorLayout A0G;
    public final C62320sa A0H;

    public C362208hW(Activity activity, ViewGroup viewGroup, ViewGroup viewGroup2, UserSession userSession, C357638Yz r12, AnonymousClass8ZY r13, C362198hV r14, AnonymousClass8XA r15, GalleryMemoriesViewModel galleryMemoriesViewModel, AnonymousClass0eM r17, C62320sa r18) {
        0qQ.A0B(viewGroup2, 7);
        this.A03 = activity;
        this.A05 = userSession;
        this.A06 = r12;
        this.A08 = r14;
        this.A0D = r17;
        this.A0F = viewGroup2;
        this.A0A = r15;
        this.A07 = r13;
        this.A0B = galleryMemoriesViewModel;
        this.A0H = r18;
        Context applicationContext = activity.getApplicationContext();
        0qQ.A07(applicationContext);
        this.A04 = applicationContext;
        View requireViewById = viewGroup.requireViewById(R.id.gallery_destination_bar);
        0qQ.A07(requireViewById);
        this.A00 = (RecyclerView) requireViewById;
        this.A02 = 2b1.A01(viewGroup.requireViewById(R.id.redesigned_gallery_destination_bar_stub), false, false);
        this.A09 = new C362258hb(applicationContext, new C362218hX(this), new C362228hY(this), new C362238hZ(this), new C362248ha(this));
        View requireViewById2 = viewGroup.requireViewById(R.id.gallery_container);
        0qQ.A07(requireViewById2);
        this.A0E = requireViewById2;
        View requireViewById3 = viewGroup.requireViewById(R.id.gallery_container_coordinator);
        0qQ.A07(requireViewById3);
        this.A0G = (BlockableCoordinatorLayout) requireViewById3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.7j2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v108, resolved type: X.7j8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v109, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v133, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v1, resolved type: X.7j8} */
    /* JADX WARNING: type inference failed for: r15v1, types: [X.9mg, X.7j2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r18v14, types: [X.7j2] */
    /* JADX WARNING: type inference failed for: r18v15, types: [X.7j8] */
    /* JADX WARNING: type inference failed for: r18v16, types: [X.7j8] */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x02b4, code lost:
        if (r4.A00() != false) goto L_0x02b6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0624  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A00() {
        /*
            r60 = this;
            r2 = r60
            com.instagram.common.session.UserSession r11 = r2.A05
            X.8Yz r0 = r2.A06
            X.80m r0 = r0.A08
            r59 = r0
            java.lang.Object r0 = r0.A00
            X.4yO r0 = (X.C279284yO) r0
            boolean r0 = X.C339047iy.A00(r11, r0)
            if (r0 == 0) goto L_0x0773
            r55 = 0
        L_0x0016:
            X.7iz r54 = X.C339057iz.CAMERA
            r58 = 2131238040(0x7f081c98, float:1.8092347E38)
            X.7j0 r56 = X.C339067j0.A00
            X.7j1 r57 = X.C339077j1.A00
            X.7j2 r0 = new X.7j2
            r53 = r0
            r53.<init>(r54, r55, r56, r57, r58)
            r1 = 2131955434(0x7f130eea, float:1.9547395E38)
            java.lang.Integer r55 = java.lang.Integer.valueOf(r1)
            X.7iz r54 = X.C339057iz.GIPHY
            r40 = 0
            r58 = 2131238321(0x7f081db1, float:1.8092917E38)
            X.7j2 r12 = new X.7j2
            r53 = r12
            r53.<init>(r54, r55, r56, r57, r58)
            r1 = 2131955211(0x7f130e0b, float:1.9546943E38)
            java.lang.Integer r55 = java.lang.Integer.valueOf(r1)
            X.7iz r54 = X.C339057iz.ASSET_HUB
            r58 = 2131238539(0x7f081e8b, float:1.809336E38)
            X.7j2 r13 = new X.7j2
            r53 = r13
            r53.<init>(r54, r55, r56, r57, r58)
            r49 = 2131238877(0x7f081fdd, float:1.8094045E38)
            r1 = 2131962975(0x7f132c5f, float:1.956269E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            X.7iz r42 = X.C339057iz.TEMPLATES
            X.7j2 r17 = new X.7j2
            r3 = r17
            r4 = r42
            r6 = r56
            r7 = r57
            r8 = r49
            r3.<init>(r4, r5, r6, r7, r8)
            r1 = 2131955304(0x7f130e68, float:1.9547132E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            X.7iz r4 = X.C339057iz.ACR
            r8 = 2131238519(0x7f081e77, float:1.809332E38)
            X.7j2 r16 = new X.7j2
            r3 = r16
            r3.<init>(r4, r5, r6, r7, r8)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.8hV r4 = r2.A08
            boolean r1 = r4.A03()
            if (r1 == 0) goto L_0x008c
            r3.add(r0)
        L_0x008c:
            X.8Yz r0 = r4.A03
            X.80m r10 = r0.A08
            java.lang.Object r0 = r10.A00
            boolean r0 = r0 instanceof X.AnonymousClass9QA
            if (r0 == 0) goto L_0x00c5
            boolean r0 = r4.A04()
            if (r0 == 0) goto L_0x00c5
            com.instagram.common.session.UserSession r6 = r4.A02
            X.0Tu r5 = X.0Tu.A05
            r0 = 36328512721862020(0x81109700013d84, double:3.037635956260212E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 == 0) goto L_0x00c5
            r0 = 2131954583(0x7f130b97, float:1.954567E38)
            java.lang.Integer r20 = java.lang.Integer.valueOf(r0)
            X.7iz r19 = X.C339057iz.CREATE_MODE
            r23 = 2131238898(0x7f081ff2, float:1.8094088E38)
            X.7j2 r0 = new X.7j2
            r18 = r0
            r21 = r56
            r22 = r7
            r18.<init>(r19, r20, r21, r22, r23)
            r3.add(r0)
        L_0x00c5:
            java.lang.Object r0 = r10.A00
            boolean r0 = r0 instanceof X.AnonymousClass9QA
            if (r0 == 0) goto L_0x00fa
            boolean r0 = r4.A04()
            if (r0 == 0) goto L_0x00fa
            com.instagram.common.session.UserSession r6 = r4.A02
            X.0Tu r5 = X.0Tu.A05
            r0 = 36328512721927557(0x81109700023d85, double:3.037635956301658E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 == 0) goto L_0x00fa
            r0 = 2131954603(0x7f130bab, float:1.954571E38)
            java.lang.Integer r20 = java.lang.Integer.valueOf(r0)
            X.7iz r19 = X.C339057iz.LAYOUT_TOOL
            r23 = 2131238486(0x7f081e56, float:1.8093252E38)
            X.7j2 r0 = new X.7j2
            r18 = r0
            r21 = r56
            r22 = r7
            r18.<init>(r19, r20, r21, r22, r23)
            r3.add(r0)
        L_0x00fa:
            boolean r0 = r4.A08()
            if (r0 == 0) goto L_0x01b5
            r0 = 2131974274(0x7f135882, float:1.9585607E38)
            java.lang.Integer r20 = java.lang.Integer.valueOf(r0)
            X.7iz r5 = X.C339057iz.IMAGINE
            r23 = 2131238628(0x7f081ee4, float:1.809354E38)
            X.7j2 r0 = new X.7j2
            r18 = r0
            r19 = r5
            r21 = r56
            r22 = r7
            r18.<init>(r19, r20, r21, r22, r23)
            r3.add(r0)
            X.1Av r6 = X.1Au.A00(r11)
            X.0s0 r1 = r6.A3y
            X.0YZ[] r14 = X.1Av.A8a
            r9 = 77
            r0 = r14[r9]
            java.lang.Object r0 = r1.CDM(r6, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x01b5
            X.0Tu r6 = X.0Tu.A05
            r0 = 36327258591475984(0x810f7300023910, double:3.036842839154105E-306)
            boolean r0 = X.182.A06(r6, r11, r0)
            if (r0 == 0) goto L_0x01b5
            android.content.Context r1 = r2.A04
            r0 = 2131974275(0x7f135883, float:1.958561E38)
            java.lang.String r8 = r1.getString(r0)
            X.0qQ.A07(r8)
            X.27r r0 = X.27p.A01(r11)
            X.29V r6 = r0.A0C
            X.0wc r7 = r6.A01
            java.lang.String r1 = "ig_camera_nux"
            X.0kJ r0 = r7.A00
            X.0Aj r7 = r7.A00(r0, r1)
            boolean r0 = r7.isSampled()
            if (r0 == 0) goto L_0x018d
            java.lang.String r1 = "IMAGINE_BUNDLE"
            java.lang.String r0 = "entity"
            r7.AAJ(r0, r1)
            java.lang.String r1 = "OPEN"
            java.lang.String r0 = "nux_step"
            r7.AAJ(r0, r1)
            X.283 r6 = r6.A04
            java.lang.String r1 = r6.A0L
            if (r1 != 0) goto L_0x0179
            java.lang.String r1 = ""
        L_0x0179:
            java.lang.String r0 = "camera_session_id"
            r7.AAJ(r0, r1)
            X.28D r1 = r6.A09
            java.lang.String r0 = "entry_point"
            r7.A8M(r1, r0)
            java.lang.String r0 = "ui_text"
            r7.AAJ(r0, r8)
            r7.Cgf()
        L_0x018d:
            android.app.Activity r1 = r2.A03
            X.6jx r0 = new X.6jx
            r0.<init>((java.lang.CharSequence) r8)
            X.5Gt r6 = new X.5Gt
            r6.<init>(r1, r0)
            r6.A01()
            r0 = 8000(0x1f40, float:1.121E-41)
            r6.A00 = r0
            java.util.Map r0 = r2.A0C
            r0.put(r5, r6)
            X.1Av r6 = X.1Au.A00(r11)
            r0 = 1
            X.0s0 r5 = r6.A3y
            r1 = r14[r9]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.Epx(r6, r0, r1)
        L_0x01b5:
            java.lang.Object r5 = r10.A00
            X.0sa r0 = r4.A09
            java.lang.Object r1 = r0.invoke()
            X.28D r1 = (X.28D) r1
            r15 = 0
            X.0qQ.A0B(r5, r15)
            r14 = 1
            X.0qQ.A0B(r1, r14)
            X.9QA r0 = X.AnonymousClass9QA.A00
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0209
            boolean r0 = X.C339097j3.A00(r1)
            if (r0 == 0) goto L_0x0209
            android.content.Context r0 = X.C60960kU.A00
            X.0qQ.A07(r0)
            boolean r0 = X.C305756Jk.A00(r0)
            if (r0 == 0) goto L_0x0209
            com.instagram.common.session.UserSession r6 = r4.A02
            X.0Tu r5 = X.0Tu.A05
            r0 = 36322048796469169(0x810ab6000727b1, double:3.0335481438136346E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 == 0) goto L_0x0209
            r0 = 2131974273(0x7f135881, float:1.9585605E38)
            java.lang.Integer r20 = java.lang.Integer.valueOf(r0)
            X.7iz r19 = X.C339057iz.IMAGINE_BLOKS_ONLY
            r23 = 2131238628(0x7f081ee4, float:1.809354E38)
            X.7j2 r0 = new X.7j2
            r18 = r0
            r21 = r56
            r22 = r57
            r18.<init>(r19, r20, r21, r22, r23)
            r3.add(r0)
        L_0x0209:
            com.instagram.common.session.UserSession r9 = r4.A02
            boolean r0 = X.1CI.A00(r9)
            if (r0 == 0) goto L_0x0238
            X.0Tu r5 = X.0Tu.A05
            r0 = 36324861999591851(0x810d45000031ab, double:3.0353272247962785E-306)
            boolean r0 = X.182.A06(r5, r9, r0)
            if (r0 == 0) goto L_0x0238
            r0 = 2131974272(0x7f135880, float:1.9585603E38)
            java.lang.Integer r20 = java.lang.Integer.valueOf(r0)
            X.7iz r19 = X.C339057iz.AI_PROTOTYPES
            r23 = 2131237969(0x7f081c51, float:1.8092203E38)
            X.7j2 r0 = new X.7j2
            r18 = r0
            r21 = r56
            r22 = r57
            r18.<init>(r19, r20, r21, r22, r23)
            r3.add(r0)
        L_0x0238:
            boolean r0 = r4.A07()
            if (r0 == 0) goto L_0x0241
            r3.add(r12)
        L_0x0241:
            boolean r0 = r4.A06()
            if (r0 == 0) goto L_0x0265
            boolean r0 = r4.A05()
            if (r0 == 0) goto L_0x075a
            android.content.Context r6 = r2.A04
            X.0sa r0 = r2.A0H
            java.lang.Object r0 = r0.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            int r5 = r0.intValue()
            X.7iz r1 = X.C339057iz.DRAFTS
            X.9SG r0 = new X.9SG
            r0.<init>(r6, r1, r5)
        L_0x0262:
            r3.add(r0)
        L_0x0265:
            boolean r0 = r4.A04()
            if (r0 == 0) goto L_0x029c
            java.lang.Object r0 = r10.A00
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x029c
            boolean r0 = r4.A00()
            if (r0 != 0) goto L_0x029c
            X.8XA r0 = r4.A05
            boolean r0 = r0.A0R()
            if (r0 != 0) goto L_0x029c
            X.0Tu r5 = X.0Tu.A05
            r0 = 36323805437767189(0x810c4f00022e15, double:3.034659050843929E-306)
            boolean r0 = X.182.A06(r5, r9, r0)
            if (r0 == 0) goto L_0x029c
            X.0Tu r5 = X.0Tu.A06
            r0 = 2342166814651788826(0x20810c4f00072e1a, double:4.06881256893558E-152)
            boolean r0 = X.182.A06(r5, r9, r0)
            if (r0 == 0) goto L_0x029c
            r3.add(r13)
        L_0x029c:
            java.lang.Object r0 = r10.A00
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x02b6
            X.0Tu r5 = X.0Tu.A05
            r0 = 36319957146935128(0x8108cf00001f58, double:3.0322253762259105E-306)
            boolean r0 = X.182.A06(r5, r9, r0)
            if (r0 == 0) goto L_0x02b6
            boolean r1 = r4.A00()
            r0 = 1
            if (r1 == 0) goto L_0x02b7
        L_0x02b6:
            r0 = 0
        L_0x02b7:
            r13 = 2
            if (r0 == 0) goto L_0x02e7
            com.instagram.music.common.model.MusicAssetModel r0 = r2.A01
            if (r0 == 0) goto L_0x0731
            android.content.Context r7 = r2.A04
            com.instagram.common.typedurl.ImageUrl r6 = r0.A03
            X.0qQ.A07(r6)
            android.app.Activity r1 = r2.A03
            android.content.res.Resources r8 = r1.getResources()
            r5 = 2131953270(0x7f130676, float:1.9543006E38)
            java.lang.String r1 = r0.A0D
            java.lang.String r0 = r0.A0I
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            java.lang.String r5 = r8.getString(r5, r0)
            X.0qQ.A07(r5)
            X.7iz r1 = X.C339057iz.AUDIO
            X.9mh r0 = new X.9mh
            r0.<init>(r7, r6, r1, r5)
        L_0x02e4:
            r3.add(r0)
        L_0x02e7:
            java.lang.Object r0 = r10.A00
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x032d
            X.0Tu r5 = X.0Tu.A05
            r0 = 36319957147000665(0x8108cf00011f59, double:3.032225376267356E-306)
            boolean r0 = X.182.A06(r5, r9, r0)
            if (r0 == 0) goto L_0x032d
            boolean r0 = r4.A00()
            if (r0 != 0) goto L_0x032d
            com.instagram.music.common.model.MusicAssetModel r0 = r2.A01
            if (r0 == 0) goto L_0x0718
            android.content.Context r7 = r2.A04
            com.instagram.common.typedurl.ImageUrl r6 = r0.A03
            X.0qQ.A07(r6)
            android.app.Activity r1 = r2.A03
            android.content.res.Resources r8 = r1.getResources()
            r5 = 2131953270(0x7f130676, float:1.9543006E38)
            java.lang.String r1 = r0.A0D
            java.lang.String r0 = r0.A0I
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            java.lang.String r5 = r8.getString(r5, r0)
            X.0qQ.A07(r5)
            X.7iz r1 = X.C339057iz.TRENDING
            X.9mh r0 = new X.9mh
            r0.<init>(r7, r6, r1, r5)
        L_0x032a:
            r3.add(r0)
        L_0x032d:
            boolean r0 = r4.A04()
            if (r0 == 0) goto L_0x035c
            boolean r0 = r4.A00()
            if (r0 != 0) goto L_0x035c
            X.8XA r0 = r4.A05
            boolean r0 = r0.A0R()
            if (r0 != 0) goto L_0x035c
            java.lang.Object r0 = r10.A00
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x035c
            X.87s r0 = r4.A08
            X.4gw r0 = r0.A04
            if (r0 != 0) goto L_0x035c
            X.8hS r0 = r4.A04
            X.0Ud r0 = r0.A0K
            java.lang.Object r0 = r0.getValue()
            if (r0 != 0) goto L_0x035c
            r0 = r17
            r3.add(r0)
        L_0x035c:
            boolean r0 = r4.A04()
            if (r0 == 0) goto L_0x045f
            java.lang.Object r0 = r10.A00
            boolean r0 = r0 instanceof X.AnonymousClass9QA
            if (r0 == 0) goto L_0x045f
            boolean r0 = r4.A0B
            if (r0 != 0) goto L_0x045f
            java.lang.Boolean r0 = X.C349167zh.A00(r9)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x045f
            X.0Tu r5 = X.0Tu.A05
            r0 = 36325201302074063(0x810d94000132cf, double:3.035541801052291E-306)
            boolean r0 = X.182.A06(r5, r9, r0)
            if (r0 == 0) goto L_0x045f
            r0 = 36325201302729429(0x810d94000b32d5, double:3.035541801466747E-306)
            boolean r0 = X.182.A06(r5, r11, r0)
            if (r0 == 0) goto L_0x06b6
            android.content.Context r0 = r2.A04
            r1 = 2131240317(0x7f08257d, float:1.8096966E38)
            android.graphics.drawable.Drawable r20 = r0.getDrawable(r1)
            if (r20 == 0) goto L_0x077c
            r1 = 1128136704(0x433e0000, float:190.0)
            float r1 = X.0nA.A00(r0, r1)
            int r6 = (int) r1
            r1 = -1039663104(0xffffffffc2080000, float:-34.0)
            float r24 = X.0nA.A00(r0, r1)
            r1 = -1041901814(0xffffffffc1e5d70a, float:-28.73)
            float r25 = X.0nA.A00(r0, r1)
            r1 = 1109655552(0x42240000, float:41.0)
            float r22 = X.0nA.A00(r0, r1)
            r1 = -1047003136(0xffffffffc1980000, float:-19.0)
            float r23 = X.0nA.A00(r0, r1)
            r1 = -1051459584(0xffffffffc1540000, float:-13.25)
            float r28 = X.0nA.A00(r0, r1)
            r1 = -1045430272(0xffffffffc1b00000, float:-22.0)
            float r29 = X.0nA.A00(r0, r1)
            r1 = -1039400960(0xffffffffc20c0000, float:-35.0)
            float r26 = X.0nA.A00(r0, r1)
            float r27 = X.0nA.A00(r0, r1)
            r1 = -1053294592(0xffffffffc1380000, float:-11.5)
            float r32 = X.0nA.A00(r0, r1)
            r1 = -1046185247(0xffffffffc1a47ae1, float:-20.56)
            float r33 = X.0nA.A00(r0, r1)
            r1 = -1036517376(0xffffffffc2380000, float:-46.0)
            float r30 = X.0nA.A00(r0, r1)
            r1 = -1055916032(0xffffffffc1100000, float:-9.0)
            float r31 = X.0nA.A00(r0, r1)
            r1 = 1117782016(0x42a00000, float:80.0)
            float r5 = X.0nA.A00(r0, r1)
            int r5 = (int) r5
            float r1 = X.0nA.A00(r0, r1)
            int r1 = (int) r1
            r21 = 0
            r39 = 33848(0x8438, float:4.7431E-41)
            X.7j4 r12 = new X.7j4
            r34 = r6
            r35 = r15
            r36 = r15
            r37 = r5
            r38 = r1
            r18 = r12
            r19 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            X.7j6 r8 = new X.7j6
            r8.<init>(r12)
            r0 = r59
            java.lang.Object r0 = r0.A00
            X.4yO r0 = (X.C279284yO) r0
            boolean r34 = X.C339047iy.A00(r11, r0)
            r30 = r34 ^ 1
            r27 = 1065353216(0x3f800000, float:1.0)
            if (r34 == 0) goto L_0x0424
            r27 = 1058642330(0x3f19999a, float:0.6)
        L_0x0424:
            X.7iz r21 = X.C339057iz.MUSIC
            X.9Le r7 = new X.9Le
            r7.<init>(r2, r15)
            X.9Le r6 = new X.9Le
            r6.<init>(r2, r14)
            X.9Le r5 = new X.9Le
            r5.<init>(r2, r13)
            r0 = 3
            X.9Le r1 = new X.9Le
            r1.<init>(r2, r0)
            r28 = 2131238572(0x7f081eac, float:1.8093426E38)
            r29 = 2131962956(0x7f132c4c, float:1.9562652E38)
            X.7j7 r23 = X.C339137j7.A00
            X.7j8 r0 = new X.7j8
            r18 = r0
            r19 = r8
            r20 = r12
            r22 = r7
            r24 = r6
            r25 = r5
            r26 = r1
            r31 = r14
            r32 = r14
            r33 = r14
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
        L_0x045c:
            r3.add(r0)
        L_0x045f:
            boolean r0 = r4.A04()
            if (r0 == 0) goto L_0x0542
            java.lang.Object r0 = r10.A00
            boolean r0 = r0 instanceof X.AnonymousClass9QA
            if (r0 == 0) goto L_0x0542
            boolean r0 = r4.A0B
            if (r0 != 0) goto L_0x0542
            X.0Tu r5 = X.0Tu.A05
            r0 = 36319939968180034(0x8108cb00111f42, double:3.032214512312016E-306)
            boolean r0 = X.182.A06(r5, r9, r0)
            if (r0 == 0) goto L_0x0542
            r0 = 36319939968573255(0x8108cb00171f47, double:3.03221451256069E-306)
            boolean r0 = X.182.A06(r5, r11, r0)
            if (r0 == 0) goto L_0x06b2
            android.content.Context r0 = r2.A04
            java.lang.String r23 = "GalleryGridDestinationBarController"
            r24 = 88
            X.8Nk r19 = new X.8Nk
            r20 = r0
            r21 = r11
            r22 = r40
            r25 = r14
            r26 = r15
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            r1 = 1115207762(0x4278b852, float:62.18)
            float r1 = X.0nA.A00(r0, r1)
            int r7 = (int) r1
            r20 = -1057300152(0xffffffffc0fae148, float:-7.84)
            java.lang.String r1 = "#FD8D32"
            int r34 = android.graphics.Color.parseColor(r1)
            r1 = -1037959168(0xffffffffc2220000, float:-40.5)
            float r21 = X.0nA.A00(r0, r1)
            r1 = -1050148864(0xffffffffc1680000, float:-14.5)
            float r22 = X.0nA.A00(r0, r1)
            r23 = 0
            r1 = -1042022400(0xffffffffc1e40000, float:-28.5)
            float r25 = X.0nA.A00(r0, r1)
            r1 = -1046740992(0xffffffffc19c0000, float:-19.5)
            float r26 = X.0nA.A00(r0, r1)
            java.lang.String r1 = "#D300C5"
            int r35 = android.graphics.Color.parseColor(r1)
            r1 = 1105461248(0x41e40000, float:28.5)
            float r29 = X.0nA.A00(r0, r1)
            r1 = 1098383360(0x41780000, float:15.5)
            float r30 = X.0nA.A00(r0, r1)
            r1 = 1117913088(0x42a20000, float:81.0)
            float r1 = X.0nA.A00(r0, r1)
            int r6 = (int) r1
            r1 = 1109131264(0x421c0000, float:39.0)
            float r1 = X.0nA.A00(r0, r1)
            int r1 = (int) r1
            r38 = 812816(0xc6710, float:1.138998E-39)
            X.7j4 r17 = new X.7j4
            r24 = r23
            r27 = r23
            r28 = r23
            r31 = r23
            r32 = r23
            r33 = r7
            r36 = r6
            r37 = r1
            r18 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r0 = 36319939968442182(0x8108cb00151f46, double:3.032214512477799E-306)
            boolean r53 = X.182.A06(r5, r11, r0)
            r0 = 47
            X.9LC r6 = new X.9LC
            r6.<init>(r2, r0)
            r0 = 48
            X.9LC r5 = new X.9LC
            r5.<init>(r2, r0)
            r0 = 49
            X.9LC r1 = new X.9LC
            r1.<init>(r2, r0)
            r50 = 2131962975(0x7f132c5f, float:1.956269E38)
            r48 = 1065353216(0x3f800000, float:1.0)
            X.7jF r45 = X.C339217jF.A00
            X.7jG r46 = X.C339227jG.A00
            X.7j8 r0 = new X.7j8
            r39 = r0
            r41 = r17
            r43 = r6
            r44 = r5
            r47 = r1
            r51 = r15
            r52 = r15
            r54 = r15
            r55 = r15
            r39.<init>(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)
        L_0x053f:
            r3.add(r0)
        L_0x0542:
            boolean r0 = r4.A00()
            if (r0 != 0) goto L_0x0583
            X.8XA r0 = r4.A05
            boolean r0 = r0.A0R()
            if (r0 != 0) goto L_0x0583
            java.lang.Object r0 = r10.A00
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x0583
            X.87s r0 = r4.A08
            X.4gw r0 = r0.A04
            if (r0 != 0) goto L_0x0583
            X.8hS r0 = r4.A04
            X.0Ud r0 = r0.A0K
            java.lang.Object r0 = r0.getValue()
            if (r0 != 0) goto L_0x0583
            X.0Tu r5 = X.0Tu.A05
            r0 = 36318333649426515(0x81075500021853, double:3.031198669864164E-306)
            boolean r0 = X.182.A06(r5, r9, r0)
            if (r0 == 0) goto L_0x0583
            r0 = 36329599348588756(0x811194000140d4, double:3.0383231433776945E-306)
            boolean r0 = X.182.A06(r5, r9, r0)
            if (r0 != 0) goto L_0x0583
            r0 = r16
            r3.add(r0)
        L_0x0583:
            java.lang.Object r0 = r10.A00
            boolean r0 = r0 instanceof X.AnonymousClass9QA
            if (r0 == 0) goto L_0x05bf
            boolean r0 = r4.A04()
            if (r0 == 0) goto L_0x05bf
            r0 = 2131952865(0x7f1304e1, float:1.9542185E38)
            java.lang.Integer r55 = java.lang.Integer.valueOf(r0)
            X.7iz r54 = X.C339057iz.PHOTOS
            r58 = 2131238638(0x7f081eee, float:1.809356E38)
            X.7j2 r0 = new X.7j2
            r53 = r0
            r53.<init>(r54, r55, r56, r57, r58)
            r3.add(r0)
            boolean r0 = r4.A0A
            if (r0 != 0) goto L_0x05bf
            r0 = 2131952867(0x7f1304e3, float:1.9542189E38)
            java.lang.Integer r55 = java.lang.Integer.valueOf(r0)
            X.7iz r54 = X.C339057iz.VIDEOS
            r58 = 2131238117(0x7f081ce5, float:1.8092504E38)
            X.7j2 r0 = new X.7j2
            r53 = r0
            r53.<init>(r54, r55, r56, r57, r58)
            r3.add(r0)
        L_0x05bf:
            com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel r0 = r4.A06
            X.0Ud r5 = r0.A06
            java.lang.Object r0 = r5.getValue()
            X.9IV r0 = (X.AnonymousClass9IV) r0
            java.lang.Object r0 = r0.A00
            X.8WV r0 = (X.AnonymousClass8WV) r0
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x06ac
            java.lang.Object r0 = r5.getValue()
            X.9IV r0 = (X.AnonymousClass9IV) r0
            java.lang.Object r0 = r0.A00
            X.8WV r0 = (X.AnonymousClass8WV) r0
            int r1 = r0.A00
        L_0x05dd:
            java.lang.Object r0 = r5.getValue()
            X.9IV r0 = (X.AnonymousClass9IV) r0
            java.lang.Object r0 = r0.A00
            X.8WV r0 = (X.AnonymousClass8WV) r0
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x0689
            r0 = r59
            java.lang.Object r0 = r0.A00
            X.4yO r0 = (X.C279284yO) r0
            boolean r7 = X.C339047iy.A00(r11, r0)
            r0 = 44
            X.9LC r6 = new X.9LC
            r6.<init>(r2, r0)
            r0 = 45
            X.9LC r5 = new X.9LC
            r5.<init>(r2, r0)
            X.9SC r0 = new X.9SC
            r0.<init>(r6, r5, r7)
        L_0x0608:
            r3.add(r1, r0)
        L_0x060b:
            java.lang.Object r0 = r10.A00
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x0686
            boolean r0 = r4.A00()
            if (r0 != 0) goto L_0x0686
            X.0Tu r4 = X.0Tu.A05
            r0 = 36329414664929385(0x81116900004069, double:3.038206348687847E-306)
            boolean r0 = X.182.A06(r4, r9, r0)
            if (r0 == 0) goto L_0x0686
            X.8XA r0 = r2.A0A
            X.0eM r0 = r0.A0l
            java.lang.Object r0 = r0.getValue()
            X.AbY r0 = (X.C40401AbY) r0
            X.0eM r0 = r0.A07
            java.lang.Object r0 = r0.getValue()
            X.89Z r0 = (X.AnonymousClass89Z) r0
            com.instagram.music.common.model.AudioOverlayTrack r0 = r0.A01()
            if (r0 == 0) goto L_0x0687
            com.instagram.music.common.model.MusicAssetModel r0 = r0.A08
            if (r0 == 0) goto L_0x0687
            com.instagram.common.typedurl.ImageUrl r6 = r0.A03
        L_0x0642:
            r0 = 46
            X.9LC r5 = new X.9LC
            r5.<init>(r2, r0)
            X.AxI r2 = X.C41604AxI.A00
            r20 = 2131238737(0x7f081f51, float:1.8093761E38)
            r1 = 2131972595(0x7f1351f3, float:1.9582202E38)
            r0 = 5
            X.0qQ.A0B(r2, r0)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r1)
            X.7iz r16 = X.C339057iz.SAVED_AUDIO
            X.9mg r15 = new X.9mg
            r18 = r5
            r19 = r2
            r15.<init>(r16, r17, r18, r19, r20)
            r15.A00 = r6
            r0 = 36610889641695406(0x821169000118ae, double:3.216212257403436E-306)
            long r4 = X.182.A01(r4, r9, r0)
            int r1 = (int) r4
            r0 = 3
            if (r1 >= r0) goto L_0x0674
            r1 = 3
        L_0x0674:
            int r0 = r3.size()
            int r0 = r0 + 1
            if (r1 <= r0) goto L_0x0682
            int r0 = r3.size()
            int r1 = r0 + 1
        L_0x0682:
            int r1 = r1 - r14
            r3.add(r1, r15)
        L_0x0686:
            return r3
        L_0x0687:
            r6 = 0
            goto L_0x0642
        L_0x0689:
            java.lang.Object r0 = r5.getValue()
            X.9IV r0 = (X.AnonymousClass9IV) r0
            java.lang.Object r0 = r0.A00
            X.8WV r0 = (X.AnonymousClass8WV) r0
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x060b
            r0 = 2131965994(0x7f13382a, float:1.9568814E38)
            java.lang.Integer r55 = java.lang.Integer.valueOf(r0)
            X.7iz r54 = X.C339057iz.MEMORIES
            r58 = 2131238134(0x7f081cf6, float:1.8092538E38)
            X.7j2 r0 = new X.7j2
            r53 = r0
            r53.<init>(r54, r55, r56, r57, r58)
            goto L_0x0608
        L_0x06ac:
            int r1 = r3.size()
            goto L_0x05dd
        L_0x06b2:
            r0 = r17
            goto L_0x053f
        L_0x06b6:
            r0 = 36325201302336210(0x810d94000532d2, double:3.0355418012180736E-306)
            boolean r0 = X.182.A06(r5, r11, r0)
            if (r0 == 0) goto L_0x06ff
            android.app.Activity r0 = r2.A03
            X.9k1 r6 = new X.9k1
            r6.<init>(r0)
            X.7iz r21 = X.C339057iz.MUSIC
            r0 = 5
            X.MM9 r5 = new X.MM9
            r5.<init>(r2, r0)
            r0 = 6
            X.MM9 r1 = new X.MM9
            r1.<init>(r2, r0)
            r28 = 2131238572(0x7f081eac, float:1.8093426E38)
            r29 = 2131962956(0x7f132c4c, float:1.9562652E38)
            r27 = 1065353216(0x3f800000, float:1.0)
            X.7j7 r23 = X.C339137j7.A00
            X.7jF r24 = X.C339217jF.A00
            X.7jG r25 = X.C339227jG.A00
            X.7j8 r0 = new X.7j8
            r18 = r0
            r19 = r40
            r20 = r6
            r22 = r5
            r26 = r1
            r30 = r15
            r31 = r15
            r32 = r14
            r33 = r15
            r34 = r15
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            goto L_0x045c
        L_0x06ff:
            r0 = 2131962956(0x7f132c4c, float:1.9562652E38)
            java.lang.Integer r20 = java.lang.Integer.valueOf(r0)
            X.7iz r19 = X.C339057iz.MUSIC
            r23 = 2131238572(0x7f081eac, float:1.8093426E38)
            X.7j2 r0 = new X.7j2
            r18 = r0
            r21 = r56
            r22 = r57
            r18.<init>(r19, r20, r21, r22, r23)
            goto L_0x045c
        L_0x0718:
            r0 = 2131955511(0x7f130f37, float:1.9547552E38)
            java.lang.Integer r20 = java.lang.Integer.valueOf(r0)
            X.7iz r19 = X.C339057iz.TRENDING
            r23 = 2131237926(0x7f081c26, float:1.8092116E38)
            X.7j2 r0 = new X.7j2
            r18 = r0
            r21 = r56
            r22 = r57
            r18.<init>(r19, r20, r21, r22, r23)
            goto L_0x032a
        L_0x0731:
            X.0Tu r5 = X.0Tu.A05
            r0 = 36321361601373487(0x810a160002252f, double:3.033113558868013E-306)
            boolean r1 = X.182.A06(r5, r11, r0)
            r0 = 2131955510(0x7f130f36, float:1.954755E38)
            if (r1 == 0) goto L_0x0744
            r0 = 2131955511(0x7f130f37, float:1.9547552E38)
        L_0x0744:
            java.lang.Integer r20 = java.lang.Integer.valueOf(r0)
            X.7iz r19 = X.C339057iz.AUDIO
            r23 = 2131238581(0x7f081eb5, float:1.8093445E38)
            X.7j2 r0 = new X.7j2
            r18 = r0
            r21 = r56
            r22 = r57
            r18.<init>(r19, r20, r21, r22, r23)
            goto L_0x02e4
        L_0x075a:
            r0 = 2131962909(0x7f132c1d, float:1.9562556E38)
            java.lang.Integer r20 = java.lang.Integer.valueOf(r0)
            X.7iz r19 = X.C339057iz.DRAFTS
            r23 = 2131238228(0x7f081d54, float:1.8092729E38)
            X.7j2 r0 = new X.7j2
            r18 = r0
            r21 = r56
            r22 = r57
            r18.<init>(r19, r20, r21, r22, r23)
            goto L_0x0262
        L_0x0773:
            r0 = 2131975890(0x7f135ed2, float:1.9588885E38)
            java.lang.Integer r55 = java.lang.Integer.valueOf(r0)
            goto L_0x0016
        L_0x077c:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C362208hW.A00():java.util.ArrayList");
    }

    public final void A01() {
        boolean z = !(this.A08.A03.A08.A00 instanceof AnonymousClass80K);
        ViewGroup viewGroup = this.A0F;
        int i = 8;
        if (z) {
            i = 0;
        }
        viewGroup.setVisibility(i);
        View view = this.A0E;
        2dP layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            2dP r1 = layoutParams;
            AppBarLayout.ScrollingViewBehavior scrollingViewBehavior = new AppBarLayout.ScrollingViewBehavior();
            if (!z) {
                scrollingViewBehavior = null;
            }
            r1.A00(scrollingViewBehavior);
            view.setLayoutParams(r1);
            this.A0G.requestLayout();
            return;
        }
        throw new NullPointerException(C273654mx.A00(48));
    }

    /* JADX WARNING: type inference failed for: r0v22, types: [android.view.ViewGroup$LayoutParams, X.5sn, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (X.182.A06(X.0Tu.A05, r5.A05, 36327387440626064L) != false) goto L_0x0022;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r18 = this;
            r5 = r18
            X.8hV r3 = r5.A08
            boolean r0 = r3.A04()
            r2 = 0
            if (r0 == 0) goto L_0x0022
            X.8Yz r4 = r5.A06
            boolean r0 = r4.A0P()
            if (r0 == 0) goto L_0x0038
            com.instagram.common.session.UserSession r7 = r5.A05
            X.0Tu r6 = X.0Tu.A05
            r0 = 36327387440626064(0x810f9100043990, double:3.0369243238754496E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            if (r0 == 0) goto L_0x0038
        L_0x0022:
            androidx.recyclerview.widget.RecyclerView r0 = r5.A00
            r1 = 0
            r0.setAdapter(r1)
            X.3oV r0 = r5.A02
            android.view.View r0 = r0.getView()
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r0.setAdapter(r1)
            com.instagram.creation.capture.quickcapture.gallery.gallerygrid.BlockableCoordinatorLayout r0 = r5.A0G
            r0.A00 = r2
            return
        L_0x0038:
            android.view.ViewGroup r1 = r5.A0F
            java.lang.String r0 = "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout"
            X.0qQ.A0C(r1, r0)
            com.google.android.material.appbar.AppBarLayout r1 = (com.google.android.material.appbar.AppBarLayout) r1
            r15 = 1
            r0 = 9
            r1.A03 = r0
            r1.requestLayout()
            com.instagram.creation.capture.quickcapture.gallery.gallerygrid.BlockableCoordinatorLayout r0 = r5.A0G
            r0.A00 = r15
            java.util.ArrayList r12 = r5.A00()
            int r1 = r12.size()
            r0 = 3
            if (r1 > r0) goto L_0x0059
            r15 = 0
        L_0x0059:
            com.instagram.common.session.UserSession r11 = r5.A05
            X.80m r7 = r4.A08
            java.lang.Object r0 = r7.A00
            X.4yO r0 = (X.C279284yO) r0
            boolean r9 = X.C339047iy.A00(r11, r0)
            java.util.Map r13 = r5.A0C
            java.lang.Object r1 = r7.A00
            r4 = 1
            X.0qQ.A0B(r1, r4)
            boolean r0 = r1 instanceof X.AnonymousClass9QA
            if (r0 == 0) goto L_0x0107
            X.0Tu r6 = X.0Tu.A05
            r0 = 36320253499678855(0x81091400002087, double:3.03241279089436E-306)
        L_0x0078:
            boolean r16 = X.182.A06(r6, r11, r0)
        L_0x007c:
            java.lang.Object r0 = r7.A00
            X.4yO r0 = (X.C279284yO) r0
            boolean r17 = X.C339047iy.A00(r11, r0)
            r0 = 17
            X.9LZ r14 = new X.9LZ
            r14.<init>(r5, r0)
            X.7jH r10 = new X.7jH
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            androidx.recyclerview.widget.RecyclerView r7 = r5.A00
            r7.setAdapter(r10)
            X.3oV r6 = r5.A02
            android.view.View r1 = r6.getView()
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            X.8hb r0 = r5.A09
            X.2t9 r0 = r0.A01
            r1.setAdapter(r0)
            if (r15 != 0) goto L_0x00ff
            if (r9 != 0) goto L_0x00ff
            android.content.Context r8 = r5.A04
            int r0 = r12.size()
            androidx.recyclerview.widget.GridLayoutManager r1 = new androidx.recyclerview.widget.GridLayoutManager
            r1.<init>(r8, r0)
        L_0x00b3:
            r7.setLayoutManager(r1)
            android.view.View r1 = r6.getView()
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            r0.<init>(r8, r2, r2)
            r1.setLayoutManager(r0)
            r8 = -1
            r1 = -2
            X.5sn r0 = new X.5sn
            r0.<init>(r8, r1)
            r0.A00 = r4
            r7.setLayoutParams(r0)
            r6.Ebw(r0)
            if (r9 == 0) goto L_0x00fd
            android.app.Activity r0 = r5.A03
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165207(0x7f070017, float:1.7944625E38)
            int r0 = r1.getDimensionPixelSize(r0)
        L_0x00e2:
            r7.setPaddingRelative(r0, r2, r2, r2)
            boolean r1 = r3.A01()
            r0 = 0
            if (r1 == 0) goto L_0x00ee
            r0 = 8
        L_0x00ee:
            r7.setVisibility(r0)
            boolean r0 = r3.A01()
            if (r0 != 0) goto L_0x00f9
            r2 = 8
        L_0x00f9:
            r6.setVisibility(r2)
            return
        L_0x00fd:
            r0 = 0
            goto L_0x00e2
        L_0x00ff:
            android.content.Context r8 = r5.A04
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            r1.<init>(r8, r2, r2)
            goto L_0x00b3
        L_0x0107:
            boolean r0 = r1 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x0114
            X.0Tu r6 = X.0Tu.A05
            r0 = 36319957147066202(0x8108cf00021f5a, double:3.032225376308802E-306)
            goto L_0x0078
        L_0x0114:
            r16 = 0
            goto L_0x007c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C362208hW.A02():void");
    }

    public final void A03() {
        if (this.A08.A04()) {
            ArrayList A002 = A00();
            C339237jH r0 = this.A00.A0A;
            if (r0 != null) {
                r0.A00(A002);
            }
        }
    }
}
