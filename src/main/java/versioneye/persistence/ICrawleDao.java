package versioneye.persistence;

import org.bson.types.ObjectId;
import versioneye.domain.Crawle;

import java.util.Date;

public interface ICrawleDao {

    void create(final Crawle crawle);

    void updateDates(ObjectId id, Date updated, Date duration);

    Crawle getById(ObjectId id);

}
