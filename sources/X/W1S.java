package X;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Map;

public final class W1S {
    public static final VUU A00(A8N a8n, C390809rs r6, Integer num, String str, Map map, byte[] bArr) {
        0qQ.A0B(bArr, 0);
        0eP A00 = a8n.A00(r6);
        C374809Aw.A01((String) A00.A00);
        VUV vuv = new VUV((String) A00.A01, num, str);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Charset charset = AnonymousClass15Q.A05;
        byteArrayOutputStream.write(Pxf.A1V("private-attribution", charset));
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(Pxf.A1V(vuv.A01, charset));
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(Pxf.A1V(vuv.A02, charset));
        byteArrayOutputStream.write(0);
        byte b = 0;
        byteArrayOutputStream.write(new byte[]{0});
        ByteBuffer A12 = Pxg.A12(2);
        A12.putShort(0);
        byte[] array = A12.array();
        0qQ.A07(array);
        byteArrayOutputStream.write(array);
        byte[] bArr2 = new byte[1];
        if (vuv.A00.intValue() == 0) {
            b = 1;
        }
        bArr2[0] = b;
        byteArrayOutputStream.write(bArr2);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        0qQ.A07(byteArray);
        AnonymousClass9BV r2 = (AnonymousClass9BV) map.get(r6);
        if (r2 != null) {
            C18398Vqy.A00("create_hybrid_encrypt_start");
            AnonymousClass979 r1 = AnonymousClass979.A01;
            r1.A01(C40226AWq.A00);
            r1.A02(C40226AWq.A01);
            B1C b1c = (B1C) r2.A03(B1C.class);
            0qQ.A07(b1c);
            C18398Vqy.A00("create_hybrid_encrypt_end");
            C18398Vqy.A00("perform_encryption_start");
            byte[] ASD = b1c.ASD(bArr, byteArray);
            0qQ.A07(ASD);
            C18398Vqy.A00("perform_encryption_end");
            ByteBuffer wrap = ByteBuffer.wrap(ASD);
            0qQ.A07(wrap);
            wrap.get(new byte[5]);
            byte[] bArr3 = new byte[32];
            wrap.get(bArr3);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4);
            return new VUU(vuv, bArr3, bArr4);
        }
        throw Pxg.A0k("No keyset handle for helper ", r6.name());
    }

    public static final AnonymousClass59G A01(AnonymousClass59G r4, AnonymousClass59G r5) {
        return new AnonymousClass59G(A02((VUU) r4.A00, (VUU) r5.A00), A02((VUU) r4.A01, (VUU) r5.A01), A02((VUU) r4.A02, (VUU) r5.A02));
    }

    public static final byte[] A02(VUU vuu, VUU vuu2) {
        byte b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        byteArrayOutputStream2.write(vuu.A02);
        byteArrayOutputStream2.write(vuu.A01);
        byte[] byteArray = byteArrayOutputStream2.toByteArray();
        0qQ.A07(byteArray);
        byteArrayOutputStream.write(byteArray);
        if (vuu2 != null) {
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            byteArrayOutputStream3.write(vuu2.A02);
            byteArrayOutputStream3.write(vuu2.A01);
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            0qQ.A07(byteArray2);
            byteArrayOutputStream.write(byteArray2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            byte[] bArr = new byte[1];
            VUV vuv = vuu.A00;
            if (vuv.A00.intValue() != 0) {
                b = 0;
            } else {
                b = 1;
            }
            bArr[0] = b;
            byteArrayOutputStream4.write(bArr);
            byteArrayOutputStream4.write(new byte[]{0});
            ByteBuffer A12 = Pxg.A12(2);
            A12.putShort(0);
            byte[] array = A12.array();
            0qQ.A07(array);
            byteArrayOutputStream4.write(array);
            byteArrayOutputStream4.write(Pxf.A1V(vuv.A02, AnonymousClass15Q.A05));
            byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
            0qQ.A07(byteArray3);
            byteArrayOutputStream.write(byteArray3);
        }
        byte[] byteArray4 = byteArrayOutputStream.toByteArray();
        0qQ.A07(byteArray4);
        return byteArray4;
    }

    public final AnonymousClass59G A03(A8N a8n, Integer num, String str, Map map, long j) {
        AnonymousClass59G A00 = C18750Vzl.A03.A00(C16479UvZ.A03, j);
        return A04(a8n, num, str, map, new AnonymousClass59G(((C18750Vzl) A00.A00).A01(), ((C18750Vzl) A00.A01).A01(), ((C18750Vzl) A00.A02).A01()));
    }

    public final AnonymousClass59G A04(A8N a8n, Integer num, String str, Map map, AnonymousClass59G r15) {
        A8N a8n2 = a8n;
        Integer num2 = num;
        String str2 = str;
        Map map2 = map;
        return new AnonymousClass59G(A00(a8n2, C390809rs.One, num2, str2, map2, (byte[]) r15.A00), A00(a8n2, C390809rs.Two, num2, str2, map2, (byte[]) r15.A01), A00(a8n2, C390809rs.Three, num2, str2, map2, (byte[]) r15.A02));
    }
}
