package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.ClipsTextAlignment;
import com.instagram.api.schemas.ClipsTextEmphasisMode;
import com.instagram.api.schemas.ClipsTextFormatType;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.List;

/* renamed from: X.3i0  reason: invalid class name */
public abstract class AnonymousClass3i0 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v51, resolved type: com.instagram.api.schemas.ClipsTextEmphasisMode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v69, resolved type: com.instagram.api.schemas.ClipsTextAlignment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C248883ik parseFromJson(X.16F r51) {
        /*
            r11 = r51
            r0 = 0
            X.0qQ.A0B(r11, r0)
            X.16L r1 = r11.A11()     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            r34 = 0
            if (r1 == r0) goto L_0x0014
            r11.A0z()     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            return r34
        L_0x0014:
            r33 = r34
            r18 = r34
            r17 = r34
            r32 = r34
            r38 = r34
            r31 = r34
            r30 = r34
            r29 = r34
            r28 = r34
            r27 = r34
            r26 = r34
            r39 = r34
            r16 = r34
            r37 = r34
            r25 = r34
            r24 = r34
        L_0x0034:
            X.16L r1 = r11.A1J()     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            java.lang.String r23 = "z_index"
            java.lang.String r22 = "width"
            java.lang.String r21 = "text_format_type"
            java.lang.String r20 = "text_emphasis_mode"
            java.lang.String r19 = "text"
            java.lang.String r15 = "start_time_ms"
            java.lang.String r14 = "scale"
            java.lang.String r13 = "rotation_degree"
            java.lang.String r12 = "offset_y"
            java.lang.String r10 = "offset_x"
            java.lang.String r9 = "is_animated"
            java.lang.String r8 = "id"
            java.lang.String r7 = "height"
            java.lang.String r6 = "font_size"
            java.lang.String r5 = "end_time_ms"
            java.lang.String r4 = "colors"
            java.lang.String r3 = "alignment"
            java.lang.String r2 = "ClipsTextInfo"
            if (r1 == r0) goto L_0x01e4
            java.lang.String r0 = r11.A0q()     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            r11.A1J()     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            boolean r1 = r3.equals(r0)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            if (r1 == 0) goto L_0x008c
            X.16L r1 = r11.A11()     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            if (r1 != r0) goto L_0x0077
            r1 = 0
            goto L_0x007b
        L_0x0077:
            java.lang.String r1 = r11.A1P()     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
        L_0x007b:
            java.util.Map r0 = com.instagram.api.schemas.ClipsTextAlignment.A01     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            java.lang.Object r18 = r0.get(r1)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            r0 = r18
            com.instagram.api.schemas.ClipsTextAlignment r0 = (com.instagram.api.schemas.ClipsTextAlignment) r0     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            r18 = r0
            if (r0 != 0) goto L_0x00c5
            com.instagram.api.schemas.ClipsTextAlignment r18 = com.instagram.api.schemas.ClipsTextAlignment.UNRECOGNIZED     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            goto L_0x00c5
        L_0x008c:
            boolean r1 = r4.equals(r0)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            if (r1 == 0) goto L_0x00b6
            X.16L r1 = r11.A11()     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            if (r1 != r0) goto L_0x00b3
            java.util.ArrayList r17 = new java.util.ArrayList     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            r17.<init>()     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
        L_0x009f:
            X.16L r1 = r11.A1J()     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            if (r1 == r0) goto L_0x00c5
            X.3iI r1 = X.C248603iG.parseFromJson(r11)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            if (r1 == 0) goto L_0x009f
            r0 = r17
            r0.add(r1)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            goto L_0x009f
        L_0x00b3:
            r17 = 0
            goto L_0x00c5
        L_0x00b6:
            boolean r1 = r5.equals(r0)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            if (r1 == 0) goto L_0x00ca
            double r0 = r11.A0U()     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            float r2 = (float) r0     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            java.lang.Float r34 = java.lang.Float.valueOf(r2)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
        L_0x00c5:
            r11.A0z()     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            goto L_0x0034
        L_0x00ca:
            boolean r1 = r6.equals(r0)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            if (r1 == 0) goto L_0x00da
            double r0 = r11.A0U()     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            float r2 = (float) r0     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            java.lang.Float r33 = java.lang.Float.valueOf(r2)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            goto L_0x00c5
        L_0x00da:
            boolean r1 = r7.equals(r0)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            if (r1 == 0) goto L_0x00ea
            double r0 = r11.A0U()     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            float r2 = (float) r0     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            java.lang.Float r32 = java.lang.Float.valueOf(r2)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            goto L_0x00c5
        L_0x00ea:
            boolean r1 = r8.equals(r0)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            if (r1 == 0) goto L_0x0100
            X.16L r1 = r11.A11()     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            if (r1 != r0) goto L_0x00fb
            r38 = 0
            goto L_0x00c5
        L_0x00fb:
            java.lang.String r38 = r11.A1P()     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            goto L_0x00c5
        L_0x0100:
            boolean r1 = r9.equals(r0)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            if (r1 == 0) goto L_0x010f
            int r0 = r11.A1D()     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            java.lang.Integer r31 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            goto L_0x00c5
        L_0x010f:
            boolean r1 = r10.equals(r0)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            if (r1 == 0) goto L_0x011f
            double r0 = r11.A0U()     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            float r2 = (float) r0     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            java.lang.Float r30 = java.lang.Float.valueOf(r2)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            goto L_0x00c5
        L_0x011f:
            boolean r1 = r12.equals(r0)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            if (r1 == 0) goto L_0x012f
            double r0 = r11.A0U()     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            float r2 = (float) r0     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            java.lang.Float r29 = java.lang.Float.valueOf(r2)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            goto L_0x00c5
        L_0x012f:
            boolean r1 = r13.equals(r0)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            if (r1 == 0) goto L_0x013f
            double r0 = r11.A0U()     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            float r2 = (float) r0     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            java.lang.Float r28 = java.lang.Float.valueOf(r2)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            goto L_0x00c5
        L_0x013f:
            boolean r1 = r14.equals(r0)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            if (r1 == 0) goto L_0x0150
            double r0 = r11.A0U()     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            float r2 = (float) r0     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            java.lang.Float r27 = java.lang.Float.valueOf(r2)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            goto L_0x00c5
        L_0x0150:
            boolean r1 = r15.equals(r0)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            if (r1 == 0) goto L_0x0161
            double r0 = r11.A0U()     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            float r2 = (float) r0     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            java.lang.Float r26 = java.lang.Float.valueOf(r2)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            goto L_0x00c5
        L_0x0161:
            r1 = r19
            boolean r1 = r1.equals(r0)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            if (r1 == 0) goto L_0x017b
            X.16L r1 = r11.A11()     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            if (r1 != r0) goto L_0x0175
            r39 = 0
            goto L_0x00c5
        L_0x0175:
            java.lang.String r39 = r11.A1P()     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            goto L_0x00c5
        L_0x017b:
            r1 = r20
            boolean r1 = r1.equals(r0)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            if (r1 == 0) goto L_0x01a3
            X.16L r1 = r11.A11()     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            if (r1 != r0) goto L_0x018d
            r1 = 0
            goto L_0x0191
        L_0x018d:
            java.lang.String r1 = r11.A1P()     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
        L_0x0191:
            java.util.Map r0 = com.instagram.api.schemas.ClipsTextEmphasisMode.A01     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            java.lang.Object r16 = r0.get(r1)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            r0 = r16
            com.instagram.api.schemas.ClipsTextEmphasisMode r0 = (com.instagram.api.schemas.ClipsTextEmphasisMode) r0     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            r16 = r0
            if (r0 != 0) goto L_0x00c5
            com.instagram.api.schemas.ClipsTextEmphasisMode r16 = com.instagram.api.schemas.ClipsTextEmphasisMode.UNRECOGNIZED     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            goto L_0x00c5
        L_0x01a3:
            r1 = r21
            boolean r1 = r1.equals(r0)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            if (r1 == 0) goto L_0x01bf
            X.16L r1 = r11.A11()     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            if (r1 != r0) goto L_0x01b5
            r0 = 0
            goto L_0x01b9
        L_0x01b5:
            java.lang.String r0 = r11.A1P()     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
        L_0x01b9:
            com.instagram.api.schemas.ClipsTextFormatType r37 = X.C248693iQ.A00(r0)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            goto L_0x00c5
        L_0x01bf:
            r1 = r22
            boolean r1 = r1.equals(r0)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            if (r1 == 0) goto L_0x01d2
            double r0 = r11.A0U()     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            float r2 = (float) r0     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            java.lang.Float r25 = java.lang.Float.valueOf(r2)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            goto L_0x00c5
        L_0x01d2:
            r1 = r23
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            if (r0 == 0) goto L_0x00c5
            int r0 = r11.A1D()     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            java.lang.Integer r24 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            goto L_0x00c5
        L_0x01e4:
            if (r18 != 0) goto L_0x01f3
            boolean r0 = r11 instanceof X.0c9     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            if (r0 == 0) goto L_0x01f3
            X.0c9 r11 = (X.0c9) r11     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            X.0LH r0 = r11.A03     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            r0.A00(r3, r2)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            goto L_0x02d9
        L_0x01f3:
            if (r17 != 0) goto L_0x01f7
            goto L_0x02ce
        L_0x01f7:
            if (r34 != 0) goto L_0x0206
            boolean r0 = r11 instanceof X.0c9     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            if (r0 == 0) goto L_0x0206
            X.0c9 r11 = (X.0c9) r11     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            X.0LH r0 = r11.A03     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            r0.A00(r5, r2)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            goto L_0x02d9
        L_0x0206:
            if (r33 != 0) goto L_0x0215
            boolean r0 = r11 instanceof X.0c9     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            if (r0 == 0) goto L_0x0215
            X.0c9 r11 = (X.0c9) r11     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            X.0LH r0 = r11.A03     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            r0.A00(r6, r2)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            goto L_0x02d9
        L_0x0215:
            if (r32 != 0) goto L_0x0224
            boolean r0 = r11 instanceof X.0c9     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            if (r0 == 0) goto L_0x0224
            X.0c9 r11 = (X.0c9) r11     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            X.0LH r0 = r11.A03     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            r0.A00(r7, r2)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            goto L_0x02d9
        L_0x0224:
            if (r38 != 0) goto L_0x0233
            boolean r0 = r11 instanceof X.0c9     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            if (r0 == 0) goto L_0x0233
            X.0c9 r11 = (X.0c9) r11     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            X.0LH r0 = r11.A03     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            r0.A00(r8, r2)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            goto L_0x02d9
        L_0x0233:
            if (r31 != 0) goto L_0x0242
            boolean r0 = r11 instanceof X.0c9     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            if (r0 == 0) goto L_0x0242
            X.0c9 r11 = (X.0c9) r11     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            X.0LH r0 = r11.A03     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            r0.A00(r9, r2)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            goto L_0x02d9
        L_0x0242:
            if (r30 != 0) goto L_0x0251
            boolean r0 = r11 instanceof X.0c9     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            if (r0 == 0) goto L_0x0251
            X.0c9 r11 = (X.0c9) r11     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            X.0LH r0 = r11.A03     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            r0.A00(r10, r2)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            goto L_0x02d9
        L_0x0251:
            if (r29 != 0) goto L_0x025f
            boolean r0 = r11 instanceof X.0c9     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            if (r0 == 0) goto L_0x025f
            X.0c9 r11 = (X.0c9) r11     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            X.0LH r0 = r11.A03     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            r0.A00(r12, r2)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            goto L_0x02d9
        L_0x025f:
            if (r28 != 0) goto L_0x026d
            boolean r0 = r11 instanceof X.0c9     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            if (r0 == 0) goto L_0x026d
            X.0c9 r11 = (X.0c9) r11     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            X.0LH r0 = r11.A03     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            r0.A00(r13, r2)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            goto L_0x02d9
        L_0x026d:
            if (r27 != 0) goto L_0x027b
            boolean r0 = r11 instanceof X.0c9     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            if (r0 == 0) goto L_0x027b
            X.0c9 r11 = (X.0c9) r11     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            X.0LH r0 = r11.A03     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            r0.A00(r14, r2)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            goto L_0x02d9
        L_0x027b:
            if (r26 != 0) goto L_0x0289
            boolean r0 = r11 instanceof X.0c9     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            if (r0 == 0) goto L_0x0289
            X.0c9 r11 = (X.0c9) r11     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            X.0LH r0 = r11.A03     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            r0.A00(r15, r2)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            goto L_0x02d9
        L_0x0289:
            if (r39 != 0) goto L_0x0296
            boolean r0 = r11 instanceof X.0c9     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            if (r0 == 0) goto L_0x0296
            X.0c9 r11 = (X.0c9) r11     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            X.0LH r1 = r11.A03     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            r0 = r19
            goto L_0x02ca
        L_0x0296:
            if (r16 != 0) goto L_0x0299
            goto L_0x02c0
        L_0x0299:
            if (r37 != 0) goto L_0x02a6
            boolean r0 = r11 instanceof X.0c9     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            if (r0 == 0) goto L_0x02a6
            X.0c9 r11 = (X.0c9) r11     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            X.0LH r1 = r11.A03     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            r0 = r21
            goto L_0x02ca
        L_0x02a6:
            if (r25 != 0) goto L_0x02b3
            boolean r0 = r11 instanceof X.0c9     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            if (r0 == 0) goto L_0x02b3
            X.0c9 r11 = (X.0c9) r11     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            X.0LH r1 = r11.A03     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            r0 = r22
            goto L_0x02ca
        L_0x02b3:
            if (r24 != 0) goto L_0x02de
            boolean r0 = r11 instanceof X.0c9     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            if (r0 == 0) goto L_0x02de
            X.0c9 r11 = (X.0c9) r11     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            X.0LH r1 = r11.A03     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            r0 = r23
            goto L_0x02ca
        L_0x02c0:
            boolean r0 = r11 instanceof X.0c9     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            if (r0 == 0) goto L_0x0299
            X.0c9 r11 = (X.0c9) r11     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            X.0LH r1 = r11.A03     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            r0 = r20
        L_0x02ca:
            r1.A00(r0, r2)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            goto L_0x02d9
        L_0x02ce:
            boolean r0 = r11 instanceof X.0c9     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            if (r0 == 0) goto L_0x01f7
            X.0c9 r11 = (X.0c9) r11     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            X.0LH r0 = r11.A03     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            r0.A00(r4, r2)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
        L_0x02d9:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            throw r0     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
        L_0x02de:
            float r41 = r34.floatValue()     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            float r42 = r33.floatValue()     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            float r43 = r32.floatValue()     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            int r50 = r31.intValue()     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            float r44 = r30.floatValue()     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            float r45 = r29.floatValue()     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            float r46 = r28.floatValue()     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            float r47 = r27.floatValue()     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            float r48 = r26.floatValue()     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            float r49 = r25.floatValue()     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            int r51 = r24.intValue()     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            X.3ik r34 = new X.3ik     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            r35 = r18
            r36 = r16
            r40 = r17
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)     // Catch:{ IOException -> 0x031d, Exception -> 0x0316 }
            return r34
        L_0x0316:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x031d:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3i0.parseFromJson(X.16F):X.3ik");
    }

    public static void A00(17Z r4, C248883ik r5) {
        r4.A0c();
        ClipsTextAlignment clipsTextAlignment = r5.A0B;
        if (clipsTextAlignment != null) {
            r4.A0R("alignment", clipsTextAlignment.A00);
        }
        List<C248623iI> list = r5.A0G;
        if (list != null) {
            16P.A03(r4, "colors");
            for (C248623iI r2 : list) {
                if (r2 != null) {
                    r4.A0c();
                    r4.A0P("count", r2.A00);
                    String str = r2.A01;
                    if (str != null) {
                        r4.A0R("hex_rgba_color", str);
                    }
                    r4.A0Z();
                }
            }
            r4.A0Y();
        }
        r4.A0O("end_time_ms", r5.A00);
        r4.A0O("font_size", r5.A01);
        r4.A0O(IgReactMediaPickerNativeModule.HEIGHT, r5.A02);
        String str2 = r5.A0E;
        if (str2 != null) {
            r4.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2);
        }
        r4.A0P("is_animated", r5.A09);
        r4.A0O("offset_x", r5.A03);
        r4.A0O("offset_y", r5.A04);
        r4.A0O("rotation_degree", r5.A05);
        r4.A0O("scale", r5.A06);
        r4.A0O("start_time_ms", r5.A07);
        String str3 = r5.A0F;
        if (str3 != null) {
            r4.A0R("text", str3);
        }
        ClipsTextEmphasisMode clipsTextEmphasisMode = r5.A0C;
        if (clipsTextEmphasisMode != null) {
            r4.A0R("text_emphasis_mode", clipsTextEmphasisMode.A00);
        }
        ClipsTextFormatType clipsTextFormatType = r5.A0D;
        if (clipsTextFormatType != null) {
            r4.A0R("text_format_type", clipsTextFormatType.A00);
        }
        r4.A0O(IgReactMediaPickerNativeModule.WIDTH, r5.A08);
        r4.A0P("z_index", r5.A0A);
        r4.A0Z();
    }
}
