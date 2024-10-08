package X;

import java.util.Map;

/* renamed from: X.8eA  reason: invalid class name and case insensitive filesystem */
public abstract class C360178eA {
    public static final Map A00;

    static {
        0eP[] r1 = new 0eP[28];
        0eP r0 = new 0eP(new 0Yh(String.class), C255453u9.A01);
        0eP r02 = new 0eP(new 0Yh(Character.TYPE), C360188eB.A00);
        0eP r03 = new 0eP(new 0Yh(char[].class), C360208eD.A00);
        0eP r04 = new 0eP(new 0Yh(Double.TYPE), C258703zV.A00);
        0eP r05 = new 0eP(new 0Yh(double[].class), C360218eE.A00);
        0eP r06 = new 0eP(new 0Yh(Float.TYPE), C2592140v.A00);
        0eP r07 = new 0eP(new 0Yh(float[].class), C2591940t.A00);
        0eP r08 = new 0eP(new 0Yh(Long.TYPE), C258663zR.A00);
        0eP r09 = new 0eP(new 0Yh(long[].class), C360228eF.A00);
        0eP r010 = new 0eP(new 0Yh(C360238eG.class), C360248eH.A01);
        0eP r011 = new 0eP(new 0Yh(C360258eI.class), C360268eJ.A00);
        0eP r012 = new 0eP(new 0Yh(Integer.TYPE), C360278eK.A00);
        0eP r013 = new 0eP(new 0Yh(int[].class), C360298eM.A00);
        0eP r30 = r02;
        0eP r31 = r03;
        0eP r32 = r04;
        0eP r33 = r05;
        0eP r34 = r06;
        0eP r35 = r07;
        0eP r36 = r08;
        0eP r37 = r09;
        0eP r38 = r010;
        0eP r39 = r011;
        0eP r40 = r012;
        0eP r41 = r013;
        System.arraycopy(new 0eP[]{r0, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, new 0eP(new 0Yh(C360308eN.class), C360318eO.A01), new 0eP(new 0Yh(C360328eP.class), C360338eQ.A00), new 0eP(new 0Yh(Short.TYPE), C360348eR.A00), new 0eP(new 0Yh(short[].class), C360368eT.A00), new 0eP(new 0Yh(C360378eU.class), C360388eV.A01), new 0eP(new 0Yh(C360398eW.class), C360408eX.A00), new 0eP(new 0Yh(Byte.TYPE), C360418eY.A00), new 0eP(new 0Yh(byte[].class), C360438ea.A00), new 0eP(new 0Yh(C360448eb.class), C360458ec.A01), new 0eP(new 0Yh(C360468ed.class), C360478ee.A00), new 0eP(new 0Yh(Boolean.TYPE), AnonymousClass40E.A00), new 0eP(new 0Yh(boolean[].class), C360488ef.A00), new 0eP(new 0Yh(C60340gF.class), C360498eg.A01), new 0eP(new 0Yh(Void.class), C360528ej.A00)}, 0, r1, 0, 27);
        System.arraycopy(new 0eP[]{new 0eP(new 0Yh(AnonymousClass30M.class), C360558em.A00)}, 0, r1, 27, 1);
        A00 = 0Yt.A06(r1);
    }

    public static final String A00(String str) {
        String valueOf;
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = str.charAt(0);
        if (Character.isLowerCase(charAt)) {
            valueOf = AnonymousClass9VV.A00(charAt);
        } else {
            valueOf = String.valueOf(charAt);
        }
        sb.append(valueOf);
        String substring = str.substring(1);
        0qQ.A07(substring);
        sb.append(substring);
        return sb.toString();
    }
}
