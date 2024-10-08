package X;

import com.google.common.collect.ImmutableList;
import com.instagram.schools.management.data.SchoolInfo;

public final class JHF extends 0Yg implements 0sK {
    public final /* synthetic */ ImmutableList A00;
    public final /* synthetic */ SchoolInfo A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ C62320sa A04;
    public final /* synthetic */ C62320sa A05;
    public final /* synthetic */ C62320sa A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JHF(ImmutableList immutableList, SchoolInfo schoolInfo, Integer num, Integer num2, C62320sa r6, C62320sa r7, C62320sa r8) {
        super(3);
        this.A01 = schoolInfo;
        this.A05 = r6;
        this.A04 = r7;
        this.A06 = r8;
        this.A00 = immutableList;
        this.A02 = num;
        this.A03 = num2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C286575Wy r2 = (C286575Wy) obj2;
        if (C51968G9o.A0D(obj3) != 16 || !r2.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(429045901, "com.instagram.schools.management.ui.SchoolOnboardingGradudationDateContent.<anonymous> (SchoolOnboardingGraduationDateContent.kt:46)");
            }
            SchoolInfo schoolInfo = this.A01;
            if (schoolInfo != null) {
                I39.A01(r2, schoolInfo, this.A02, this.A03, this.A05, this.A04, this.A06, 0, this.A00.contains(HMD.SCHOOL_SELECTION));
            }
            if (0fL.A02()) {
                0fL.A00(-648754785);
            }
        } else {
            r2.Evl();
        }
        return C60340gF.A00;
    }
}
