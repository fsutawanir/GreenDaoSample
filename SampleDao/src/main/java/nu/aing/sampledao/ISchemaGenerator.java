package nu.aing.sampledao;

import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

/**
 * @author Fanny Irawan Sutawanir (fannyirawans@gmail.com)
 */
public interface ISchemaGenerator {
    void createTables(Schema schema);

    interface IEntities {
        Entity createUsers(Schema schema);

        Entity createUserDetails(Schema schema);
    }
}