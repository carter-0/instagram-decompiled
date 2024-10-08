package X;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class QYy extends QYz {
    public static final Pattern A08;
    public QYz A00;
    public Integer A01;
    public Object A02;
    public Object A03;
    public String A04;
    public final String A05;
    public final String A06;
    public final double[] A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QYy(ReadableMap readableMap) {
        super((ReadableMap) null);
        double[] dArr;
        int[] iArr;
        ReadableType readableType = null;
        ReadableArray array = readableMap.getArray("inputRange");
        if (array != null) {
            int size = array.size();
            dArr = new double[size];
            for (int i = 0; i < size; i++) {
                dArr[i] = array.getDouble(i);
            }
        } else {
            dArr = new double[0];
        }
        this.A07 = dArr;
        this.A05 = readableMap.getString("extrapolateLeft");
        this.A06 = readableMap.getString("extrapolateRight");
        ReadableArray array2 = readableMap.getArray("outputRange");
        if ("color".equals(readableMap.getString("outputType"))) {
            this.A01 = AnonymousClass05K.A01;
            if (array2 != null) {
                int size2 = array2.size();
                int[] iArr2 = new int[size2];
                for (int i2 = 0; i2 < size2; i2++) {
                    iArr2[i2] = array2.getInt(i2);
                }
                iArr = iArr2;
            } else {
                iArr = new int[0];
            }
        } else {
            if ((array2 != null ? array2.getType(0) : readableType) == ReadableType.String) {
                this.A01 = AnonymousClass05K.A0C;
                int size3 = array2.size();
                double[][] dArr2 = new double[size3][];
                Pattern pattern = A08;
                Matcher matcher = pattern.matcher(array2.getString(0));
                ArrayList A1C = AnonymousClass7TE.A1C();
                while (matcher.find()) {
                    String group = matcher.group();
                    0qQ.A07(group);
                    Pxf.A1Q(A1C, Double.parseDouble(group));
                }
                int size4 = A1C.size();
                double[] dArr3 = new double[size4];
                int size5 = A1C.size();
                for (int i3 = 0; i3 < size5; i3++) {
                    dArr3[i3] = JTO.A00(A1C.get(i3));
                }
                dArr2[0] = dArr3;
                for (int i4 = 1; i4 < size3; i4++) {
                    double[] dArr4 = new double[size4];
                    Matcher matcher2 = pattern.matcher(array2.getString(i4));
                    int i5 = 0;
                    while (matcher2.find() && i5 < size4) {
                        String group2 = matcher2.group();
                        0qQ.A07(group2);
                        dArr4[i5] = Double.parseDouble(group2);
                        i5++;
                    }
                    dArr2[i4] = dArr4;
                }
                this.A03 = dArr2;
                this.A04 = array2.getString(0);
                return;
            }
            this.A01 = AnonymousClass05K.A00;
            if (array2 != null) {
                int size6 = array2.size();
                double[] dArr5 = new double[size6];
                for (int i6 = 0; i6 < size6; i6++) {
                    dArr5[i6] = array2.getDouble(i6);
                }
                iArr = dArr5;
            } else {
                iArr = new double[0];
            }
        }
        this.A03 = iArr;
    }

    static {
        Pattern compile = Pattern.compile("[+-]?(\\d+\\.?\\d*|\\.\\d+)([eE][+-]?\\d+)?");
        0qQ.A07(compile);
        A08 = compile;
    }

    public final String A03() {
        return 002.A0c("InterpolationAnimatedNode[", "] super: {super.prettyPrint()}", this.A02);
    }
}
