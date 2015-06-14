package hackaday.io.accountmanager.platform;

/**
 * Created by paul on 2015/06/14.
 */
import android.provider.ContactsContract.Data;
/*
 * The standard columns representing contact's info from social apps.
 */
public final class SampleSyncAdapterColumns {
    private SampleSyncAdapterColumns() {
    }
    /**
     * MIME-type used when storing a profile {@link Data} entry.
     */
    public static final String MIME_PROFILE =
            "vnd.android.cursor.item/vnd.hackadayio.profile";
    public static final String DATA_PID = Data.DATA1;
    public static final String DATA_SUMMARY = Data.DATA2;
    public static final String DATA_DETAIL = Data.DATA3;
}