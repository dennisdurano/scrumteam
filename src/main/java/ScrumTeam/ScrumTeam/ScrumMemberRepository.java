package ScrumTeam.ScrumTeam;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel="scrum_member",path="scrum_member")
public interface ScrumMemberRepository extends MongoRepository<ScrumMember,String>{

}
